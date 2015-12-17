import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
    This program uses the DecimalFormat class to display
    formatted numbers in a message dialog.
*/

public class Format3
{
    public static void main( String[] args )
    {
        double number1 = 123.899;
        double number2 = 1233.899;
        double number3 = 12345.899;
        double number4 = 1234567.899;
        double number5 = 1234567.899;

        // Create a DecimalFormat object.
        DecimalFormat formatter = new DecimalFormat( "#,##0.00" );

        // Display the formatted variable contents.
        JOptionPane.showMessageDialog( null, formatter.format( number1 ) );
        JOptionPane.showMessageDialog( null, formatter.format( number2 ) );
        JOptionPane.showMessageDialog( null, formatter.format( number3 ) );
        JOptionPane.showMessageDialog( null, formatter.format( number4 ) );
        JOptionPane.showMessageDialog( null, formatter.format( number5 ) );
    }
}