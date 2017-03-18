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
		if(!isOn) isOn = true;
		else
			throw new LightAlreadyOnException();
	}
	
	public void off() throws LightAlreadyOffException
	{
		if(isOn) isOn = false;
		else
			throw new LightAlreadyOffException();
	}
}
