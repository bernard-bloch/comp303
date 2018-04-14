import java.awt.Color;
import java.awt.Font;
import java.awt.Shape;
import javax.swing.JButton;

public class Cool303Button extends JButton implements Cool303Component
{
	public Cool303Button(String s)
	{
		JButton button = new JButton();
		setText(s);
		
		setFont(new Font("Tahoma", Font.BOLD, 12));
		//setFocusPainted(false);	
	}
	
	
	public void setColor(Color c)
	{
		setBackground(c);
		//setBackground(Color.blue);
	}
	public void setPosSize(int x,int y, int w, int h){
		setBounds(x,y,w,h);
	}
	
}
