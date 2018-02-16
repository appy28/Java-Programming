//when final keyword preceed the class variable it becomes constant throughout the program
class ErrorMsg
{
	//Error Codes
	final int OUTER =0;
	final int INNER=1;
	final int DISKERR=2;
	final int INDEXERR=3;
	
	String msgs[]={"Output Error","Input Error","Disk Full","Index out of Bounds"};
	
	String getErrorMsg(int i)
	{
		if(i >=0 & i<=msgs.length)
			return msgs[i];
		else
			return "Invalid error code";
	}
}
public class FinalD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(err.OUTER));
		System.out.println(err.getErrorMsg(err.DISKERR));		
	}
}
