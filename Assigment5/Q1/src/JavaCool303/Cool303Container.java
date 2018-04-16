package JavaCool303;
import java.awt.Color;

import javax.swing.JPanel;

/**
File Name: Cool303Container.java <br>
Purpose: Cool 303 Containers store and display components in a fixed bounded area. But the
		bounded area cannot be seen. It is an invisible area; however, the components can be seen
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
public class Cool303Container extends JPanel 
{
	
	private static final long serialVersionUID = 1L;

	public Cool303Container(Color container)
	{
		JPanel panel = new JPanel();
		panel.setSize(5,5);
		setBackground(container);
	}

}
