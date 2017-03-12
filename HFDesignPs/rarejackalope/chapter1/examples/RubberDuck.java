package rarejackalope.chapter1.examples;

public class RubberDuck extends Duck 
{
	public void quack()
	{
		System.out.println("Squeak"); //Overriden to squeak instead of quack.
	}
	
	@Override
	public void display() 
	{
		System.out.println("Looks like a rubber Duck.");
	}
	
}
