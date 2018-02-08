
public class DowhileDemo {

	public static void main(String[] args) 
	throws java.io.IOException{
		// TODO Auto-generated method stub

		char ch,ignore;
		do
		{
			System.out.println("Press a Key followed by Enter: ");
			ch = (char) System.in.read();
			do
			{
				ignore = (char)System.in.read();
			}while(ignore != '\n');
		}while(ch != 'q');		
	}
}
