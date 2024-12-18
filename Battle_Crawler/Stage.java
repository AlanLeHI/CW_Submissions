import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Stage {
	static public int stageNum;
	static Scanner gameReader = new Scanner (System.in);
	/**
	 * This method starts the game
	 */
	public static void gameStart()
	{
		//prints message 
		System.out.println("Welcome to prototype crawler. What is your name?");
		//Readers their input for their name
		String name = new String(gameReader.nextLine());
		//Asks them for their class
		System.out.println("What class would you like to be? Type \"class\" for classes");
		//reads their class
		String classes = new String(gameReader.nextLine());
		//verify is classes are valid
		classes = verifyClass(classes);
		//generates a player object
		Player user = Player.generatePlayer(classes, name);
		//asks them if they want to play the tutorial
		promptTutorial(user);
	}
	/**
	 * Da tutorial tells you how stuff works
	 */
	public static void daTutorial(Player user)
	{
		System.out.println("Okay ima speedrun this");
		System.out.println("You see this? Fafnir[4]");
		System.out.println("The 4 shows how many counters it uses. If you have 4 counters, it's 4-4 after you use the move");
		System.out.println("If the counter hits 0, you pass the move to the enemy. If you go under, well let's just");
		System.out.println("Say you don't want that to happen.");
		System.out.println("You also get items, they don't take up any counters");
		System.out.println("Go have fun exploring what the moves do.");
		System.out.println("Are you ready?");
		new String(gameReader.nextLine());
		startStg0(user);
	}
	/**
	 * Verify if class asked exists 
	 */
	public static String verifyClass(String classes)
	{
		//if the input is class or the input isn't a class name, it reprompts them
		while (classes.equalsIgnoreCase("class") || !classes.equalsIgnoreCase("bruiser"))
		{
			//prints out available classes
			System.out.println("The current classes are just \"bruiser\"");
			//asks them to pick a class
			System.out.println("Please pick a class");
			//reasks them for classes
			classes = new String(gameReader.nextLine());
		}
		
		return classes;
	}
	
	/**
	 * Prompts the user if they want a tutorial, starts stage 0 if not
	 */
	public static void promptTutorial(Player user)
	{
		//asks for tutorial
		textPA("Would you like a tutorial? Yes or No");
		//gets their answer
		String answer = "";
		answer = new String(gameReader.nextLine());
		//if yes, does tutorial
		if (answer.equalsIgnoreCase("yes"))
		{
			daTutorial(user);
		}
		//if no, starts stage 0
		else 
		{
			startStg0(user);
		}
		stgCheck(stageNum, user);
	}
	
	/**
	 * stgCheck checks what stage the user is on and directs them to the stage, passing their stats
	 * @param stgNum
	 * @param user
	 */
	public static void stgCheck(int stgNum, Player user)
	{
		if (stageNum == 1)
		{
			startStg1(user);
		}
		else if (stageNum == 2 || stageNum == -999)
		{
			startStg2(user);
		}
		else if (stageNum == 3)
		{
			startStg3(user);
		}
		else if (stageNum  ==  4)
		{
			startStg4(user);
		}
	}
	
	/**
	 * Starts stage 0, easy enemy battle
	 * @param user
	 */
	public static void startStg0(Player user)
	{
		//sets current stage to 0
		stageNum = 0;
		//flavor text
		textPA("You take a step forth into the damp, dark room. You let out a sigh of relief as");
		textPA("it's empty. Sudden a monster jumps forth from behind the corner");
		//creates easy enemy
		Enemy enemy1 = Enemy.generateEnemy(1);
		//enters battle with enemy generated
		enterBattle(user, enemy1);
		stgCheck(stageNum, user);
	}
	
	/**
	 * Creates branching paths, one with a mimic, and one with a harder enemy
	 * @param user
	 */
	public static void startStg1(Player user)
	{
		//asks user what path they want
		textPA("There are two paths in front of you, one with a chest on the left and the other a wood door. Say left or right");
		//gets their input
		String answer = new String(gameReader.nextLine());
		//if they say left, goes to room ID 2
		if (answer.equalsIgnoreCase("left"))
		{
			stageNum ++;
		}
		//of they say right, goes to room ID 999
		else if (answer.equalsIgnoreCase("right"))
		{
			stageNum = -999;
		}
		//reprompts if invalid
		else
		{
			stageNum ++;
		}
		//sends them to that stage with passed player stats
		stgCheck(stageNum, user);
	}
	
	/**
	 * If the room ID is 2 mimic fight or -999, starts a medium difficulty fight
	 * @param user
	 */
	public static void startStg2(Player user)
	{
		//if room ID is 2, mimic fight
		if (stageNum == 2)
		{
			textPA("You peak around the corner and notice a suspicious chest. Your curiosity gets the best of you and you");
			textPA("open the chest. Uncount riches are revealed. As you put your hand inside, the chest snaps shut, almost ripping your hand");
			textPA("off. You brace yourself");
			//creates enemy with unique enm ID
			Enemy mimic = Enemy.generateEnemy(86);
			//enters battle with enemy
			enterBattle(user, mimic);
		}
		//if right, medium fight
		if (stageNum == -999)
		{
			textPA("placeholder text");
			Enemy enemy = Enemy.generateEnemy(2);
			enterBattle(user, enemy);
		}
		stageNum = 3;
		stgCheck(stageNum, user);
	}
	/**
	 * Starts stage 3
	 * @param user
	 */
	public static void startStg3(Player user)
	{
		if (stageNum == 3 )
		{
			textPA("You take a deep breath, a difficult fight is  ahead");
			//generates and starts battle
			Enemy enemy = Enemy.generateEnemy(3);
			enterBattle(user, enemy);
		}
		//goes to stage
		stgCheck(stageNum, user);
	}
	
	public static void startStg4(Player user)
	{
		//if low hp, does a special message
		if (user.getHealth() <= (int)((0.30)*(user.getMaxHealth())));
		{
			textPA("You made it out by the skin of your teeth");
		}
		//enemy start msg
		textPA("You open the heavy gates in front of you...");
		slowtextPA("...");
		slowtextPA("...");
		slowtextPA("...");
		textPA("You feel judgement being passed upon you.");
		textPA("A giant knight in armor sitting on a throne stands in front of you.");
		textPA("The armor of the fallen stands between you and the knight");
		//generates enemy
		Enemy boss = Enemy.generateEnemy(true, 1);
		//enters battle with generated enemy
		enterBattle(user, boss);
		if (boss.getHealth()  <=  0)
			{
			ending(user);
			}
	}
	/**
	 * starts the battle system and lasts until either the enemy's health drops to zero or yours does
	 * @param user
	 * @param enemy
	 */
	public static int enterBattle(Player user, Enemy enemy1)
	{
		System.out.println("The battle begins");
		//turn counter
		int n = 0;
		//while both the enemy and user hp is above zero the battle system will keep running
		while (user.getHealth() > 0 && enemy1.getHealth() > 0)
		{
			//adds one to turn counter
			n++;
			//printers out turn count
			textPA("Turn" + n + ": It's your turn!");
			//man I really wanted to make multiple enemies but it would have taken too long and now I'm too lazy to remove this
			Enemy[] enemyList = {enemy1};
			//checks if the user is stunned, turn counter drops to zero if so
			Move.stunStateCheck(user);
			//pulls up the menu
			userMenu(user, enemy1, enemyList);
			//checks if the enemy is still alive
			if (enemy1.getHealth() > 0)
			{
				//checks enemy stun state, if true, skips their turn
				if (enemy1.isStunState())
				{
					System.out.println("The Enemy is stunned! Their turn was skipped!");
					//turns off stun for the enemy
					enemy1.setStunState(false);
				}
				//if enemy is not stunned
				else
					{
					//enemy does attack
					Enemy.enemAttack(enemy1, user);
					}
			}
			//prints if user dies
			else if (user.getHealth() < 0)
			{
				textPA(user.getName() + " was defeated...");
				return 1;
			}
			
			//prints if user wins
			else
			{
				//if enemy is dead, else restarts loop
				if (enemy1.getHealth() < 0)
				{
					//winning message
					textPA("You won the battle!");
					int amountOfPossibleDrops = 0;
					//checks for the amount of possible drops
					for (int i=0; i != enemy1.getDropList().length(); i++)
					{
						if (enemy1.getDropList().charAt(i) == '*')
						{
							//adds 1 to possible drops
							amountOfPossibleDrops ++;
						}
					}
					//chooses one of the drops
					int random = ((int) (Math.random() * (amountOfPossibleDrops)));
					//pulls up the drop list
					String tempList = enemy1.getDropList();
					//finds out where the drop position is, cuts out item from list and adds it to the user's items
					for (int i=0; i != random +1; i++)
					{
						//gets the index where to chop off
						int chopper = tempList.indexOf('*');
						if (random == i)
						{
							//says it dropped something
							System.out.println("The enemy dropped something!");
							//cuts off everything after the *
							tempList = tempList.substring(0, tempList.indexOf('*')  + 1);
							//sets the itemlist so it adds the item dropped
							user.setItemList(user.getItemList() + tempList);
							//says the item
							if (tempList != "")
							{
								System.out.println(tempList);
							}
							else 
							{
								System.out.println("lol nothing");
							}
						}
						else 
						{
							//cuts off everything before the chopper
							tempList =  tempList.substring(chopper + 1);
						}
					}
					//moves the stage num up one
					stageNum += 1;
					//moves to next stage
				}
			}
		}
	return 1;
	}
	/**
	 * Pulls up the user's main menu
	 * @param user
	 * @param target
	 * @param emList
	 */
	public static void userMenu(Player user, Enemy target, Enemy[] emList)
	{
		//while the user's counters are > 0, it repeatedly prompts for attack
		while (user.getCounter() > 0)
		{
			System.out.println("-----------------------------------------------");
			System.out.println(user.getName() + "'s HP: " + user.getHealth() + "/" + user.getMaxHealth() );
			//I was gonna make it so if there's multiple enemies it prints them out but I got lazy
			for(int i = 1; i != emList.length + 1; i++)
			{
				//prints enemy hp
				System.out.println(target.getName() + "'s HP:" + target.getHealth() + "/" + target.getMaxHealth());
			}
			//prints possible options
			System.out.println("1: Moves");
			System.out.println("2: Items");
			//counter #
			System.out.println("Counters:" + user.getCounter() + "/" + user.getMaxCounter());
			System.out.println("Say a number to pick your next option");
			//reads the opponent's option
			String option = new String(gameReader.nextLine());
			//if they said 1, it pulls up the moves
			if (option.equals("1") || option.equalsIgnoreCase("Moves"))
			{
				//goes to the move reader method
				chooseAMove(user, target, emList);
			}
			//if they say 2, it pulls up the item system
			else if (option.equals("2") || option.equalsIgnoreCase("Items"))
			{
				//pulls up item menu
				itemMenu(user, target, emList);
			}
			//hard coded a solution because mr trauger broke it
			if (target.getHealth() < 0)
			{
				user.setCounter(0);
			}
		}
		//meant to be used if the user enters negative counters, self damage and stuns themselves
		if (user.getCounter() < 0)
		{
			//damages = 1/5 max hp * the # of negative counters 
			int dmg = ((user.getMaxHealth()/5) * user.getCounter());
			System.out.println("You exhausted yourself (counters fell below 0). You're stunned and took " +dmg+ "!");
			//subtracts dmg
			user.setHealth(user.getHealth() + dmg);
			//set stun state to true
			user.setStunState(true);
			
		}
		//resets counters
		user.setCounter(user.getMaxCounter());
		
		if (user.isGrounded() == false)
		{
			user.setGrounded(true);
			System.out.println("You landed on your feet!");
		}
	}
	
	/**
	 * This creates a menu that lets the player choose their move. It prompts the user
	 * to choose a move by saying the move name. The move name is passed into the doMove method
	 * and checks if the move exists in the player character and is a valid move. It then does damage calculation
	 * @param user
	 * @param target
	 * @param emList
	 */
	public static void chooseAMove(Player user, Enemy target, Enemy[] emList)
	{
		//prompts user
		System.out.println("Cast your spell or say 'back' to return to the menu");
		//prints out each move 
		for (int i=0; i != user.getMovelist().length; i++)
		{
			System.out.println(user.getMovelist()[i]);
		}
		//asks user to say move
		String command = new String(gameReader.nextLine());
		//creates a really big string to test if the said move is inside the user's move list
		String test = "";
		for (int i = 0; user.getMovelist().length != i; i++)
		{
			test += user.getMovelist()[i];
			test += " ";
		}
		//makes all the letters in the big string lower case
		test = test.toLowerCase();
		//if the user says back, it restarts the main menu
		if (command.equalsIgnoreCase("back"))
		{
			userMenu(user, target, emList);
		}
		//if the command was valid, it says the user casted the move and does it
		else if ((test.indexOf(command.toLowerCase()) != -1))
		{
			//prints out the command done
			System.out.println("You casted " + command.toLowerCase());
			//does the move said
			Move.doMove(command, user, target);
		}		
	}
	/**
	 * Item menu, does the menuing for the items. I don't know what else to say.
	 * @param user
	 * @param target
	 * @param emList
	 */
	public static void itemMenu(Player user, Enemy target, Enemy[] emList)
	{
		System.out.println("Cast your item or say 'back' to return to the menu");
		//creates a temp variable for all the menu items
		String temp = user.getItemList();
		//creates a space to track where I want to cut off the temp
		int keySpace = 0;
		//repeats till I print all the items
		for (int i =0; i!= temp.length(); i++)
		{
			//cuts off at the * character
			if (temp.charAt(i) == '*')
			{
				//prints the item
				System.out.println(temp.substring(keySpace,i));
				//Goes to the next item
				keySpace = i + 1;
			}
		}
		//asks what item they want to use
		String command = new String(gameReader.nextLine());
		if (temp.length() == 0)
		{
			System.out.println("You have no items!");
			command = "back";
		}
		//to test if the item exists
		String test = user.getItemList();
		test = test.toLowerCase();
		
		//if they say back, goes back to main menu
		if (command.equalsIgnoreCase("back"))
		{
			userMenu(user, target, emList);
		}
		
		//else it does the item move
		else if ((test.indexOf(command.toLowerCase()) != -1))
		{
			System.out.println("You casted " + command.toLowerCase());
			//does the item
			Move.doItem(command, user, target);
		}
			
	}
	/**
	 * Delayed text printer. It has a few millisecond delay after every char printed
	 * @param text
	 * @return nothing
	 */
	public static int textPA(String text)
	{
		//prints text one character at a time with a 20, or whatever I put, ms delay in between
		try
		{
			for (int i = 0; i != text.length(); i++)
			{
				//creates a small delay
				TimeUnit.MILLISECONDS.sleep(30);
				//prints character at i
				System.out.print(text.charAt(i));
			}
			System.out.println("");
		}
		//I'm gonna be honest, I tried to make so if they press something it just ends the text but I never
		//got it to work so I gave up
		catch (InterruptedException e)
		{
			return 1;
		}
		return 1;
	}
	
	/**
	 * Text PA but I slowed it down
	 * @param text
	 * @return slower text
	 */
	public static int slowtextPA(String text)
	{
		//prints text one character at a time with a 20, or whatever I put, ms delay in between
		try
		{
			for (int i = 0; i != text.length(); i++)
			{
				//creates a small delay
				TimeUnit.MILLISECONDS.sleep(400);
				//prints character at i
				System.out.print(text.charAt(i));
			}
			System.out.println("");
		}
		//I'm gonna be honest, I tried to make so if they press something it just ends the text but I never
		//got it to work so I gave up
		catch (InterruptedException e)
		{
			return 1;
		}
		return 1;
	}
	/**
	 * Ending of the game
	 * @param user
	 */
	public static void ending(Player user)
	{
		textPA("Demise falls to the ground.");
		textPA("The room shakes at the weight of its armor.");
		textPA("Congratulation " + user.getName() + "! You finished the game!");
		textPA("PS: remind me to change the name of this project");
	}
	
}
