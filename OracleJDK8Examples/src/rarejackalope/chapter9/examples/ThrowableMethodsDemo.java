package rarejackalope.chapter9.examples;

public class ThrowableMethodsDemo {

	public static void main(String[] args) 
	{
		try
		{
			GenException.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("The standard message is: ");
			System.out.println(exc);
			System.out.println("\nStack trace.");
			exc.printStackTrace();
			System.out.println("The exception message itself is: ");
			System.out.println(exc.getMessage());
		}

	}

}
