package rarejackalope.chapter7.examples;

public class ARectangle extends ATwoDShape 
{	
	private String style;
	private final static String NAME = "Rectangle";
	
	public ARectangle()
	{
		super();
		this.style = style;
	}
	
	public ARectangle(double width, double height, String style)
	{
		super(width, height, NAME);
		this.style = style;
	}
	
	public ARectangle(double width, double height)
	{
		super(width, height, NAME);
		this.style = style;
	}
	
	public ARectangle(double length, String style)
	{
		super(length, length, NAME);
		this.style = style;
	}
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getName() {
		return NAME;
	}

	@Override
	double area() {
		return getWidth() * getHeight();
	}
	
	public String showStyle()
	{
		return "Rectangle is " + getStyle();
	}
	
}
