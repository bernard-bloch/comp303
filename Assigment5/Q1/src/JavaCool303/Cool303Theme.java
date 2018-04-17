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
public interface Cool303Theme {

	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: background color
	//Side-effects: None
	 * */
	public Color getBgColor();

	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: container color
	//Side-effects: None
	 * */
	public Color getContainerColor();

	/**
	@author Jonathan Bernard Bloch
	//Purpose: accessor
	//Outputs: button color
	//Side-effects: None
	 * */
	public Color getButtonColor();

	/**
	@author Jonathan Bernard Bloch
	//Purpose: Makes a container using the factory design pattern.
	//Outputs: container
	//Side-effects: None
	 * @param label Label of button.
	 * */
	public Cool303Button makeButton(String label);

	/**
	@author Jonathan Bernard Bloch
	//Purpose: Makes a container using the factory design pattern.
	//Outputs: container
	//Side-effects: None
	 * */
	public Cool303Container makeContainer();
}
