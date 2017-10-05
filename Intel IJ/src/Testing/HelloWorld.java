package Testing;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloWorld {
    public static void main(String[] args) {
       /*System.out.print("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String ten = sc.next();
        System.out.println("Your name: " + ten);*/
        String name = "";
        name = JOptionPane.showInputDialog("Ai đẹp trai nhất nào? ");
        String msg = "Chính là anh " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
        System.out.println("Người đẹp trai nhất là " + name);
/*
        // Tạo một đối tượng BufferedReader
        BufferedReader dataIn = new BufferedReader(new
                InputStreamReader( System.in) );
        // Biến name
        String name = "";
        System.out.println("Please Enter Your Name:");

        // Tiến hành đọc từ bàn phím

        try
        {
            name = dataIn.readLine();
        }
        catch( IOException e )
        {
            System.out.println("Error!");
        }

        // hiển thị tên

        System.out.println("Hello " + name +"!"); */
    }

}
