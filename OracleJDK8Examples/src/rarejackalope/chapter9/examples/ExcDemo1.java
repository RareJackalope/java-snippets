package rarejackalope.chapter9.examples;

public class ExcDemo1 {

	public static void main(String[] args) {
		int [] nums = new int[4];
		try
		{
		nums[7] = 10;
		System.out.println("This won't be displayed.");
		
		
		System.out.println("Before exception is generated.");
			
		} catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("After catch statement.");
	}

}
