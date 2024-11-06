import java.util.Scanner;
public class main {

	static Scanner gameReader = new Scanner (System.in);
	public static void main(String[] args) {
		//random word generator
		String soln = new String ("brick" + "crass" + "crack" + "flame" + "guess" + "grass" + "tries" + "track");
		//picks a random word by cutting out one word from the string
		int randomWord = ((int) ((Math.random())* (soln.length())/5) ) * 5;
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
		String printedWord = "";
		//tempWord will be used to check if letters are repeated
		String tempWord =  "";
		/*
		 * will repeat a whole bunch of times for each letter but the short of it is that it checks if the letter
		 * matches the player guess and prints that letter if it do. If it exists, it'll return a ? unless it is already in temp word.
		 * Also if the letter exists, it is added to tempWord. If the letter doesn't exist it or is in tempWord && isn't in that spot it 
		 * will print an X. Makes sense? I hope it does because I coded this at 2 AM and I feel like a damn genius
		 */
		if (keyWord.charAt(0) == playerGuess.charAt(0))
		{
			//if correct adds letter to printedWord
			printedWord = printedWord + keyWord.charAt(0);
		}
		//checks if the solution has the letter and that it doesn't exist in tempWord
		else if ((keyWord.indexOf(playerGuess.charAt(0)) > -1) && ((tempWord.indexOf(playerGuess.charAt(0)) > -1) == false))
		{
			//adds to tempWord the letter
			tempWord = tempWord + playerGuess.charAt(0);
			//adds a ? to the printedWord
			printedWord = printedWord + "?";
		}
		else 
		{
			//if none of these check, it adds a X
			printedWord = printedWord + "X";
		}
		
		
		//repeats
		if (keyWord.charAt(1) == playerGuess.charAt(1))
		{
			printedWord = printedWord + keyWord.charAt(1);
		}
		else if (keyWord.indexOf(playerGuess.charAt(1)) > -1 && ((tempWord.indexOf(playerGuess.charAt(1)) > -1) == false))
		{
				tempWord+= playerGuess.charAt(1);
				printedWord+= "?";
		}
		else 
		{
			printedWord+= "X";
		}
		
		
		
		//repeats
		if (keyWord.charAt(2) == playerGuess.charAt(2))
		{
			printedWord = printedWord + keyWord.charAt(2);
		}
		else if (keyWord.indexOf(playerGuess.charAt(2)) > -1 && ((tempWord.indexOf(playerGuess.charAt(2)) > -1) == false))
		{
			tempWord+= playerGuess.charAt(2);
			printedWord+= "?";
		}
		else 
		{
			printedWord+= "X";
		}
		
		
		//repeats
		if (keyWord.charAt(3) == playerGuess.charAt(3))
		{
			printedWord = printedWord + keyWord.charAt(3);
		}
		else if (keyWord.indexOf(playerGuess.charAt(3)) > -1 && ((tempWord.indexOf(playerGuess.charAt(3)) > -1) == false))
		{
			tempWord+= playerGuess.charAt(3);
			printedWord+= "?";
		}
		else 
		{
			printedWord+= "X";
		}
		
		
		//repeats
		if (keyWord.charAt(4) == playerGuess.charAt(4))
		{
			printedWord = printedWord + keyWord.charAt(4);
		}
		else if (keyWord.indexOf(playerGuess.charAt(4)) > -1 && ((tempWord.indexOf(playerGuess.charAt(4)) > -1) == false))
		{
			tempWord+= playerGuess.charAt(4);
			printedWord+= "?";
		}
		else 
		{
			printedWord+= "X";
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
				 tellThemTheySuck = ((int) ((Math.random())*4));
			 }
			 if (tellThemTheySuck == 0)
			 {
				 System.out.println("L bozo");
			 }
			 
			 if (tellThemTheySuck == 1)
			 {
				 System.out.println("Try harder next time...");
			 }
			 
			 if (tellThemTheySuck == 2)
			 {
				 System.out.println("You really need help to solve a wordle huh?");
			 }
			 
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
