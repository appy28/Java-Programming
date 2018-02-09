//Use Nested Try block
/*An exception that can be handled by an inner try- in this case ,a divide by Zero error
 *allows the program to continue.however an Array Boundary error is  caught by an outer
 *try,which cause the program to terminate.
 */
public class NestTrys {

	public static void main(String[] args) {
		
		int numer[]={4,8,16,32,64,128,256,512};
		int denom[]={2,0,4,4,0,8};
		
		try
		{
			for(int i=0;i<numer.length;i++)
			{
				try
				{
					System.out.println(numer[i]+" / "+denom[i]+" is "+numer[i]/denom[i]);
				}
				catch(ArithmeticException exc)
				{
					System.out.println("Cant divide by Zero..!");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("NO Matching Element found.");
			System.out.println("Fatal Error-Program terminated..!!");
		}
	}

}
