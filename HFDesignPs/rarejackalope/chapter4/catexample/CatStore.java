package rarejackalope.chapter4.catexample;

public abstract class CatStore 
{	
	public Cat orderCat(String type)
	{	
		Cat cat;
		cat = generateCat(type);
		return cat;
	}
	
	public abstract Cat generateCat(String type);
}
