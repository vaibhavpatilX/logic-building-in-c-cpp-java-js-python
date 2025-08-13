// Program to demonstrate background color setting

import java.awt.*;
import java.awt.event.*;

class AWT_Frame7 extends Frame
{
	AWT_Frame7()	
	{
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent w)
		{
			System.exit(0);
		}		
		});
	}

	public void paint(Graphics g)
	{
		this.setBackground(new Color(255,155,55));
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame7 f = new AWT_Frame7();
		
		// set size of window
		f.setSize(300,300);
		
		// set title of window
		f.setTitle("Marvellous Infosystems");

		// Display that frame
		f.setVisible(true);
	}
}