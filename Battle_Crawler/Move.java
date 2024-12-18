import java.util.concurrent.TimeUnit;

public class Move {
int dmg;
int counterUse;

/*
 * Reads the move and calls a method to do the attack against the enemy. 
 */
public static void doMove(String name, Player user, Enemy enm)
{
	//instantiates dmg
	int dmg = 0;
	//creates a giant string with all the move names
	String test = "";
	for (int i = 0; user.getMovelist().length != i; i++)
	{
		test += user.getMovelist()[i];
		test += " ";
	}
	//turns it into all lowercase
	test = test.toLowerCase();
	
	//checks the input of the thing
	if (name.equalsIgnoreCase("slash") && test.indexOf("slash") != -1)
	{
		//does move
		dmg = doSlash(user, enm);
	}
	//same thing checks
	else if (name.equalsIgnoreCase("volcanic viper") && test.indexOf("volcanic viper") != -1)
	{
		//does move
		dmg = doVolcanicViper(user, enm);
	}
	//checks move name
	else if ((name.equalsIgnoreCase("wild throw") && test.indexOf("wild throw") != -1))
	{
		//does move
		dmg = doWildThrow(user, enm);
	}
	//checks move name
	else if (name.equalsIgnoreCase("punch") && test.indexOf("punch") != -1)
	{
		//does move
		dmg = doPunch(user, enm);
	}
	//checks move name
	else if (name.equalsIgnoreCase("fafnir") && test.indexOf("fafnir") != -1)
	{
		//does move
		dmg = doFafnir(user, enm);
	}
	//checks move name
	else if (name.equalsIgnoreCase("bite") && test.indexOf("bite") != -1)
	{
		//does move
		dmg = doBite(user,enm);
	}
	//checks move name
	else if (name.equalsIgnoreCase("vortex") && test.indexOf("vortex") != -1)
	{
		//does move
		dmg = doVortex(user, enm);
	}

	
	//does a final damage calculation
	dmg = finalDmgCheck(user, enm, dmg);
	//shows dmg done
	printDmg(enm, dmg);
	//if the enemy dies, sets counters to zero so it moves onto the win screen
	if (enm.getHealth() <= 0)
	{
		user.setCounter(0);
	}
}
/**
 * overloaded method for enemy that does the moves. Yeah I just copy and pasted it from the player's
 * @param name
 * @param enm
 * @param user
 */
public static void doMove(String name, Enemy enm, Player user)
{
	int dmg = 0;
	//creates a giant string with all the move names
	String test = "";
	for (int i = 0; enm.getMovelist().length != i; i++)
	{
		test += enm.getMovelist()[i];
	}
	//turns it all to lowercase
	test = test.toLowerCase();
	//checks if the move is slash and exists in the enemy's movelist
	if (name.equalsIgnoreCase("slash") && test.indexOf("slash") != -1)
	{
		//does the move
		dmg = doSlash(enm, user);
	}
	//same thing
	else if (name.equalsIgnoreCase("volcanic viper") && test.indexOf("volcanic viper") != -1)
	{
		dmg = doVolcanicViper(enm, user);
	}
	//same
	else if (name.equalsIgnoreCase("punch") && test.indexOf("punch") != -1)
	{
		dmg = doPunch(enm, user);
	}
	//same
	else if (name.equalsIgnoreCase("bite") && test.indexOf("bite") != -1)
	{
		dmg = doBite(enm,user);
	}
	//checks move name
	else if (name.equalsIgnoreCase("vortex") && test.indexOf("vortex") != -1)
	{
		//does move
		dmg = doVortex(enm, user);
	}
	else if (name.equalsIgnoreCase("judgement") && test.indexOf("judgement") != -1)
	{
		//does move
		dmg = doJudgement(enm, user);
	}
	else if (name.equalsIgnoreCase("stare") && test.indexOf("stare") != -1)
	{
		//does move
		dmg = doStare(enm, user);
	}
	else if (name.equalsIgnoreCase("swing") && test.indexOf("swing") != -1)
	{
		//does move
		dmg = doSwing(enm, user);
	}
	//does final calculations like crit check
	dmg = finalDmgCheck(enm, user, dmg);
	//prints move
	System.out.println("The " + enm.getName() + " used " + name);
	//prints damage
	printDmg(user, dmg);
}


public static void doItem(String name, Player user, Enemy enm)
{
	String test = "";
	test = user.getItemList();
	test = test.trim();
	test = test.toLowerCase();
	System.out.println(test);
	if (name.equalsIgnoreCase("potion") && test.indexOf("potion") != -1)
	{
		doPotion(user);
	}
	else if (name.equalsIgnoreCase("throwing knife") && test.indexOf("throwing knife") != -1)
	{
		doTKnife(user, enm);
	}
	
	else if (name.equalsIgnoreCase("dragon deck") && test.indexOf("dragon deck") != -1)
	{
		doDragonDeck(user, enm);
	}
	
	else if (name.equalsIgnoreCase("d20 dice") && test.indexOf("d20 dice") != -1)
	{
		doD20(user, enm);
	}
	//cuts off the item from the item list cause you used it
	user.setItemList(user.getItemList().substring(0,user.getItemList().indexOf(name)) + user.getItemList().substring((user.getItemList().indexOf(name) + name.length() + 1)));
}

public static void doPotion(Player user)
{
	int heal = (int)(user.getMaxHealth() *  0.10);
	System.out.println("You healed " + heal + " hp");
	user.setHealth(user.getHealth() + heal);
}
/**
 * Throws a knife for a percentage of the enemy's health in dmg
 * @param user
 * @param target
 */
public static void doTKnife(Player user, Enemy target)
{
	int dmg = (int)(target.getMaxHealth() *  0.10);
	System.out.println("You did " + dmg + " hp");
	target.setHealth(target.getHealth() - dmg);
	
}
/**
 * does a random number of dmg
 * @param user
 * @param target
 */
public static void doD20(Player user, Enemy target)
{
	int dmg = (int)(Math.random() * 20);
	System.out.println("You did " + dmg + " hp");
	target.setHealth(target.getHealth() - dmg);
	
}
/**
 * does 100 flat
 * @param user
 * @param target
 */
public static void doDragonDeck(Player user, Enemy target)
{
	int dmg = 100;
	System.out.println("A dragon appears before you and sets your enemy ablaze");
	System.out.println("You did " + dmg + " hp");
	target.setHealth(target.getHealth() - dmg);
	
}
/*
 * For now, it checks if the hit was a critical hit and returns the dmg with a multiplier if it does
 */
public static int finalDmgCheck(Player user, Enemy target, int dmg)
{
	//if the crit chance is less than Math.random(), it runs the crit calculation
	if (user.getCritChance() <= (int)(Math.random() * 100))
	{
		//prints crit message
		System.out.println("A critical hit!");
		//dmg multiplies by 1.2
		dmg = (int)(dmg * 1.2);
	}
	//sets the targets health to health-dmg
	target.setHealth(target.getHealth() - dmg);
	//returns dmg to be printed
	return dmg;
}


/*
 * For now, it checks if the hit was a critical hit and returns the dmg with a multiplier if it does
 */
public static int finalDmgCheck(Enemy user, Player target, int dmg)
{
	//if the crit chance is less than Math.random(), it runs the crit calculation
	if (user.getCritChance() <= Math.random())
	{
		//prints crit message
		System.out.println("A critical hit!");
		//dmg multiplies by 1.2
		dmg = (int)(dmg * 1.2);
	}
	//sets the targets health to health-dmg
	target.setHealth(target.getHealth() - dmg);
	//returns dmg to be printed
	return dmg;
}

/**
 * does the slash move
 * @param user
 * @param target
 * @return dmg value
 */
public static int doSlash(Player user, Enemy target)
{
	user.setCounter(user.getCounter() - 1);
	int dmg = ((int)((20)*((user.getAttack()))*(target.getDefense())));
	return dmg;
}

/**
 * does the slash move but the enemy does it (overloaded for enemy)
 * @param user
 * @param target
 * @return dmg value
 */
public static int doSlash(Enemy user, Player target)
{
	
	int dmg = ((int)((20)*((user.getAttack()))*(target.getDefense())));
	return dmg;
}

public static int doVolcanicViper(Player user, Enemy target)
{
	user.setCounter(user.getCounter() - 4);
	int dmg = ((int)((40)*((user.getAttack())*(target.getDefense()))));
	if (target.isGrounded())
	{
		dmg = (int) (dmg * 1.5);
		System.out.println("A clean hit!");
	}
	return dmg;
	
}

public static int doVolcanicViper(Enemy user, Player target)
{
	int dmg = ((int)((45)*((user.getAttack())*(target.getDefense()))));
	if (target.isGrounded())
	{
		dmg = (int) (dmg * 1.5);
		System.out.println("A clean hit!");
	}
	return dmg;
	
	
}
/**
 * prints the damage message and does a funny lil animation if it does a lot of damage
 * @param target
 * @param dmg
 */
public static void printDmg(Enemy target, int dmg)
{
	String text = target.getName() + " took " + dmg + " damage!";
	//does a crappy crit animation if the damage is 100+
	if (dmg > 99)
	{
		try
		{
			//loops 3 times
			for (int i = 0; i != 3; i++)
			{
				//750 millisecond delay of the dmg text
				TimeUnit.MILLISECONDS.sleep(750);
				System.out.println(text);
				try 
				{
					//does it again, but with an indent
					TimeUnit.MILLISECONDS.sleep(150);
					for (int t = 0; t != 100; t++)
					{
						System.out.println("");
					}
					System.out.println("    " + text);
				}
				catch(InterruptedException msg)
				{
					System.err.println("");
				}
				//does it again without the indent
				try 
				{
					TimeUnit.MILLISECONDS.sleep(150);
					for (int t = 0; t != 100; t++)
					{
						System.out.println("");
					}
				}
				catch(InterruptedException msg)
				{
					System.err.println("");
				}
				System.out.println("");
			}
		}
		catch (InterruptedException msg)
		{
			System.err.println("");
		}
	}
	//if it is <100 it prints normally
	else 
	{
		System.out.println(text);
	}
}
/**
 * prints the damage message and does a funny lil animation if it does a lot of damage
 * @param target
 * @param dmg
 */
public static void printDmg(Player target, int dmg)
{
	String text = target.getName() + " took " + dmg + " damage!";
	//does a crappy crit animation if the damage is 100+
	if (dmg > 99)
	{
		try
		{
			//loops 3 times
			for (int i = 0; i != 3; i++)
			{
				//750 millisecond delay of the dmg text
				TimeUnit.MILLISECONDS.sleep(750);
				System.out.println(text);
				try 
				{
					//does it again, but with an indent
					TimeUnit.MILLISECONDS.sleep(150);
					for (int t = 0; t != 100; t++)
					{
						System.out.println("");
					}
					System.out.println("    " + text);
				}
				catch(InterruptedException msg)
				{
					System.err.println("");
				}
				//does it again without the indent
				try 
				{
					TimeUnit.MILLISECONDS.sleep(150);
					for (int t = 0; t != 100; t++)
					{
						System.out.println("");
					}
				}
				catch(InterruptedException msg)
				{
					System.err.println("");
				}
				System.out.println("");
			}
		}
		catch (InterruptedException msg)
		{
			System.err.println("");
		}
	}
	//if it is <100 it prints normally
	else 
	{
		System.out.println(text);
	}
}
/**
 * does the punch move
 * @param user
 * @param target
 * @return dmg
 */
public static int doPunch(Player user, Enemy target)
{
	//removes a counter
	user.setCounter(user.getCounter() - 1);
	//dmg calc
	int dmg = ((int)((25)*((user.getAttack()))*(target.getDefense())));
	//returns dmg to final calc and printing
	return dmg;
}

/**
 * does the punch move but the enemy does it
 * @param user
 * @param target
 * @return dmg
 */
public static int doPunch(Enemy user, Player target)
{
	//dmg calc
	int dmg = ((int)((25)*((user.getAttack()))*(target.getDefense())));
	//returns dmg to be printed
	return dmg;
}

/**
 * does the bite move
 * @param user
 * @param target
 * @return dmg
 */
public static int doBite(Player user, Enemy target)
{
	//removes a counter
	user.setCounter(user.getCounter() - 1);
	//dmg calc
	int dmg = ((int)((25)*((user.getAttack()))*(target.getDefense())));
	//returns dmg to be printed
	return dmg;
}

/**
 * does the bite move, but the enemy does it
 * @param user
 * @param target
 * @return dmg
 */
public static int doBite(Enemy user, Player target)
{
	//dmg calc
	int dmg = ((int)((25)*((user.getAttack()))*(target.getDefense())));
	//returns dmg for final calc
	return dmg;
}

/**
 * A stunning move that has a 50% chance to stun
 * @param user
 * @param target
 * @return enemy
 */
public static int doWildThrow(Player user, Enemy target)
{
	//initializes dmg
	int dmg = 0;
	//coin flip to see if enemy gets stunned
	int coinFlip = (int)((Math.random())*2);
	//removes counter
	user.setCounter(user.getCounter() - 3);
	//skips if enemy is flying
	if (target.isGrounded())
	{
		//dmg calc
		dmg = ((int)((10)*((user.getAttack())*(target.getDefense()))));
		//if coin flip works, it does throw
		if (coinFlip == 0)
			{
			//sets stun state to true
			target.setStunState(true);
			//tells player they're stunned
			System.out.println("The enemy is stunned");
			}
	}
	else
	{
		//if it missed, tells the user it missed
		Stage.textPA("Wild Throw missed! The target is in the air!");
	}
	//returns for dmg calc
	return dmg;
}

/**
 * A move that does extra damage to stunned enemies
 * @param user
 * @param target
 * @return
 */
public static int doFafnir(Player user, Enemy target)
{
	//removes 4 counters
	user.setCounter(user.getCounter() - 4);
	//dmg calc
	int dmg = ((int)((45)*((user.getAttack()))*(target.getDefense())));
	//if enemy is stunned, 1.5* dmg
	if (target.isStunState() == true)
	{
		//more dmg calc
		dmg = (int) (dmg * 1.5);
		//tells user what happened
		System.out.println("The enemy was stunned, they took extra damage");
	}
	//returns dmg for final calc
	return dmg;
}
/**
 * Does the funny fafnir move that does more if the target is stunned
 * @param user
 * @param target
 * @return
 */
public static int doFafnir(Enemy user, Player target)
{
	//dmg calc
	int dmg = ((int)((45)*((user.getAttack()))*(target.getDefense())));
	//if enemy stunned more dmg
	if (target.isStunState() == true)
	{
		//dmg calc for moar
		dmg = (int) (dmg * 1.5);
		//tells you what happened
		System.out.println("You are stunned, you took extra damage");
	}
	return dmg;
}

/**
 * Checks if you're stunned
 * @param user's stun state
 */
public static void stunStateCheck(Player user)
{
	//if you're stunned you get your turn skipped
	if (user.isStunState())
	{
		//sets counters to 0
		user.setCounter(0);
		//stun msg
		System.out.println("You are stunned! Your turn is skipped!");
		//sets stun state to false so you don't get stun looped
		user.setStunState(false);
	}
}

/**
 * Strong move, but launches enemy on hit removing the grounded state, extra damage to ungrounded enemies
 * @param user
 * @param target
 */
public static int doVortex(Player user, Enemy target)
{
	//removes 4 counters
		user.setCounter(user.getCounter() - 2);
		//dmg calc
		int dmg = ((int)((35)*((user.getAttack()))*(target.getDefense())));
		//if enemy is in air, 1.5* dmg
		if (target.isGrounded() == false)
		{
			//more dmg calc
			dmg = (int) (dmg * 1.5);
			//tells user what happened
			System.out.println("The enemy is airborn, they took extra damage");
		}
		else 
		{
			target.setGrounded(false);
			System.out.println("The enemy was launched!");
		}
		//returns dmg for final calc
		return dmg;
}
/**
 * does a launch move
 * @param user
 * @param target
 * @return dmg
 */
public static int doVortex(Enemy user, Player target)
{
		//dmg calc
		int dmg = ((int)((35)*((user.getAttack()))*(target.getDefense())));
		//if enemy is in air, 1.5* dmg
		if (target.isGrounded() == false)
		{
			//more dmg calc
			dmg = (int) (dmg * 1.5);
			//tells user what happened
			System.out.println("You are airborn, you took extra damage");
		}
		else 
		{
			target.setGrounded(false);
			System.out.println("The enemy was launched!");
		}
		//returns dmg for final calc
		return dmg;
}
/**
 * boss move
 * @param user
 * @param target
 * @return dmg
 */
public static int doJudgement(Enemy user, Player target)
{
	Stage.textPA("You feel the ground underneath you shake");
	int dmg = ((int)((40)*((user.getAttack()))*(target.getDefense())));
	return dmg;
}

/**
 * boss move that does nothing
 * @param user
 * @param target
 */
public static int doStare(Enemy user, Player target)
{
	Stage.textPA("Demise stares into your soul... He remains still");
	int dmg = 0;
	return dmg;
}

/**
 * Weaker boss move
 * @param user
 * @param target
 * @return dmg
 */
public static int doSwing(Enemy user, Player target)
{
	Stage.textPA("Demise swings its hammer, crushing everything in sight");
	int dmg = ((int)((25)*((user.getAttack()))*(target.getDefense())));
	return dmg;
}
}
