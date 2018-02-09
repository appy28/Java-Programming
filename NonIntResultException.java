//Create an Custom Exception
class NonIntResultException extends Exception
{
	int a;
	int b;
	
	NonIntResultException(int i,int j)
	{
		a=i;
		b=j;
	}
	
	public String toString()
	{
		return "Result of "+a + " / "+b+" is non-intrger.";
	}
}
