package rarejackalope.chapter9.examples;

public class GenException 
{
	static void genException()
	{
		int [] nums = new int[4];
		System.out.println("Before an exception has been generated.");
		
		nums[7] = 10;
		System.out.println("This will be unreachable code.");
	}
}
