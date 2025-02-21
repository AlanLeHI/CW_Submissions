package arrayLists;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList = new ArrayList();
		
		//intArrList is an Integer array list,  strArrayList is an empty for string
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		
		//adds 1,2,3 to the int one and 3 names for the other
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		strArrayList.add("Alice");
		strArrayList.add("Bob");
		strArrayList.add("Charlie");
		
		//adds 5 to before the 3 in the intArrList and Derek on the second index
		intArrList.add(2, 5);
		strArrayList.add(1, "Derek");
		
		//Print out the second and last elements in both intArrList and stringArrList.
		System.out.println(intArrList.get(1));
		System.out.println(intArrList.get(intArrList.size() - 1 ));
		System.out.println(strArrayList.get(1));
		System.out.println(strArrayList.get(strArrayList.size() - 1));
		
		// Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". 
		//Print out the first element in each array before and after the change. 
		System.out.println( intArrList.set(0, 0));
		System.out.println( strArrayList.set(0, "zero"));
		System.out.println(intArrList.get(0));
		System.out.println(strArrayList.get(0));
		
		//Delete the last element in both arrays. Print out what that removed element was. 
		System.out.println(intArrList.remove(intArrList.size() - 1));
		System.out.println(intArrList.get(intArrList.size() - 1));
		System.out.println(strArrayList.remove(strArrayList.size() - 1));
		System.out.println(strArrayList.get(strArrayList.size() - 1));
	}

}
