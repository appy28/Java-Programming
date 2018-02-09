
public class ExcDemo1 {

	public static void main(String[] args) {

		try
		{
			ExTest.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			//catch the exception
			System.out.println("Index out of bounds!");
		}
		System.out.println("After catch statement");
	}

}
