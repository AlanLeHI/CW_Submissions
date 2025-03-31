
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tdarray1 = new int[4][6];
		int[][] tdarray2 = 
		{
			{4, 5, 7},
			{2, -1, 8},
			{0, 1, 3}
		};
		//For both of those arrays, change the element in the first row, first column to a 17.		
		printArr(tdarray1);
		//sets 0,0 of td1 to 17
		tdarray1[0][0] = 17;
		printArr(tdarray1);
		printArr(tdarray2);
		//sets 0,0 of td2 to 17
		tdarray2[0][0] = 17;
		printArr(tdarray2);
		
		// For both of those arrays, change the element in the second row, third column into a 20. 
		printArr(tdarray1);
		//sets 1,2 of td1 to 20
		tdarray1[1][2] = 20;
		printArr(tdarray1);
		printArr(tdarray2);
		//sets 1,2 of td2 to 20
		tdarray2[1][2] = 20;
		printArr(tdarray2);
		
		//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
		printArr(tdarray1);
		//sets 0,last of td1 to -5
		tdarray1[0][tdarray1[0].length - 1] = -5;
		printArr(tdarray1);
		printArr(tdarray2);
		//sets 0,last of td2 to -5
		tdarray2[0][tdarray2[0].length - 1] = -5;
		printArr(tdarray2);
		
		//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 
		printArr(tdarray1);
		//sets last,0 of td1 to -7
		tdarray1[tdarray1.length - 1][0] = -7;
		printArr(tdarray1);
		printArr(tdarray2);
		//sets last,0 of td2 to -7
		tdarray2[tdarray2.length - 1][0] = -7;
		printArr(tdarray2);
		
		//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		printArr(tdarray1);
		//sets last,last of td1 to -30
		tdarray1[tdarray1.length - 1][tdarray1[0].length - 1] = -30;
		printArr(tdarray1);
		printArr(tdarray2);
		//sets last,last of td2 to -30
		tdarray2[tdarray2.length - 1][tdarray2[0].length-1] = -30;
		printArr(tdarray2);
		
		printArrRow1(tdarray1);
		printArrCol1(tdarray1);
		printArrColMaj(tdarray1);
	}

	//Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
	public static void printArr(int[][] tdarray1)
	{
		//pritns out each element in the row, going down 1 row at a time
		for (int  i = 0; i < tdarray1.length; i++)
		{
			//goes through the row to print
			for(int k = 0; k<tdarray1[i].length; k++)
			{
				System.out.print(tdarray1[i][k]);
				//comma for spacing
				System.out.print(", ");
			}
			System.out.println();
		}
	System.out.println();
	}
	
	//Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	public static void printArrRow1(int[][] tdarray1)
	{
		//yeah I just copied and pasted the previous code and put a 1
		for (int  i = 0; i < 1; i++)
		{
			for(int k = 0; k<tdarray1[i].length; k++)
			{
				System.out.print(tdarray1[i][k]);
				System.out.print(", ");
			}
			System.out.println();
		}
	System.out.println();
	}
	
	//Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	public static void printArrCol1(int[][] tdarray1)
	{
		//yeah I copied and pasted it and just changed the column code to 1
		for (int  i = 0; i < tdarray1.length; i++)
		{
			for(int k = 0; k<1; k++)
			{
				System.out.print(tdarray1[i][k]);
				System.out.print(", ");
			}
			//spacing 
			System.out.println();
		}
	System.out.println();
	}
	
	//Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 
	public static void printArrColMaj(int[][] tdarray1)
	{
		//sets each collum
		for (int k = 0; k<tdarray1[0].length; k++)
		{
			//prints out each element in that column
			for (int  i = 0; i < tdarray1.length; i++)
			{
				System.out.print(tdarray1[i][k]);
				System.out.print(", ");
			}
			//spacing
			System.out.println();
		}
	}
}
