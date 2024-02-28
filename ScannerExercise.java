import java.util.*;

public class ScannerExercise {

    /* a shopkeeper wants to streamline the process of calculating the total price of items purchased by a customer and offer discounts based on the total amount. Write a java program using the 'Scanner' class to assist the shopkeeper in achieving this.

    the shop offers the following items with respective prices:
    milk - ksh 67.50
    bread - ksh 95.00
    eggs - ksh 20.50
    sugar - ksh 250.00
    tea masala - ksh 76.99

    the java program should perform the following tasks:
    1. prompt the shopkeeper to input the quantity of each item sold(in integers) using the Scanner class
    2. calculate the total price of all items
    3. apply a discount of 10% if the total is over ksh 1000
    4. display the total price, the applied discount(if any) and the final balance payable by the customer*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("\t\tDECEMBER1");
        System.out.println("============================");

        System.out.print("qty of milk: ");
        int milk= sc.nextInt();
        System.out.print("qty of bread: ");
        int bread = sc.nextInt();
        System.out.print("qty of eggs: ");
        int eggs= sc.nextInt();
        System.out.print("qty of sugar: ");
        int sugar= sc.nextInt();
        System.out.print("qty of tmasala: ");
        int tmasala= sc.nextInt();

        double milkPrice = 67.50;
        double breadPrice = 95.00;
        double eggsPrice = 29.50;
        double sugarPrice = 250.00;
        double tmasalaPrice = 76.99;


        double total;

        total = (milk * milkPrice) + (bread * breadPrice) + (eggs * eggsPrice) + (sugar * sugarPrice) + (tmasala * tmasalaPrice);
        double discountedBalance = (total * 0.9);
        double discount = (total * 0.1);

        System.out.println("============================");

        System.out.println("total price: " + total);

        String msg = "";
        msg = (total > 1000)? "discount applied: " + discount + "\nbalance payable: " + discountedBalance  : "discount applied: 0.00";

        System.out.println(msg);

        System.out.println("============================");


        sc.close();


    }



}

