import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
    This program calculates a running total.
*/

    public class TotalSales
    {
        public static void main( String[] args )
        {
            int days;           // The number of days
            double sales;       // A day's sales figure
            double totalSales;  // Accumulator
            String input;       // To hold the user's input

            // Create a DecimalFormat object to format output.
            DecimalFormat dollar = new DecimalFormat( "#,##0.00" );

            // Get the number of days.
            input = JOptionPane.showInputDialog( "For how many days " +
                "do you have sales figures?" );
            days = Integer.parseInt( input );

            // Set the accumulator to 0.
            totalSales = 0.0;

            // Get the sales figures and calculate a running total.
            for ( int count = 1; count <= days; count++ )
            {
                input = JOptionPane.showInputDialog( "Enter the sales " +
                    "for day " + count + ":" );
                sales = Double.parseDouble( input );
                totalSales += sales; // Add sales to totalSales.
            }

            // Display the total sales.
            JOptionPane.showMessageDialog( null, "The total sales are $" +
                dollar.format( totalSales ) );

            System.exit( 0 );
            }
        }