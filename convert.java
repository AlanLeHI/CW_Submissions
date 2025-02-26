import java.util.ArrayList;;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] checkArr = {1, 1, 2, 2, 1, 1, 2, 2, 1};
		ArrayList<Integer> testArr = new ArrayList<Integer>();
		testArr.add(4);
		testArr.add(4);
		testArr.add(9);
		testArr.add(4);
		testArr.add(4);
		testArr.add(3);
		testArr.add(4);
		testArr.add(2);
		testArr.add(4);
		sort(testArr);
		System.out.println(testArr);
	}
	
	
	/**
	 * So this sorts the array given. I think this is selection sort but I really have no idea.
	 * @param numArr
	 * @return numArr but sorted
	 */
	public static ArrayList<Integer> sort(ArrayList<Integer> numArr)
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
		for (int i = counter; i < numArr.size(); i++)
		{
			//if the array index is greater than the index being checked, swap them
			if (numArr.get(counter) > numArr.get(i))
			{
				//swaps them
				numArr.set(counter, numArr.set(i, numArr.get(counter)));
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
/**
 * Man I just got lazy and made it return the smallest #
 * @param numArr
 * @return smallest #
 */
public static int smallest(ArrayList<Integer> numArr)
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
	for (int i = counter; i < numArr.size(); i++)
	{
		//if the array index is greater than the index being checked, swap them
		if (numArr.get(counter) > numArr.get(i))
		{
			//swaps them
			numArr.set(counter, numArr.set(i, numArr.get(counter)));
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
return numArr.get(0);
}

/**
 * finds average
 * @param num array
 * @return average
 */
public static int average(ArrayList<Integer> numArr)
{
	//self explanatory
	int average = 0;
	for (int i = 0; i < numArr.size(); i++)
	{
		average+= numArr.get(i);
	}
	average /= numArr.size();
	return average;
	
}

/**
 * checks if all nums are even
 * @param nums
 * @return
 */
public static boolean even(ArrayList<Integer> nums)
{
	 for (int i = 0; i < nums.size(); i++)
	 {
		//checks if it's even 
		 if (nums.get(i) % 2 != 0)
			 
		 {
				 
			 return false;
			 
		 }
	 }
	 return true;
}



/**
 * replaces 2 consecutive 5s into 0s
 * @param nums
 */
public static void replace15(ArrayList<Integer> nums)
{
	int counter = 0;
	 for (int i = 0; i < nums.length; i++)
	 {
			 if (nums.get(i) == 5)
			 {
				 counter++;
			 }
			 if (nums.get(i) != 5)
			 {
				 counter = 0;
			 }
			 if (counter == 2)
			 {
				 nums.set(i, 0);
				 nums.set(i - 1, 0);
				 counter = 0;
			 }
	}
}

/**
 * sees if numbers repeat 3 times
 */
public static boolean tripleCheck(ArrayList<Integer> nums)
{
		 for (int i = 0; i < nums.size(); i++)
		 {
			 int counter = 0;
			 for (int t = 0; t < nums.size(); t++)
			 {
				 if (nums.get(i) == nums.get(t))
				 {
					 counter++;
				 }
				 if (nums.get(i) != nums.get(t))
				 {
					 counter = 0;
				 }
				 if (counter >= 3)
				 {
					 return true;
				 }
			 }
			 
			 //if it exists inside the string, it adds 1 to the counter and if it exceeds 3 it returns true
		 }
		 return false;
}

/**
 * counts the amount of # in an int array
 * @param num to count
 * @param int array
 * @return # inside int array
 */
public static int counter(int num, ArrayList<Integer> nums)
{
	int amount = 0;
	//goes through array
	for (int i = 0; i < nums.size(); i++)
	{
		//counts if they match
		if(nums.get(i) == num)
		{
			amount++;
		}
	}
	return amount;
}

/**
 * makes array backwards
 * @param int array
 */
public static void backwards(ArrayList<Integer> nums)
{
	//creates a temp array
	ArrayList<Integer> copyArr = new ArrayList<Integer>();
	for (int k = 0; k < nums.size(); k++)
	  {
	    copyArr.add(nums.get(k));
	  }
	//creates an index for the array to go be copied to
	int k = 0;
	for (int i  = nums.size() - 1; i >= 0; i--)
	{
		//copies from  temp to array  backwards
		nums.set(i, copyArr.get(k));
		k++;
	}
}
/**
 * shifts arrat forward one
 * @param int array
 */
public static void shift(ArrayList<Integer> nums)
{
	nums.add(nums.remove(0));
}

}
