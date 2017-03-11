package rarejackalope.chapter9.examples;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		int numer[] = {2,3,4,6,8,9,0,2};
		int denom[] = {2,0,4,4,0,10};
		
		
		for(int i = 0; i < numer.length; i++)
		{
			try
			{
				if(numer[i] % 2 !=0)
				{
					throw new NonIntegerResultException(numer[i], denom[i]);
				}
				else
				{
					System.out.println(numer[i] + " / " + 
									   denom[i] + " = " + 
									   numer[i]/denom[i]);
				}
			} catch(NonIntegerResultException exc)
			{
				System.out.println(exc);
			} catch(ArithmeticException exc)
			{
				System.out.println("Cannot divide by Zero.");
			} catch(ArrayIndexOutOfBoundsException exc)
			{
				System.out.println("Array out-of-bounds.");
			}
			
			
		}

	}

}
