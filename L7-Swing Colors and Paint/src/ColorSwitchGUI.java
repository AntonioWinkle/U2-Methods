import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {
    JFrame window;
    JPanel panel;
    JButton redChange;
    JButton blueChange;
    JButton yellowChange;

    Color redPaletteOne = new Color(59,0, 0);
    Color redPaletteTwo = new Color(255, 0, 0);
    Color redPaletteThree = new Color(255, 149, 197);

    Color bluePaletteOne = new Color(20, 39, 155);
    Color bluePaletteTwo = new Color(61, 86, 178);
    Color bluePaletteThree = new Color(92, 133, 234);

    Color yellowPaletteOne = new Color(244, 244, 17);
    Color yellowPaletteTwo = new Color(242,237,111);
    Color yellowPaletteThree = new Color(206, 227, 151);

    //Declare your frame, panel and three buttons.
    public ColorSwitchGUI(){
        //create your GUI
        window = new JFrame("ColorSwitch");
        panel = new JPanel();
        redChange = new JButton("Change to Red");
        blueChange = new JButton("Change to Blue");
        yellowChange = new JButton("Change to Yellow");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,350);
        window.setLocationRelativeTo(null);

        redChange.addActionListener(new RedChange());
        blueChange.addActionListener(new BlueChange());
        yellowChange.addActionListener(new yellowChange());

        panel.add(redChange);
        panel.add(blueChange);
        panel.add(yellowChange);
        window.add(panel);

        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class RedChange implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(redPaletteOne);
            redChange.setForeground(redPaletteTwo);
            redChange.setBackground(redPaletteThree);

            blueChange.setForeground(null);
            blueChange.setBackground(Color.WHITE);

            yellowChange.setForeground(null);
            yellowChange.setBackground(Color.WHITE);
        }
    }

    private class BlueChange implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(bluePaletteOne);
            redChange.setForeground(null);
            redChange.setBackground(Color.WHITE);

            blueChange.setForeground(bluePaletteTwo);
            blueChange.setBackground(bluePaletteThree);

            yellowChange.setForeground(null);
            yellowChange.setBackground(Color.WHITE);
        }
    }

    private class yellowChange implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(yellowPaletteOne);
            redChange.setForeground(null);
            redChange.setBackground(Color.WHITE);

            blueChange.setForeground(null);
            blueChange.setBackground(Color.WHITE);

            yellowChange.setForeground(yellowPaletteTwo);
            yellowChange.setBackground(yellowPaletteThree);
        }
    }
}
