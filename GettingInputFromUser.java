import java.io.*;

public class GettingInputFromUser {
    /**
     *getting user input
     *
     * we have two ways off doing this:
     *
     * 1. BufferedReader class -> console line way
     * 2. JOptionPane Class -> GUI(Graphical User Interface)
     */

    public static void main(String[] args) {
        //lets get user input using BufferedReader class

        //create an instance of buffered reader
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        //create a variable for holding the user input
        String userName = null;

        // use a try... catch block to execute the code
        try{
            //ask the user for their name
            System.out.println("Please enter your name: ");
            userName= dataIn.readLine();

        }catch(IOException ex) {
            System.out.println("there was an error reading the user input");
        }

        // output the user input
        System.out.println("Greetings " + userName);

        //write a java program that asks the user for their name and age. then converts the age into minutes the user has lived.

        //create a variable for holding the user input
        int userAge = 0;

        // use a try... catch block to execute the code
        try{
            //ask the user for their age
            System.out.println("please enter your age: ");
            userAge= dataIn.read();
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        //convert input to minutes
        userAge = userAge * 365 * 24 * 60;
        //25771501

        // output the user input
        System.out.println("You have lived for "+ userAge +" minutes. ");
    }
}

