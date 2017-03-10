package rarejackalope.chapter7.examples;

public class Triangles extends TwoDShape
{	
	String style;
	Triangles()
	{
		super();
		style = "filled";
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
	Triangles(int length)
	{
		super(length);
		this.style = "filled";
	}
	
	Triangles(Triangles ob)
	{
		super(ob);
		style = ob.style;
	}
	
	public String getStyle() {
		return style;
	}
	
	public int getArea()
	{
		return getHeight() * getWidth() / 2;
	}
	
}
