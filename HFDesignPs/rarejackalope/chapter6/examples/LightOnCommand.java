package rarejackalope.chapter6.examples;


public class LightOnCommand implements Command
{
	Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	@Override
	public void execute() {
		try {
			light.on();
		} catch (LightAlreadyOnException e) {
			e.getMessage();
		}
	}

}
