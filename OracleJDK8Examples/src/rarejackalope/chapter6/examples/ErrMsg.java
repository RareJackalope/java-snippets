package rarejackalope.chapter6.examples;

public class ErrMsg {

	public static void main(String[] args) {
		ErrInfo e = new ErrInfo();
		ErrorMsg err;
		

		err = e.getErrInfo(1);
		System.out.println(err.msg +" " + err.severity);
		
		err = e.getErrInfo(3);
		System.out.println(err.msg +" " + err.severity);
		
		
	}

}
