package NguyenVanQuan.helloworld;

import javax.swing.*;
import java.awt.*;

public class JframeColor extends JFrame{
    public JLabel createJlabel(String txt, Color text, Color background) {
        JLabel lb = new JLabel(txt);

        lb.setHorizontalAlignment(JLabel.CENTER); //allign

        lb.setForeground(text); //Foreground color

        lb.setOpaque(true); //mac dinh la false, true ms doi dc mau nen

        lb.setBackground(background); //Background color
        return lb;
    }
    public JframeColor() {
        setLayout(new GridLayout(1,2,5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JLabel lb;
        lb = createJlabel("Bùi Trung Hiếu", Color.red, Color.green);
        add(lb);

        lb = createJlabel("Rất đẹp trai", Color.blue, Color.yellow);
        add(lb);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JframeColor();
    }
}
