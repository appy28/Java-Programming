import java.util.Scanner;
class chkNum
{	
	boolean isEven(int x)
	{
		if(x%2 == 0)
			return true;
		else 
			return false;
	}
}
public class ChkNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		chkNum obj1 = new chkNum();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		number = scanner.nextInt();
				
		if(obj1.isEven(number))
			System.out.println("The Number is Even");
		else 
			System.out.println("The number is odd");
	}

}
