import javax.swing.JOptonPane;
import java.text.DecimalFormat;

/**
    This program uses the DecimalFormat class to display
    formatted numbers in a message dialog.
*/

public class Format4
{
    public static void main( String[] args )
    {
        double number1 = 0.12;
        double number2 = 0.05;

        // Create a DecimalFormat object.
        DecimalFormat formatter = new DecimalFormat( "#0%" );

        // Display the formatted variable contents.
        JOptonPane.showMessageDialog( null, formatter.format( number1 ) );
        JOptonPane.showMessageDialog( null, formatter.format( number2 ) );
    }
}