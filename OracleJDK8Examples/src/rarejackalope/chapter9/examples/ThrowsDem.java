package rarejackalope.chapter9.examples;

import java.io.IOException;

public class ThrowsDem 
{
	public static char prompt(String str) throws IOException
	{
		System.out.println(str + " : ");
		return (char)System.in.read();
	}
	
	public static void main(String[] args)
	{
		char ch;
		try
		{
			ch = prompt("Enter some letters");
		}
		catch(IOException exc)
		{
			System.out.println("IOException occured");
			ch = 'X';
		}
		
		System.out.println("You pressed " + ch);
	}
}
