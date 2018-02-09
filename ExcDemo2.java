
public class ExcDemo2 {

	public static void main(String[] args) {

		int numer[]={4,8,16,32,64,128,256,512};
		int denom[]={2,0,4,4,0,8};
		
		for(int i=0;i<numer.length;i++)
		{
			try
			{
				System.out.println(numer[i]+" / "+denom[i]+" is "+numer[i]/denom[i]);
			}
			//multiple catch statement
			catch(ArithmeticException exc)
			{
				System.out.println("Cant Divide By Zero!");
			}
			catch(ArrayIndexOutOfBoundsException exc)
			{
				System.out.println("NO Matching element Found!ss");
			}
		}
	}

}
