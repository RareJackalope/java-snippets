package rarejackalope.chapter4.examples;

public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory)
	{
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza;
		pizza = factory.createPizza(type);
		
		//prepare, bake, cut and box pizza.
		return pizza;
	}
	
}
