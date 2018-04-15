package JavaCool303AppDemo;

/**
 	<h1>File Name: Application.java </h1><br>
 	@author Jonathan Bernard Bloch 
*/


import JavaCool303.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Application
{
	
	public static void main(String[] args)
	{
		Cool303Window window = new Cool303Window();
		
		window.setSize(500, 500);
		
		Cool303Root root = new Cool303Root();
		window.setContentPane(root);
		root.setLayout(new GridLayout(5,4,5,5));
		root.setColor(PastelButton.chocolate);

		for(int i=1; i <= 20; i++)
		{
			
			Cool303Button button = new Cool303Button("" + i );
			Cool303Container container = new Cool303Container();
			container.setColor(PastelButton.mauve);
			
			
			button.setColor(SummerButton.forestGreen);
			button.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.out.println(button.getText());
			}	}					
									);
			
			root.add(container);
			container.add(button);
			
		}
		
		window.setVisible(true);	
	}
}