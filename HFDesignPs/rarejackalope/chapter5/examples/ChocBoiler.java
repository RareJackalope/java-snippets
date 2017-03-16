package rarejackalope.chapter5.examples;

public class ChocBoiler 
{
	private boolean empty;
	private boolean boiled;
	
	private static ChocBoiler uniqueBoiler;
	
	private ChocBoiler()
	{
		this.empty = true;
		this.boiled = false;
	}
	
	public static ChocBoiler getInstance()
	{
		if(uniqueBoiler == null)
		{
			uniqueBoiler = new ChocBoiler();
		}
		return uniqueBoiler;
	}
	
	public void fill()
	{
		if(isEmpty())
		{
			empty = false;
			boiled = false;
			//fill the boiler
		}
	}
	
	public void drain()
	{
		if(!isEmpty() && isBoiled())
		{
			empty = true;
		}
	}
	
	public void boil()
	{
		if(!isEmpty() && !isBoiled())
		{
			//boil the boiler.
			boiled = true;
		}
	}
	
	public boolean isEmpty()
	{
		return empty;
	}
	
	public boolean isBoiled()
	{
		return boiled;
	}
}
