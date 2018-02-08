
public class CountSpaces {

	public static void main(String[] args) 
	throws java.io.IOException{
		// TODO Auto-generated method stub

		char ch;
		int spaces=0;
		do
		{
			System.out.println("Enter a key followed by enter: ");
			ch = (char)System.in.read();
			if (ch == ' ')
				spaces++;
		}while(ch != '.');
		
		System.out.println("Total Number of Spaces entered are : "+ spaces);
	}

}
