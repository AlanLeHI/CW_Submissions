
public class PuppyDog extends Dawg{
	/**
	 * extension of the dog class, adds attribute of isfed and changes age from years to months
	 */
	boolean isFed;

	/**
	 * makes the smaller dog, extension of dog constructor but adds is fed
	 * @param name
	 * @param isAdopted
	 * @param age
	 * @param isFed
	 */
	public PuppyDog(String name, boolean isAdopted, int age, boolean isFed)
	{
		//uses attributes from the dog class: name, adoption and age
		super(name, isAdopted, age);
		//adds on fed attribute
		this.isFed = isFed;
	}
	/**
	 * prints out the age
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + (age) + " months old.");
	}
	/**
	 * changes fed status to true
	 */
	public void feedPup()
	{
		//yeah does what it says
		isFed = true;
	}
	
	/**
	 * increases age by one month and unfeeds the dog
	 */
	public void increaseAge()
	{
		//increases age
		super.increaseAge();
		//sets fed status to false
		isFed = false;
	}
	/**
	 * prints out age, name, and fed status
	 */
	public String toString()
	{
		//if its fed, says its not hungry plus other attributes
		if(isFed)
		{
			//returns info regarding dog but its not hungry
			return super.toString() + "\nThis dawg not hungry";
		}
		else
		{
			//returns info regarding dog but its hungry
			return super.toString() + "\nThis dawg hungry";
		}
	}
	
	/**
	 * compares two puppies to see if they're the same
	 * @param pDawg
	 * @return if two compared puppies are the same
	 */
	public boolean equals(PuppyDog pDawg)
	{
		//if it has all the same attributes return true
		if(super.equals(pDawg) && pDawg.isFed == isFed)
		{
			return true;
		}
		//else return false
		return false;
	}
}
