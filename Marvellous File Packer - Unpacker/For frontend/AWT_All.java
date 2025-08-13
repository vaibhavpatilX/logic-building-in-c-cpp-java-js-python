import java.awt.*;
import java.awt.event.*;

public class AWT_All
{
    // characteristics
    Frame mainFrame;
    Label headerLabel;
    Label statusLabel;
    Panel controlPanel;
    
    // ccontrutcor
    public AWT_All()
    {
        mainFrame = new Frame("Marvellous Infosystems");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }
        });
        
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        
        statusLabel.setSize(350,100);
        
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        AWT_All  obj = new AWT_All();
        obj.Display();
    }
    
    private void Display()
    {
        headerLabel.setText("Please select batch");
        
        Button PPA = new Button("PPA");
        Button LB = new Button("LB");
        Button Angular = new Button("Angular");
        
        PPA.setActionCommand("PPA");
        LB.setActionCommand("LB");
        Angular.setActionCommand("Angular");
        
        PPA.addActionListener(new MyListener());
        LB.addActionListener(new MyListener());
        Angular.addActionListener(new MyListener());
        
        controlPanel.add(PPA);
        controlPanel.add(LB);
        controlPanel.add(Angular);
        
        mainFrame.setVisible(true);
    }
    
    private class MyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String command = e.getActionCommand();
            if( command.equals( "PPA" ))
            {
                statusLabel.setText("Pre-Placement Activity batch selected");
            }
            else if( command.equals( "LB" ) )
            {
                statusLabel.setText("Logic Building batch selected");
            }
            else if( command.equals( "Angular" ) )
            {
                statusLabel.setText("Web Development using Angular");
            }  	
        }		
    }
}
