/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import static bai10.Test.sc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Than
 */
public class SXTimKiem {
    public void sortByName(List list){
        Collections.sort(list, new Comparator<QLTB>() {
            @Override
            public int compare(QLTB t, QLTB t1) {
                if(t.getPhongHoc().getName().compareTo(t1.getPhongHoc().getName()) > 0) return 1;
                else if(t.getPhongHoc().getName().compareTo(t1.getPhongHoc().getName()) == 0) return 0;
                return -1;
            }
        });
    }
    
    public void sortBySL(List list){
        Collections.sort(list, new Comparator<QLTB>() {
            @Override
            public int compare(QLTB t, QLTB t1) {
                if(t.getSoLuong() < t1.getSoLuong() ) return 1;
                else if(t.getSoLuong() == t1.getSoLuong() ) return 0;
                return -1;
            }
        });
    }
    
    public void timKiem(ArrayList<QLTB> list){
        String name;
        System.out.println("Nhap ten thiet bi: ");
        name  =sc.nextLine();
        
        for(QLTB q: list){
            if(q.getThietBi().getName().toLowerCase().matches(".*"+name+".*")){
//                System.out.println(q.toString());
            }
        }
    }
}
