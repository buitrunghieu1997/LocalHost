/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Than
 */
public class Clock extends JFrame{
    public static void main(String[] args) {
        SimpleDateFormat sfd = new SimpleDateFormat("hh:mm:ss");
        JFrame f = new JFrame();
        while(true){
            Date d = new Date();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            }
            Calendar date = Calendar.getInstance();
            JButton button = new JButton(sfd.format(d)); //sfd.format(date).toString()
            f.add(button);
            f.setSize(100, 100);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(EXIT_ON_CLOSE);
            f.setVisible(true);
        }
        
    }
}
