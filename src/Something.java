import java.util.ArrayList;
import java.util.List;

public abstract class Something 
{
	private String name;
	private char token;
	private int x, y;

	
	public Something(String name, char token, int x, int y)
	{
		this.name = name;
		this.token = token;
		this.x = x;
		this.y = y;
	}
	
	public void step(Something[][] world)
	{
		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setToken(char token)
	{
		this.token = token;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public String getName()
	{
		return name;
	}
	
	public char getToken()
	{
		return token;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}
