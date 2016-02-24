//  sac grid crude map drawn with lines - jPanel in an applet
import java.awt.Graphics;
import javax.swing.JPanel;

public class Proj extends JPanel
{
    // draws a grid
    public void paintComponent( Graphics g )
    {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent( g );
        
        // these are cool but I don't want to make the lines change size based on the size of the panel:
        //int width = getWidth(); // total width of panel
        //int height = getHeight(); // total height of panel
        
        // Sacramento's grid has vertical North-South streets named numerically: 1st through 29th (28 streets)
        // and horizontal East-West Streets named alphabetically: C through W (21 streets).
        // Thus, this grid must be 28 lines wide and 21 lines tall.
        
        // Locations on the grid are colloquially referred to by their nearest cross-street in the form:
        // "Number & Letter", i.e., "8th & J", "27th & L", "15th & Q", etc.
        // This is ideal for a data structure (such as a 2d array) that can store each bike parking structure at a
        // location in the form (x, y). The x value will need to be the horizontal letter streets, so we'll switch the
        // order when outputting to the user, but having the value "8" (or other number street) and the value "J"
        // (or other letter street) that will serve as coordinates AND as partial names seems like it'll be very useful.
        // *if using a 2D array the letters (char) will probably have to be converted to integers and back*
        
        // first step is making the grid!
    
        // these are sample horizontal lines:
        // g.drawLine( 0, 25, width, 25 );
        // g.drawLine( 0, 50, width, 50);
        // so how do we iterate through the streets to create these lines?
        // in the letter streets (which we will call 1-21 for now), the y values change but never the x values
        // the y1 and y2 values in each line are the same, so one variable can be used for both, which we can call y
     
        
        //horizontal
        for (int y = 1; y < 22; y++)
        {
            g.drawLine( 25, (y * 25), 700, (y * 25) );
        }
        
        //vertical
        for (int x = 1; x < 29; x++)
        {
            g.drawLine( (x * 25), 25, (x * 25), 525);
        }
        
        
 
    } // end method paintComponent
} // end class Proj
