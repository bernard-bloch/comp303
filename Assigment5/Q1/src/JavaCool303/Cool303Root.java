package JavaCool303;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * 
 * @author jbloch1
 *
 */
public class Cool303Root extends JPanel implements Cool303Component
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Cool303Root()
	{

	}
	@Override
	public void setColor(Color c) 
	{	
		setBackground(c);
	}
	
	
}
