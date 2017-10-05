package NguyenVanQuan.helloworld;

import javax.swing.*;
import java.awt.*;

public class Jlabel extends JFrame {
    /*@Override
    public void setTitle(String title) {
        super.setTitle("Đè phương thức cha để đổi tên :))");
    }*/

    public Jlabel() {
        setLayout(new GridLayout(1,3,5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);

        Icon icon = new ImageIcon(getClass().getResource("Smile.png"));
        Icon ic = new ImageIcon(getClass().getResource("Unlock.png"));

        JLabel jLabel1 = new JLabel("Chỉ có chữ thôi cu :))",SwingConstants.CENTER);
        JLabel jLabel2 = new JLabel(ic, SwingConstants.CENTER);
        JLabel jlabel3 = new JLabel("Có cả ảnh và chữ nhá :))", icon, SwingConstants.CENTER);

        add(jLabel1);
        add(jLabel2);
        add(jlabel3);

        setLocationRelativeTo(null);
        setResizable(true);
        //pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Jlabel();
        new JLabel();
    }
}
