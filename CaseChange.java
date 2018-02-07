
public class CaseChange {

	public static void main(String[] args) 
	throws java.io.IOException{
		// TODO Auto-generated method stub

		char ch;
		int case_chng=0;
		System.out.println("Enter period to stop");
		do
		{
			ch = (char)System.in.read();
			if(ch >= 'a' & ch <= 'z')
			{
				ch -=  32;
				case_chng++;
				System.out.println("character: "+ ch);
			}
			else if(ch >='A' & ch <= 'Z')
			{
				ch += 32;
				case_chng++;
				System.out.println("Character: "+ ch);
			}
		}while(ch != '.');
		
		System.out.println("Total Number of case changes are: " + case_chng);
	}

}
