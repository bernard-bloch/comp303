import java.util.List;
import java.util.Scanner;

public class World 
{
	private Something world [][];
	
	
	public World() throws Exception
	{
		int numberOfRows, numberOfColumns;

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you would like your world to have.");
		
		numberOfRows = in.nextInt();
		
		System.out.println("Enter the number of columns you would like your world to have.");
		
		numberOfColumns = in.nextInt();

		if(!(isValidSize(numberOfRows, numberOfColumns))) throw new Exception("Invalid array size. Please try again");
		else world = new Something[numberOfRows][numberOfColumns];
	}


	public void step()
	{
		for(int row = 0; row < world.length; row++)
		{
			for(int column = 0; column < world[row].length; column++)
			{
				if(world[row][column].getClass() == Autonomous.class)
					world[row][column].step(world);
			}
		}
	}
	
	
	public void display()
	{
		
	}
	
	
	public void add(Something item, int x, int y) throws Exception
	{
		if(!(isValidSize(x, y))) throw new Exception("Invalid array size.");
		else if(world[x][y] != null) throw new Exception("Cell is already occupied. Please try another!");
		else world[x][y] = item;
	}
	
		
	private boolean isValidSize(int numberOfRows, int numberOfColumns)
	{
		if(!(numberOfRows >= 0 && numberOfColumns >= 0)) return false;
		else return true;
	}
}
