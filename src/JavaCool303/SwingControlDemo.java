package JavaCool303;
import java.awt.*;	// Basic java graphics library
import java.awt.event.*;	//Basic java event handling library
import javax.swing.*;	//The Swing library

private class ButtonClickListener implements ActionListener
{
	private JLabel statusLabel = new JLabel;

	private ButtonClickListener()
	{
	}
	
	if(command.equals( "OK" )) 
	{
		statusLabel.setText("Ok Button clicked.");
	} 
	else if(command.equals("Submit")) 
	{
		statusLabel.setText("Submit Button clicked.");
	} 
	else 
	{
		statusLabel.setText("Cancel Button clicked.");
	}

	public void actionPerformed(ActionEvent e) 
	{
		String command = e.getActionCommand();
	}
}




public class SwingControlDemo 
{
	private JFrame mainFrame; // A window
	private JLabel headerLabel; // Label - display text
	private JLabel statusLabel; // Label – display text
	private JPanel controlPanel;// Panel – can be populated
	
	public SwingControlDemo()	// constructor & main method
	{
		prepareGUI();
	}
	
	public static void main(String[] args){
		SwingControlDemo swingControlDemo = new SwingControlDemo();
		swingControlDemo.showEventDemo();
		}
	
	private void prepareGUI(){
		mainFrame = new JFrame("Java SWING Examples");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3, 1));
		headerLabel = new JLabel("",JLabel.CENTER );
		statusLabel = new JLabel("",JLabel.CENTER);
		statusLabel.setSize(350,100);
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
			System.exit(0);
			}
			});
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
	}
	
	private void showEventDemo(){
		headerLabel.setText("Control in action: Button");

		JButton okButton
		= new JButton("OK");
		JButton submitButton = new JButton("Submit");
		JButton cancelButton = new JButton("Cancel");
		
		okButton.setActionCommand("OK");
		submitButton.setActionCommand("Submit");
		cancelButton.setActionCommand("Cancel");
		
		okButton.addActionListener(new ButtonClickListener());
		submitButton.addActionListener(new ButtonClickListener());
		cancelButton.addActionListener(new ButtonClickListener());
		
		controlPanel.add(okButton);
		controlPanel.add(submitButton);
		controlPanel.add(cancelButton);
		
		mainFrame.setVisible(true);
	}
}
}

