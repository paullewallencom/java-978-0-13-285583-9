import javax.swing.JOptionPane;

/**
    This program demonstrates the recursive 
    factorial method.
*/

public class FactorialDemo
{
    public static void main( String[] args )
    {
        String input;   // To hold user input
        int number;     // To hold a number

        // Get a number from the user.
        input = JOptionPane.showInputDialog( "Enter a " + "non-negative integer: " );

        number = Integer.parseInt( input );

        // Display the factorial of the number.
        JOptionPane.showMessageDialog( null, number + "! is " + factorial( number ) );

        System.exit( 0 );
    }

    /**
        The factorial method uses recursion to calculate 
        the factorial of it's argument, which is assumed 
        to be a non-negative number.
        @param n The number to use in the calculation.
        @return The factorial of n.
    */

    private static int factorial( int n )
    {
        if ( n == 0 )
            return 1;                       // Base case
        else
            return n * factorial( n - 1 );
    }
}