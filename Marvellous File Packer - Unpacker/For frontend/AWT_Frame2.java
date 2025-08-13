// Program to demonstrate frame creation by extending frame class

import java.awt.*;

class AWT_Frame2 extends Frame
{
	AWT_Frame2(String name)	
	{
		// call Frame class constructor
		super(name);
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame2 f = new AWT_Frame2("Marvellous Infosystems");
		
		// Decide size of that Frame
		f.setSize(500,500);

		// Display that frame
		f.setVisible(true);
	}
}