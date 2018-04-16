package JavaCool303;

import java.awt.Color;

//import java.awt.Color;

import javax.swing.JButton;

/**
 * 
 * @author jbloch1
 *
 */
public class Cool303SummerButton extends JButton
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Cool303SummerButton(String s)
	{
		super(s);
	}
	public void setColor(Color c)
	{
		setBackground(c);
		//setBackground(Color.blue);
	}
	
	
}

