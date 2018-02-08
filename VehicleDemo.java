
class Vehicle
{
	int passengers;
	int fuelcap;
	int mpg;
	int range;
	
	Vehicle( int a, int b, int c)
	{
		passengers = a;
		fuelcap = b;
		mpg = c;
	}
	
	int range()
	{
		range = fuelcap*mpg;
		return range;
	}
	
	double fuelneeded(int miles)
	{
		return (double)(miles/mpg);
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		int range1, range2;
		int dist = 252;
		
		/*minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;*/
		
		range1 = minivan.range();
		range2 = sportscar.range();
		
		System.out.println("Minivan can carry "+ minivan.passengers + " with a range of "+ range1);
		System.out.println("Sportscar can carry "+ sportscar.passengers + " with a range of "+ range2);
		
		double gallons;
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go "+ dist + " miles minivan needs "+ gallons + " gallons of fuel.");
		
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go "+ dist + " miles sportscar needs "+ gallons + " gallons of fuel.");
	}

}
