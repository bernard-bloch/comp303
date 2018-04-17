package JavaCool303;
import javax.swing.JFrame;

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
public class Cool303Window extends JFrame
{
	private static final long serialVersionUID = 1L;
	protected Cool303Theme theme;
	private Cool303Root root;
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: Makes a container using the factory design pattern.
	//Outputs: container
	//Side-effects: None
	 * @param label Label of button.
	 * @return A button.
	 * */
	public Cool303Button buttonFactory(String label) {
		return theme.makeButton(label);
	}
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: Makes a container using the factory design pattern.
	//Outputs: container
	//Side-effects: None
	 * @return A container
	 * */
	public Cool303Container containerFactory() {
		return theme.makeContainer();
	}
	
	/**
	@author Jonathan Bernard Bloch
	//Purpose: Create a window.
	//Inputs: An instance of a theme.
	//Outputs: Constructor
	//Side-effects: one
	 * @param theme An instance of a theme.
	 * @throws NullPointerException if the theme is null.
	 * */
	public Cool303Window(Cool303Theme theme)
	{
		if(theme == null) throw new NullPointerException("Must have a theme.");
		this.theme = theme;
		root = new Cool303Root(this);
		this.setContentPane(root);
	}
	
}
