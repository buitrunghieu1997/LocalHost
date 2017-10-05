/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11_1;

/**
 *
 * @author Than
 */
public class Check {
    public static void main(String[] args) {
        String s = "aaaaa";
        String s1 = "sssds";
        if(s.matches("^[a-z]{3}|[a-z]{5}$")) System.out.println("OK1");
        if(s1.matches("^[a-z]{3}|{5}$")) System.out.println("OK2");
    }
}
