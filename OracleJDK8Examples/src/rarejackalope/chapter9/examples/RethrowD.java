package rarejackalope.chapter9.examples;

public class RethrowD {

	public static void main(String[] args) 
	{
		try
		{
			Exc3.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			//recatching exception here.
			System.out.println("Fatal error - program terminated.");
		}

	}

}
