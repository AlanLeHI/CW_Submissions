package efwbnefcncfw;
import java.util.ArrayList;
public class Sort {
/** hopefully I did it the way you wanted it to be
*/
	/**
	 * shoves the 2D array into an array list, sorts it, then puts it back LR order
	 * @param toBeSorted
	 * @return didSorted
	 */
public static double[][] sortLR(double [][] toBeSorted)
{	
	//creates an array for it to be shoved into
	ArrayList<Double> mcQueen = new ArrayList<Double>();
	//loops through the array to add to the ArrayList
	for(int i = 0; i < toBeSorted.length; i++)
	{
		for (int k = 0; k< toBeSorted[i].length; k++)
		{
			mcQueen.add(toBeSorted[i][k]);
		}
	}
	
	//sorts it
	bort(mcQueen);
	
	//replaces the original values with the sorted values
	for(int i = 0; i < toBeSorted.length; i++)
	{
		for (int k = 0; k< toBeSorted[i].length; k++)
		{
			toBeSorted[i][k] =  mcQueen.get(0);
			mcQueen.remove(0);
		}
	}
	//returns the sorted array
	return toBeSorted;
}
/**
 * does the same thing as sortLR but up and down
 * @param toBeSorted
 * @return
 */
public static double[][] sortUD(double [][] toBeSorted)
{	
	//creates an array for it to be shoved into
	ArrayList<Double> mcQueen = new ArrayList<Double>();
	////loops through the array to add to the ArrayList
	for(int i = 0; i < toBeSorted.length; i++)
	{
		for (int k = 0; k< toBeSorted[i].length; k++)
		{
			mcQueen.add(toBeSorted[i][k]);
		}
	}
	////sorts it
	bort(mcQueen);
	
	////replaces the original values with the sorted values
	for(int i = 0; i < toBeSorted.length; i++)
	{
		for (int k = 0; k< toBeSorted[i].length; k++)
		{
			toBeSorted[k][i] =  mcQueen.get(0);
			mcQueen.remove(0);
		}
	}
	//returns the sorted array
	return toBeSorted;
}

/**
* the b(est) (s)ort(er), sorts an arraylist
*/
public static void bort(ArrayList<Double> numArr)
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
				//System.out.println(numArr);
				//flips flag to false if it has to swap anything
				sorted = false;
			}
		}

	}

}
}
