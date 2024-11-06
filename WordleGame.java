import java.util.Scanner;
public class main {

	static Scanner gameReader = new Scanner (System.in);
	public static void main(String[] args) {
		//random word generator
		String soln = new String ("brick" + "crass" + "crack" + "flame" + "guess" + "grass" + "tries" + "track");
		//picks a random word by cutting out one word from the string
		int randomWord = ((int) ((Math.random())* (soln.length())/5)) * 5;
		//picks that word as a "keyWord" or solution
		String keyWord = soln.substring(randomWord, randomWord + 5);
		
		//welcomes them (they don't deserve it)
		System.out.print("Welcome to Wordle! ");
		
		//run the game
		playGame(keyWord);
		

	}
	/**
	 * You decide how to comment this!
	 * 
	 * @param soln is the right answer
	 */
	
	public static void playGame(String keyWord) {
		
		//create a scanner object that is constructed to read the console (aka System.in)

		//prompt and allow user to give an input, set a String equal to it (it is the guess)
		System.out.println("Make a guess (lowercase with 5 letters please): ");
		String playerGuess = new String(gameReader.next());
		
		if (playerGuess.length() < 5 || playerGuess.length() > 5)
		{
			System.out.println("Your word is not 5 letters. Learn how to read");
			playGame(keyWord);
		}
		else
		{
			runGame(keyWord, playerGuess);
		}
	}
	/**
	 * This code checks if the letters of the guessed word matches the actual letters of the keyword
	 * If it does it prints the letter
	 * If it exists in the word it prints a ?
	 * If it doesn't it prints a capital X
	 * @param keyWord
	 * @param playerGuess
	 */
	public static void runGame(String keyWord,  String playerGuess)
	{
		//printed word that will print at the end
		String printedWord = "XXXXX";
		//tempWord will be used to check if letters are repeated multiple times by removing it from the tempKey if it is. That way
		String tempKey = keyWord;
		/*
		 * will repeat a whole bunch of times for each letter but the short of it is that it checks if the letter
		 * matches the player guess and replaces the X with that index with that letter if it do. If it exists, it'll return a ? unless it is not in tempKey.
		 * Also if the letter exists, it is replaced in tempWord. I hope it does because I coded this at 2 AM and I feel like a damn genius
		 */
		if (keyWord.charAt(0) == playerGuess.charAt(0))
		{
			//if correct replaces X in printedWord with letter
			printedWord = keyWord.charAt(0) + printedWord.substring(1, 5);
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(0))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(0)) + 1, tempKey.length());	
			
		}
		//repeats
		if (keyWord.charAt(1) == playerGuess.charAt(1))
		{
			printedWord = printedWord.substring(0, 1) + keyWord.charAt(1) + printedWord.substring(2, 5);
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(1))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(1)) + 1, tempKey.length());
		}
		//repeats
		if (keyWord.charAt(2) == playerGuess.charAt(2))
		{
			printedWord = printedWord.substring(0, 2) + keyWord.charAt(2) + printedWord.substring(3, 5);
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(2))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(2)) + 1, tempKey.length());
		}
		//repeats
		if (keyWord.charAt(3) == playerGuess.charAt(3))
		{
			printedWord = printedWord.substring(0, 3) + keyWord.charAt(3) + printedWord.substring(4, 5);
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(3))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(3)) + 1, tempKey.length());
		}
		//repeats
		if (keyWord.charAt(4) == playerGuess.charAt(4))
		{
			printedWord = printedWord.substring(0, 4) + keyWord.charAt(4);
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(4))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(4)) + 1, tempKey.length());
		}
		//checks if the solution has the letter and that it doesn't exist in tempWord
		//repeats
		
		
		
		//checks if the word exists in tempKey and isn't matching, it removes the char from tempKey and replaces it with a space then
		//replaces the poition with ? on printedWord
		if (((tempKey.indexOf(playerGuess.charAt(0)) > -1)) && !(keyWord.charAt(0) == playerGuess.charAt(0)))
		{
			//the replacing of tempKey
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(0))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(0)) + 1, tempKey.length());	
			//the replacing with ?
			printedWord = "?" + printedWord.substring(1, 5);

		}
		
		if (((tempKey.indexOf(playerGuess.charAt(1)) > -1)) && !(keyWord.charAt(1) == playerGuess.charAt(1)))
		{
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(1))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(1)) + 1, tempKey.length());
			printedWord = printedWord.substring(0, 1) + "?" + printedWord.substring(2, 5);
			
		}
		
		if (((tempKey.indexOf(playerGuess.charAt(2)) > -1)) && !(keyWord.charAt(2) == playerGuess.charAt(2)) )
		{
				tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(2))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(2)) + 1, tempKey.length());
				printedWord = printedWord.substring(0, 2) + "?" + printedWord.substring(3, 5);
		}
		
		if (((tempKey.indexOf(playerGuess.charAt(3)) > -1)) && !(keyWord.charAt(3) == playerGuess.charAt(3)))
		{
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(3))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(3)) + 1, tempKey.length());
			printedWord = printedWord.substring(0, 3) + "?" + printedWord.substring(4, 5);
		}
		
		if (((tempKey.indexOf(playerGuess.charAt(4)) > -1)) && !(keyWord.charAt(4) == playerGuess.charAt(4)))
		{
			tempKey = tempKey.substring(0, tempKey.indexOf(playerGuess.charAt(4))) + " " + tempKey.substring(tempKey.indexOf(playerGuess.charAt(4)) + 1, tempKey.length());
			printedWord = printedWord.substring(0, 4) + "?";
		}
		
		
		System.out.println(printedWord);

		//if they guess wrong
		 if (!(playerGuess.equals(keyWord)))
		{
			//prompt user to guess again because they were wrong
			 //this solely exists because I felt like the randomizer didn't reroll every time properly so I wanted
			 //to make sure it works
			 int tellThemTheySuck = 0;
			
			 if (tellThemTheySuck  == tellThemTheySuck)
			 {
				//randomizes the messages 
				 tellThemTheySuck = ((int) ((Math.random())*4));
			 }
			//tell them they suck ver 1
			 if (tellThemTheySuck == 0)
			 {
				 System.out.println("L bozo");
			 }
			 //tell them they suck ver 2
			 if (tellThemTheySuck == 1)
			 {
				 System.out.println("Try harder next time...");
			 }
			 //tell them they suck ver 3
			 if (tellThemTheySuck == 2)
			 {
				 System.out.println("You really need help to solve a wordle huh?");
			 }
			 //tell them they suck ver 4
			 if (tellThemTheySuck == 3)
			 {
				 System.out.println("You should give up...");
			 }
			 playGame(keyWord);
		}
		
		 /* if you are here, that means the user guessed it correctly */
		 else  
		{
			//print out success message
			System.out.println("Congrats! You successfully guessed that the word was " + keyWord + ".");
			gameReader.close();
		}
		
	}

}
