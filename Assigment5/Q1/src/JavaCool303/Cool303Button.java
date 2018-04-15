package JavaCool303;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class Cool303Button extends RoundButton implements Cool303Component
{
	//No idea what this is
	private static final long serialVersionUID = 1L;
	
	public Cool303Button(String s)
	{
		super(s);
		setText(s);
		setFont(new Font("Tahoma", Font.BOLD, 12));	
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
