// Program to demonstrate event deligate model using ActionListener

import java.awt.*;
import java.awt.event.*;

class AWT_Frame3 extends Frame
{
	AWT_Frame3(String name)	
	{
		// call Frame class constructor
		super(name);
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame3 f = new AWT_Frame3("Marvellous Infosystems");
		
		// Decide size of that Frame
		f.setSize(500,500);

		// Display that frame
		f.setVisible(true);
		
		// Add action listener to frame
		// Pass the object of class which implments WindowListener
		f.addWindowListener(new ActionListener());	
	}
}

// Class which implements WindowListener
class ActionListener implements WindowListener
{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	//public void windowDeactivated(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}