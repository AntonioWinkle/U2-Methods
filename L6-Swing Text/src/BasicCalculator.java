import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {
static JTextField inputField1;
static JTextField inputField2;
static JLabel output;
    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Basic Calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("Enter a number: ");
        JLabel inputLabel2 = new JLabel("Enter a number: ");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("x");
        JButton divideButton = new JButton("/");

        output = new JLabel("Answer: ");


        window.setSize(250, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        addButton.addActionListener(new AddListener());
        subtractButton.addActionListener(new MinusListener());
        multiplyButton.addActionListener(new MultiplyListener());
        divideButton.addActionListener(new DivideListener());

        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);

        panel.add(output);

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        window.add(panel);
        window.setVisible(true);
    }

    private static class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            /*
            1.) get input from text fields
            2.) add the numbers
            3.) output to the result label
             */
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            output.setText(String.valueOf("Answer:" + number1+number2));
        }
    }

    private static class MinusListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            output.setText(String.valueOf(number1-number2));
        }
    }

    private static class MultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            output.setText(String.valueOf("Answer: "+number1*number2));
        }
    }

    private static class DivideListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            output.setText(String.valueOf("Answer: "+number1/number2));
        }
    }
}
