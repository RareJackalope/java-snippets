package rarejackalope.chapter6.examples;

public class VarArgs {
	
	static void vaTest(int ... v)
	{
		System.out.println("The number of arguements is: " + v.length);
		System.out.println("Contents: ");
		
		
		for(int varg: v)
		{
			System.out.print(varg + " ");
		}
	}
}
