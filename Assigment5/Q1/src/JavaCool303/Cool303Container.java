package JavaCool303;
import java.awt.Color;

import javax.swing.JPanel;

public class Cool303Container extends JPanel implements Cool303Component
{
	
	private static final long serialVersionUID = 1L;

	public Cool303Container()
	{
		JPanel panel = new JPanel();
		panel.setSize(5,5);
	}

	@Override
	public void setColor(Color c) 
	{
		setBackground(c);
	}
}
