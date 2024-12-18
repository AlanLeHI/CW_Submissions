public class Enemy {
static String[] lowdif = {"Ghoul", "Bat"};
static String[] midDif = {"Goblin", "Beholder"};
static String[] highDif = {"Mr Trauger"};
private int health = 25;
private int maxHealth;
private double attack = 0.75;
private double defense = 0.25;
private String name;
private String[] movelist = {};
private String dropList = "";
private boolean grounded;
private boolean stunState;
private double critChance;

/*
 * Constructor for enemy
 */
public Enemy(int emHealth, double emAttack, double emDefense, String emName, String[] emMovelist, boolean enmgrounded, double enmCritChance, String emDropList)
{
	name = emName;
	health = emHealth;
	maxHealth = health;
	attack = emAttack;
	defense = emDefense;
	name = emName;
	movelist = emMovelist;
	grounded = enmgrounded;
	critChance = enmCritChance;
	stunState = false;
	dropList = emDropList;
	
	
}

/*
 * Randomly generates the enemy to make runs different. Uses the constructor to create an enemy
 * returns enemy
 */
public static Enemy generateEnemy(int dif)
{
	//if the difficulty is low, it generates a random low lvl enemy
	if (dif == 1)
	{
		//randomly chooses a lowdif enemy using Math.random and a string array with all the names of the enemies. Too lazy to use big string
		int chosen = (int) ((Math.random() * lowdif.length));
		//if it lands on 0, genereates goblin
		if (chosen == 0)
		{
			//enemy stats for goblin
			int health = 75;
			double attack = 0.75;
			double defense = 0.90;
			String name = "Ghoul";
			//prints out name of goblin
			System.out.println("There is a " + name + "!");
			String[] movelist = {"slash"};
			boolean grounded = true;
			double critChance = 0.01;
			String dropList = "potion*"  + "throwing knife*";
			//calls constructor
			Enemy enm = new Enemy(health, attack, defense, name, movelist, grounded, critChance, dropList);
			//return the object
			return enm;
		}
		
		//if it lands on 1, it creates a bat enemy
		if (chosen == 1)
		{
			//bat stats
			String name = "Bat";
			int health = 50;
			double attack = 0.90;
			double defense = 0.50;
			//It says the name of the enemy
			System.out.println("There is a " + name + "!");
			String[] movelist = {"slash", "bite"};
			boolean grounded = false;
			double critChance = 5;
			String dropList = "";
			//calls constructor to create the bat
			Enemy enm = new Enemy(health, attack, defense, name, movelist, grounded, critChance, dropList);
			//returns enemy
			return enm;
		}
	}
	
	//if the dif enemy is medium
	else if (dif == 2)
	{
		//randomly chooses a middif enemy using Math.random and a string array with all the names of the enemies. Too lazy to use big string
		int chosen = (int) ((Math.random() * midDif.length));
		if (chosen == 0)
		{
			String name = "Goblin";
			int health = 120;
			double attack = 0.90;
			double defense = 0.50;
			System.out.println("There is a " + name + "!");
			String[] movelist = {"slash", "bite"};
			boolean grounded = true;
			double critChance = 5;
			String dropList = "potion*" + "throwing knife*";
			Enemy enm = new Enemy(health, attack, defense, name, movelist, grounded, critChance, dropList);
			return enm;
		}
		else if (chosen == 1)
		{
			//Enemy Name
			String name=  "Beholder";
			int health = 150;
			double attack = 0.80;
			double defense = 0.80;
			//Says the name of the enemy
			System.out.println("There is a " + name + "!");
			String[] movelist = {"slash", "bite"};
			boolean grounded = false;
			double critChance = 5;
			String dropList = "potion*";
			Enemy enm = new Enemy(health, attack, defense, name, movelist, grounded, critChance, dropList);
			return enm;
		}
	}
	//"high" dif enemy
	else if (dif == 3)
	{
		//randomly chooses enemy from  list
		int chosen = (int) ((Math.random() * highDif.length));
		if (chosen == 0)
		{
			//stats
			int health = 150;
			double attack = 50;
			double defense = 5;
			String name = "Mr Trauger";
			//message
			System.out.println("There is an old man!");
			String[] movelist = {"slash"};
			boolean grounded = true;
			double critChance = 90;
			String dropList = "potion*"  + "throwing knife*"  + "dragon deck*" + "d20 dice*";
			Enemy enm = new Enemy(health, attack, defense, name, movelist, grounded, critChance, dropList);
			return enm;
		}
	}
	//unique enemy ID
	else if (dif == 86)
	{
		//Enemy name and stats
		String name=  "Mimic";
		int health = 200;
		double attack = 1;
		double defense = 1;
		//prints enemy name
		System.out.println("There is a " + name + "!");
		String[] movelist = {"bite"};
		boolean grounded = true;
		double critChance = 10;
		String dropList = "potion*" + "throwing knife*";
		Enemy enm = new Enemy(health, attack, defense, name, movelist, grounded, critChance, dropList);
		return enm;
	}
	//incase I mess something up, spawns dummy enemy
	String[] empty = {""};
	String dropList = "";
	Enemy dummy = new Enemy(10, 0.0 ,0.0 , "Dummy", empty, true, 0.0, dropList);
	return dummy;
}

/**
 * Overloaded generator for boss
 * @param dif
 * @return boss
 */
public static Enemy generateEnemy(boolean boss, int dif)
{
	//Enemy name and stats
			String name=  "Demise, King of Armagedon";
			int health = 500;
			double attack = 1.2;
			double defense = 0.8;
			//prints enemy name
			System.out.println("You feel uneasy");
			String[] movelist = {"judgement", "stare", "swing"};
			boolean grounded = true;
			double critChance = 5;
			String dropList = "sands of time*";
			Enemy enm = new Enemy(health, attack, defense, name, movelist, grounded, critChance, dropList);
	return enm;
}
/*
 * chooses a random enemy attack
 */
public static void enemAttack(Enemy enm, Player player)
{
	//chooses a random number corresponding to the amount of moves the enemy has
	int dice = ((int) (Math.random() * enm.movelist.length));
	String move = enm.movelist[dice];
	Move.doMove(move, enm, player);
}
/**
 * returns string array of lowdif enemies
 * @return lowdif enms
 */
public static String[] getLowdif() {
	return lowdif;
}
/**
 * sets lowdif enemies
 * @param lowdif
 */
public static void setLowdif(String[] lowdif) {
	Enemy.lowdif = lowdif;
}

/**
 * gets midDif
 * @return middif enemies
 */
public static String[] getMidDif() {
	return midDif;
}

/**
 * sets midDif
 * @param set middifs
 */
public static void setMidDif(String[] midDif) {
	Enemy.midDif = midDif;
}

/**
 * gets the health
 * @return health
 */
public int getHealth() {
	return health;
}

/**
 * sets health
 * @param health
 */
public void setHealth(int health) {
	this.health = health;
}

/**
 * gets max health
 * @return maxhealth
 */
public int getMaxHealth() {
	return maxHealth;
}

/**
 * sets max health
 * @param maxhealth
 */
public void setMaxHealth(int maxHealth) {
	this.maxHealth = maxHealth;
}

/**
 * gets attack
 * @return attack
 */
public double getAttack() {
	return attack;
}

/**
 * sets attack
 * @param attack
 */
public void setAttack(double attack) {
	this.attack = attack;
}

/**
 * gets defense
 * @return defense
 */
public double getDefense() {
	return defense;
}

/**
 * sets defense
 * @param defense
 */
public void setDefense(double defense) {
	this.defense = defense;
}

/**
 * gets name
 * @return name
 */
public String getName() {
	return name;
}

/**
 * sets name
 * @param name
 */
public void setName(String name) {
	this.name = name;
}

/**
 * returns droplist
 * @return droplist
 */
public String getDropList() {
	return dropList;
}

/**
 * @param droplist state
 * Sets droplists
 */
public void setDropList(String dropList) {
	this.dropList = dropList;
}

/**
 * returns grounded state
 * @return grounded state
 */
public boolean isGrounded() {
	return grounded;
}
/**
 * sets grounded state
 * @param grounded state
 */
public void setGrounded(boolean grounded) {
	this.grounded = grounded;
}

/**
 * gets stunstate
 * @return stunstate
 */
public boolean isStunState() {
	return stunState;
}
/**
 * returns movelist
 * @return movelist
 */
public String[] getMovelist() {
	return movelist;
}
/**
 * sets movelist
 * @param movelist
 */
public void setMovelist(String[] movelist) {
	this.movelist = movelist;
}
/**
 * sets stun state
 * @param stun state
 */
public void setStunState(boolean stunState) {
	this.stunState = stunState;
}

/**
 * gets crit chance
 * @return crit chance
 */
public double getCritChance() {
	return critChance;
}

/**
 * sets crit chance
 * @param crit chance
 */
public void setCritChance(double critChance) {
	this.critChance = critChance;
}

}
