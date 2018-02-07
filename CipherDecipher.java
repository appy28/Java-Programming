/* XOR has Interesting property. when some value X is XORed with value Y,
 * and then that result is XORed with Y again,X is Produced.so Y being the key we can use this 
 * property of XOR to encode and Decode the Message
 */

public class CipherDecipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "This is a Test";
		String encMsg = "";
		String decMsg = "";
		int key = 88;
		//String key1 = "abcdefgi";//if the key is 8 character string
		
		System.out.print("Original Message: ");
		System.out.println(msg);
		
		//Encode this Message
		//int j=0;//use when key is string
		for(int i=0;i<msg.length();i++)
		{
			encMsg=encMsg+(char)(msg.charAt(i)^key);
			/*encMsg=encMsg+(char)(msg.charAt(i)^key1.charAt(j));
			j++;
			if(j==8) j=0;*/ //use when key is string
		}
		
		System.out.print("Encoded Message: ");
		System.out.println(encMsg);
		
		//Decode the Message
		//j=0;
		for(int i =0;i<encMsg.length();i++)
		{
			decMsg=decMsg+(char)(encMsg.charAt(i)^key);
			/*decMsg=decMsg+(char)(encMsg.charAt(i)^key1.charAt(j));
			j++;
			if(j==8) j=0;*/
					
		}
		
		System.out.print("Decoded Message: ");
		System.out.println(decMsg);
	}

}
