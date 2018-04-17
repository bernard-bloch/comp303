package JavaCool303;

import javax.swing.JPanel;

/**
	File Name: Cool303Container.java <br>
	Purpose:	
		Class Cool303Root is a container populated with Components and Containers. A user can
		implement more than one Cool303Root in their application. The Root is fancy and
		follows the selected theme and applies the theme to all elements populated within it. Root
		does not have a title or any other text. Root will auto size itself to the minimum size
		needed to display all the components if the user does not specify a size. If the user of
		Root defines a size the class will attempt to follow that request if it is sufficient to display
		all the components. If it is not big enough then the automatic sizing option is automatically initiated 
		overriding the user’s specified size. <br> 
	Inputs: None <br>
	Outputs: None <br> 
	Modifications: None <br>
	=========================================================================================================<br> 
	Due Date: 2018-04-16 <br>
	Creates the root panel that stores all the containers <br>
	@since 2018-03-17 
	@author Jonathan Bernard Bloch 
*/
public class Cool303Root extends JPanel
{
	
	private Cool303Window window;
	
	private static final long serialVersionUID = 1L;
	
	/**
	 	Outputs: None <br>
		Side-effects: None <br>
		Special notes: None <br>
		Developer: Jonathan Bernard Bloch <br>
		Purpose: Creates a Cool303Root object.
		@param window a decorated jframe <br>
	*/
	public Cool303Root(Cool303Window window)
	{
		super();
		this.window = window;
	}	
	
}
