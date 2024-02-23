public class JavaPrimitives {

    /**
     * Java Primitives
     * i. boolean
     * ii. char(for textual)
     * iii. byte
     * iv. short
     * v. int
     * vi. long(integral)
     * vii. double
     * viii. float(floating-point numbers
     *
     */

    public static void main(String[] args) {

        //1.Boolean(logical) data type
        //represents two states->true or false
        //we use boolean keywords to create a boolean data type in Java
        //example;
        boolean isRaining = false;
        boolean isRunning = true;

        System.out.println(isRaining);
        System.out.println(isRunning);

        //2.char(textual) data type
        //represents a single unicode character
        //a character is enclosed in single quotes
        //to create a character data type, we use the char keyword
        char d= 'd';
        char D= 'D';

        //insert a tab -> \t
        System.out.println("\t\t\t\t\t software development");

        //insert a line break -> \n
        System.out.println("this is a very very very long sentence, \nwe have inserted a line break here...");

        //insert a single quote
        char apostrophe= '\'';
        System.out.println(apostrophe);

        //insert a double quote
        char dobleQuoute = '"';
        System.out.println(dobleQuoute);

        //create a euro pound
        char euroPound= '\u00A3';
        System.out.println(euroPound);

        char thauBhat = '\u0E3F';
        System.out.println(thauBhat);

        char infinity = '\u221E';
        System.out.println(infinity);

        //strings-> represents a data type that contains multiple characters
        //it's not a primitive data type
        //it has its literals enclosed in double quotes
        //created using string keyword
        String greetingsMessage = "Hello Everyone";
        System.out.println(greetingsMessage);

        //3. integral data types(byte, short, int and long)
        //integral data types uses three forms ->decimal, octal and hexadecimal
        //examples: 2(decimal), 077(octal), 0x13(hexadecimal)
        //the fefault type of integral data types is int for integer
        //for instance you can define a long valuue of the integer by using capital letter L or l
        //e.g 10L

        //byte-> range -128 to +127 ->length 8bits(1byte)
        //to create a byte data type we use the byte keyword
        byte myByte;
        myByte = -128;
        System.out.println(myByte);
        //short -> range -32, 768 to +32, 767 ->16bits(2bytes)
        //to create a short data type we use short keyword
        short myShort;
        myShort = 32765;
        System.out.println(myShort);

        //int -> range -2, 147,483,648 to + 2,147, 483, 647 -> 32bits(4bytes)
        //to create an int data type, use int keyword
        int myInt;
        myInt= -214765353;
        System.out.println(myInt);

        //long -> range -9, 223, 372, 036, 853, 775L to 9, 223, 372, 036, 853, 775L -> 64bits(8bytes)
        long myLong;
        myLong= 9_223_372_036L;
        System.out.println(myLong);

        //7. floating-point primitive data types( float and double)
        //floating point type has a default data type
        //floating-point literal includes either a decimal point or one of the following
        //F or f(float)
        //D or d(double)
        //examples:
        //3.14- simple floating-point value
        //6.02E23- large floating point value
        //2.718F- simple float value
        //123/4E+ 3060 - a very large double value

        //float-> range -2, 147, 483, 648 to 2, 147, 483, 647 -> size 4bytes
        //to create a float data type use float keyword
        float myFloat;
        myFloat= 123564;
        System.out.println(myFloat);


    }
}
