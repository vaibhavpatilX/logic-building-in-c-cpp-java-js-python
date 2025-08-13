// Program to demonstrate text printing on frame

import java.awt.*;
import java.awt.event.*;

class AWT_Frame8 extends Frame
{
	AWT_Frame8()	
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
		// set background of frame
		this.setBackground(new Color(255,255,255));
		
		// Create font object for printing
		Font fn = new Font("Century",Font.BOLD,55);

		// set the font
		g.setFont(fn);
	
		// set font color
		g.setColor(Color.blue);

		// Draw string on frame
		g.drawString("Marvellous Infosystems",250,250);
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame8 f = new AWT_Frame8();
		
		// set size of window
		f.setSize(1200,500);
		
		// set title of window
		f.setTitle("Marvellous Infosystems");

		// Display that frame
		f.setVisible(true);
	}
}