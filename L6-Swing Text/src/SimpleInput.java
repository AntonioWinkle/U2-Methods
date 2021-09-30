import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static int clickCount = 0;
    static JLabel clickCountLabel;
    static JTextField input;

    public static void main(String[] args) {
        JFrame window = new JFrame("Clicker Explosion");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click for explosion");
        clickCountLabel = new JLabel("Click Count: ");
        JLabel inputLabel = new JLabel("Enter product name: ");
        input = new JTextField(15);

        window.setSize(250, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(inputLabel);
        panel.add(input);
        panel.add(clickCountLabel);
        panel.add(button);

        window.add(panel);

        window.setVisible(true);
    }

    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String product = input.getText();

            clickCount ++;

            clickCountLabel.setText("Sold " + clickCount + " number of " + product);


        }
    }
}
