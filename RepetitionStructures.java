import java.util.*;

public class RepetitionStructures {
    /**
     * repetition control structures
     * are java statements that allows us to execute specific blocks of code a number of times
     * there are 3 types
     * 1. while-loop
     * 2. do-while loop
     * 3. for-loop
     */

    public static void main(String[] args) {
        //1. while-loop -> it's a statement or block of code that is repeated as long as some condition is satisfied

        //while loop has the syntax

        //while (boolean_expression){
        //    statement1;
        //    statement2;
        // }
        //the statements inside the while loop are executed as long as the boolean_expression evaluates to true

        //example:
        //write a while loop that prints the integers 1 2 3 4 5 6 7 8 9 10

        int x = 1;

//        repeat as long as the value of x is less than 10
        while (x < 11) {
            System.out.println(x);
            x++;
        }

        System.out.println("==================");
        //output: 0 2 4 6 8 10 12 14 16 18 20

        int y= 0;
        while (y < 21){
            System.out.println(y);
            y +=2;

        }

        System.out.println("===========");
        //output: 15 12 9 6 3 0 -3 -6 -9 -12 -15

        int z = 15;
        while (z >= -15){
            System.out.println(z );
            z -=3;
        }
        System.out.println("===========");

        //2. do...while
        //statements inside a do while loop are executed several times as long as the condition is satisfied/met

        //it's similar to a while loop, the main difference is that statements inside a do-while loop are executed at least once

        //syntax

        //do {
        //    statement1;
        //    statement2;
        // } while (boolean_expression);

        //output 1 2 3 4 5 6 7 8 9 10

        int m = 1;

        do {
            System.out.println(m);
            m +=1;
        } while (m <= 10);

        System.out.println("=======================");

        //0 5 10 15 20 25 30 35 40 45 50
        //50 45 40 35 30 25 20 15 10 5 0

        int q = 0;

        do {
            System.out.println(q);
            q += 5;
        } while ( q <= 50);


        System.out.println("===============");


        q -=5;

        do {
            System.out.println(q);
            q -=5;
        } while (q >= 0);

        System.out.println("================");


        //3. for loop
        // allows for execution of the same code a number of times

        //syntax:
        //for (initialization_expression; loop_condition; step_expression) {
        //    statement1;
        //    statement2;
        //}

        //where:
        //-> initialization_expression: is used to initialize the loop variable
        //-> loop_condition: compares the loop variable to some limit
        //-> step_expression: updates the loop variable

        //example:
        //output: 1 2 3 4 5 6 7 8 9 10

        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        System.out.println("=============");


        //output: 10 20 30 40 50 60 70 80 90 100

        for (int v = 10; v <= 100; v += 10){
            System.out.println(v);
        }

        System.out.println("=============");


        //.BranchingStatements
        // branching statements allows for redirection of the flow of program execution

        //java offers 3 branching statements
        //i. break
        //ii. continue
        //iii. return

        /*
        i. break statements
        terminates the enclosing switch statement, and flow of control transfers to the statement immediately following the switch
        this can also be used to terminate a for, while, or a do-while loop

         */
        //create a new scanner object
        Scanner dd = new Scanner(System.in);

        String[] studentNames = {"Joanoah", "Bradley", "Muzna","Hamza","Ian", "Benson", "Praise", "Ephraim", "Frank", "Ryan", "Nathan", "Yasmin", "Dominic", "Phill", "Brenda"};

        System.out.println("enter student name: ");
        String searchName = dd.next();
        boolean foundName = false;

        for (int indx = 0; indx < studentNames.length; indx ++){
            if (studentNames[indx].equalsIgnoreCase(searchName))  {
                foundName = true;
                break;
            }
        }

        if (foundName){
            System.out.println(searchName + " found!");
        } else {
            System.out.println(searchName + " not found!");
        }



        System.out.println("==========");

        //ii.continue
        // skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop, basically skipping the remainder of this iteration of the loop

        //example:
        String [] names = {"Bean", "Bianca", "Beah", "Lance", "Kaka", "Beah"};

        int count = 0;

        for (int p = 0; p < names.length; p ++){
            if (!names[p].equals("Beah")) {
                continue; //skip next statement
            }
            count ++;
        }

        System.out.println("there are: "+count+ " Beahs in this list");

        System.out.println("================");

        //nested for loop
        //create a times table for a user provided number

        //ask the user for the times table number
        System.out.print("enter the times table no: ");
        int timesTable = dd.nextInt();

        for (int tt = 1; tt <= 12; tt ++){
            System.out.println(timesTable + " x "+ tt + " = " + (timesTable * tt) );
        }


        System.out.println("======");

        //create the whole times table
        for (int col = 1; col <= 12; col ++){
            for (int row = 1; row <= 12; row ++){
                System.out.println(col + " x " + row + " = " +(col * row) );
            }
            System.out.println("\t");
        }


        // iii. return statement
        // is used to exit from the current method
        // flow of control returns the statement that follows the original method call
        // to return, simply put the value ( or an expression that calculates the value) after the return keyword
        // for example:
        // return count ++; or return "Java";
        // the type of data declared by the method by the method must match the type of value returned by the return statement
        //when a method is declared void, use the form of return that doesn't return a value i.e   return;



        dd.close();

    }
}
