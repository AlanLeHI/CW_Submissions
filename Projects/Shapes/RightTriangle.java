/**
 * Creates a right triangle object. Calculates/says its hypotenus, base, height, perimeter, area,
 * shape, and # of sides
 */
public class RightTriangle {
	//Declares base as a double and makes it inaccessible outside the class
	private double base;
	//Declares height as a double and makes it inaccessible outside the class
	private double height;
	//Calculates the hypotenus "hyp" and stores it as a double 
	//and makes it inaccessible outside the class
	private double hyp = Math.sqrt((base*base))+((height)*(height));
	
	
	public RightTriangle(double l, double w)
	{
		/**
		 * Creates a right triangle object using the absolute value of the length and width
		 */
		//constructor
		//assigns the abs of l to length
		base = Math.abs(l);
		//assigns the abs of w to width
		height = Math.abs(w);
	}
	
	public static String getShape()
	{
		/**
		 * returns the shape name
		 */		
		//Returns "Right Triangle"
		return ("Right Triangle");
	}
	

	/**
	 * functionality
	 * Returns the base given
	 */
	public double getBase()
	{
		//returns base
		return base;
	}


	/**
	* Returns the height given
 	*/
	public double getHeight()
	{
		//returns Height
		return height;
	}


	/**
	 * Returns the previously calculated hypotenus
	 */
	public double getHypotenus()
	{
		//returns the hypotenus
		return hyp;
	}


	/**
	 * Calculates the perimeter and returns it
	 */
	public double getPerimeter() {
		//returns perimeter
		return base + height + hyp;
	}


	/**
	 * Calculates the area and returns it
	 */
	public double getArea()
	{
		//gets area
		return (0.5)*(base*height);
	}


	/**
	 * Says the # of sides of a right triangle and returns it
	 */
	public static int getNumOfSides()
	{
		//returns num of sides
		return 3;
	}
}


