package rarejackalope.chapter7.examples;

public class TwoDShape2 
{
	private double width;

	private double height;
	private String name;
		
	TwoDShape2()
	{
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShape2(double width, double height, String name)
	{
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	TwoDShape2(double length, String name)
	{
		width = height = length;
		this.name = name;
	}
	
	TwoDShape2(TwoDShape2 ob)
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
		return "Height: " + height + "Width: " +width;
	}
	
	public double getArea()
	{
		return height * width;
	}
	
	
}
