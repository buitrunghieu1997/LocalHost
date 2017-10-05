/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12_1;

import java.util.ArrayList;

/**
 *
 * @author Than
 */
public class VD {
    public static void main(String[] args) {
        ArrayList str = new ArrayList();
        str.add("ha");
        str.add("cute");
        str.add("map");
        str.add("ha");
        str.add("cute");
        str.add("map");
        str.add("ha");
        str.add("cute");
        str.add("map");
        str.add("dang ghet");
        int count = 0;
        boolean b= false;
        for (int i = 0; i < str.size(); i++) {
            
            for (int j = 0; j < i; j++) {
                if(str.get(j).toString().compareTo(str.get(i).toString()) == 0){
                    b = true;
                }
            }
            if(!b){
                System.out.println("b = "+ b);
                count++;
            }
        }
        System.out.println("count= "+count);
    }
}
