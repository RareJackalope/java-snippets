package rarejackalope.chapter9.examples;

public class MultiCatchDemo {

	public static void main(String[] args) {
		int a = 99, b = 0;
		char  []characters = {'A','B','C'};
		int result;
		
		
		for(int i = 0; i < 2; i++)
		{
			try
			{
				if(i == 0)
				{
				result = a / b;
				}else
				{
				characters[4] = 'X';
				}
				
			} catch(ArithmeticException | ArrayIndexOutOfBoundsException exc)
			{
				System.out.println("Exception caught " + exc);
			}
		}
		System.out.println("After multicatch.");

	}

}
