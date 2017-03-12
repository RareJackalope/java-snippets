package rarejackalope.chapter1.examples;

public abstract class Duck 
{
	public static void quack()
	{
		System.out.println("Quack");
	}
	
	public static void swim()
	{
		System.out.println("Much swim.");
	}
	
	public abstract void display();
	
	public static void fly()
	{
		System.out.println("Its flying!"); //Joe adds flying functionality to the superclass for all ducks to inherit.
	}
}
