package h04;
import java.awt.*;
import java.applet.Applet;
public class Tekenen extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(10, 20, 100, 20);
        g.drawRect(10, 40, 100, 100);
        g.drawRoundRect(10, 150, 100, 100, 10, 10);

    }
}