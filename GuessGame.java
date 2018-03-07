
public class GuessGame {

	public static void main(String[] args) 
	throws java.io.IOException{
		// TODO Auto-generated method stub

		char ch ,answer = 'K';
		System.out.println("I am thinking of character between A to Z.");
		System.out.println("Can you Guess the Character I am thinking ??");
		
		ch = (char)System.in.read();
		
		if (ch == answer)
			System.out.println("You are Right!!");
		else
			System.out.println("Sorry..You are Wrong!!");
	}

}
