import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("3 Quotes");
        JPanel panel = new JPanel();
        JButton buttonOne = new JButton("First One");
        JButton buttonTwo = new JButton("Second One");
        JButton buttonThree = new JButton("Third One");

        window.setSize(300, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //default area
        window.setLocationRelativeTo(null);

        //three listeners listening
        buttonOne.addActionListener(new ButtonListenerOne());
        buttonTwo.addActionListener(new ButtonListenerTwo());
        buttonThree.addActionListener(new ButtonListenerThree());
        
        window.add(panel);
        window.setVisible(true);
    }

    private static class ButtonListenerOne implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "In the grim darkness of the 42 millennium, there can be no victor.");
        }
    }

    private static class ButtonListenerTwo implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Sometimes, I dream about cheese");
        }
    }

    private static class ButtonListenerThree implements ActionListener{
     public void actionPerformed(ActionEvent e){
         JOptionPane.showMessageDialog(null, "Yes.");
     }
    }
}
