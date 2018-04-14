/**
 * Implemented exactly as Immovable, however it can be moved by one cell position
 * if bumped into by an Autonomous object. It is displaced in the same direction as
 * the bump. For example, if the item was bumped on its right side and the motion of
 * the bump was towards the left, then the item will move to the left.
 * @author jbloch1
 *
 */
public class Moveable extends Item 
{
	public Moveable(String name, char token)
	{
		super(name, token);
	}
	
	public boolean isMoveable()
	{
		return true;
	}
}
