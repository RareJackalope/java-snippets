package rarejackalope.chapter4.examples;

public class SimplePizzaFactory 
{
	public Pizza createPizza(String type)
	{
		Pizza pizza = null;
		
		switch(type)
		{
			case "cheese":
				pizza = new CheesePizza();
			break;
			case "pepperoni":
				pizza = new PepperoniPizza();
			break;
		}
		
		return pizza;
	}
}
