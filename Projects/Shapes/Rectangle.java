/** this class calculates info to create a rectangle object. It lists its perimeter, length, width,
 * shape, area, and # of sides
 * 
 */
public class Rectangle {
//data attributes
	//declares the length as a double and makes it inaccessible outside the class
	private double length;
	//declares the width as a double and makes it inaccessible outside the class
	private double width;

	
	/**
	 * Creates a rectangle object using the absolute value of the length and width
	 * constructor
	 */
	public Rectangle(double l, double w)
	{
		//gives the absolute value of l to length
		length = Math.abs(l);
		//gives the absolute value of w to width
		width = Math.abs(w);
	}
	
	
	/**
	 * Creates a rectangle object using the absolute value of a side
	 */
	public Rectangle(double s)
	{
		length = Math.abs(s);
		width = Math.abs(s);
	}

	/**
	* Says the shape of the shape
	*/
	public static String getShape()
	{
		//says shape
		return ("Rectangle");
	}
		
	
	/**
	 * functionality
	 * Returns the length given
	 */
	public double getLength()
	{
		//Returns the length
		return length;
	}
	
	
	/**
	 * Returns the width given
	 */
	public double getWidth()
	{
		//returns width
		return width;
	}
	
	
	/**
	 * Calculates and returns the perimeter of the rectangle
	 */
	public double getPerimeter() {
		//returns perimeter
		return (2*length)+(2*width);
	}
	
	
	/**
	 * Calculates and returns the area of the rectangle
	 */
	public double getArea()
	{
		//gets area
		return (length*width);
	}
	
	
	/**
	 * Returns the number of sides of a rectangle
	 */
	public static int getNumOfSides()
	{
		//returns num of sides
		return 4;
	}
	
	
	/**
	 * This turns everything about the rectangle object into a string
	 */
	public String toString()
	{
		//returns info
		return "This is a rectangle with length "  + length + " and an area of " + getArea() + 
				" and a perimeter " + getPerimeter() + " and has 4 sides";
	}


	public void setLength(double length) 
	{
		this.length = length;
	}


	public void setWidth(double width) 
	{
		this.width = width;
	}
}

