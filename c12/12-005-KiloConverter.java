import javax.swing.*;

/**
    The KiloConverter class displays a JFrame that 
    lets the user enter a distance in kilometers. When 
    the Calculate button is clicked, a dialog box is 
    displayed with the distance converted to miles.
*/

public class KiloConverter extends JFrame
{
    private JPanel panel;                   // To reference a panel
    private JLabel messageLabel;            // To reference label
    private JTextField kiloTextField;       // To reference a text field
    private JButton calcButton;             // To reference a button
    private final int WINDOW_WIDTH = 310;   // Window width
    private final int WINDOW_HEIGHT = 100;  // Window height

    /**
        Constructor
    */

    public KiloConverter()
    {
        // Set the window title.
        setTitle( "Kilometer Converter" );

        // Set the size of the window.
        setSize( WINDOW_WIDTH, WINDOW_HEIGHT );

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // Build the panel and add it to the frame.
        buildPanel();

        // Add the panel to the frame's content pane.
        add( panel );

        // Display the window.
        setVisible( true );
    }

    /**
        The buildPanel method adds a label, a text field, 
        and a button to a panel.
    */

    private void buildPanel()
    {
        // Create a label to display instructions.
        messageLabel = new JLabel( "Enter a distance " + 
            "in kilometers" );

        // Create a text field 10 characters wide.
        kiloTextField = new JTextField( 10 );

        // Create a button with the caption "Calculate".
        calcButton = new JButton( "Calculate" );

        // Create a JPanel object and let the panel 
        // field reference it.
        panel = new JPanel();

        // Add the label, text field, and button 
        // components to the panel.
        panel.add( messageLabel );
        panel.add( kiloTextField );
        panel.add( calcButton );
    }

    /**
        main method
    */

    public static void main( String[] args )
    {
        new KiloConverter();
    }
}