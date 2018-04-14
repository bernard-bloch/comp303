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
	 * The method public void display() to display the world on the screen
	 * using Swing or JavaFX. This must be a GUI grid displaying simple text tokens
	 * that represent the items in the world.
	 */
	/*public void display()
	{
		JFrame mainFrame = null; // A window
		JLabel headerLabel = null;// Label – display text
		JLabel statusLabel = null; // Label – display text
		JPanel controlPanel = null;// Panel – can be populated
		
		mainFrame = prepareGui(mainFrame, headerLabel, statusLabel,controlPanel);
		
		
		for(int row = 0; row < numberOfRows; row++)
		{
			for(int column = 0; column < numberOfColumns; column++)
			{
				if(world[row][column] != null)
				{
					//controlPanel.add(button, null);
					//label.setText("" + world[row][column].getToken());
				}
			}
		}
		mainFrame.setVisible(true);
	}
	
	public JFrame prepareGui(JFrame mainFrame, JLabel headerLabel, JLabel statusLabel, JPanel controlPanel)
	{
		JButton button;
		mainFrame = new JFrame("World Display");
		mainFrame.setSize(300, 300);
		
		mainFrame.setLayout(new GridLayout(3,1));
		
		headerLabel = new JLabel("",JLabel.CENTER );
		headerLabel.setText("Hello World");

		for(int row = 0; row < numberOfRows; row++)
		{
			for(int column = 0; column < numberOfColumns; column++)
			{
				if(world[row][column] != null)
				{
					button = new JButton();
					controlPanel.add(button, null);
					//label.setText("" + world[row][column].getToken());
				}
			}
		}
		
		
		
		mainFrame.add(headerLabel);
		//statusLabel = new JLabel(""+,JLabel.CENTER);
		//statusLabel.setSize(350,100);
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(numberOfRows,numberOfColumns));
		
		
		mainFrame.add(controlPanel);
		return mainFrame;
	}*/
	
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
}
