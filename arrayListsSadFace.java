import java.util.ArrayList;
public class main {
//man........
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(5);
		nums.add(5);
		nums.add(5);
		nums.add(7);
		nums.add(2);
		nums.add(4);
		System.out.println(checkfor4(nums));
		sort(nums);
		System.out.println(nums);
		ridAllFives(nums);
		System.out.println(nums);
	}
/**
 * //Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
 */
	public static int checkfor4(ArrayList<Integer> nums)
	{
		//makes a lil loopy loop
		for (int i = 0; i < nums.size(); i++)
		{
			//if 4, return index of 4
			if (nums.get(i) == 4)
			{
				return i;
			}
		}
	//if no 4, return -1
		return -1;
	}
	
	/**
	 * deletes all the 5s
	 * @param nums
	 */
	public static void ridAllFives(ArrayList<Integer> nums)
	{
		//a second counter, i know I could have just i-i inside the check if there was a 5, but I thought of that later and I was lazy
		int k =  0;
		for (int i = 0; k < nums.size() - 1; i++)
		{
			//if 5 removes it
			if (nums.get(k)  == 5)
			{
				nums.remove(k);
			}
			//else moves forward an index
			else
			{
			k++;
			}
		}
	}
	/**
	 * just bubble sort  but for arraylists this time
	 * @param numArr
	 */
	public static void sort(ArrayList<Integer> numArr)
	{
		
		//creates a check of whether or not it's sorted to be flipped
		boolean sorted = false;
		//while the check flag is false, keep doing the loop
		while (sorted == false) 
		{
			//flips flag to true to be changed
			sorted = true;
			//goes through the array flipping the numbers next to each other depending on which one is bigger
			for (int i = 0; i < numArr.size() - 1; i++)
			{
				//if the first number is bigger than the one next to it, swap them
				if (numArr.get(i) > numArr.get(i+ 1))
				{
					//does a swap
					numArr.set(i, numArr.set(i+1, numArr.get(i)));
					System.out.println(numArr);
					//flips flag to false if it has to swap anything
					sorted = false;
				}
			}

		}

	}
}

