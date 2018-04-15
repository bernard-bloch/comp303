import javax.print.attribute.UnmodifiableSetException;

/**
 * Immovable.
 * @author jbloch1
 *
 */
public class Immovable extends Item 
{
	public Immovable(final World world, final String name, final char token)
	{
		super(world, name, token);
	}
	@Override
	public boolean isMoveable(final Moveable push)
	{
		return false;
	}
	@Override
	public void move(final Moveable push) {
		throw new UnmodifiableSetException("Can't move.");
	}
}
