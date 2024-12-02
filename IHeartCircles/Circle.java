
public class Circle {



    //data attributes
    //Creates pi and makes it private
    private final double pi = 3.14159265;
    //Creates and sets radius as a double
    private double radius;
    //Says the amount of dimensions
    int dimensions = 2;


    /**
     * Constructor
     * Creates a cube from the absolute value of the side length
     */
    public Circle(double r)
    {
        //constructor
        radius = Math.abs(r);
    }

    /**
     * Sets the radius
     * @param r
     */
    public void setRadius(double r)
    {
        radius = r;
    }



    /**
     * returns the shape name
     */
    public static String getShape()

    {
        return "circle";
    }


    //functionality
    /**
     * Returns the radius
     * @return
     */
    public double getRadius()
    {
        return radius;
    }


    /**
     * Calculates and returns diameter
     * @return
     */
    public double getDiameter()
    {
        return 2*radius;
    }

    /**
     * Calculates and returns circumference
     * @return
     */
    public double getCircumference() {
        return 2*radius*pi;
    }

    /**
     * Calculates and returns area
     * @return
     */
    public double getArea()
    {
        return ((radius)*(radius))*(pi);
    }

    public String toString() {
        return "This is a Circle with radius of " + radius + " and an area of " + getArea() +
                " and a circumference of " + getCircumference();
    }
}
