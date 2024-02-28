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


    }
}

