import javax.swing.*;
import java.awt.*;
public class zadanie extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(25, 300, 450, 300);
        g.drawLine(25, 175, 125, 75);
        g.drawLine(125, 75, 225, 175);
        g.drawLine(150, 75, 150, 100);
        g.drawLine(150, 75, 175, 75);
        g.drawLine(175, 75, 175, 125);
        g.drawLine(340, 250, 340, 300);
        g.drawLine(360, 250, 360, 300);
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);
        g.drawOval(275,50,150,200);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        zadanie draw = new zadanie();
        frame.setSize(500,400);
        draw.setSize(450,300);

        frame.add(draw);
        frame.pack();
        frame.setVisible(true);
    }
}