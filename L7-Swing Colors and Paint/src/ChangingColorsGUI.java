import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window;
    JPanel panel;
    JButton colorClicker;

    Color pastelPurple = new Color(191,162,219);
    Color lightestPurple = new Color(243,241,245);
    Color pinkishPurple = new Color(240,216,255);
    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */

    public ChangingColorsGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");

        //create a new Custom color
        colorClicker.addActionListener(new ColorChanger());

        //Set the colors of our buttons and panel
        panel.setBackground(pastelPurple);
        colorClicker.setForeground(lightestPurple);
        colorClicker.setBackground(pinkishPurple);

        panel.add(colorClicker);
        window.add(panel);

        window.setVisible(true);
    }

    //Add a listener to change the color when the button is clicked
    private class ColorChanger implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(pinkishPurple);
            colorClicker.setForeground(pastelPurple);
            colorClicker.setBackground(lightestPurple);
        }
    }



}
