
public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterChecker("Leeeroy", 'e'));
		System.out.println(getFactorial(5));
		printIfRepeats("AaBb");
		
	}
	/**
	 * Checks how many times the letter is printed
	 * @param str given string
	 * @param letter letter checked
	 * @return # of that letter
	 */
public static int letterChecker(String str, char letter)
{
	//the number being counted
	int x = 0;
	//repeats for the amount of letters in the word
	for (int i = 0; i <str.length(); i++)
	{	
		//checks for each individual letter
		if (str.charAt(i) == letter)
		{
			//adds one if it is
			x++;
		}
	}
	//returns number 
	return x;
}
/**
 * prints the factorial of the number given
 * @param x the number
 * @return the factorial of it
 */
public static int getFactorial(int x)
{
	//repeats like a countdown of the number -1. The number being counted is multiplied by the number given
	for (int i = x-1; i > 0; i--)
	{
		//multiplies by the temporary number
		x = x * i;
		
	}
//returns the factorial
return x;
}

/**
 * checks is the letter repeats
 * @param str given string
 */
public static void printIfRepeats(String str)
{
	//changes string to lowercase
	str = str.toLowerCase();
	//creates a temporary word to check against
	String tempKey = str;
	//if each check fails, returns false
	boolean test = false;
	//repeats for each letter in the word
	for (int i = 0; i < str.length(); i++)
	{
		//resets tempkey
		tempKey = str;
		//if the checks are still failing
		if ((test == false));
		{
			//removes letter being checked
			tempKey = tempKey.substring(0, i) + " "  + tempKey.substring(i+1, tempKey.length()) ;
			//checks if the removed letter has a repeat in the word
			if (tempKey.indexOf(str.charAt(i)) != -1)
			{
				//if do changes check to true
				test = true;
			}
		}
	}
	//prints results
	System.out.println(test);
}
}
