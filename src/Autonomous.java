import java.util.Stack;

public class Autonomous extends Something {
	public Autonomous(String name, char token, int x, int y)
	{
		super(name, token, x, y);
	}
	
	public void step(Something[][] world)
	{
		double randomDecimalNum = Math.random();
		
		if(randomDecimalNum >= 0 && randomDecimalNum <= 0.25)
		{
			moveUp(world);
		}
		else if(randomDecimalNum >= 0.25 && randomDecimalNum < 0.50)
		{
			moveDown(world);
		}
		else if(randomDecimalNum >= 0.50 && randomDecimalNum < 0.75)
		{
			moveLeft(world);
		}
		else 
		{
			moveRight(world);
		}
	}
	

	public void moveUp(Something[][] world)
	{
		Stack recursion = new Stack();
		
		for(int row = this.getX(); world[row][this.getY()] != null; row--)
		{
			//if()
		}
	}
	
	public void moveDown(Something[][] world)
	{
		for(int row = this.getX(); world[row][this.getY()] != null; row++)
		{
			
		}
	}
	
	public void moveLeft(Something[][] world)
	{
		for(int column = this.getY(); world[this.getX()][column] != null; column--)
		{
			
		}
	}
	
	public void moveRight(Something[][] world)
	{
		for(int column = this.getY(); world[this.getX()][column] != null; column++)
		{
			
		}
	}
}
