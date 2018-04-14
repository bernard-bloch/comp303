/**
 * Implemented exactly like Moveable (bumped by a Moveable object or another
 * Autonomous object causes it to shift one cell in the direction it was bumped).
 * @author jbloch1
 *
 */
public class Autonomous extends Item {
	public Autonomous(String name, char token)
	{
		super(name, token);
	}
	
	
	public boolean isMoveable()
	{
		return true;
	}
	
	/**
	 * A public void step() method that randomly picks a direction and updates
	 * the item to a new location by one cell.
	 */
	@Override
	public void step()
	{
		/*double randomDecimalNum = Math.random();
		
		if(randomDecimalNum >= 0 && randomDecimalNum <= 0.25)
		{
			World.moveUp(this.getX(),this.getY());
		}
		else if(randomDecimalNum >= 0.25 && randomDecimalNum < 0.50)
		{
			World.moveDown(this.getX(),this.getY());
		}
		else if(randomDecimalNum >= 0.50 && randomDecimalNum < 0.75)
		{
			World.moveLeft(this.getX(),this.getY());
		}
		else 
		{
			World.moveRight(this.getX(),this.getY());
		}*/
	}
	
}
