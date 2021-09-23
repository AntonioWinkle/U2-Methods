import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop

    1.) Get input for a word with P with three letters after.
    2.) Find the first P, maybe using indexOf
        -Then get three letters after
    3.) Output the findings
     */

    public static void main(String[] args) {
        String word = pThree(JOptionPane.showInputDialog("What is the word?"));
        JOptionPane.showMessageDialog(null,"Your new weird word is: " + word + ". ");
        System.exit(0);
    }

    public static String pThree(String word){
        String upperPea = word.toUpperCase();
        int peaPosition = upperPea.indexOf("P");
        return word.substring(peaPosition, peaPosition+4);

    }
}
