import javax.swing.*;
import java.awt.*;

public class pr1 extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new pr1();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(100, 100, 200, 200);
    }

}
