import javax.swing.*;
import java.awt.*;

public class Circle implements Figure {

    private int radius;
    private int x, y;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        FigureGUI gui = new FigureGUI();
        gui.createFrame();
        gui.addComponent(drawPanel());
    }

    private JPanel drawPanel() {
        return new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.setColor(Color.red);
                g.fillOval(x, y, 2*radius, 2*radius);
            }
        };
    }

    public double square() {
        return 2*Math.PI*radius;
    }
}
