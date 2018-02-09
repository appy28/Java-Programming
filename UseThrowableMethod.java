//Using Throwable Methods
class ExcTest
{
	static void genException()
	{
		int nums[]=new int[4];
		
		System.out.println("Before Exception is Generated.");
		//generate an out of index bound exception
		
		nums[7]=10;
		System.out.println("this wont be Dispalyed..");
	}
}
public class UseThrowableMethod {

	public static void main(String[] args) {

		try
		{
			ExcTest.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("Standard Message is: ");
			System.out.println(exc);
			System.out.println("\nStack Trace: ");
			exc.printStackTrace();
		}
		System.out.println("After catch Statment.");
	}

}
