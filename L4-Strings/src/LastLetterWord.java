import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing

    1.) Get inputs for the 3 words.
    2.) Steal last three letters of each word.
        -Find how long the words are.
        -Have the program find out the last three letters and isolate them.
        -Put them through a method to make 1 "word."
    3.) Output results.
    */

    public static void main(String[] args) {
        String wordOne = multiWord(JOptionPane.showInputDialog("What is the first word?"));
        String wordTwo = multiWord(JOptionPane.showInputDialog("What is the second word?"));
        String wordThree = multiWord(JOptionPane.showInputDialog("What is the third word?"));

        String output = multiWord(wordOne)+multiWord(wordTwo)+multiWord(wordThree);

        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
    }

    public static String multiWord(String word){
        String newWord;

        if(word.length() <=3){
             newWord = word;
        }else{
             newWord = word.substring(word.length()-3);
        }

        return newWord;
    }
}
