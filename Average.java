
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x[]={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.0};
		double sum=0,avg;
		
		for(int i=0;i<10;i++)
		    sum=sum+x[i];
		
		avg=sum/x.length;
		
		System.out.println("Average :"+avg);
	}

}
