import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand{
    static int tax;
    static double price16, price20;
    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */
    public static void main(String[] args) {

    int sixteenOunce = Integer.parseInt(JOptionPane.showInputDialog("How many 16 oz. cups did you buy?"));
    int twentyOunce = Integer.parseInt(JOptionPane.showInputDialog("How many 20 oz. cups did you buy?"));
    double taxRate = tax/100.0;

    lemonadeCost(sixteenOunce, twentyOunce, taxRate);

    System.exit(0);
    }

    public static void lemonadeCost(int sixteenOunce,int twentyOunce,double taxRate){

        DecimalFormat roundTo2 = new DecimalFormat("#.##");

        double sixteenOuncePrice = sixteenOunce * price16;
        double twentyOuncePrice = twentyOunce * price20;

        double totalSixteenOuncePrice = sixteenOuncePrice * (1 + taxRate);
        double totalTwentyOuncePrice = twentyOuncePrice * (1 + taxRate);

        double totalPrice = totalSixteenOuncePrice + totalTwentyOuncePrice;

        JOptionPane.showMessageDialog(null, "Your total cost for the 16 oz cups is: $" + roundTo2.format(totalSixteenOuncePrice));
        JOptionPane.showMessageDialog(null, "Your total cost for the 20 oz cups is: $" + roundTo2.format(totalTwentyOuncePrice));
        JOptionPane.showMessageDialog(null,"Your total cost for both the 16 oz cups and 20 oz cups is: $" + roundTo2.format(totalPrice));
    }
}
