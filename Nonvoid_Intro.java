public class Nonvoid_Intro {
    public static void main(String[] args)
    {
        System.out.println(stateName());
        System.out.println(stateHairStyle());
        System.out.println(stateFavoriteFood());
        System.out.println(printCircleStats(6));
        System.out.print(printMathStuffs(5,8));
    }
    /*1. Create a nonvoid method called stateName() that returns your name. Repeat this task for stateEyeColor(), stateHairStyle(),
     stateBestFriend(), and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood(). Use the calls to 
     make a full print statement.  */
    public static String stateName(){
        //Returns my name
        return ("My name is Alan");
    }
    public static String stateEyeColor()
    {
        //Returns my eye color
        return ("my eye color is brown");
    }
    public static String stateHairStyle()
    {
        //returns my hair style
        return ("My hair style is bed hair");
    }
    public static String stateBestFriend()
    {
        //returns my best friend
        return ("My best friend is Elizabeth Nguyen");
    }
    public static String stateFavoriteFood()
    {
        //returns favorite food
        return ("My favorite food is karaage");
    }
    /* Create a nonvoid method printCircleStats() that is passed a double (meant to represent a circle's radius) and calculates 
    then returns the radius, diameter, circumference, and area of the circle. Call the method in a print statement or variable 
    declaration in order to make a complete print statement of all the properties.  */
    public static String printCircleStats(double radius)
    {
        //Calculates the circle's diameter, cricumference, and area using its radius and returns a statement listing each
        double diameter = radius * 2.0;		
		final double pi = 3.14159265;
		double circumference = diameter * pi;
		double area = (radius*radius)*pi;
		return ("The circumference is " + circumference + " and the area is " + area + " and the diameter is " + diameter + ".");
    }
    /* Create nonvoid methods that are passed two ints and returns their sum, difference, product, quotient, and the remainder 
    (using modulus) of the first number modulus the second number; all operations should be their own respective methods. Call them
    inside print statements to make sure they work.  */
    public static String printMathStuffs(int intone, int inttwo)
    {
        int sum = intone + inttwo;
		int dif = intone - inttwo;
		int quo = intone/inttwo;
		int rem = intone%inttwo;
		int prod = intone*inttwo;
		return ("The sum is " + sum + " the difference is " + dif + 
				" the quotient is " + quo + " the remainder is " + rem + "and the product is " +prod);
    }
}
