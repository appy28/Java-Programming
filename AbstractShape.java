abstract class TwoDShape
{
	private double width;
	private double height;
	private String name;
	
	//A default constructor
	TwoDShape()
	{
		width=height=0.0;
		name ="none";
	}
	//parameterized constructor
	TwoDShape(double w, double h,String s)
	{
		width =w;
		height=h;
		name =s;
	}
	//Construct an object with equal width and height
	TwoDShape(double x,String s)
	{
		width=height=x;
		name=s;
	}
	//construct an object from an object
	TwoDShape(TwoDShape ob)
	{
		height=ob.height;
		width=ob.width;
		name=ob.name;
	}
	//Accessor Method for width and height
	double getWidth() { return width;}
	double getHeight() {return height;}
	void setWidth(double w)
	{ width =w;}
	void setHeight(double h)
	{ height=h;}
	
	String getName() { return name;}
	
	void showDim()
	{
		System.out.println("Width and Height are "+width+ " and "+height);
	}
	
	abstract double area();
}
//A subclass for TwoDShape Triangle
class Triangle extends TwoDShape
{
	private String style;
	//Default constructor
	Triangle()
	{
		super();
		style ="none";
	}
	//parameterized constructor
	Triangle(double w, double h,String s)
	{
		super(w,h,"Triangle");
		style=s;
	}
	//One argument constructor
	Triangle(double x)
	{
		super(x,"Triangle");
		style="filled";
	}
	//Construct an Object from an object
	Triangle(Triangle ob)
	{
		super(ob);
		style=ob.style;
	}
	//override area() for Triangle
	double area()
	{
		return getWidth()*getHeight()/2;
	}
	
	void showStyle()
	{
		System.out.println("Triangle is "+style);
	}
}
//A subclass of TwoDShape for Rectangles
class Rectangles extends TwoDShape
{
	Rectangles()
	{
		super();
	}
	Rectangles(double w,double h)
	{
		super(w,h,"Rectangle");
	}
	Rectangles(double x)
	{
		super(x,"Rectangle");
	}
	Rectangles(Rectangles ob)
	{
		super(ob);
	}
	
	boolean isSquare()
	{
		if(getWidth()==getHeight())
			return true;
		return false;
	}
	//override area for Rectangle
	double area()
	{
		return getWidth()*getHeight();
	}
}
public class AbstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoDShape shapes[]=new TwoDShape[4];
		shapes[0]=new Triangle(8.0,12.0,"outlined");
		shapes[1]=new Rectangles(10);
		shapes[2]=new Rectangles(10,4);
		shapes[3]=new Triangle(7.0);
		
		for(int i=0;i<shapes.length;i++)
		{
			System.out.println("Object is "+shapes[i].getName());
			System.out.println("Area is "+shapes[i].area());
			System.out.println();
		}
	}

}
