package rarejackalope.chapter5.examples;

public class EagerSingleton 
{
	private static EagerSingleton uniqueInstance = new EagerSingleton();
	
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance()
	{
		return uniqueInstance;
	}
}
