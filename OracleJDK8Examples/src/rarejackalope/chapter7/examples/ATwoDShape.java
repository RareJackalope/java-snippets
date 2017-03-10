package rarejackalope.chapter7.examples;

public abstract class ATwoDShape 
{
	private double width;
	private double height;
	private String name;
	
	public ATwoDShape()
	{
		width = height = 0.0;
		name = "none";
	}
	
	public ATwoDShape(double width, double height, String name)
	{
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	public ATwoDShape(double length, String name)
	{
		width = height = length;
		this.name = name;
	}
	
	public ATwoDShape(ATwoDShape ob)
	{
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String showDims()
	{
		return "Height and width are: " + width + " " + height;
	}
	
	abstract double area();
}
