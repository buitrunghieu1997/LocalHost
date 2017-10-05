/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Than
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        try{
        String s=in.nextLine();
        double  a= Double.parseDouble(s);
        System.out.println(""+a);
        }
        catch(NumberFormatException e)
        {
            System.out.println("got exception "+e.getMessage());
        }
        
    }
    
}

