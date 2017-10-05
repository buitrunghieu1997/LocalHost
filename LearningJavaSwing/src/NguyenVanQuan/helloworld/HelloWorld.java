package NguyenVanQuan.helloworld;

import javax.swing.*;
public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(250,200);
        frame.setLocation(300,200); //toa do tren mh
        //frame.setLocationRelativeTo(null); //chinh giua mh

        frame.setVisible(true);
    }
}
