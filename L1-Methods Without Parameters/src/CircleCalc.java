import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        //call the area method
        area();
        //call the circumference method
        circumference();

        System.exit(0);
    }

    //write a method to calculate a circle's area
        public static void area () {
        DecimalFormat round = new DecimalFormat("#.##");

        int radius = Integer.parseInt(JOptionPane.showInputDialog("Please enter the radius: "));

        double area = Math.PI * (Math.pow(radius, 2.0));

        JOptionPane.showMessageDialog(null, "The area is: " + round.format(area));
        }

    //write a method to calculate a circle's circumference
        public static void circumference () {
            DecimalFormat round = new DecimalFormat("#.##");
            int radius = Integer.parseInt(JOptionPane.showInputDialog("Please enter the radius: "));
            int diameter = 2*radius;

            double circumference = Math.PI * diameter;

            JOptionPane.showMessageDialog(null, "The circumference is: " + round.format(circumference));

        }
}
