import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;

public class Game extends Applet implements ActionListener {
    Button myButton = new Button("press me");

    public void init() {
        add(myButton);
        myButton.addActionListener(this);
    }

    public void paint(Graphics g) {
        Random r = new Random();
        setBackground(Color.black);
        for(int count = 0; count <= 200; count++) {
            g.setColor(Color.LIGHT_GRAY);
            g.drawOval(r.nextInt(200), r.nextInt(200), 1, 1);
        }
    }

    public void actionPerformed(ActionEvent event) {
        repaint();
    }
}
