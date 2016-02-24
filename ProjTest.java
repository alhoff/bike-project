// Application to display a panel with grid
import javax.swing.JFrame;

public class ProjTest
{
    public static void main( String[] args )
    {
        // create a panel that contains our drawing
        Proj panel = new Proj();
        
        // create a new frame to hold the panel
        JFrame application = new JFrame();
        
        // set the frame to exit when it is closed
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        application.add( panel ); // add the panel to the frame
        application.setSize( 750, 575 ); // set the size of the frame
        application.setVisible( true ); // make the frame visible
    } // end main
} // end class ProjTest
