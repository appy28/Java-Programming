/*this class prints lower character and their corresponding 
upper case Character using Bitwise And operator
65503=1111 1111 1101 1111.in this only 6th bit is off.so anding this value with the int value of char
leads to turn off the 6th bit and resulting in upper case char*/

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		
		for(int i=0;i<26;i++)
		{
			ch = (char)('a'+i);
			System.out.print(ch);
			
			//this statement turns off the 6th Bit
			ch =(char)((int)ch & 65503);// ch is now uppercase.
			
			System.out.print(ch + " ");
		}
	}

}
