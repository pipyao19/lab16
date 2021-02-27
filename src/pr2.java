import javax.swing.*;
import java.awt.*;

public class pr2 extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(100, 100, 200,200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        pr2 draw = new pr2();
        draw.setSize(400,400);
        frame.add(draw);
        frame.pack();
        frame.setVisible(true);
    }
}
