
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] checkArr = {4, 11, 12, 99, 100, 7, -4};
		int[] checkArr2 = {4, 11, 12, 99, 100, 7, -4};
		checkArr2 = sort(checkArr);
		for (int i = 0; i < checkArr.length; i++)
		{
			System.out.println(checkArr2[i]);
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
/**
 * Man I just got lazy and made it return the smallest #
 * @param numArr
 * @return smallest #
 */
public static int smallest(int numArr[])
{
int smallest = 0;
//creates a check which changes when the array is sorted
boolean check = false;
//which index the sorting algorithm is on
int counter = 0;
//# of swaps counter
int swap = 0;
int[] copyArr = new int[numArr.length];
for (int k = 0; k < numArr.length; k++)
  {
    copyArr[k] = numArr[k];
  }
//while it is unsorted, keep going
while (check == false) 
{
	//changes check flag to true
	check = true;
	//combs through the array one by one
	for (int i = counter; i < copyArr.length; i++)
	{
		//if the array index is greater than the index being checked, swap them
		if (copyArr[counter] >= copyArr[i])
		{
			//swaps them
			swap(copyArr, counter, i);
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
smallest = copyArr[0];
return smallest;
}



/**
 * find index of smallest index
 * @param numArr
 * @return smallest index
 */
public static int indexOfSmallest(int numArr[])
{
int smallest = 0;
//creates a check which changes when the array is sorted
boolean check = false;
//which index the sorting algorithm is on
int counter = 0;
//# of swaps counter
int swap = 0;
int[] copyArr = new int[numArr.length];
for (int k = 0; k < numArr.length; k++)
  {
    copyArr[k] = numArr[k];
  }
//while it is unsorted, keep going
while (check == false) 
{
	//changes check flag to true
	check = true;
	//combs through the array one by one
	for (int i = counter; i < copyArr.length; i++)
	{
		//if the array index is greater than the index being checked, swap them
		if (copyArr[counter] >= copyArr[i])
		{
			//swaps them
			swap(copyArr, counter, i);
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
smallest = copyArr[0];
for (int i = 0; i < numArr.length; i++)
{
	if (numArr[i] == copyArr[0])
	{
		return i;
	}
}
return smallest;
}

/**
 * finds average
 * @param num array
 * @return average
 */
public static int average(int num[])
{
	//self explanatory
	int average = 0;
	for (int i = 0; i < num.length; i++)
	{
		average+= num[i];
	}
	average /= num.length;
	return average;
			
}
/**
 * replaces 2 consecutive 5s into 0s
 * @param nums
 */
public static void replace15(int nums[])
{
	//turns the array into a string
	int[] copyArr = new int[nums.length];
	  String test = "";
	  for (int i = 0; i < nums.length; i++)
	  {
	    test += nums[i];
	    copyArr[i] = nums[i];
	  }
	  //finds the index of the 2 5s and replaces them
	  if(test.indexOf("55") != -1)
	  {
		  int temp = test.indexOf("55");
		  nums[temp] = 0;
		  nums[temp + 1] = 0;
	  }
}

/**
 * sees if numbers repeat 3 times
 */
public static boolean tripleCheck(int nums[])
{
	//turns the array into a string
		int[] copyArr = new int[nums.length];
		  String test = "";
		  for (int i = 0; i < nums.length; i++)
		  {
		    test += nums[i];
		    copyArr[i] = nums[i];
		  }
		 
		  //goes through 0-9 to check if there are any repeats
		 for (int i = 0; i < 9; i++)
		 {
			//creates a string of three repeating numbers
			 String num = "";
			 num += i;
			 num += i;
			 num += i;
			 //if it exists inside the string, it returns -1
			 if (test.indexOf(num) != -1)
			 {
				 return true;
			 }
		 }
		 return false;
}

/**
 * counts the amount of # in an int array
 * @param num to count
 * @param int array
 * @return # inside int array
 */
public static int counter(int num, int nums[])
{
	int amount = 0;
	//goes through array
	for (int i = 0; i < nums.length; i++)
	{
		//counts if they match
		if(nums[i] == num)
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
public static void backwards(int nums[])
{
	//creates a temp array
	int[] copyArr = new int[nums.length];
	for (int k = 0; k < nums.length; k++)
	  {
	    copyArr[k] = nums[k];
	  }
	//creates an index for the array to go be copied to
	int k = 0;
	for (int i  = nums.length - 1; i >= 0; i--)
	{
		//copies from  temp to array  backwards
		nums[k] = copyArr[i];
		k++;
	}
}
/**
 * shifts arrat forward one
 * @param int array
 */
public static void shift(int nums[])
{
	//creates a temp array
	int[] copyArr = new int[nums.length];
	for (int k = 0; k < nums.length; k++)
	  {
	    copyArr[k] = nums[k];
	  }
	//creates an index for the array to go be copied to
	for (int i = 1; i < nums.length - 1; i++)
	{
		//copies from  temp to array  backwards
		nums[i] = copyArr[i + 1];
	}
	nums[0] = copyArr[nums.length-1];
}

}
