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
			
			//world.display();

			String response;
			while(true)
			{
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
		if(World.columnSize * World.rowSize<immovables+moveables+autonomous) throw new IndexOutOfBoundsException("Not enough room for those objects");
		World world = new World();
		Random ran = new Random(0); // debugging, always creates random at the same place
		for(int i = 0; i < immovables; i++) {
			char tok = (char) ('a' + (i % 26));
			String str = "" + tok;
			Immovable imm = new Immovable(str, tok);
			boolean success = false;
			do {
				try {
					int x = ran.nextInt(World.rowSize), y = ran.nextInt(World.columnSize);
					world.add(imm, x, y);
					success = true;
				} catch(ArrayStoreException e) {
					// try again in a different place
				}
			} while(!success);
		}
		/*addImmovablesToList(world, immovables);
		addMoveablesToList(world, moveables);
		addAutonomousToList(world, autonomous);*/
		return world;
		/*int countImmovableObjects, countMoveableObjects, countAutonomousObjects;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many immovable objects would you like in the world?");
		countImmovableObjects = Integer.parseInt(in.readLine());
		System.out.println("How many moveable objects would you like in the world?");
		countMoveableObjects = Integer.parseInt(in.readLine());
		System.out.println("How many autonomous objects would you like in the world?");
		countAutonomousObjects = Integer.parseInt(in.readLine()); */
	}
	
	/*public static void addImmovablesToList(World world, int countImmovableObjects) throws IOException 
	{
		String name; char token; int x, y; 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int immovableObjsNum = 0; immovableObjsNum < countImmovableObjects; immovableObjsNum++)
		{	
			System.out.println("What name will you give this object");
			
			name = in.readLine();
			
			System.out.println("What token will you give this object");
			
			token = in.readLine().charAt(0);
		
			do{
				System.out.println("Where on the x-axis will this object be placed?");
				
				x = Integer.parseInt(in.readLine());
			
				System.out.println("Where on the y-axis will this object be placed?");
			
				y = Integer.parseInt(in.readLine());
			
				try
				{
					world.add(new Immovable(name, token, x, y), x, y);
					break;
				}catch(Exception error)
				{
					System.err.println(error.getMessage());
				}
				System.out.println("here");
			}while(true);
		}
	}
	
	public static void addMoveablesToList(World world, int countMoveableObjects) throws IOException
	{
		String name; char token; int x, y; 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int movableObjsNum = 0; movableObjsNum < countMoveableObjects; movableObjsNum++)
		{ 	
			System.out.println("What name will you give this object");
			
			name = in.readLine();
			
			System.out.println("What token will you give this object");
			
			token = in.readLine().charAt(0);
			
			do
			{
				System.out.println("Where on the x-axis will this object be placed?");
			
				x = Integer.parseInt(in.readLine());
			
				System.out.println("Where on the y-axis will this object be placed?");
			
				y = Integer.parseInt(in.readLine());
			
				try
				{
					world.add(new Moveable(name, token, x, y), x, y);
					break;
				}catch(Exception error)
				{
					System.err.println(error.getMessage());
				}
				
			}while(true);
		}
	}
	
	public static void addAutonomousToList(World world, int countAutonomousObjects) throws IOException
	{
		String name; char token; int x, y; 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int autonomousObjsNum = 0; autonomousObjsNum < countAutonomousObjects; autonomousObjsNum++)
		{
			System.out.println("What name will you give this object");
			
			name = in.readLine();
			
			System.out.println("What token will you give this object");
			
			token = in.readLine().charAt(0);

			do
			{
				System.out.println("Where on the x-axis will this object be placed?");
			
				x = Integer.parseInt(in.readLine());
			
				System.out.println("Where on the y-axis will this object be placed?");
			
				y = Integer.parseInt(in.readLine());
			
				try
				{
					world.add(new Autonomous(name, token), x, y);
					break;
				}catch(IOException error)
				{
					System.err.println(error.getMessage());
				}
				
			}while(true);
		}
	}*/
}
