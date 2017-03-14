package rarejackalope.chapter4.catexample;

public class CatFactoryDemo 
{
	public static void main(String[] args) {
		CatStore catStore = new CandyCatStore();
		Cat cat = catStore.orderCat("Tabby");
		System.out.println("This cat looks like a " + cat.getColor() + " " + cat.getName());
	}
	
}
