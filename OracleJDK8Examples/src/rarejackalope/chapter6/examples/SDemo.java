package rarejackalope.chapter6.examples;

public class SDemo {
	
	

	public static void main(String[] args) {
		staticDemo ex1 = new staticDemo();
		staticDemo ex2 = new staticDemo();
		
		ex1.x = 3;
		ex2.x = 5;
		
		System.out.println("The integer x for both ex1 and ex2 are of course different " + ex1.x +" and "+ ex2.x);
		System.out.println("But both objects will share a static variable of y ");
		ex1.y = 10;
		System.out.println(ex1.y);
		System.out.println(ex2.y);
	}

}
