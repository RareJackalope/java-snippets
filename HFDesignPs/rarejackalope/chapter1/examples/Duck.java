package rarejackalope.chapter1.examples;

public abstract class Duck 
{
	FlyBehaviour flybehaviour;
	QuackBehaviour quackbehaviour;
	
	public void performQuack()
	{
		quackbehaviour.quack();
	}
	
	public void swim()
	{
		System.out.println("Much swim.");
	}
	
	public abstract void display();
	
	public void performFly()
	{
		flybehaviour.fly();
	}
}
