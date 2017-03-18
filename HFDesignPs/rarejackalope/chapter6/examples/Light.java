package rarejackalope.chapter6.examples;

public class Light 
{	
	boolean isOn;
	public Light()
	{
		isOn = false;
	}
	
	public void on() throws LightAlreadyOnException
	{	
		if(!isOn)
		{
			isOn = true;
			System.out.println("Light is on.");
		}
		else
			throw new LightAlreadyOnException();
	}
	
	public void off() throws LightAlreadyOffException
	{
		if(isOn)
		{
			isOn = false;
			System.out.println("Light is off.");
		}
		else
			throw new LightAlreadyOffException();
	}
}
