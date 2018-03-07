
public class GuessUsingNestedIf {

	public static void main(String[] args) 
	throws java.io.IOException{
		// TODO Auto-generated method stub

		char ch,answer = 'K';
		
		System.out.println("I am thinking of the character between A to Z.");
		System.out.println("Can you Guess the Character??");
		
		ch = (char)System.in.read();
		
		if (ch == answer)
			System.out.println("You are Right");
		else
		{
			System.out.print("Sorry..Your answer is ");
			if (ch < answer)
				System.out.println("too low.");
			else 
				System.out.println("too High.");
		}
	}

}
