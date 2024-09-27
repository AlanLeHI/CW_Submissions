/** 
 * This prints all the calculated/given information of a shape when used
 */

public class MathStats {
	
	/**
	 * Prints a rectangle's shape, # of sides, side length, width, perimeter, and area. 
	 * Then makes a space after
	 */	
	public static void getRecStats(Rectangle temp)
	{
	
		//Get Rectangle Stats
		System.out.println("This is a " + temp.getShape());
		System.out.println("This shape has " + temp.getNumOfSides() + " sides");
		System.out.println("Its length is " + temp.getLength());
		System.out.println("Its width is " + temp.getWidth());
		System.out.println("Its perimeter is " + temp.getPerimeter());
		System.out.println("Its area is " + temp.getArea());
		//Spacing 
		System.out.println("");
	}
	/**
	 * Prints a right triangle's shape, # of sides, base, height, hypotenus, 
	 * perimeter, and area. Then makes a space after
	 */
	public static void getRightTriangleStats(RightTriangle temp)
	{
		//Print Right Triangle Stats
		System.out.println("This is a " + temp.getShape());
		System.out.println("This shape has " + temp.getNumOfSides() + " sides");
		System.out.println("Its base is " + temp.getBase());
		System.out.println("Its height is " + temp.getHeight());
		System.out.println("Its hypotenus is " +temp.getHypotenus());
		System.out.println("Its perimeter is " + temp.getPerimeter());
		System.out.println("Its area is " + temp.getArea());
		//Spacing
		System.out.println("");
	}
	
	/**
	 * Prints a cube's shape, # of sides, surface area, and volume. Then makes a 
	 * space after
	 */
	
	public static void getCubeStats(Cube temp)
	{
		//Print Cube stats
		System.out.println("This is a " + temp.getShape());
		System.out.println("This shape has " + temp.getNumOfFaces() + " faces");
		System.out.println("Its surface area is " + temp.getSurfaceArea());
		System.out.println("Its volume is " + temp.getVolume());
		//Spacing
		System.out.println("");
		
	}
	
	/**
	 * Prints a kite's shape, # of sides, first diagonal, second diagonal, perimeter, 
	 * and area. Then makes a space after
	 */
	public static void getKiteStats(Kite temp)
	{
		//Print Kite stats
		System.out.println("This is a " + temp.getShape());
		System.out.println("This shape has " + temp.getNumOfSides() + " sides");
		System.out.println("Its first diagonal is " + temp.getDiag1());
		System.out.println("Its second diagonal is " + temp.getDiag2());
		System.out.println("Its perimeter is " + temp.getPerimeter());
		System.out.println("Its area is " + temp.getArea());
		//Spacing
		System.out.println("");
	
	
	}
	
	/**
	 * Prints a square's shape, # of sides, side length, perimeter, and area. 
	 * Then makes a space after
	 */
	public static void getSquareStats(Square temp)
	{
		System.out.println("This is a " + temp.getShape());
		System.out.println("This shape has " + temp.getNumOfSides() + " sides");
		System.out.println("Its side length is " + temp.getSide());
		System.out.println("Its perimeter is " + temp.getPerimeter());
		System.out.println("Its area is " + temp.getArea());
		//Spacing
		System.out.println("");
	
	}
	}
