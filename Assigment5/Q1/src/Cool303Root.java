
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Cool303Root extends JPanel implements Cool303Component
{
	List <Cool303Component> list = new ArrayList<Cool303Component>();
	
	
	public Cool303Root()
	{
		setSize(300, 300);
		setVisible(true);
		setLayout(new GridLayout(5,4,5,5));
	}
	@Override
	public void setColor(Color c) 
	{	
		setBackground(c);
	}
	
	public void addC(Cool303Component a)
	{
		list.add(a);
		add((JComponent) a);
	}
}
