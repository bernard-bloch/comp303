package JavaCool303;
import java.awt.Color;

import javax.swing.JPanel;

public class Cool303Container extends JPanel 
{
	
	private static final long serialVersionUID = 1L;

	public Cool303Container()
	{
		JPanel panel = new JPanel();
		panel.setSize(5,5);
	}

	public void setColor(Color c) 
	{
		setBackground(c);
	}
}
