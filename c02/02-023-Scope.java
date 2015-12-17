// This program can't find it's variable.

public class Scope
{
	public static void main( String[] args )
	{
		System.out.println( value ); // ERROR!
		int value = 100;
	}
}