
public class Player {
	private String[] classes = {"bruiser"};
	private double attack;
	private int counter;
	private double defense;
	private String[] movelist;
	private String name;
	private int health;
	private boolean grounded;
	private int maxHealth;
	private int maxCounter;
	private boolean stunState;
	private double critChance;
	private boolean ultCharge;
	private boolean ogGroundState;
	private String itemList = "potion*" + "throwing knife*";
	
	/**
	 * returns character class
	 * @return character class
	 */
	public String[] getClasses() {
		return classes;
	}

	/**
	 * sets char class
	 * @param classes
	 */
	public void setClasses(String[] classes) {
		this.classes = classes;
	}

	/**
	 * returns attack
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
	 * gets counters
	 * @return counter
	 */
	public int getCounter() {
		return counter;
	}

	/**
	 * sets counters
	 * @param counter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
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
	 * returns name
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
	 * returns health
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
	 * returns max health
	 * @return
	 */
	public int getMaxHealth() {
		return maxHealth;
	}

	/**
	 * sets max health
	 * @param maxHealth
	 */
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	/**
	 * returns max counter
	 * @return
	 */
	public int getMaxCounter() {
		return maxCounter;
	}

	/**
	 * sets max health
	 * @param maxCounter
	 */
	public void setMaxCounter(int maxCounter) {
		this.maxCounter = maxCounter;
	}

	/**
	 * returns stun state
	 * @return
	 */
	public boolean isStunState() {
		return stunState;
	}

	/**
	 * sets stun state
	 * @param stunState
	 */
	public void setStunState(boolean stunState) {
		this.stunState = stunState;
	}

	/**
	 * gets crit chance
	 * @return
	 */
	public double getCritChance() {
		return critChance;
	}

	/**
	 * sets crit chance
	 * @param critChance
	 */
	public void setCritChance(double critChance) {
		this.critChance = critChance;
	}

	/**
	 * returns ult charge,  I will probably not do anything with this
	 * @return ultcharge
	 */
	public boolean isUltCharge() {
		return ultCharge;
	}

	/**
	 * sets ult charge
	 * @param ultCharge
	 */
	public void setUltCharge(boolean ultCharge) {
		this.ultCharge = ultCharge;
	}

	/**
	 * returns item list
	 * @return item list
	 */
	public String getItemList() {
		return itemList;
	}

	/**
	 * sets itemlist
	 * @param itemList
	 */
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public Player(int plyMaxHealth, double plyAttack, int plyCounter, double plyDefense, String[] plyMovelist, String plyName, boolean plygrounded, double plyCritChance)
	{
		maxHealth = plyMaxHealth;
		health = maxHealth;
		attack = plyAttack;
		counter = plyCounter;
		maxCounter = counter;
		defense = plyDefense;
		movelist = plyMovelist;
		name = plyName;
		grounded = plygrounded;
		critChance = plyCritChance;
		ultCharge = true;
		itemList = itemList;
		ogGroundState = plygrounded;
		
	}
	/**
	 * generates the player
	 * @param class
	 * @param name
	 * @return character
	 */
	public static Player generatePlayer(String cls, String name)
	{
		//if the player says bruiser
		if (cls.equalsIgnoreCase("Bruiser") || cls.equalsIgnoreCase("b"))
		{
			//player stats
			int maxHealth = 250;
			double attack = 1.25;
			int counter = 4;
			double defense = 1.10;			
			String[] movelist = {"Wild Throw[3]", "Fafnir[4]", "Volcanic Viper[4]", "Vortex[2]", "Punch[1]"};
			boolean grounded = true;
			double critChance = 10;
			//passes all of it to the constructor
			Player user = new Player(maxHealth, attack, counter, defense, movelist, name, grounded, critChance);
			return user;
		}
		//returns nothing if it all of it doesn't match
		return null;
	}
	
}
