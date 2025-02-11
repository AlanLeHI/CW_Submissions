
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] checkArr = {4, 11, -4, 12, 99, 100, 7, -5};
		checkArr = sort(checkArr);
		for (int i = 0; i < checkArr.length; i++)
		{
			System.out.println(checkArr[i]);
		}
	}
	/**
	 * does a bubble sort, it's pretty neat
	 * @param numArr
	 * @return numArr but sorted pretty slowly
	 */
	public static int[] sort(int numArr[])
	{
		
		//creates a check of whether or not it's sorted to be flipped
		boolean sorted = false;
		//while the check flag is false, keep doing the loop
		while (sorted == false) 
		{
			//flips flag to true to be changed
			sorted = true;
			//goes through the array flipping the numbers next to each other depending on which one is bigger
			for (int i = 0; i < numArr.length - 1; i++)
			{
				//if the first number is bigger than the one next to it, swap them
				if (numArr[i] >= numArr[i + 1])
				{
					//does a swap
					swap(numArr, i, i+1);
					//flips flag to false if it has to swap anything
					sorted = false;
				}
			}

		}
		//returns the array for no reason
		return numArr;
	}
	/**
	 * does a funny swap
	 * @param numArr
	 * @param index1
	 * @param index2
	 * @return sorted array for no reason
	 */
	public static int[] swap( int numArr[], int index1, int index2)
	{
		//creates a copy array
		int[] copyArr = new int[numArr.length];
		for (int k = 0; k < numArr.length; k++)
		  {
		    copyArr[k] = numArr[k];
		  }
		//swaps the indexes
		numArr[index1] = copyArr[index2];
		numArr[index2] = copyArr[index1];
		return numArr;
	}

}
