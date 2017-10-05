/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author Than
 */
public class TTT {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        if(s.matches("^[a-zA-Z]{2}-[a-zA-Z]{2}$") || s.matches("^[a-zA-Z]{2}-[a-zA-Z]{4}$")
                ||s.matches("^[a-zA-Z]{4}-[a-zA-Z]{2}$") || s.matches("^[a-zA-Z]{4}-[a-zA-Z]{4}$"))
            System.out.println("OK");
    }
}
