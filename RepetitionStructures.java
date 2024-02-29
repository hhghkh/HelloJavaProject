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

        int z = 999;
        while (z > -9999){
            System.out.print(z + "\t");
            z -=3;
        }



    }
}
