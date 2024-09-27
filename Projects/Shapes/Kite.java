/** this class does magic to create a kite object. It lists its perimeter, diagonal lengths, 
 * shape, area, and # of sides
 */

public class Kite {
//data attributes
	//declares the diagonals of the kite and makes it so you can't access it outside of the class
	private double diag1;
	private double diag2;

	/**
	 * Creates a kite object by taking the absolute value of l and w and assigns it to 
	 * diag1 and diag2
	 */
	public Kite(double l, double w)
	{
		//constructor
		diag1 = Math.abs(l);
		diag2 = Math.abs(w);
	}
	
	/**
	 * Says the shape which is a kite
	 */
	public static String getShape()
	{
		//says shape
		return ("Kite");
	}
	

	/**
	 * Returns the length of one diagonal of the kite created
	 */
	//functionality
	public double getDiag1()
	{
		//returns diag1
		return diag1;
	}
	
		/**
		 * Returns the length of the other diagonal of the kite created
		 */
	public double getDiag2()
	{
		//returns diag2
		return diag2;
	}
	
		/**
		* calculates and returns the perimeter
		*/
	public double getPerimeter() {
		//returns perimeter calculated from diag1 and 2
		return 2*(diag1+diag2);
	}
	
		/**
		 * calculates and returns the area
		 */
	public double getArea()
	{
		//gets area and returns it
		return ((diag1*diag2)/2);
	}
	
		/**
		 * Returns the number of sides of a kite
		 */
	public static int getNumOfSides()
	{
		//returns 4
		return 4;
	}
	}
	
