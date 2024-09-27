/**  
 * Cubes were a mistake. This finds the information of a cube using its side. 
 * This class finds the cube's shape, surface area, volume, number of sides, and side length. 
 * Was too lazy to rename "sides" to "faces" (ノ-_-)ノ~┻━━━┻
 */
public class Cube {
//data attributes
	//declares side as a double 
	private double side;

	/**
	 * Constructor
	 * Creates a cube from the absolute value of the side length
	 */
	public Cube(double s)
	{
		side = Math.abs(s);
	}
	
	/**
	 * returns the shape name
	 */
	public static String getShape()
	{
		//says shape
		return ("Cube");
	}
	

	/**returns the side length
	 * functionality
	 */
	public double getSide()
	{
		//returns length
		return side;
	}
	
	
	/**
	 * returns get surface area of the shape
	 */
	public double getSurfaceArea() 
	{
		//finds area for one side of the shape
		double temp = (side*side);
		//finds surface area for entire shape
		return 6*temp;
		
	}
	
	
	/**
	 * Returns the volume of the shape
	 */
	public double getVolume()
	{
		//gets area
		return (side*side*side);
	}
	
	
	/**
	 * returns the # of sides
	 */
	public static int getNumOfFaces()
	{
		//returns num of faces
		return 6;
	}
	}
	
