public class JavaLiterals {
    public static void main(String[] args) {
        /**
         * Java Literals
         * there are different types of literals
         * i. integer literal
         * ii. floating point literals
         * iii. boolean literals
         * iv. character literals
         * v. string literals
          */

        //1. integer literals
        //they come in different formats
        //-> decimal (base 10)
        // it doesn't have a special notation e.g. 12
        System.out.println("example of a decimal literal is: "+ 12);

        //-> hexadecimal (base 16)
        //preceded by 0x or 0X e.g. 0xC
        System.out.println("example of a hexadecimal literal is: "+ 0XF);

        //-> octal  (base 8)
        //preceded by 0 e.g. 014
        System.out.println("example of an octal literal is: "+ 010);


        //2.floating-point literals
        //represents decimals with fractional parts e.g 3.1416
        //can be expressed in standard or scientific notation
        //e.g. 583.45 (standard) or 5.8345e2
        System.out.println("example of a standard float literal is: "+ 583.45);
        System.out.println("example of scientific float literal is: "+ 5.834e4);

        //3. boolean literals
        //boolean literals have only two values, true o false
        System.out.println("example of boolean literal is: true and false");

        //4. character literals
        //represents single unicode characters
        //a unicode character set replaces the 8-bit ASCII set
        //unicode allows the inclusion of symbols anf=d special characters from other languages
        //to use a cahracter literal, enclose the character in single quotes
        //e.g. letter a is represened as 'a'
        System.out.println('a');

        System.out.println("this is a paragraph with \na new\sline or line break");

        //5. string literals
        //represent multiple character and are enclosed in double quotes
        //e.g. "Hello World"
        System.out.println("Hello World!!");

        //tomorrow-> Primitive Data Types
    }
}
