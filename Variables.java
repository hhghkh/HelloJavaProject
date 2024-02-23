public class Variables {
    /**
     * Variables in Java
     *
     * A variable is a named memory location in the computer's memory for storing different types of data
     * A variable is an item for storing the state of objects
     * A variable is a container for holding data
     *
     * A variable has :-
     * data type-> specifies the type of data that the variable can hold
     * name-> used to reference the variable (must follow the identifier rules
     *
     */

    public static void main(String[] args){
        //declaring and intializing variables
        //in java, we declare variables as follows;


        //syntax:
        //<data_type> <variable_name> [= initial_value];
        //declare and initialize 8 variables of 8 data types
        String userName ="Spiky";
        int userAge = 4 ;
        byte userID = 28;
        short userStaffNo = 2414;
        long userAccNo = 234567898765L;
        float userApprovalNo;
        double userTransNo;
        char userLetter = 'e';

        //variable declared on one line(not reccomended)
        double quiz= 10, exam=0, grade=0;

        //recommended(declare a single variable on a single line
        double studentQuiz= 10;
        double studentExam=0;
        double studentGgrade = 'A';

        String firstName = "Kasyoki";
        String lastname = "Kasyoki";

        //outputting variables data
        //.System.out.println() ->appends a line break
        //System.out.print() ->appends the data on the same line
        System.out.println(firstName);
        System.out.println(lastname);

        String userGreeting = "Hello, ";
        String userTarget = "World";

        System.out.print(userGreeting);
        System.out.print(userTarget);

        //in java programming we have two types of variables
        //->primitive variables: stores data in the actual memory location of where the variable is e.g int, long...
        int number= 10;//primitive language example
        //->reference variables: stores the address in th memory location. Points to another memeory location where the actual data is e.g. String
        String favLanguage= "Java";

    }
}
