package rarejackalope.chapter7.examples;

public class Triangles extends TwoDShape
{	
	String style;
	Triangles()
	{
		super();
		style = "unknown";
	}
	
	Triangles(int width, int height, String style)
	{
		super(width,height);
		this.style = style;
	}
	
	Triangles(int length, String style)
	{
		super(length);
		this.style = style;
	}
	
	
	
}
