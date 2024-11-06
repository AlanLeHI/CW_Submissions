import java.util.Scanner;
public class Main
{
	static Scanner myReader = new Scanner(System.in);
	public static void main(String[] args)
	{
		int winDoor = doorChooser1();
		int playerDoor = choose();
		int revealedDoor = checkCorrect(playerDoor, winDoor);
		int second = choice2(revealedDoor);
		checkDoor2(second, winDoor);
		 
		
	}
	public static int doorChooser1()
	{
		//randomizes which door is chosen
		int chosen = (int) ((Math.random())* 3 );
		//returns chosen door depending on randomizer
		if (chosen == 0)
		{
			return 1;
		}
		else if (chosen == 1)
		{
			return 2;
		}
		
		else
		{
			return 3;
		}
	}
	
	
	/**
	 * Player chooses door
	 * @return door player chooses
	 */
	public static int choose()
	{
		//Tells the user what to type
		System.out.println("Please type \"1\", \"2\", or \"3\"");
		//Creates scanner to read the user input
		//Stores the input in the variable playerGuess
		String playerGuess = myReader.nextLine();
		
		//Checks the value of playerGuess and returns an int depending on the String input
		if (playerGuess.equals("1") || playerGuess.equalsIgnoreCase("one"))
		{
			return 1;
		}
		else if (playerGuess.equals("2") || playerGuess.equalsIgnoreCase("two"))
		{
			return 2;
		}
		
		else if (playerGuess.equals("3") || playerGuess.equalsIgnoreCase("three"))
		{
			return 3;
		}
		
		//If they mess up by inputting something else they'll try again
		else 
		{
			System.out.print("try again");
			return choose();
		}
		
	}
	
	/**
	 * checks if the door the player chose is the correct door and prompts them to choose another
	 * @param playerGuess
	 * @param winDoor
	 * @return which door to close
	 */
	public static int checkCorrect(int playerGuess, int winDoor)
	{
		
		//Checks what the player guessed and what is the winning door and chooses the other one
		if ((playerGuess == 1 && winDoor == 3) || (playerGuess == 3 && winDoor == 1) )
		{
			return 2;
		}
		
		else if ((playerGuess == 1 && winDoor == 2) || (playerGuess == 2 && winDoor == 1))
		{
			return 3;
		}
		
		else if ((playerGuess == 2 && winDoor == 3) || (playerGuess == 3 && winDoor == 2))
		{
			return 1;
		}
		
		/*
		 * If the guessed door and the winning door are the same, math.random basically flips a coin
		 * to decide which one to choose to reveal
		 */
		else
		{
			int coinFlip = (int) ((Math.random()*2));		
			if (playerGuess == 1 && coinFlip == 1)
			{
				return 2;
			}
			
			else if (playerGuess == 1 && coinFlip == 0)
			{
				return 3;
			}
			if (playerGuess == 2 && coinFlip == 1)
			{
				return 1;
			}
			else if (playerGuess == 2 && coinFlip == 0)
			{
				return 3;
			}
			
			
			if (playerGuess == 3 && coinFlip == 1)
			{
				return 1;
			}
			else
			{
				return 2;
			}
		}

	}
	
	
	/**
	 * Reveals the chosen door and lets the user choose another door
	 * @param revealedDoor
	 * @return the second door chosen
	 */
	public static int choice2(int revealedDoor)
	{
		//Checks which door is revealed and lets the user choose another door
		if (revealedDoor == 3)
		{
			//tells the user the revealed door
			System.out.print("It is not door 3, please choose either door 1 or 2");
			//stores the choice as the variable choice
			String choice = myReader.nextLine();
			//checks what choice is equals to
			if (choice.equals("3") || choice.equalsIgnoreCase("Three"))
			{
				//returns -1 in case the user is an idiot
				return -1;
			}
			//if the user is smart it proceeds
			else
			{
				//checks what it equal to and returns the String as an int equivalent
				if (choice.equals("2") || choice.equalsIgnoreCase("two"))
				{
					return 2;
				}
				if (choice.equals("1") || choice.equalsIgnoreCase("one"))
				{
					return 1;
				}
			}
		}
		/**
		 * If the revealed door is 2, gives the options between 1 and 3
		 */
		else if (revealedDoor == 2)
		{
			System.out.print("It is not door 2, please choose either door 1 or 3");
			String choice = myReader.nextLine();
			if (choice.equals("2") || choice.equalsIgnoreCase("two"))
			{
				return -1;
			}
			else
			{
				if (choice.equals("3"))
				{
					return 3;
				}
				if (choice.equals("1"))
				{
					return 1;
				}
			}
		}
		/**
		 * If the revealed door is 1, gives the options between 2 and 3
		 */
		else
		{
			System.out.print("It is not door 1, please choose either door 2 or 3");
			String choice = myReader.nextLine();
			if (choice.equals("1"))
			{
				return -1;
			}
			else
			{
				if (choice.equals("2"))
				{
					return 2;
				}
				if (choice.equals("3"))
				{
					return 3;
				}
			}
		}
		//prints this out in case the user types in something stupid
		System.out.println("You're not very smart are you? Try typing one of the choices.");
		//reruns code
		return choice2(revealedDoor);
	}
	
	/**
	 * Checks if the chosen door and winning door are the same and prints a message
	 * @param second
	 * @param winDoor
	 */
	public static void checkDoor2(int second, int winDoor)
	{
		//If the user is an idiot and typed the revealed door, I just made them lose they don't deserve
		//a second change
		if (second == -1)
		{
			System.out.println("You chose the revealed door, you lose");
		}
		
		//If the doors match, they win
		else if (second == winDoor)
		{
			System.out.println("You win :D");
		}
		
		//If the doors don't match, it prints a losing message and what door it was behind
		else 
		{
			System.out.println("You lose " + "the prize was behind door " + winDoor);
		}
	}
}
