
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getMonth(1));
	}
	/*
	 *
	 *
	*/
	public static String getMonth(int n)
		{
			//Mr Trauger copied my big string idea
			//Makes a string called months with spaces to separate each month
			String months = "January February March April May June "
					+ "July August September October November December ";

			//Starts a loop cuts off a month every time it loops by going to the index of the space and cutting everything before it. If it hits a match 
			//with the month, it returns the start of the string until the first ' ' which is the end of the month
			for (int i = 1; i <= 12; i++)
			{
				//gets the index of the first space
				int sL = months.indexOf(' ');

	      //when it hits a matching month index, it cuts off the space and everything after so it's just the month
				if (n == i)
				{
	        //returns the month
					return months.substring(0, sL);
				}
	      //it cuts off the space and everything before it so the month is skipped
				else
				{
	        //turns the variable month into what it was minus the first month
					months = months.substring(sL + 1);
				}
			}
			//return the month chosen by the loop
			return months;
			
		}
}
