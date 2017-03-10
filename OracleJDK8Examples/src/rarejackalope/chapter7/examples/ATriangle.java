package rarejackalope.chapter7.examples;

public class ATriangle extends ATwoDShape
{	
	private String style;
	private final static String NAME= "triangle";
	
	public ATriangle()
	{
		super();
		this.style = "none";
	}
	
	public ATriangle(double width, double height, String style)
	{
		super(width, height, NAME);
		this.style = style;
	}
	
	public ATriangle(double width, double height)
	{
		super(width, height, NAME);
		this.style = "none";
	}
	
	double area() {
		return getWidth() * getHeight() / 2;	
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public static String getNAME() {
		return NAME;
	}
}
