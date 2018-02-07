/* This class show us Bits in provide byte value using Bitwise And Operator
 * the for loop successively tests each bit in val using the bitwise and
 * ,to determine whether it is on or off.if the bit is on.the digit 1 is
 * displayed else 0.
 */
public class ShowBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte val;
		int t;
		
		val =123;
		for(t=128;t>0;t=t/2)
		{
			if((val & t) != 0)
				System.out.print("1 ");
			else 
				System.out.print("0 ");
		}
	}

}
