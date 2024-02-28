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

        int milk;
        int bread;
        int eggs;
        int sugar;
        int tmasala;

        System.out.print("qty of milk: ");
        milk= sc.nextInt();
        System.out.print("qty of bread: ");
        bread = sc.nextInt();
        System.out.print("qty of eggs: ");
        eggs= sc.nextInt();
        System.out.print("qty of sugar: ");
        sugar= sc.nextInt();
        System.out.print("qty of tmasala: ");
        tmasala= sc.nextInt();

        milk = (int) (milk * 67.50);
        bread = (int) (bread * 95.00);
        eggs = (int) (eggs * 29.50);
        sugar = (int) (sugar * 250.00);
        tmasala = (int) (tmasala * 76.99);

        int total;
        int discount;

        total = milk + bread + eggs + sugar + tmasala;
        discount = (int) (total * 0.9);

        System.out.println("total price: " + total);

        String msg = "";
        msg = (total > 1000)? "discount applied: 10% \nbalance payable: " + discount  : "";

        System.out.println(msg);




        sc.close();


    }



}

