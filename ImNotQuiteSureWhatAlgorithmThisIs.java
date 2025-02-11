
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] checkArr = {4, 11, 12, 99, 100, 7, -4};
		checkArr = sort(checkArr);
		for (int i = 0; i < checkArr.length; i++)
		{
			System.out.println(checkArr[i]);
		}
		System.out.println("hello");
	}
	/**
	 * So this sorts the array given. I think this is selection sort but I really have no idea.
	 * @param numArr
	 * @return numArr but sorted
	 */
	public static int[] sort(int numArr[])
	{
	//creates a check which changes when the array is sorted
	boolean check = false;
	//which index the sorting algorithm is on
	int counter = 0;
	//# of swaps counter
	int swap = 0;
	
	//while it is unsorted, keep going
	while (check == false) 
	{
		//changes check flag to true
		check = true;
		//combs through the array one by one
		for (int i = counter; i < numArr.length; i++)
		{
			//if the array index is greater than the index being checked, swap them
			if (numArr[counter] >= numArr[i])
			{
				//swaps them
				swap(numArr, counter, i);
				//+1 to swap counter
				swap++;
				//flips flag to false
				check = false;
				
			}
		}
		//if it passes the check, prints out the amount of counters and swaps
		if (check)
		{
			System.out.println("checker");
			System.out.println(swap + " swap check");
			System.out.println(counter + " counter check");
		}
		//+1 to counter index checker
		counter++;
	}
	//returns it for no reason, it could have been a void lmao
	return numArr;
}
	/**
	 * swapper, someone showed me the light of having organized code
	 * @param numArr
	 * @param index1
	 * @param index2
	 * @return numArr but with 2 swapped indexs
	 */
public static int[] swap( int numArr[], int index1, int index2)
{
	//creates a new array and copies everything through for a temp array
	int[] copyArr = new int[numArr.length];
	for (int k = 0; k < numArr.length; k++)
	  {
	    copyArr[k] = numArr[k];
	  }
	//swaps the indexs
	numArr[index1] = copyArr[index2];
	numArr[index2] = copyArr[index1];
	//returns it for no reason
	return numArr;
}
}
