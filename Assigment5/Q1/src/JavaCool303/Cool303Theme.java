package JavaCool303;

import java.awt.Color;

public interface Cool303Theme {
	public Color getBgColor();
	public Color getContainerColor();
	public Color getButtonColor();
	public Cool303Button makeButton(String label);
	public Cool303Container makeContainer();
}
