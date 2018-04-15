import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class MainProgram 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		World world = buildWorld(5, 3, 2);
		
		do
		{
			for(int countIteration = 1; countIteration <= 100; countIteration++)
			{
				world.step();
			}
			
			world.display();

			String response;
			while(true)
			{
				System.out.println(world);
				System.out.println("Would you like to run the simulation again?");
				response = in.readLine();	
				if(response.equalsIgnoreCase("no") || response.equalsIgnoreCase("yes")) break;
				else System.out.println("Please reply either a yes or a no.");
			}			
			if(response.equalsIgnoreCase("no")) break;

		}while(true);	
		System.out.println("Fine then!! Have a nice day!");
	}
	
	/**
	 * construct a world of and then populate
	 * @throws IndexOutOfBoundsException If there is not enough room.
	 */
	private static World buildWorld(int immovables, int moveables, int autonomous)
	{
		final int rows = 5, columns = 5;
		// ensure the size is enough for every object
		if(columns * rows<immovables+moveables+autonomous) throw new IndexOutOfBoundsException("Not enough room for those objects");
		World world = new World(rows, columns);
		Random ran = new Random(0); // debugging, always creates random at the same place
		
		for(int i = 0; i < immovables; i++) {
			char tok = (char) ('A' + (i % 26));
			String str = "" + tok;
			Immovable imm = new Immovable(world, "Imm-"+str, tok);
			boolean success = false;
			do {
				try {
					int x = ran.nextInt(world.rowSize), y = ran.nextInt(world.columnSize);
					world.add(imm, x, y);
					success = true;
				} catch(ArrayStoreException e) {
					// the contents are occupied try again in a different place
				}
			} while(!success);
		}
		for(int i = 0; i < moveables; i++) {
			char tok = (char) ('a' + (i % 26));
			String str = "" + tok;
			Moveable mov = new Moveable(world, "Mov-"+str, tok);
			boolean success = false;
			do {
				try {
					int x = ran.nextInt(world.rowSize), y = ran.nextInt(world.columnSize);
					world.add(mov, x, y);
					success = true;
				} catch(ArrayStoreException e) {
					// the contents are occupied try again in a different place
				}
			} while(!success);
		}
		/*for(int i = 0; i < autonomous; i++) {
			char tok = (char) ('!' + (i % 32));
			String str = "" + tok;
			Autonomous aut = new Autonomous(world, "Aut-"+str, tok);
			boolean success = false;
			do {
				try {
					int x = ran.nextInt(world.rowSize), y = ran.nextInt(world.columnSize);
					world.add(aut, x, y);
					success = true;
				} catch(ArrayStoreException e) {
					// the contents are occupied try again in a different place
				}
			} while(!success);
		}*/
		return world;
	}
}
