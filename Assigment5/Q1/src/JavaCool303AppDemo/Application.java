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
		Class selectedTheme = Cool303PastelTheme.class;
		
		if(selectedTheme == Cool303SummerTheme.class)
		{
			Cool303SummerWindow cool303SummerWindow = new Cool303SummerWindow();
		
			cool303SummerWindow.setSize(500, 500);
		
			Cool303Root root = new Cool303Root();
			cool303SummerWindow.setContentPane(root);
			root.setLayout(new GridLayout(5,4,5,5));
			root.setColor(Cool303SummerTheme.khaki);

			for(int i=1; i <= 20; i++)
			{
			
				Cool303SummerButton cool303SummerButton = new Cool303SummerButton("" + i );
				Cool303Container container = new Cool303Container();
				container.setColor(Cool303SummerTheme.lavender);
			
			
				cool303SummerButton.setColor(Cool303SummerTheme.forestGreen);
				cool303SummerButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						System.out.println(cool303SummerButton.getText());
					}
				}
						);
			
			root.add(container);
			container.add(cool303SummerButton);
			}
		
		
			cool303SummerWindow.setVisible(true);
		}
		else if(selectedTheme == Cool303PastelTheme.class)
		{
			Cool303PastelWindow cool303PastelWindow = new Cool303PastelWindow();
			
			cool303PastelWindow.setSize(500, 500);
		
			Cool303Root root = new Cool303Root();
			cool303PastelWindow.setContentPane(root);
			root.setLayout(new GridLayout(5,4,5,5));
			root.setColor(Cool303PastelTheme.chocolate);

			for(int i=1; i <= 20; i++)
			{
			
				Cool303PastelButton cool303PastelButton = new Cool303PastelButton("" + i );
				Cool303Container container = new Cool303Container();
				container.setColor(Cool303PastelTheme.mauve);
			
			
				cool303PastelButton.setColor(Cool303PastelTheme.meirose);
				cool303PastelButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						System.out.println(cool303PastelButton.getText());
					}
				}
						);
			
			root.add(container);
			container.add(cool303PastelButton);
			}
		
		
			cool303PastelWindow.setVisible(true);
		}
	}
}
