import java.util.*;

public class DecisionControlStructures {
    /**
     * decision control structures
     *
     * these are java statements that allow us to select and execute speific blocks of code whilw skipping other sections
     * there are threee types:
     * 1. if statement
     * 2. if-else statement
     * 3. if-else-if statement
     */

    public static void main(String[] args) {
        //i. if statement
        //specifies that a statement(or a block of code) will be executed if and only if a certain booleasn statement is true

        //syntax
        //if(boolean_expression)
        //   statement;

        //or
        //if(boolean_expression){
        //    statement1''
        //    statement2;

        //where;
        //-> boolean_expression is either a boolean expression or a boolean variable.

        int grade =92;

        //print congratulationas if grade is greater than 60

        if (grade > 60)
            System.out.println("congratulations!");

        if (grade > 60){
            System.out.println("congratulations!");
        }

        //print "congratulations" if grade is greater than 60 and also print "you passed!"

        if (grade > 60){
            System.out.println("congratulations");
            System.out.println("you passed!");
        }

        System.out.println("====================");

        //ii. if-else statement
        //used when we want to execute a certain statement if a condition is true and a different statement if the condition is false

        //syntax
        //if(boolean_expression){
        //      statement1;
        //      statement2;
        // }else {
        //      statement3;
        //      statement4;
        // }

        if (grade > 80){
            System.out.println("congrats");
        }else {
            System.out.println("sorry you have not passed");
        }

        //iii. if-else-if statement
        //the statement in the else clause of an if-else block can be treated as another if-else structure
        //this cascading of structures allows us to make more complex selections
        //used to execute multiple courses of action

        //syntax

        //if (condition1){
        //    statement will execute if condition1 is true
        //} else if (condition2) {
        //    statement will execute if condition1 is false condition2 is true
        //} else if (condition3) {
        //    statement will execute if condition1 and condition2 are false condition3is true
        //}else {
        //   statement will execute if all conditions are false
        //}

        //print "excellent" if grade is greater than 90, "very good" if greater than 60, otherwise "sorry you failed"

        if (grade > 90){
            System.out.println("excellent");
        } else if (grade > 60) {
            System.out.println("very good!");
        }else{
            System.out.println("sorry you failed!");
        }

        //switch statement
        //a switch allows branching on multiple outcomes
        //it has the following syntax:

        //switch(switch_expression){
        //    case case_selector1:
        //        statement1;
        //        statement2;
        //        break;
        //    case case_selector2:
        //        statement1;
        //        statement2;
        //        break;
        //    default:
        //        statement1;
        //        statement2;
        // }

        //where:
        // -> switch_expression: is an integer or character expression
        // -> case_selector1, case_selector2 and so on are unique integer or character constants

        //when a switch statement is encountered:-

        //java first evaluates the switch expression and jumps the case whose selector/label matches value of the expression

        //the program executes the statements in order from that point on until a break statement is encountered, skipping to the first statement after the end of the switch structure

        //if none of the cases are satisfied, the default block is executed. take note however, that the default part is optional

        //note:
        //unlike the if statement the multiple statements in the switch are executed without including the curly braces
        //when a case in a switch statement has been matched, all the statements associated with that case are executed. not only that, the statements associated with succeeding cases are also executed
        //to prevent the program from executing statements in the subsequent cases, we use a break statement as our last statement

        System.out.println("==========================");
        int score = 90;

        switch (score){
            case 100:
                System.out.println("excellent");
                break;
            case 90:
                System.out.println("good job");
                break;
            case 80:
                System.out.println("study jarder");
                break;
            default:
                System.out.println("sorry you failed");
        }

        //1. create a java program using switch statement that asks the user for an integer between 1 and 7 inclusive and then outputs the day of the week e.g. if the user entered 1, then output "Sunday"

        //2. ask the user for a color then print if that is their favorite color if it matches with the one in the system

        Scanner sc = new Scanner(System.in);
        System.out.print("input number between 1 and 7: ");
        int no = sc.nextInt();

        switch (no){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
            default:
                System.out.println("error: only input numbers between 1 and 7");
        }

        String favoriteColor = "red";
        System.out.println("input color: ");
        favoriteColor = sc.next();

        switch (favoriteColor.toLowerCase()){
            case "yellow":
                System.out.println("your favorite color is: " + favoriteColor);
                break;
            default:
                System.out.println("we don't have your favorite color");

        }


        }





}

