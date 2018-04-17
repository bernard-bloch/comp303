package JavaCool303;

import java.awt.Color;


/**
File Name: Cool303Container.java <br>
Purpose:	
		Cool303 pastel buttons are bubbly shaped buttons colored in pastel colors. <br> 
Inputs: None <br>
Outputs: None <br> 
Modifications: None <br>
=========================================================================================================<br> 
Due Date: 2018-04-16 <br>
@since 2018-02-17 
@author Jonathan Bernard Bloch 
*/
public class Cool303PastelButton extends Cool303RoundButton
{
	/**
	 * Added by Eclipse
	 */
	private static final long serialVersionUID = -9125276676569865812L;
	
	/**
		@author Jonathan Bernard Bloch
		Purpose: <<what is this source file trying to accomplish>>
		@param label which labels the round button
		@param c the color of the container.
		Outputs: None
		Side-effects: None
		Special notes: None
 */
	public Cool303PastelButton(String label, Color c)
	{
		super(label, c);
		setBackground(c);
	}
	
}
