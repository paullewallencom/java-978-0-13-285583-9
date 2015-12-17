import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
    This program uses the DecimalFormat class to display
    formatted numbers in a message dialog.
*/

public class Format1
{
    public static void main( String[] args )
    {
        double number1 = 0.166666666666667;
        double number2 = 1.666666666666667;
        double number3 = 16.666666666666667;
        double number4 = 166.666666666666667;

        // Create a DecimalFormat object.
        DecimalFormat formatter = new DecimalFormat("*0.00");

        // Display the formatted variable contents.
        JOptionPane.showMessageDialog( null, formatter.format( number1 ) );
        JOptionPane.showMessageDialog( null, formatter.format( number2 ) );
        JOptionPane.showMessageDialog( null, formatter.format( number3 ) );
        JOptionPane.showMessageDialog( null, formatter.format( number4 ) );
    }
}