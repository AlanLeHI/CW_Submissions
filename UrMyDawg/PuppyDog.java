
public class PuppyDog extends Dawg{
	boolean isFed;

	public PuppyDog(String name, boolean isAdopted, int age, boolean isFed)
	{
		super(name, isAdopted, age);
		this.isFed = isFed;
	}
	
	public void stateAge()
	{
		System.out.println(name + " is " + (age) + " months old.");
	}
	
	public void feedPup()
	{
		isFed = true;
	}
	
	public void increaseAge()
	{
		super.increaseAge();
		isFed = false;
	}
	
	public String toString()
	{
		if(isFed)
		{
			return super.toString() + "\nThis dawg not hungry";
		}
		else
		{
			return super.toString() + "\nThis dawg hungry";
		}
	}
	
	public boolean equals(PuppyDog pDawg)
	{
		if(super.equals(pDawg) && pDawg.isFed == isFed)
		{
			return true;
		}
		return false;
	}
}
