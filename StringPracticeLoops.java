import java.util.Scanner;
public class Main {
    static Scanner myReader = new Scanner (System.in);
    public static void main(String[] args) {
      //I listened to the Teen Beach Movie OST while doing this
      repeatTillStop();
    }





/*
repeatidly asks the stupid user for strings til they stay stop and keeps track of 
how many horrible messages they've said
 */
    public static void repeatTillStop()
    {
        //gets the User's text
        String text = myReader.nextLine();
        //blank until User changes it inside the loop
        String stopper = "";
        //to keep track of the # of messages
        int i = 0;
        //repeatidly ask for messages till they type stop
        while (!(stopper.equalsIgnoreCase("stop")))
        {
            //adds 1 to counter
            i++;
            //prints their message
            System.out.println(i + ". " + text);
            //changes the variable stopper into their text
            stopper = myReader.nextLine();
        }
    }
}
