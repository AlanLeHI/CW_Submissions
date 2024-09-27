public class Main {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Creates three rectangle objects using the rectangle class
		Rectangle recOne = new Rectangle(2.0 , 3.0);
		Rectangle recTwo = new Rectangle(5.0 , 2.0);
		Rectangle recThree = new Rectangle(-1.0 , 9.0);
		
		//Creates three kite objects using the kite class
		Kite kiteOne = new Kite(2.0 , 3.0);
		Kite kiteTwo = new Kite(-11.0 , 4.0);
		Kite kiteThree = new Kite(0.0 , 0.0);
		
		//Creates three right triangles using the right triangle class
		RightTriangle rtriOne = new RightTriangle(2.0,3.0);
		RightTriangle rtriTwo = new RightTriangle(3.0,4.0);
		RightTriangle rtriThree = new RightTriangle(-1.0,10.0);
		 
		//Creates three squares using the square class I'm going crazy
		Square sqrOne = new Square(2.0);
		Square sqrTwo = new Square(-1.0);
		Square sqrThree = new Square(11.0);
		
		//Creates three cubes using the cube class
		Cube cubeOne = new Cube(1.0);
		Cube cubeTwo = new Cube(2.0);
		Cube cubeThree = new Cube(-1.0);
		
		
		//Prints out the three rectangles' information
		MathStats.getRecStats(recOne);
		MathStats.getRecStats(recTwo);
		MathStats.getRecStats(recThree);
		
		//Prints out the three kites' information 
		MathStats.getKiteStats(kiteOne);
		MathStats.getKiteStats(kiteTwo);
		MathStats.getKiteStats(kiteThree);
		
		//Prints out the three right triangles' information
		MathStats.getRightTriangleStats(rtriOne);
		MathStats.getRightTriangleStats(rtriTwo);
		MathStats.getRightTriangleStats(rtriThree);
		
		//Prints out the three Squares' information 
		MathStats.getSquareStats(sqrOne);
		MathStats.getSquareStats(sqrTwo);
		MathStats.getSquareStats(sqrThree);
		
		//Prints out the three Cubes' information
		MathStats.getCubeStats(cubeOne);
		MathStats.getCubeStats(cubeTwo);
		MathStats.getCubeStats(cubeThree);
		
		//Prints all info about the rectangle
		System.out.print(recOne.toString());
	}

}
