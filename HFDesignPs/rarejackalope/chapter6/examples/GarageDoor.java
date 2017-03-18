package rarejackalope.chapter6.examples;

public class GarageDoor 
{	
	private Light garageLight = new Light();;
	private static GarageDoor thisGarageDoor = new GarageDoor();
	
	public enum DoorState
	{
		IsUp(false),IsDown(true),IsBetween(false);
		
		boolean currentState;
		DoorState(Boolean isInState)
		{
			this.currentState = isInState;
		}
	}
	
	public static GarageDoor getInstance()
	{
		return thisGarageDoor;
	}
	
	public void up() 
	{
		DoorState.IsUp.currentState = true;
	}
	
	public void down() {
		DoorState.IsDown.currentState = true;

	}
	
	public void stop() {
		if(doorInBetweenClosedAndOpen())
		{
			DoorState.IsBetween.currentState = true;
		}
	}

	private boolean doorInBetweenClosedAndOpen() {
		return !DoorState.IsUp.currentState && !DoorState.IsDown.currentState;
	}
	
	public void lightOn() throws LightAlreadyOnException 
	{
		garageLight.on();
	}
	
	public void lightOff() throws LightAlreadyOffException 
	{
		garageLight.off();
	}
}
