import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		//determine what the answer should be, coder gets to decide this LOWERCASE ONLY
		String soln = new String ("brick" + "crass" + "crack" + "flame" + "guess" + "grass" + "tries");
		int randomWord = ((int) ((Math.random())* 6)) * 5;
		String keyWord = soln.substring(randomWord, randomWord + 5);
		System.out.print("Welcome to Wordle! ");
		
		//run the game
		playGame(keyWord);
		

	}
	/**
	 * You decide how to comment this!
	 * 
	 * @param soln is the right answer
	 */
	
	private static void playGame(String keyWord) {
		
		//create a scanner object that is constructed to read the console (aka System.in)
		Scanner gameReader = new Scanner (System.in);
		
		//prompt and allow user to give an input, set a String equal to it (it is the guess)
		System.out.println("Make a guess (lowercase with 5 letters please): ");
		String playerGuess = new String (gameReader.next());
		
		if (playerGuess.length() < 5)
		{
			System.out.println("Your word is not 5 letters. Learn how to read");
			playGame(keyWord);
		}
		
		if (keyWord.charAt(0) == playerGuess.charAt(0))
		{
			System.out.print(keyWord.charAt(0));
		}
		else if (keyWord.indexOf(playerGuess.charAt(0)) > -1)
		{
			System.out.print("?");
		}
		else 
		{
			System.out.print("X");
		}
		
		
		
		if (keyWord.charAt(1) == playerGuess.charAt(1))
		{
			System.out.print(keyWord.charAt(1));
		}
		else if (keyWord.indexOf(playerGuess.charAt(1)) > -1)
		{
			System.out.print("?");
		}
		else 
		{
			System.out.print("X");
		}
		
		
		
		if (keyWord.charAt(2) == playerGuess.charAt(2))
		{
			System.out.print(keyWord.charAt(2));
		}
		else if (keyWord.indexOf(playerGuess.charAt(2)) > -1)
		{
			System.out.print("?");
		}
		else 
		{
			System.out.print("X");
		}
		
		
		
		if (keyWord.charAt(3) == playerGuess.charAt(3))
		{
			System.out.print(keyWord.charAt(3));
		}
		else if (keyWord.indexOf(playerGuess.charAt(3)) > -1)
		{
			System.out.print("?");
		}
		else 
		{
			System.out.print("X");
		}
		
		
		
		if (keyWord.charAt(4) == playerGuess.charAt(4))
		{
			System.out.println(keyWord.charAt(4));
		}
		else if (keyWord.indexOf(playerGuess.charAt(4)) > -1)
		{
			System.out.print("?");
		}
		else 
		{
			System.out.println("X");
		}
		
		
		
		
  	/*
		 * This is where all the code you write should be. You can write it all
		 * in here or you can write separate methods to accomplish the task.
		 * My only suggestion is to make methods that cheack each letter individially
		 * and prints out the letter, an X or a ? respectively. 
		 */
		
		
		 if (!(playerGuess.equals(keyWord)))
		{
			//prompt user to guess again because they were wrong
			 System.out.println("You suck");
			 playGame(keyWord);
		}
		 
		 else  /* if you are here, that means the user guessed it correctly */
		{
			//print out success message
			System.out.println("Congrats! You successfully guessed that the word was " + keyWord + ".");
			gameReader.close();
		}
		
	}

}
