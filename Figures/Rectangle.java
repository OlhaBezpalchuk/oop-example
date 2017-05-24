import javax.swing.*;
import java.awt.*;

public class Rectangle implements Figure {

    int x, y;
    int width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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
                g.fillRect(x, y, width, height);
            }
        };
    }

    public double square() {
        return width*height;
    }
}
