package rarejackalope.chapter9.examples;

public class ExcDemo2 
{
	public static void main(String [] args)
	{
		int[] nums1 = {4,8,16,32,64,128,256,512};
		int[] nums2 = {2,0,3,3,0,8};
		
		for (int i = 0; i < nums1.length; i++) 
		{
			try
			{
			System.out.println(nums1[i] + " / " + nums2[i] +
									   " is " + nums1[i] /nums2[i]);
			}
			catch(ArithmeticException exc)
			{
				System.out.println("Cannot divide by zero!");
			}
			catch(ArrayIndexOutOfBoundsException exc)
			{
				System.out.println("No matching element found.");
			}
		}
	}
}
