import java.util.Scanner;

public class GettingInputScanner {
    public static void main(String[] args) {


        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //declare our variables
        String userName= null ;
        int userAge;

        //ask the user for their name
        System.out.print("please enter your name: ");
        userName = sc.next();
        //ask the user for their age
        System.out.print("enter your age: ");
        userAge = sc.nextInt();

        //output the data
        System.out.println("hello " + userName + ", you are " +userAge + " years old");

        //close the scanner object
        sc.close();
    }
}
