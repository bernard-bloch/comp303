package JavaCool303;

import java.awt.Color;

public class Cool303PastelButton extends RoundButton
{
	/**
	 * Added by Eclipse
	 */
	private static final long serialVersionUID = -9125276676569865812L;
	
	public Cool303PastelButton(String label)
	{
		super(label);
	}
	
	public void setColor(Color c)
	{
		setBackground(c);
	}
}
