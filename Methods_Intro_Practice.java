package A_PROJECT;

public class Methods_Intro_Practice {

	public static void main(String[] args) {
/* 1. Create a void method called stateName() that prints out your name. Repeat this task for stateEyeColor(), 
 * stateHairStyle(), stateBestFriend(), and stateFavoriteFood(). 
 * Then, call stateName(), stateHairStyle, and stateFavoriteFood().
 */
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(50.0);
		printMathStuffs(5, 8);
	}
	public static void stateName()
	
	{
		//States name
		System.out.println("My name is Alan Le");
	}
	public static void stateEyeColor()
	{
		//States eye color
		System.out.println("My eye color is brown");
	}
	public static void stateHairStyle()
	{
		//States hair style 
		System.out.println("My hair style is bed hair");
	}
	public static void stateBestFriend()
	{
		//States best friend
		System.out.println("My best friend is Elizabeth Nguyen");
	}
	public static void stateFavoriteFood()
	{
		//States favorite food
		System.out.println("My favorite food is karaage");
	}
	/* Create a method printCircleStats() that is passed a double (meant to represent a circle's radius) 
	 * and calculates then prints out the radius, diameter, circumference, and area of the circle. 
	 * Call the method to make sure it works.
	 */
	public static void printCircleStats(double radius)
	{
		double diameter = radius * 2.0;		
		final double pi = 3.14159265;
		double circumference = diameter * pi;
		double area = (radius*radius)*pi;
		System.out.println("The circumference is " + circumference + " and the area is " + area + " and the diameter is " + diameter + ".");
				
		
	}
	public static void printMathStuffs(int intone, int inttwo) 
	{
		/* 3. Create a method printMathStuffs() that is passed two ints and prints their sum, 
		 * difference, product, quotient, and the remainder (using modulus) of the first number modulus 
		 * the second number. Call it to make sure it works.
		 */
		int sum = intone + inttwo;
		int dif = intone - inttwo;
		int quo = intone/inttwo;
		int rem = intone%inttwo;
		int prod = intone*inttwo;
		System.out.print("The sum is " + sum + " the difference is " + dif + 
				" the quotient is " + quo + " the remainder is " + rem + "and the product is " +prod);
	}
}
