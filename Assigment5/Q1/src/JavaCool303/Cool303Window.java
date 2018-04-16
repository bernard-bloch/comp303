package JavaCool303;
import javax.swing.JFrame;

public class Cool303Window extends JFrame
{
	private static final long serialVersionUID = 1L;
	protected Cool303Theme theme;
	private Cool303Root root;
	public Cool303Button buttonFactory(String label) {
		return theme.makeButton(label);
	}
	public Cool303Container containerFactory() {
		return theme.makeContainer();
	}
	public Cool303Window(Cool303Theme theme)
	{
		this.theme = theme;
		root = new Cool303Root(this);
		this.setContentPane(root);
	}
	
}
