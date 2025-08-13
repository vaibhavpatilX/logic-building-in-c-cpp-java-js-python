// Program to demonstrate frame creation 

import java.awt.*;
class AWT_Frame
{
	public static void main(String args[])
	{
		// Create new frame
		Frame f = new Frame("Marvellous Infosystems");
		
		// Decide size of that Frame
		f.setSize(500,500);

		// Display that frame
		f.setVisible(true);
	}
}