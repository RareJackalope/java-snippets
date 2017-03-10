package rarejackalope.chapter7.examples;

public class TruckDemo {

	public static void main(String[] args) 
	{
		Truck semi = new Truck(2, 200, 7, 44000, "semi");
		Truck pickup = new Truck(3, 28, 15, 2000, "pickup");
		
		Truck [] trucks = {semi, pickup};
		
		for(Truck truck : trucks)
		{
			System.out.println(truck.getType() + " can go " + truck.getRange() + " miles.");
		}

	}

}
