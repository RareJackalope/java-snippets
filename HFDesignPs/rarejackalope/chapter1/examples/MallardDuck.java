package rarejackalope.chapter1.examples;

public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		quackbehaviour = new Quack();
		flybehaviour = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("This duck appears Mallardy.");
	}
	
}
