/*this class prints Upper character and their corresponding 
lower case Character using Bitwise OR operator
32=0000 0000 0010 0000.in this only 6th bit is On.so anding this value with the int value of char
leads to turn ON the 6th bit and resulting in lower case char*/

public class UpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		
		for(int i=0;i<26;i++)
		{
			ch =(char)('A'+i);
			System.out.print(ch);
			
			//This statement turn on the 6th bit
			ch =(char)((int)ch|32);//ch is now lower case
			System.out.print(ch + " ");		
		}
	}

}
