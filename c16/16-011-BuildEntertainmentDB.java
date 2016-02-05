import java.sql.*;

/**
    This program shows how to create a new database 
    using Java DB.
*/

public class BuildEntertainmentDB
{
    public static void main( String[] args ) throws Exception
    {
        final String DB_URL = 
            "jdbc:derby:EntertainmentDB;create=true";

        try
        {
            // Create a connection to the database.
            Connection conn = 
                       DriverManager.getConnection( DB_URL );

            // Create a Statement object.
            Statement stmt = conn.createStatement();

            // Create the DVD table.
            System.out.println("Creating the DVD table...");
            stmt.execute("CREATE TABLE DVD (" + 
                         "Title CHAR( 25 ), " + 
                         "Minutes INTEGER, " + 
                         "Price DOUBLE)");

            // Close the resources.
            stmt.close();
            conn.close();
            System.out.println( "Done" );
        }
        catch( Exception ex )
        {
            System.out.println( "ERROR: " + ex.getMessage() );
        }
    }
}