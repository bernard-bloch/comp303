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
	// Name:  in case we print a hard copy
	// Developers: <<all the programmers who worked on this file>>
	// Purpose: <<what is this source file trying to accomplish>>
	// Inputs: <<None>> <<or, describe each one, files, user, ...>>
	// Outputs: <<None>> <<ditto>>
	// Side-effects: <None>> <<ditto>>
	// Special notes: <<None>> <<ditto>>
	public static void main(String[] args)
	{
		Cool303Theme a = new Cool303SummerTheme();
		Cool303Theme b = new Cool303PastelTheme();
		Cool303Window window = new Cool303Window(b);
		window.setSize(500, 500);
		window.setLayout(new GridLayout(5,4,5,5));
		for(int i=1; i <= 20; i++)
		{
			// add a button
			Cool303Button button = window.buttonFactory(""+i);
			button.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.out.println(button.getText());
				}
			}
			);
			
			// add a container
			Cool303Container container = window.containerFactory();
			window.add(container);
			container.add(button);
			
		}
		window.setVisible(true);
	}
}
