/*
 * Creates a square object. Calculate/says its side length, shape, area, perimeter, and # of sides
 */
public class Square {
//data attributes
	//Declares the side as a double and makes it inaccessible outside the class
	private double side;

	
	
	/**
	 * Creates a square from the absolute length of one side
	 */
	public Square(double s)
	{
		//constructor
		side = Math.abs(s);
	}
	
	
	/**
	 * Says the name of the shape
	 */
	public static String getShape()
	{
		//says shape
		return ("Square");
	}
	

	/**
	 * Returns the side length given
	 * functionality
	 */
	public double getSide()
	{
		//returns length
		return side;
	}
	
	
	/**
	 * Calculates and returns the perimeter
	 */
	public double getPerimeter() {
		//returns perimeter
		return (4*side);
	}
	
	
	/**
	 * Calculates and returns the area
	 */
	public double getArea()
	{
		//gets area
		return (side*side);
	}
	
	
	/**
	 * Returns the # of sides of a square
	 */
	public static int getNumOfSides()
	{
		//returns num of sides
		return 4;
	}
	}
	
