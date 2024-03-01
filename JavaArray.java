public class JavaArray {
    /*
    Java Arrays

    What is an array?

    Suppose we have three variables of type int with different identifiers for each variable

    int number1;
    int number2;
    int number3;

    number1 = 1;
    number2 = 2;
    number3 = 3;

    as you can see, it's a tedious task to just initialize and use the variables, especially if they have the same purpose

    In java and other programming languages, there is one capability wherein we can use one variable to store a list of data and manipulate them more efficiently. this type of variable is called an array.

    an array stores multiples data items of the same data type, in a contiguous block f memory divided into a number of slots

    Declaration of an array

    declaring arrays

    to declare an array, write the data type, followed by a set of square brackets [], followed by th identifier name

    e.g.: int[] ages;     or     int ages[];

    instantiation of an array

    array instantiation

    after declaring, we must create the array and specify its length with a constructor statements.
    definitions:
    - instantiation -> in Java, this means creation
    - constructor -> in order to instantiate an object, we need to use a constructor for this. A constructor is a method that is called to create a certain object

    to instantiate ( or create an array, write the 'new' keyword, followed by the square brackets containing the number of items elements you want the array to have

     */

    public static void main(String[] args) {
        // e.g:
        //declaration
        int ages [];

        //instantiate
        ages = new int[100];

        //or can also be written as
        //declare and instantiate
        int aged[] = new int[100];

        //you can also instantiate an array by directly initializing it with data
        int [] arr = {1 ,2 ,3 ,4 ,5};
        //this statement declares and instantiates an array of integers with five elements(initialized to the values 1, 2, 3, 4 and 5

        //boolean array
         boolean [] results = {true, false, true, false, true, false};

         //double array
        double [] grades= {100, 90, 80, 75};

        //string array
        String [] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};

        //accessing array elements
        //to access an array element, or part of the array, you use a number called an 'index' or a 'subscript'
        //index number or subscript
        //-> is assigned to each element of the array, to allow the program to access an individual member of the array
        //-> begins with zero and progresses sequentially by whole numbers to the end of the array
        //NOTE: elements inside your array are from 0 to (sizeOfArray - 1)

        //e.g. given the array we declared a while ago, we have

        //assign 10 to the first element in the array
        ages[0] = 10;

        //prints the last element in an array
        System.out.println(ages[0]);



    }



}
