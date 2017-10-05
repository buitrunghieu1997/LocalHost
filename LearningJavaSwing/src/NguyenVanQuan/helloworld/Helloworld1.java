package NguyenVanQuan.helloworld;
import javax.swing.*;
public class Helloworld1 extends JFrame {
    public Helloworld1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 400);

        JLabel b = new JLabel("HelloWorld1", SwingConstants.CENTER); //them nhan label va can chinh
        add(b);

        //add(JLabel = new JLabel("HelloWorld1"); //viet gop lenh
        //pack(); //Jlabel tu dong vua frame
        setVisible(true);
        setResizable(true); //resize


    }
    public static void main(String[] args) {
        new Helloworld1();
    }
}
