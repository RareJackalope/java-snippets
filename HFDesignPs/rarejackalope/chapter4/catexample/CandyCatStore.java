package rarejackalope.chapter4.catexample;

public class CandyCatStore extends CatStore
{

	@Override
	public Cat generateCat(String type) {
		switch(type)
		{
			case "Tabby":
				return new CandyTabbyCat();
			default:
				return null;
		}
	}
	
}
