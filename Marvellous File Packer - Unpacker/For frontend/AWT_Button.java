// Program to Push Buttons

import java.awt.*;
import java.awt.event.*;

class AWT_Button extends Frame// implements ActionListener
{
	Button a,b;

	AWT_Button()
	{
		addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent w)
            {
                System.exit(0);
            }
		});

		// Set layout to insert buttons
		//setLayout(new FlowLayout());
		
		// Create objects of button class
		a = new Button("Demo");
		b = new Button("Hello");
			
		// set position of that buttons
		a.setBounds(100,100,50,50);
		b.setBounds(100,160,50,50);

		// Add that buttons to frame
		this.add(a);
		this.add(b);
	}

	public static void main(String args[])
	{
		// Create new frame
		AWT_Button f = new AWT_Button();

		// set size of window
		f.setSize(400,400);
		
		// set title of window
		f.setTitle("Marvellous Infosystems");

		// Display that frame
		f.setVisible(true);
	}
}
