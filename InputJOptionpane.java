import javax.swing.*;

public class InputJOptionpane {
    public static void main(String[] args) {
        // create variables to store the username
        String userName = "";

        //ask the user for their name
        userName = JOptionPane.showInputDialog("please enter your name");

        //create teh output message
        String msg = "helloo "+ userName + "!";

        //output the user data
        JOptionPane.showMessageDialog(null, msg);

        //write a java program that gets the radius of a circle from the user then outputs in a dialog box/ message box, the perimeter and the area of that circle


        float radius = 0;
        float perimeter = 0;
        float area = 0;
        float PI= 3.142F;
        // convert a string to an integer -> Integer.parseInt()
        // convert a string to a float -> Float.parseFloat()

        radius = Float.parseFloat(JOptionPane.showInputDialog("please enter the radius: "));

        perimeter = 2 * PI * radius;
        area = PI * (radius*radius);

        String output = "Perimeter: " + perimeter + "\nArea: " + area;

        JOptionPane.showMessageDialog(null, output);

    }
}
