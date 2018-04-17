package JavaCool303;

import java.awt.Color;

/**
	File Name: Cool303SummerTheme.java <br>
	Purpose:	
			A set of type Summer colors <br> 
	Inputs: None <br>
	Outputs: None <br> 
	Modifications: None <br>
	=========================================================================================================<br> 
	Due Date: 2018-03-17 <br>
	<br>
	@since 2018-02-17 
	@author Jonathan Bernard Bloch 
*/
public class Cool303SummerTheme implements Cool303Theme
{

	public static Color lavender = new Color(230,230,250);
	public static Color khaki = new Color(240,230,140);
	public static Color forestGreen = new Color(34,139,34);
	public static Color pink = new Color(255,192,203);
	public static Color blue = new Color(0, 0, 255);

	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: khaki
	//Side-effects: None
	 * */
	public Color getBgColor() {
		return khaki;
	}
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: lavender
	//Side-effects: None
	 * */
	public Color getContainerColor() {
		return lavender;
	}
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: forest green
	//Side-effects: None
	 * */
	public Color getButtonColor() {
		return forestGreen;
	}
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: Makes a button using the factory design pattern.
	//Outputs: button
	//Side-effects: None
	 * @param label Label of button.
	 * */
	public Cool303Button makeButton(String label) {
		return new Cool303SummerButton(label, getButtonColor());
	}

	/**
	@author Jonathan Bernard Bloch
	//Purpose: Makes a container using the factory design pattern.
	//Outputs: container
	//Side-effects: None
	 * */
	@Override
	public Cool303Container makeContainer() {
		return new Cool303Container(getContainerColor());
	}
	
}
