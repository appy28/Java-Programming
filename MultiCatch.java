
public class MultiCatch {

	public static void main(String[] args) {

		int a=88,b=0;
		int result;
		char chrs[]={'A','B','C'};
		
		for(int i=0;i<2;i++)
		{
			try
			{
				if(i==0)
					result=a/b;//generate an Arithmetic Exeption
				else
					chrs[5]='X';			
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException exc)
			{
				System.out.println("Exception caught: "+exc);
			}
		}
		System.out.println("After MultiCatch.");
	}
}
