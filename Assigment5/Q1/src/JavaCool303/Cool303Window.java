package JavaCool303;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class Cool303Window extends JFrame 
{
	private static final long serialVersionUID = 1L;
	protected Cool303Theme theme;
	private Cool303Root root;
	public Cool303Button makeButton(String label) {
		return theme.makeButton(label);
	}
	public Cool303Container makeContainer() {
		return theme.makeContainer();
	}
	public Cool303Window(Cool303Theme theme)
	{
		this.theme = theme;
		root = new Cool303Root();
		this.setContentPane(root);
	}
	public void setLayout(LayoutManager manager)
	{
		root.setLayout(manager);
	}
}
