package rarejackalope.chapter6.examples;

public class RemoteControlTest {
	public static void main(String[] args) 
	{
		Light light = new Light();
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonWasPressed();
		remoteControl.buttonWasPressed();
		
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		remoteControl.setCommand(lightOffCommand);
		remoteControl.buttonWasPressed();
	}
}
