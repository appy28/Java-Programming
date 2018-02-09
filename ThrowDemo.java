//Manually Throwing an Exception

public class ThrowDemo {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Before Throw");
			throw new ArithmeticException();
		}
		catch(ArithmeticException exc)
		{
			System.out.println("Exception caught.");
		}
		System.out.println("after Try/Catch Block.");
	}
}
