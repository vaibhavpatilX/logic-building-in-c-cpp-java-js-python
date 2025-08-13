// Program to demonstrate displaying image on frame
// It support .gif and .jpg format

import java.awt.*;
import java.awt.event.*;

class AWT_Frame9 extends Frame
{
	// Create Image class object
	static Image im;

	AWT_Frame9()	
	{
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent w)
		{
			System.exit(0);
		}		
		});

		// Create Image object and load the image
		im = Toolkit.getDefaultToolkit().getImage("marvellous logo3 Final.jpg");			

		// Create object of MediaTracker for waiting purpose		
		MediaTracker m = new MediaTracker(this);

		// Add image
		// 1 is id for that image
		m.addImage(im,1);
		try
		{
			m.waitForID(1);
		}
		catch(InterruptedException e)
		{}		
	}

	public void paint(Graphics g)
	{
		// Draw image on screen
		g.drawImage(im,0,0,null);
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame9 f = new AWT_Frame9();
		
		// set size of window
		f.setSize(2424,960);
		
		// set title of window
		f.setTitle("Marvellous Infosystems");

		// Display that frame
		f.setVisible(true);
	}
}