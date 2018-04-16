package JavaCool303;

import java.awt.Color;

public class Cool303PastelTheme implements Cool303Theme
{
	public static final Color pinkLace = new Color(255,204,249);
    public static final Color mauve = new Color(197,163,255);
	public static final Color meirose = new Color(175,20,147);
	public static final Color chocolate = new Color(210,105,30);
	public static final Color rosyBrown = new Color(188,143,143);
	
	
	public Color getBgColor() {
		return chocolate;
	}
	
	public Color getContainerColor() {
		return mauve;
	}
	
	public Color getButtonColor() {
		return meirose;
	}
	
	public Cool303Button makeButton(String label) {
		return new Cool303SummerButton(label);
	}

	public Cool303Container makeContainer() {
		return new Cool303Container();
	}
}
