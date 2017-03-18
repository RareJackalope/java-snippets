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
	
	public GarageDoor getInstance()
	{
		return thisGarageDoor;
	}
	
	private void up() 
	{
		DoorState.IsUp.currentState = true;
	}
	
	private void down() {
		DoorState.IsDown.currentState = true;

	}
	
	private void stop() {
		if(doorInBetweenClosedAndOpen())
		{
			DoorState.IsBetween.currentState = true;
		}
	}

	private boolean doorInBetweenClosedAndOpen() {
		return !DoorState.IsUp.currentState && !DoorState.IsDown.currentState;
	}
	
	private void lightOn() throws LightAlreadyOnException 
	{
		garageLight.on();
	}
	
	private void lightOff() throws LightAlreadyOffException 
	{
		garageLight.off();
	}
}
