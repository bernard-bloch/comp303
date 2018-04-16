package JavaCool303;

import java.awt.Color;

/**
 * 
 * @author jbloch1
 *
 */
public class Cool303SummerTheme implements Cool303Theme
{

	public static Color lavender = new Color(230,230,250);
	public static Color khaki = new Color(240,230,140);
	public static Color forestGreen = new Color(34,139,34);
	public static Color pink = new Color(255,192,203);
	public static Color blue = new Color(0, 0, 255);

	public Color getBgColor() {
		return khaki;
	}
	
	public Color getContainerColor() {
		return lavender;
	}
	
	public Color getButtonColor() {
		return forestGreen;
	}
	
	public Cool303Button makeButton(String label) {
		return new Cool303SummerButton(label);
	}

	@Override
	public Cool303Container makeContainer() {
		return new Cool303Container();
	}
	
}
