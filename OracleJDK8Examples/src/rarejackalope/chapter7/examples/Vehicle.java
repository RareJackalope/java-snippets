package rarejackalope.chapter7.examples;

public class Vehicle 
{
	private int passengers;
	private double mpg;
	private double fuelcap;
	
	Vehicle(int passengers, double mpg, double fuelcap)
	{
		this.passengers = passengers;
		this.mpg = mpg;
		this.fuelcap = fuelcap;
	}
	
	public double getRange()
	{
		return mpg * fuelcap;
	}
	
	public double fuelneeded(int miles)
	{
		return (double) mpg/miles;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public double getMpg() {
		return mpg;
	}
	
	public double getFuelcap() {
		return fuelcap;
	}
	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	
	public void setFuelcap(double fuelcap) {
		this.fuelcap = fuelcap;
	}
	
}
