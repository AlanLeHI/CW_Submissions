//This code does three separate prints. One for my name in ASCII art, one for an equation, and one for the circumference and area of a circle :D
/*This code is for the first assignment. This does two things, it prints Hello World and then I'll submit it
 */
public class Hello_World {

	public static void main(String[] args) {
		/*
		  For each task below, explain why the code is incorrect, what type of error that is, and how to fix it.
		*/
//I need to write my name in ASCII Art
System.out.println("    0     0       0     0   0");
System.out.println("   0 0    0      0 0    00  0");
System.out.println("  00000   0     0 0 0   0 0 0");
System.out.println(" 0     0  0    0     0  0  00");
System.out.println("0       0 000 0       0 0   0");

//Task 2: Write code to compute the following math problem:
System.out.println(((6.0*3.5)-(1.5*5))/ (55.6 - 30.2));

//Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. (Hint: the value of pi is 3.1519 and it never changes)

final double pi = 3.1519;
double rad = 4.0;
double circ = (2.0 * pi * rad);
double area = (pi* (rad * rad));
System.out.println("The circumference is " + circ + " and the area is " + area + ".");
	}

}
