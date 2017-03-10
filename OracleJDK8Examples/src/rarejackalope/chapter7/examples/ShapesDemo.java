package rarejackalope.chapter7.examples;

public class ShapesDemo {

	public static void main(String[] args) {
		Triangles tri1 = new Triangles(5,4,"right angled");
		Triangles tri2 = new Triangles(6,3, "scalene");
		Triangles tri3 = new Triangles(4);
		
		Triangles [] TriArray = {tri1, tri2, tri3};
		
		for(Triangles triangle: TriArray)
		{
			System.out.println("Triangle has dimensions " + triangle.showDims());
			System.out.println("Triangle has an area of " + triangle.getArea());
			System.out.println("Triangle also has a style of " + triangle.getStyle());
			System.out.println();
		}
		
		
	}

}
