/**
 * Immovable.
 * @author jbloch1
 *
 */
public class Immovable extends Item 
{
	public Immovable(String name, char token)
	{
		super(name, token);
	}
	public boolean isMoveable()
	{
		return false;
	}
}
