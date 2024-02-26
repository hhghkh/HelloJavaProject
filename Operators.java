public class Operators {
    /**
     * Operators in java
     * we have different types of operators in java
     * 1. arithmetic operators
     * 2. relation operators
     * 3. logical operators
     * 4. conditional operators
     * they follow a certain precedence so that the compiler can know which operator to evaluate
     first in case multiple operators are used in the statement
     */

    public static void main(String[] args){
        //create 2 integers
        double x = 30;
        int y= 20;

        // 1. arithmetic operators;
        //addition +
        System.out.println(x+y);
        //subtraction -
        System.out.println(x-y);
        //multiplication *
        System.out.println(x*y);
        //division /
        System.out.println(x / y);
        //modulus %(finds the remainder of a division)
        System.out.println(x % y);

        //2. increment and decrement operators(++, --)
        // increment and decrement operators increase and decrease a value stored in a number by 1
        //unary increment operator ++
        //unary decrement operator --

        //for example: count= count + 1; increment the value of count by 1
        //the above example is equivalent to: count++

        //Operator        Use         Description
        //++               x++          increment x by 1; evaluates to the value of x before it was incremented
        //++               ++x          increment x by 1; evaluates to the value of x after it was incremented
        //--               x--          decrements x by 1; evaluates to the value of x before it was incremented
        //--               --x          decrements x by 1; evaluates to the value of x after it was incremented

        //the increment and decrement operators can be placed before and after an operand
        //when used before an operand, it causes the variable to be incremented o decremented by 1, and then the new value is used in the expression in which it appears

        //  For example
            int i= 10;
            int j= 3;
            int k= 0;

            k= ++j + i;// will result to k= 4  and then add 10 to get 14
            System.out.println("the value of k is: " + k);

            k= j++ + i;//
            System.out.println("the value of k is: " + k);

            int op = 1;

            ++op;
            System.out.println(op);
            System.out.println(op);

            k = j-- + i;
            System.out.println("the value of k is:" +k);

        //3.Relational operators
        // compare two values and determines the relatiolnship between those values
        //the output of evaluation is a boolean value -> true or false

        //operator              name                          use                description
        // >                    greater than                    x > y               x is greater than y
        // >=                   greater than or equal to        x >= y              x is greater than or equal to y
        // <                    less than                       x < y               x is less than y
        // <=                   less than or equal to           x <= y              x is less than or equal to y
        // ==                   equal to                        x == y              x is equal to y
        // !=                   not equal to                    x != y              x is not equal to y

        int a = 20;
        int b = 6;

        //greater than
        System.out.println("20 > 6? " + (a > b));
        //greater than or equal to
        System.out.println("20 >= 6? " + (a >= b));
        //less than
        System.out.println("20 < 6? " + (a < b));
        //less than or equal to
        System.out.println("20 <= 6? " + (a < b));
        //equals to
        System.out.println("20 == 6? " + (a == b));
        //not equals to
        System.out.println("20 != 6? " + (a != b));

        //4.Logical operators
        //have one or two boolean operands that yield a boolean result

        int c = 2;
        int d = 1;

        //there are 3 logical operators
        //i. logical AND ( && ) -> when using logical and operator both operands(expressions must evaluate to true to get a true output
        //x1            x2          Result
        //TRUE          TRUE        TRUE
        //TRUE          FALSE       FALSE
        //FALSE         TRUE        FALSE
        //FALSE         FALSE       FALSE

        //example
        System.out.println((c > d) && ( c < d));
        System.out.println((c > d) && ( d < c));
        System.out.println((c <= d) && ( d != c));

        //ii. logical OR -> ( || ) you only need one operand(expression) to evaluate to true to get the entire result as true
        //x1            x2          Result
        //TRUE          TRUE        TRUE
        //TRUE          FALSE       TRUE
        //FALSE         TRUE        TRUE
        //FALSE         FALSE       FALSE

        //example
        System.out.println((2 == 1) || (2 > 2));
        System.out.println((2 != 1) || (2 != 2));

        //iii. logical NOT ( ! )
        //takes in one argument, wherein that argument can be an expression, variable or constant
        //x1                result
        //TRUE             FALSE
        //FALSE            TRUE


        boolean isRaining= true;
        boolean isRunning= false;

        System.out.println(!isRaining);
        System.out.println(!isRunning);

        //a login program

        //user login credentials
        String userName = "Ndolo";
        String password = "password";

        //correct user login credentials
        String correctUserName = "Ndolo";
        String correctPassword = "p@$$w0rd";

        //check if the user entered the correct credentials
        if ((userName == correctUserName) && (password == correctPassword)){
            //if user credentials match( meaning true), login the user
            System.out.println("Logged in successfully");
        } else{

            //if user credentials not match( meaning false),  throw an error
            System.out.println("invalid login credentials, please try again");
        }

        //5. Conditional operator ( ?: )
        //is als0 called a ternary operator
        //the structure/syntax of an exppression using a conditional operator is:
        //exp1 ? exp2 : exp3

        //wherein:
        //exp1 -> is a boolean expression whose result must either be true or false

        //result:
        // if exp1 is true, exp2 is the result returned
        // if exp1 is false, then exp3 is the result returned

        String status = "" ;
        int grade = 79 ;

        //get the status of the student
        status = (grade >= 60) ? "passed" : "failed" ;

        //print status
        System.out.println(status);



    }
}
