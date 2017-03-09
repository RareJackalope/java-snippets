package rarejackalope.chapter7.examples;

public class TwoDShape {
	private int height, width, area;
	
	TwoDShape(int height, int width)
	{
		this.height = height;
		this.width = width;
	}
	
	TwoDShape(int sidelength)
	{
		height = width = sidelength;
	}
	TwoDShape()
	{
		height = width = 0;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void showDims()
	{
		System.out.println("has height " + height + " and width " +width);
	}
	
	public void area()
	{
		area = height * width;
	}
}
