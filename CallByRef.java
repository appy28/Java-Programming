/* when you pass object to method it is passed by reference.
 * as a result when you pass this reference to a method,the parameter
 * that receives it will refer to the same object as that referred to by the
 * argument.so changes to the object inside the method do affect the object used as an argument.
 */
class Test
{
	int a,b;
	
	Test(int i,int j)
	{
		a=i;
		b=j;
	}
	
	void change(Test ob)
	{
		ob.a=ob.b+ob.a;
		ob.b=-ob.b;
	}
}

public class CallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test ob = new Test(15,20);
		
		System.out.println("ob.a and ob.b before call: "+ob.a+" "+ob.b);
		
		ob.change(ob);
		
		System.out.println("ob.a and ob.b after the call: "+ob.a+" "+ob.b);
	}

}
