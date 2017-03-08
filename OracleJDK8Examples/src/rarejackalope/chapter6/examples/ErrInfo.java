package rarejackalope.chapter6.examples;

public class ErrInfo {
	//These two arrays could be re-written as a much nicer key-value pair collection.
	String msg[] = {
			"Output Error",
			"Input Error",
			"Disk Fail",
			"Out-of-bounds"	
	};
	
	int severity[] = {3,3,2,1};
	
	ErrorMsg getErrInfo(int i)
	{
		return new ErrorMsg(msg[i],severity[i]);
	}
}
