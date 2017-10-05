package NguyenVanQuan.helloworld;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class Jbutton extends JFrame implements ActionListener {
    private JButton green;
    private JLabel lb;

    public Jbutton() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,300);
        setLayout(new GridLayout(3,1,5,5)); //3 hang 1 cot hang cot cach nhau 5 px

        lb = new JLabel("Nền mặc định");
        lb.setOpaque(true); //cho phép đổi màu nền
        add(lb);


    }

    private JButton creatJButton(String tilte) {
        JButton btn = new JButton(tilte);

        btn.addActionListener(this);
        return btn;
    }

    private void changeBackgroundJLabel(Color bg, String name) {
        lb.setBackground(bg);
        lb.setText("Màu nền là " + name);
    }

    @Override
    public void actionPerfomed(ActiveEvent e) {
        if(e.
    }
}
