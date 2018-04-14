import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class WorldSet extends LinkedHashSet<Item> {
	// I have no idea, Eclipse generated it for me
	private static final long serialVersionUID = 1L;

	private /*there is no way to final*/ HashMap<Item,Object> map = null;
	private Object PRESENT = null;
	
	@SuppressWarnings("unchecked")
	public WorldSet(final int x, final int y) {
		super(x * y);
		Field f;
		try {
			f = this.getClass().getDeclaredField("map");
			f.setAccessible(true);
			map = (HashMap<Item,Object>)f.get(this);
			f = this.getClass().getDeclaredField("PRESENT");
			f.setAccessible(true);
			PRESENT = f.get(this);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public Item get(final Item other) {
		/*Item item = map.put(other, PRESENT)
		int hash = other.hashCode();*/
		return null;
	}
}
