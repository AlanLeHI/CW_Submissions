import java.util.Scanner;
public class Main {
	
	public static void StringIntros(String[] args) {
		// TODO Auto-generated method stub
		//Creates a new scanner object called myReader
		Scanner myReader = new Scanner(System.in);
		
		//Uses the myInput Scanner object to get a string directly from the user and 
		//stops when they add a space
		String myInput = new String(myReader.next());

		//closes the scanner
		myReader.close();
		
		//Prints the second and last letter
		secondAndLastLetter(myInput);
		
		//Prints the index of the first 'e'
		System.out.println(findTheE(myInput));
		
		//Prints out the word's length
		System.out.println(getLength(myInput));
		
		//Prints out the last three letters
		printFirstAndLastThree(myInput);
	}
	/**
	 * This method prints out the second and last letter of a string
	 * @param temp
	 */
	public static void secondAndLastLetter(String temp)
	{
		//finds the word length
		int wordLength = temp.length();
		//finds the second letter
		char char1 = temp.charAt(1);
		//finds the last letter
		char char2 = temp.charAt(wordLength-1);
		//prints out the second and last letter
		System.out.println(char1 + " " + char2);
		
	}
	
	/**
	 * This method finds the first "e" of the word and returns its index
	 * @param temp
	 * @return
	 */
	public static int findTheE(String temp)
	{
		//returns the index of the first lower case 'e'
		return temp.indexOf('e');
	}

	/**
	 * This method returns the word length
	 * @param temp
	 * @return
	 */
	public static int getLength(String temp)
	{
		//finds the word length
		int wordLength = temp.length();
		//returns length
		return wordLength;
	}
	
	public static void printFirstAndLastThree(String temp)
	{
		//finds the word length
		int wordLength = temp.length();
		//returns the last 3 letters of the input
		System.out.println(temp.substring(wordLength-3, wordLength));
	}
	
}
