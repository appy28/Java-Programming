//Catching subclass exceptions--A catch clause for superclass will also match
//any of its subclass
public class ExcDemo3 {

	public static void main(String[] args) {

		int numer[]={4,8,16,32,64,128,256,512};
		int denom[]={2,0,4,4,0,8};
		
		for(int i=0;i<numer.length;i++)
		{
			try
			{
				System.out.println(numer[i]+" / "+denom[i]+" is "+numer[i]/denom[i]);
			}
			catch(ArrayIndexOutOfBoundsException exc)//catch subclass
			{
				System.out.println("No Mathing element found..!");
			}
			catch(Throwable exc)//catch superclass
			{
				System.out.println("Some Exception Occured.!!");
			}
		}
	}

}
