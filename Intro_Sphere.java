package A_PROJECT;

public class Intro_Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* This is my sphere class. It prints the radius, volume, and surface area of a volume as an integer.
		 */

		//This declares the radius of the sphere as an double
		final double pi = 3.14159265;
		double radius = 11;
		//This calculates its surface area
		double Surface_Area = 4*((radius)*(radius))*pi;
		//This calculates its volume
		double volume = ((radius)*(radius)*(radius))*(4.0/3.0)*pi;

		//This prints the values as a integer in a sentence
		System.out.print("The sphere has a radius of" + " " + radius + ". The surface area of the sphere is " + " " + (int)(Surface_Area) 
				+ " and the volume is" + " " + (int)(volume));

	}

}
