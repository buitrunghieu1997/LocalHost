/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;
import javax.swing.JOptionPane;
/**
 *
 * @author buitr
 */
public class HelloWorld {
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Ai đẹp trai nhất nào? ");
        String msg = "Chính là anh " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
        System.out.println("Người đẹp trai nhất là " + name);
    }
    
}
