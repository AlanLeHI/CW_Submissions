
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Create a method checkFor4() that is passed an int array and returns true if that array has a 4 and false if that array has no 4's. 
	 */
	public static boolean checkFor4(int[] arr)
	{
		//creates a copy of the array
		int[] copyArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			copyArr[i] = arr[i];
		}
		
		//creates a check to see if a 4 exists
		boolean checker = false;
		for (int i = 0; i < arr.length; i++) 
		{
			if (copyArr[i] == 4)
			{
				//change checker to true if there is
				checker = true;
			}
		}
		//return the check
		return checker;
	}

	/**
	 * Create a method countFor4() that is passed an int array and returns how many times 4 shows up in the array. 
	 * @param arr
	 * @return
	 */
	public static int countFor4(int[] arr)
	{
		//creates a copy of the array
		int[] copyArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			copyArr[i] = arr[i];
		}
		//creates a counter
		int counter = 0;
		//counts the amount of fours
		for (int i = 0; i < arr.length; i++) 
		{
			if (copyArr[i] == 4)
			{
				//increases count by 1 for every 4
				counter++;
			}
		}
		//returns  the count
		return counter;
	}
	
	/**
	 * Create a method checkForFour4() that is passed an int array and return true if the array has exactly four 4's in it. 
	 * * @param arr
	 * @return
	 */
	public static boolean checkForFour4(int[] arr)
	{
		//creates a copy of the array
		int[] copyArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			copyArr[i] = arr[i];
		}
		
		//creates a counter
		int counter = 0;
		//creates a checker to see if there are 4 fours
		boolean checker = false;
		for (int i = 0; i < arr.length; i++) 
		{
			if (copyArr[i] == 4)
			{
				//counts
				counter++;
			}
		}
		//if there are 4 fours it changes the check to true
		if (counter == 4)
		{
			checker = true;
		}
		//returns the check
		return checker;
	}
}
