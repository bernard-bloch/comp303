import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class Application
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		Cool303Root r = new Cool303Root();
		f.setContentPane(r);
		
		r.setColor(new Pastel().chocolate);

		for(int i=1; i <= 20; i++)
		{
			
			Cool303Button b = new Cool303Button("" + i );
			Cool303Container container = new Cool303Container();
			container.setBackground(new Pastel().mauve);
			
			
			b.setColor(new Summer().forestGreen);
			b.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println(b.getText());
			}});
			r.add(container);
			container.add(b);
			
		}
		
 
		
		f.setVisible(true);
		
		
	}
}
