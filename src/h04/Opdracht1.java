package h04;
import java.awt.*;
import java.applet.Applet;

public class Opdracht1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(60, 10, 110, 80);
        g.drawLine( 10, 80, 60, 10);
        g.drawRect(10, 80, 100, 100);
        g.drawRect(60, 140, 30, 40);
        g.drawRect(40, 90, 30, 30);
    }
}

