/* when you pass a primitive type such as int or double to a method it is 
 * passed by value.Thus a copy of a argument is made and what occurs to the parameter
 * that receives the argument has no effect outside the method.
 */
class Test
{
	void noChange(int i, int j)//this method will not cause any change to the argument
	{
		i=i+j;
		j=-j;
	}
}
public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test ob = new Test();
		
		int a=15;
		int b =20;
		
		System.out.println("a and b before call: "+a+" "+b);
		ob.noChange(a, b);
		System.out.println("a and b after call: "+a+" "+b);
	}

}
