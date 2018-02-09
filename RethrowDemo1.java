/*if in Main in try block two methods are called. out of that first method does not create any 
 *exception then it will go to next method called in try block.But if it creates exception and rethrowing it then
 *the exception will get handled but it will not go further in try block for another method. 
 */
public class RethrowDemo1 {

	static void getData()
	{
		try
		{
			int a =100/0;
			System.out.println("A: "+a);
		}
		catch(ArithmeticException exc)
		{
			throw exc;
		}
	}
	
	static void getData1()
	{
		try
		{
			int b= 100/4;
			System.out.println("B: "+b);
		}
		catch(ArithmeticException exc)
		{
			throw exc;
		}
	}
	public static void main(String[] args) {

		try
		{
			getData();
			getData1();
		}
		catch(ArithmeticException exc)
		{
			System.out.println("Handled in Main method");
		}
	}

}
