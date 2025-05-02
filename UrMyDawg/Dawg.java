
public class Dawg {

	protected boolean isAdopted;
	protected int age;
	protected String name;
	
	public Dawg(String name, boolean isAdopted, int age)
	{
		this.name = name;
		this.isAdopted = isAdopted;
		this.age = age;
	}
	
	public boolean getAdotpedStatus()
	{
		return isAdopted;
	}
	
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	
	public void increaseAge()
	{
		age++;
	}
	public String toString()
	{
		stateAge();
		if(isAdopted)
		{
			return "this dog is adopted";
		}
		else
		{
			return "this dog is unwanted";
		}
	}
	
	public boolean equals(Dawg dog)
	{
		if(isAdopted == dog.isAdopted && age == dog.age && name == dog.name)
		{
			return true;
		}
		return false;
	}
}

	
