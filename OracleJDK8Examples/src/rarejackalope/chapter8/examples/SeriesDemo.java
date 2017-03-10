package rarejackalope.chapter8.examples;

public class SeriesDemo {
	public static void main(String [] args)
	{
		ByTwos ob = new ByTwos();
		int [] nums = new int[10];
		for(int i = 0; i < 5;  i++)
		{
			System.out.println("Next value is " + ob.getNext());
		}
		
		System.out.println("\nResetting\n");
		ob.reset();
		
		for(int i = 0; i < 5;  i++)
		{
			System.out.println("Next value is " + ob.getNext());
		}
		
		System.out.println("\nResetting\n");
		ob.reset();
		
		ob.setStart(100);
		for(int i = 0; i < 5;  i++)
		{
			System.out.println("Next value is " + ob.getNext());
		}
		
		System.out.println("\nResetting\n");
		ob.reset();
		
		ob.setStart(100);
		for(int i = 0; i < 5;  i++)
		{
			System.out.println("Previous value is " + ob.getPrevious());
		}
		
		nums = ob.getNextArray(10);
		
		for(int number: nums)
		{
			System.out.print(number + " ");
		}
	}
}
