
public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		for(num=0;num<=100;num++)
		{
			if(num%2 != 0)continue; //if number not even force to iterate next 
			System.out.println(num);
		}
	}

}
