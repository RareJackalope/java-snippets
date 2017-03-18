package rarejackalope.chapter6.examples;

public class SimpleRemoteControl 
{
	Command slot;
	
	public SimpleRemoteControl(){}
	
	public void setCommand(Command command)
	{
		slot = command;
	}
	
	public void buttonWasPressed()
	{
		slot.execute();
	}
}
