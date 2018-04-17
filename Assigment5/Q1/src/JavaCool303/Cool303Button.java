package JavaCool303;

import java.awt.Color;

import javax.swing.JButton;


/**
File Name: Cool303Button.java <br>
Purpose:	
		Cool 303 buttons store and display components in a fixed bounded area. 
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
public abstract class Cool303Button extends JButton
{

	
	private static final long serialVersionUID = 1L;

	/**
		@author Jonathan Bernard Bloch
		Purpose: To construct the Cool303Button  
		@param string A string used to label the button
		@param color the color of the button
		@return None
		Side-effects: None
		Special notes: None
	*/
	public Cool303Button(String string, Color color)
	{
		super(string);
		setBackground(color);
	}
}
