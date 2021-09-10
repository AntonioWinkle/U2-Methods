import java.util.Scanner;
public class CircleCalc {
    Scanner read = new Scanner(System.in);
    private int radius;

    public static void main(String[] args) {

        //create and run the program

    }

    //re-write the method to calculate a circle's area using parameters
        public void area() {
        System.out.print("Please enter the radius: ");
        radius = read.nextInt();

        double area = Math.PI * (Math.pow(radius, 2.0));

        System.out.println("The area is " + area);
        }

    //re-write the method to calculate a circle's perimeter using parameters
        public void circumference() {

        }
}
