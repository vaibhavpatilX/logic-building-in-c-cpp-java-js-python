import java.awt.*;
import java.awt.event.*;

class AWT_Frame5 extends Frame
{
	AWT_Frame5(String name)	
	{
		// call Frame class constructor
		super(name);
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Frame5 f = new AWT_Frame5("Marvellous Infosystems");
		
		// Decide size of that Frame
		f.setSize(500,500);

		// Display that frame
		f.setVisible(true);
		
		// anonymous inner class
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});	
	}
}