import javax.swing.*;
import java.awt.*;


public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;

    Color darkBlue = new Color(15,4,76);
    Color snowWhite = new Color(238,238,238);
    Color coalBlack = new Color(23,10,25);
    Color scarfMaroon = new Color(123,17,58);
    public ArtworkGUI()
    {
        //CREATE THE GUI
        frame = new JFrame("Snowman Art");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
                setBackground(darkBlue);
        }

        //Add the PaintComponent Method and create your drawing.

        public void paintComponent (Graphics g){

            super.paintComponent(g);

            g.setColor(snowWhite);
            g.fillRect(0, 400, 400, 400);

            g.fillOval(200,325,100,100);
            g.fillOval(215,260,75,75);

            g.setColor(coalBlack);
            g.fillOval(243,345,15,15);
            g.fillOval(243, 370,15,15);
            g.fillOval(230,283,15,15);
            g.fillOval(255,283,15,15);

            g.setColor(scarfMaroon);
            g.fillRect(223,325, 58,10);

            g.setColor(coalBlack);
            g.fillRect(200,255, 100, 10);
            g.fillRect(225,158, 50 , 100);

            g.setColor(scarfMaroon);
            g.fillRect(226, 245,50,10);
        }
    }
}
