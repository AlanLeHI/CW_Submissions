import java.util.Scanner;
public class Main {
    static Scanner myReader = new Scanner(System.in);

    repeatTillStop();
    
    public static void main(String[] args) {
        firstCircle();
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
    
    /*
    Creates the og radius of the circle
     */
    public static void firstCircle()
    {
        //sets the radius temporarily to 0
        double radius = 0;
        //Makes an original radius of a circle by using a scanner
        System.out.println("Give me an original radius of a circle");
        String input = myReader.nextLine();
        try
        {
            //turns the input into a double
            radius = Double.valueOf(input);
        }
        catch (NumberFormatException IHAVENOIDEAHOWCATCHWORKS)
        {
            //restarts if they make an error
            System.out.println("You're stupid, we're restarting");
            firstCircle();
        }
        //goes onto making the second circle
        finalCircle(radius);
    }

    /*
    This one asks for 5 inputs and adds them onto the final radius to make another circle
     */
    public static void finalCircle(double radius1)
    {
        //temp sets radius to 0
        double finalRadius = 0;
        //loops 5 times for 5 inputs
        for (int i=0; i!=5; i++)
        {
            //asks them for a double
            System.out.println("Add a double (＾▽＾)");
            String adder = myReader.nextLine();
            try
            {
                //turns double string into double double
                double radius = Double.valueOf(adder);
                //adds it onto the final radius
                finalRadius += radius;
            }
            catch (NumberFormatException msg)
            {
                //calls them an idiot and restarts
                System.out.println("You're stupid, we're restarting");
                firstCircle();
            }
        }
        //adds of radius to final radius
        finalRadius += radius1;
        //creates og circle
        Circle ogCirc = new Circle(radius1);
        //creates final circle
        Circle newCirc = new Circle(finalRadius);
        //prints og circle stats
        System.out.println("Your original circle with the radius of " + radius1 + " has the stats of");
        System.out.println(ogCirc.toString());
        //prints final circle stats
        System.out.println("Your new circle with the radius of " + finalRadius + " has the stats of");
        System.out.println(newCirc.toString());

    }
}
