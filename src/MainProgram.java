import java.util.Scanner;
import java.util.List;
import java.util.Stack;

public class MainProgram 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String response;
		
		World world = buildWorld();
		
		do
		{
			for(int countIteration = 1; countIteration <= 100; countIteration++)
			{
				world.step();
			}
			
			while(true)
			{
				System.out.println("Would you like to run the simulation again?");
				response = in.nextLine();
				
				if(response.equalsIgnoreCase("no") || response.equalsIgnoreCase("yes")) break;
				else System.out.println("Please reply either a yes or a no.");
			}
			
			if(response.equalsIgnoreCase("no")) break;

		}while(true);
		
		
	}
	
	private static World buildWorld()
	{
		int countImmovableObjects, countMoveableObjects, countAutonomousObjects;
		Scanner in = new Scanner(System.in);
		World world;
		
		while(true)
		{
			try
			{
				world = new World();
				break;
			}catch(Exception error)
			{
				System.out.println(error.getMessage());
			}
		}

		System.out.println("How many immovable objects would you like in the world?");
		
		countImmovableObjects = in.nextInt();
		

		System.out.println("How many moveable objects would you like in the world?");
		
		countMoveableObjects = in.nextInt();
		
		
		System.out.println("How many autonomous objects would you like in the world?");
		
		countAutonomousObjects = in.nextInt();
		
		addImmovablesToList(world, countImmovableObjects);
		
		addMoveablesToList(world, countMoveableObjects);

		addAutonomousToList(world, countAutonomousObjects);
		
		return world;
	}
	
	public static void addImmovablesToList(World world, int countImmovableObjects) 
	{
		Scanner in = new Scanner(System.in);
		
		for(int immovableObjsNum = 0; immovableObjsNum < countImmovableObjects; countImmovableObjects++)
		{
			String name; char token; int x, y; 
			
			System.out.println("What name will you give this object");
			
			name = in.nextLine();
			
			System.out.println("What token will you give this object");
			
			token = in.next().charAt(0);
			
			do
			{
				System.out.println("Where name on the x-axis will this object be placed on?");
			
				x = in.nextInt();
			
				System.out.println("Where name on the y-axis will this object be placed on?");
			
				y = in.nextInt();
			
				try
				{
					world.add(new Immovable(name, token, x, y), x, y);
					break;
				}catch(Exception error)
				{
					System.err.println(error.getMessage());
				}
				
			}while(true);
		}
	}
	
	public static void addMoveablesToList(World world, int countMoveableObjects)
	{
		Scanner in = new Scanner(System.in);
		
		for(int immovableObjsNum = 0; immovableObjsNum < countMoveableObjects; countMoveableObjects++)
		{
			String name; char token; int x, y; 
			
			System.out.println("What name will you give this object");
			
			name = in.nextLine();
			
			System.out.println("What token will you give this object");
			
			token = in.next().charAt(0);
			
			do
			{
				System.out.println("Where name on the x-axis will this object be placed on?");
			
				x = in.nextInt();
			
				System.out.println("Where name on the y-axis will this object be placed on?");
			
				y = in.nextInt();
			
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
	
	public static void addAutonomousToList(World world, int countAutonomousObjects)
	{
		Scanner in = new Scanner(System.in);
		
		for(int immovableObjsNum = 0; immovableObjsNum < countAutonomousObjects; countAutonomousObjects++)
		{
			String name; char token; int x, y; 
			
			System.out.println("What name will you give this object");
			
			name = in.nextLine();
			
			System.out.println("What token will you give this object");
			
			token = in.next().charAt(0);
			
			System.out.println("Where name on the x-axis will this object be placed on?");
			
			x = in.nextInt();
			
			System.out.println("Where name on the y-axis will this object be placed on?");
			
			y = in.nextInt();
			

			do
			{
				System.out.println("Where name on the x-axis will this object be placed on?");
			
				x = in.nextInt();
			
				System.out.println("Where name on the y-axis will this object be placed on?");
			
				y = in.nextInt();
			
				try
				{
					world.add(new Autonomous(name, token, x, y), x, y);
					break;
				}catch(Exception error)
				{
					System.err.println(error.getMessage());
				}
				
			}while(true);
		}
	}
}
