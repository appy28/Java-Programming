
public class GalToLitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gallons,liters;
		int counter;
		
		counter=0;
		for(gallons=1;gallons<=100;gallons++)
		{
			liters = gallons * 3.784;
			System.out.println(gallons + " Gallon is " + liters + " liters.");
			counter++;
			
			if(counter == 10)
			{
				System.out.println();
			    counter=0;
			}
		}
	}

}
