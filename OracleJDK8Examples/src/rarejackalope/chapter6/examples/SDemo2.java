package rarejackalope.chapter6.examples;

public class SDemo2 {

	public static void main(String[] args) {
		System.out.println("Val is "+SMethodDemo.val);
		System.out.println("staticMeth.valDiv2() is " +SMethodDemo.valDiv2() );
		
		SMethodDemo.val = 4;
		
		System.out.println("Val is "+SMethodDemo.val);
		System.out.println("staticMeth.valDiv2() is " +SMethodDemo.valDiv2() );
	}

}
