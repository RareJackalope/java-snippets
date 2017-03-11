package rarejackalope.chapter9.examples;

public class NonIntegerResultException extends Exception
{
	int n, d;
	
	public NonIntegerResultException(int n, int d)
	{
		this.n = n;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Result of " + n + " and " + d +
			   " non-integer.";
	}
	
}
