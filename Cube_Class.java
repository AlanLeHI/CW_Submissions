package A_PROJECT;

public class Intro_Cube {

	public static void main(String[] args) {
/* This is my cube class. It prints the edge, volume, and surface area of a cube as an integer.
 */

//This declares the sides of the cube as an double
double edge = 50.7;
//This calculates its surface area
double Surface_Area = 6*((edge)*(edge));
//This calculates its volume
double volume = edge*edge*edge;

//This prints the values as a integer in a sentence
System.out.print("The cube has an edge of" + " " + edge + ". The surface area of the cube is " + " " + (int)(Surface_Area) 
		+ " and the volume is" + " " + (int)(volume));

	}

}
