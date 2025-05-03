
public class Dawg {

	/**
	 * hot doggity dog this makes a dog
	 */
	//adoption status
	protected boolean isAdopted;
	//age
	protected int age;
	//name
	protected String name;
	
	/**
	 * creates a dog using adoption status, name and age
	 * @param name
	 * @param isAdopted
	 * @param age
	 */
	public Dawg(String name, boolean isAdopted, int age)
	{
		//constructs using these attributes
		this.name = name;
		this.isAdopted = isAdopted;
		this.age = age;
	}
	
	/**
	 * states adoption status
	 * @return adoption status
	 */
	public boolean getAdotpedStatus()
	{
		//does what it do
		return isAdopted;
	}
	
	/**
	 * states the dogs age
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	/**
	 * returns adoption status
	 * @return
	 */
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	
	/**
	 * increases age by one year
	 */
	public void increaseAge()
	{
		age++;
	}
	
	/**
	 * if its adopted says it is and prints age
	 */
	public String toString()
	{
		//prints age
		stateAge();
		//if adopted says so, if not not
		if(isAdopted)
		{
			return name + ": this dog is adopted";
		}
		else
		{
			return name + ": this dog is unwanted";
		}
	}
	
	/**
	 * if the dog is the same as another dog with all its attributes, it returns true
	 * @param dog
	 * @return if dog same
	 */
	public boolean equals(Dawg dog)
	{
		//if it has the same name, age. and adoption status return true false if not
		if(isAdopted == dog.isAdopted && age == dog.age && name == dog.name)
		{
			return true;
		}
		//if not true
		return false;
	}
}

	
