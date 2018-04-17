package JavaCool303;

import java.awt.Color;

/**
File Name: Cool303Container.java <br>
Purpose:	
		Cool 303 Containers store and display components in a fixed bounded area. 
		But the bounded area cannot be seen. It is an invisible area; however, the components can be seen
		and the containers can be given a background. Containers have an optional string. If this
		string is present, then the string is displayed as a title (in bold) appearing at the top left
		corner of the container area. Containers have an optional background color, if provided
		the invisible area is revealed. <br> 
Inputs: None <br>
Outputs: The results of each method <br> 
Modifications: None <br>
=========================================================================================================<br> 
Due Date: 2018-02-22 <br>
Stores the current pin and methods that will be used throughout in Pinmain.java and in TestPin.java.<br>
@since 2018-02-17 
@author Jonathan Bernard Bloch 
*/
public class Cool303PastelTheme implements Cool303Theme
{
	public static final Color pinkLace = new Color(255,204,249);
    public static final Color mauve = new Color(197,163,255);
	public static final Color meirose = new Color(175,20,147);
	public static final Color chocolate = new Color(210,105,30);
	public static final Color rosyBrown = new Color(188,143,143);
	
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: chocolate
	//Side-effects: None
	 * */
	public Color getBgColor() {
		return chocolate;
	}
	
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: mauve
	//Side-effects: None
	 * */
	public Color getContainerColor() {
		return mauve;
	}
	
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: meirse
	//Side-effects: None
	 * */
	public Color getButtonColor() {
		return meirose;
	}
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: Makes a button using the factory design pattern.
	//Outputs: button
	//Side-effects: None
	 * @param label Label of button.
	 * */
	public Cool303Button makeButton(String label) {
		return new Cool303PastelButton(label, getButtonColor());
	}

	/**
	@author Jonathan Bernard Bloch
	//Purpose: Makes a container using the factory design pattern.
	//Outputs: container
	//Side-effects: None
	 * */
	public Cool303Container makeContainer() {
		return new Cool303Container(getContainerColor());
	}
}
