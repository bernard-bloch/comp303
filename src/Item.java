/**
 * Items are Moveable, Immovable, or Autonomous.
 * @author jbloch1
 *
 */
public abstract class Item
{
	private final String name;
	private final char token;
	private int x, y;
	
	/**
	 * Initializes an item. Called from Immovable, Moveable and Autonomous using super method.
	 * @param name
	 * @param token
	 */
	public Item(String name, char token)
	{
		this.name = name;
		this.token = token;
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Default step() method does nothing.
	 */
	public void step()
	{
		
	}
	
	/**
	 * Abstract
	 * @return true or false if moveable or not respectively
	 */
	public abstract boolean isMoveable();
	
	/**
	 * Private string name, describing what it is.
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Private char token, a character that stores the symbol that represents the
	 * item when printed to the screen.
	 * @return token
	 */
	public char getToken()
	{
		return token;
	}
	
	/**
	 * Private int x, y, which specifies the location in the array this item exists.
	 * @return
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * Private int x, y, which specifies the location in the array this item exists.
	 * @return
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * This is a perfect hash for the columnSize x rowSize.
	 * It takes in no arguments and it uses the (x, y) coordinate of the 
	 * item to compute a unique value to use as an index into the array
	 */
	@Override
	public final int hashCode()
	{
		return x + y * World.rowSize;
	}
	
	/**
	 * Compares the x, y.
	 * http://www.angelikalanger.com/Articles/JavaSolutions/SecretsOfEquals/Equals-2.html
	 */
	@Override
	public final boolean equals(Object o) {
		if(o.getClass() != this.getClass()) return false;
		Item obj = (Item)o;
		return (obj.x == this.x) && (obj.y == this.y);
	}

}
