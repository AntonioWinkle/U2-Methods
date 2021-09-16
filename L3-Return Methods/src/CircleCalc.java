import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        DecimalFormat round = new DecimalFormat("#.##");

        //create and run the program

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));

        JOptionPane.showMessageDialog(null, "The area is "+round.format(area(radius))+". The circumference is "+round.format(circumference()));

        System.exit(0);
    }

    //re-write the method to calculate a circle's area using parameters and return statement
public static double area(double radius){
        return Math.PI*(Math.pow(radius, 2.0));
}

    //re-write the method to calculate a circle's perimeter using parameters and return statement
public static double circumference(){
        return Math.PI*(2.0*area(1.0));
}
}
