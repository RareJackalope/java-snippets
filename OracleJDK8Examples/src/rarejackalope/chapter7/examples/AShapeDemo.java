package rarejackalope.chapter7.examples;

public class AShapeDemo {

	public static void main(String[] args) {
		ATwoDShape shapes[] = new ATwoDShape[4];
		
		shapes[0] = new ATriangle(5.0,10.0,"Filled");
		shapes[1] = new ARectangle(6.0,3.0, "Stripped");
		shapes[2] = new ATriangle(4.0,4.0);
		shapes[3] = new ARectangle(2.0,"opaque");
		
		
		for(ATwoDShape shape: shapes)
		{
			System.out.println("object is " + shape.getName());
			System.out.println("Area is " + shape.area());
			System.out.println();
		}

	}

}
