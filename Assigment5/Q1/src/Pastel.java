import java.awt.Color;


public class Pastel implements Cool303Theme
{
	Color pinkLace;
    Color mauve;
	Color meirose;
	Color chocolate;
	Color rosyBrown;
	
	public Pastel()
	{
		pinkLace = getColor(255,204,249);
		mauve = getColor(197,163,255);
		meirose = getColor(175,20,147);
		chocolate = getColor(210,105,30);
		rosyBrown = getColor(188,143,143);
	}
	
	public Color getColor(int r, int g, int b)
	{
		return new Color(r,g,b);
	}
	
	
}
