import java.awt.Color;

public class Summer implements Cool303Theme
{
	Color lavender;
	Color khaki;
	Color forestGreen;
    Color pink;
	Color blue;

	public Summer()
	{
		lavender = getColor(230,230,250);
		khaki = getColor(240,230,140);
		forestGreen = getColor(34,139,34);
		pink = getColor(255,192,203);
		blue = getColor(0, 0, 255);
	}
	
	
	public Color getColor(int r, int g, int b)
	{
		return new Color(r,g,b);
	}
}

