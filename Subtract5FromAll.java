
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {12, -5, 12, 8, 4};
		int [] test2 = subtract5FromAll(test);
		PA(test2);
		System.out.println("break");
		PA(test);
		
	}
	public static int[] subtract5FromAll(int[] nums)
	{
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++)
		{
			temp[i] = nums[i] - 5;
		}
		return temp;
	}
	
	public static void PA(int[] test)
	{
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}
}
