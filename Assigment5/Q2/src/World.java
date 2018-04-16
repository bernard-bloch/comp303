import java.awt.GridLayout;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This is the world. This is implemented as a rowSize x columnSize
 * array backed by a LinkedHashMap (approximately) to enforce a
 * singleton design pattern.
 * @author jbloch1
 *
 */
public class World extends Stew<Item>
{
	private JFrame frame = null; // A window
	private JLabel labels[][];

	public final int rowSize, columnSize;
			
	/**
	 * Sets up a blank world.
	 * @param rowSize
	 * @param columnSize
	 */
	public World(final int rowSize, final int columnSize)
	{
		super(rowSize * columnSize);
		this.rowSize = rowSize;
		this.columnSize = columnSize;
		prepareGui();
	}
	
	/**
	 * A method called public void step() that iterates through the cells of the
	 * array changing the state of the world by updating the position of all the
	 * Autonomous and Moveable objects (see below). It does this once for each call to
	 * the method.
	 */
	public void step()
	{
		// Concurrent modification prevents: forEach(i -> i.step())
		Stack<Item> stack = new Stack<>();
		forEach(item -> stack.add(item));
		while(!stack.empty()) stack.pop().step();
	}
	
	/**
	 * Look in the world.
	 * @param x
	 * @param y
	 * @return The item at the coordinates.
	 */
	public Item look(final int x, final int y)
	{
		if(!isValidCoord(x, y)) return null;
		// i is a dummy only used for it's hashCode()
		Item i = new Immovable(this, "i", 'i');
		i.setXY(x, y);
		return get(i);
	}
	
	/**
	 * The method public void add(item,x,y) is used to populate the world
	 * by adding items to the array at cell x,y. The cell needs to be available (empty) or
	 * the add fails.
	 * @param item
	 * @param x row
	 * @param y column
	 * @throws NullPointerException, IndexOutOfBoundsException, ArrayStoreException when the array is occupied.
	 */
	public void add(Item item, int x, int y) throws NullPointerException, IndexOutOfBoundsException, ArrayStoreException
	{
		if(item == null) throw new NullPointerException();
		if(!isValidCoord(x, y)) throw new IndexOutOfBoundsException(item + " add ("+x+", "+y+") invalid coordinates.");
		if(look(x, y) != null) throw new ArrayStoreException(item + " add ("+x+", "+y+") array cell is already occupied.");
		// remove old position
		if(contains(item)) remove(item);
		item.setXY(x, y);
		if(!add(item)) throw new ArrayStoreException("Couldn't add " + item);
		//System.err.println("Adding "+item+"; Added " + look(x, y));
	}
	
	/**
	 * Is this a valid coord?
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean isValidCoord(int x, int y)
	{
		if(x < 0 || y < 0) return false;
		else if(x >= rowSize || y >= columnSize) return false;
		else return true;
	}

	/**
	 * The method public void display() to display the world on the screen
	 * using Swing or JavaFX. This must be a GUI grid displaying simple text tokens
	 * that represent the items in the world.
	 */
	public void display()
	{
		char tokens[][] = new char[rowSize][columnSize];
		for(int x = 0; x < rowSize; x++) {
			for(int y = 0; y < columnSize; y++) {
				tokens[x][y] = ' ';
			}
		}
		for(Item i : this) {
			if(i.getX() > 4 || i.getY() > 4) {
				System.err.println("Inconcievable! "+i);
			}
			tokens[i.getX()][i.getY()] = i.getToken();
		}
		for(int x = 0; x < rowSize; x++) {
			for(int y = 0; y < columnSize; y++) {
				labels[x][y].setText(""+tokens[x][y]);
			}
		}
	}
	
	/**
	 * Called from constructor
	 */
	private void prepareGui()
	{
		frame = new JFrame("World Display");
		frame.setSize(50 * rowSize, 50 * columnSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(columnSize,rowSize, 5, 5));
		frame.setVisible(true);
		labels = new JLabel[rowSize][columnSize];
		for(int x = 0; x < rowSize; x++) {
			for(int y = 0; y < columnSize; y++) {
				JLabel a = new JLabel("*");
				a.setHorizontalAlignment(JLabel.CENTER);
				frame.add(a);
				labels[x][y] = a;
			}
		}
	}
	
	/**
	 * Debug.
	 */
	@Override
	public String toString() {
		String a = "<<World.toString\n";
		for(int x = 0; x < rowSize; x++) {
			for(int y = 0; y < columnSize; y++) {
				Item i = look(x, y);
				a += i == null ? ' ' : i.getToken();
			}
			a += '\n';
		}
		a += super.toString() + "World.toString>>\n";
		return a;
	}

}

