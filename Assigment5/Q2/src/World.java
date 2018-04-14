import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class World 
{
	private Set<Item> world;
	public static final int rowSize = 5, columnSize = 5;
	static private JFrame frame = null; // A window

	/**
	 * A 2D array that can store one Moveable, Immoveable, or Autonomous object per
	 * cell of the array.
	 */
	public World()
	{
		// this will implement a perfect hash set which is mapped to 2d array which will not allow multiple entries
		world = new LinkedHashSet<>(rowSize * columnSize);
	}
		
	/**
	 * A method called public void step() that iterates through the cells of the
	 * array changing the state of the world by updating the position of all the
	 * Autonomous and Moveable objects (see below). It does this once for each call to
	 * the method.
	 */
	public void step()
	{
		world.forEach(item -> item.step());
	}
	
	/**
	 * @param item
	 * @return Returns true if the item is in the world
	 *  Otherwise false.
	 */
	public boolean containsItem(final Item item) {
		return world.contains(item);
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
		if(!isValidCoord(x, y)) throw new IndexOutOfBoundsException("Invalid coordinates ("+x+", "+y+").");
		if(world.contains(item)) world.remove(item);
		item.setXY(x, y);
		if(world.contains(item)) throw new ArrayStoreException("Array cell is already occupied.");
		world.add(item);
	}

	private boolean isValidCoord(int x, int y)
	{
		if(x < 0 || y < 0) return false;
		else if(x >= rowSize || y >= columnSize) return false;
		else return true;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 * @throws IndexOutOfBoundsException
	 */
	/*public Item getItem(int x, int y) throws IndexOutOfBoundsException {
		if(!isValidCoord(x, y)) throw new IndexOutOfBoundsException("Invalid coordinates ("+x+", "+y+").");
		return world[x][y];
	}*/

	/**
	 * The method public void display() to display the world on the screen
	 * using Swing or JavaFX. This must be a GUI grid displaying simple text tokens
	 * that represent the items in the world.
	 */
	public void display()
	{
		char tokens[][] = new char[World.rowSize][World.columnSize];
		for(int x = 0; x < rowSize; x++) {
			for(int y = 0; y < columnSize; y++) {
				tokens[x][y] = ' ';
			}
		}
		for(Item i : world) tokens[i.getX()][i.getY()] = i.getToken();
		for(int x = 0; x < rowSize; x++) {
			for(int y = 0; y < columnSize; y++) {
				JLabel a = new JLabel(""+tokens[x][y]);
				a.setHorizontalAlignment(JLabel.CENTER);
				frame.add(a);
			}
		}
	}
	
	public static void prepareGui()
	{
		frame = new JFrame("World Display");
		frame.setSize(50 * World.rowSize, 50 * World.columnSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(/*World.columnSize,World.rowSize, */5, 5));
		frame.setVisible(true);
	}

}
