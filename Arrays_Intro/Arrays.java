
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Create an empty array that is meant to represent doubles. 
		 * Name it doubArr.Repeat this for arrays that represent ints,
		 *  booleans, String objects, and Circle objects. 
		 */
		double[] doubArr;
		int[] intArr;
		boolean[] dllArr;
		String[] strArr;
		Circle[] circArr;
		
		/*
		 * Create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000.
		 */
		int[] int2Arr = {7, -12, 88, -88, 0, 5, 2000};
		
		/*
		 * Create an array that represents 5 String objects with default values. 
		 * Name the array fruitsArr. In the comment for this task, state what each 
		 * element's default value is. State what the default value for ints, doubles, 
		 * booleans, and any reference data type is as well. 
		 */
		
		String[] fruitsArr = new String[5];
		//null
		int[] int3Arr = new int[5];
		//0
		boolean[] bll2Arr = new boolean[5];
		//false
		double[] doub2Arr = new double[5];
		//0.0
		Circle[] circ2Arr = new Circle[5];
		//null
		
		/*
		 *  Change the 2nd element in fruitsArr to "Bapple" .
		 */
		fruitsArr[1] = "bapple";
		
		/*
		 * Change the last element in fruitsArr to "Zanana" . 
		 * Accomplish this without typing the number "4" and instead accessing the arrays length.
		 */
		fruitsArr[fruitsArr.length - 1] = "zanana";
		
		/*
		 * To verify you did number 4 correctly, print out the second element of fruitsArr.
		 */
		System.out.println(fruitsArr[1]);
		
		/*
		 * Create a loop that one by one prints out each element in fruitsArr.
		 */
		int t = 0;
		for (int i = fruitsArr.length -1; i >= 0; i-- )
		{
			System.out.println(fruitsArr[t]);
			t++;
		}
	}

}
