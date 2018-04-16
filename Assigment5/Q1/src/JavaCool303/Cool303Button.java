package JavaCool303;

import java.awt.Color;

import javax.swing.JButton;

public abstract class Cool303Button extends JButton
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Cool303Button(String string, Color color)
	{
		super(string);
		setBackground(color);
	}
}
