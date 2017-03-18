package rarejackalope.chapter6.examples;

public class LightOffCommand implements Command
{
	Light light;
	
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	@Override
	public void execute()
	{
		try {
			light.off();
		} catch (LightAlreadyOffException e) {
			System.out.println(e);
		}
	}
	
}
