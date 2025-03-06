import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CylinderTest {
    public static void main( String[] args ) {
        Cylinder cylinder = new Cylinder( 12, 23, 2.5, 5.7 );
        String output = "X coordinate is " + cylinder.getX() +
            "\nY coordinate is " + cylinder.getY() + "\nRadius is " + 
            cylinder.getRadius() + "\nHeight is " + cylinder.getHeight();
        cylinder.setX( 35 );          // set new x-coordinate
        cylinder.setY( 20 );          // set new y-coordinate
        cylinder.setRadius( 4.25 );   // set new radius
        cylinder.setHeight( 10.75 );  // set new height
        output += "\n\nThe new location, radius and height of cylinder are\n" + 
                    cylinder.toString();
        DecimalFormat df = new DecimalFormat( "0.00" );
       	output += "\n\nDiameter is " + df.format( cylinder.getDiameter() );
        output += "\nCircumference is " + df.format( cylinder.getCircumference() );
        output += "\nArea is " + df.format( cylinder.getArea() );
        output += "\nVolume is " + df.format( cylinder.getVolume() );
        JOptionPane.showMessageDialog( null, output ); // display output
        System.exit( 0 );
    } // end main

} // end class CylinderTest
