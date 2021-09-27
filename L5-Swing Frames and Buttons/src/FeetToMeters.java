import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.

    1.) Create GUI
    2.) get input when button, is pressed
    3.) The math - 3.28 feet in a meter
                    F->M Divide by 3.28
                    M->F Multiply by 3.28
    4.) Display results after buttons clicked
     */
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JPanel panel = new JPanel();
        JButton feet2Meters = new JButton("Click to Convert Feet to Meters");
        JButton meters2Feet = new JButton("Click to Convert Meters to Feet");

        window.setSize(500,350);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        feet2Meters.addActionListener(new FeetToMetersListener());
        meters2Feet.addActionListener(new FeetToMetersListener());

        panel.add(feet2Meters);
        panel.add(meters2Feet);

        window.add(panel);
        window.setVisible(true);
    }

    private static class FeetToMetersListener implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the feet:"));

            double result = number / 3.28;

            JOptionPane.showMessageDialog(null, result + " in meters");
        }
    }

    private static class metersToFeetListener implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the meters:"));

            double result = number * 3.28;

            JOptionPane.showMessageDialog(null, result + " in feet");
        }
    }
}
