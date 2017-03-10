package rarejackalope.chapter7.examples;

public class Truck extends Vehicle
{
	private double cargocap;
	private String type;
	
	public Truck(int passengers, double mpg, double fuelcap, double cargocap, String type)
	{	
		super(passengers, mpg, fuelcap);
		this.cargocap = cargocap;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public double getCargocap() {
		return cargocap;
	}
}
