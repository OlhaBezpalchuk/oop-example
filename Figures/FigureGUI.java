import javax.swing.*;
import java.awt.*;

public class FigureGUI {

    private JFrame window;

    public void createFrame() {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setVisible(true);
    }

    public void addComponent(Component component) {
        window.getContentPane().add(component);
    }
}
