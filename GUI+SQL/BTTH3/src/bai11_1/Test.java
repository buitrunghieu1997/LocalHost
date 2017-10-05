/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Than
 */
public class Test {
    private ArrayList<DA> duAn;
    private ArrayList<NV> nhanVien;
    private ArrayList<BPC> list;
    static Scanner sc = new Scanner(System.in);
    
    public Test(){
        duAn = new ArrayList();
        nhanVien = new ArrayList();
        list = new ArrayList();
    }
    
    public static void main(String[] args) {
        Test ex = new Test();
        int lc = 0;
        
        do{
            System.out.println("========MENU=======\n1.nhap DA.\n2.Nhap NV.\n3.nhap BPC.\n4.xuat DA."
                    + "\n5.xuat NV.\n6.xuat BPC.\n7.sap xep theo ten NV.\n8.sap xep theo so ngay tham gia."
                    + "\n9.tim kiem theo ten nhan vien.\n0.thoat.\nBan chon ?");
            try{
                lc = Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("got an exception.");
            }
            switch(lc){
                case 0: System.out.println("Bye!"); break;
                case 1:{
                    ex.nhapDA();
                    break;
                }
                case 2:{
                    ex.nhapNV();
                    break;
                }
                case 3:{
                    ex.nhapBPC();
                    break;
                }case 4:{
                    ex.xuatDA();
                    break;
                }case 5:{
                    ex.xuatNV();
                    break;
                }case 6:{
                    ex.xuatBPC();
                    break;
                }
                case 7:{
                    ex.sortByName();
                    break;
                }
                case 8:{
                    ex.sortBySoNgay();
                    break;
                }
                case 9:{
                    ex.search();
                    break;
                }
                
                default: System.out.println("nhap sai chuc nang.");
                
            }
        } while(lc != 0);
    }
    
    public boolean nhapDA(){
        DA d = new DA();
        System.out.println("Nhap ten DA: ");
        d.setName(sc.nextLine());
        System.out.println("Kieu DA: ");
        d.setKieu(sc.nextLine());
        System.out.println("Tong von: ");
        d.setKinhPhi(Double.parseDouble(sc.nextLine()));
        duAn.add(d);
        return true;
    }
    
    public boolean nhapNV(){
        NV n = new NV();
        System.out.println("Ten NV: ");
        n.setName(sc.nextLine());
        System.out.println("Dia chi: ");
        n.setAddr(sc.nextLine());
        while(true){
            System.out.println("Nhap chuyen mon: ");
            String s = sc.nextLine();
            if(s.matches("^[A-Za-z]{2}|^[A-Za-z]{4}-[a-zA-Z]{4}|-[A-Za-z]{2}$") ){
                n.setcMon(s);
                break;
            }
        }
        nhanVien.add(n);
        return true;
        
        
    }
    public boolean nhapBPC(){
        BPC x = new BPC();
        int lc, id, idd;
        boolean bb = false;
        System.out.println("Nhap ma NV: ");
        id = Integer.parseInt(sc.nextLine());
        for(NV n: nhanVien){
            if(n.getID() == id){
                x.setNhanVien(n);
                bb = true;
            }
        }
        
        if(!bb){
            System.out.println("sai ma NV");
            return false;
        }
        
        while(true){
            bb = false;
            BPC xx = new BPC();
            xx.setNhanVien(x.getNhanVien());
            System.out.println("nhap 0 de thoat. #0 de tiep tuc.");
            lc = Integer.parseInt(sc.nextLine());
            if(lc  ==0) break;
            System.out.println("Nhap ma DA: ");
            idd = Integer.parseInt(sc.nextLine());
            if(trung(id, idd)){
                System.out.println("Nhap trung ma DA.");
                return false;
            }
            for(DA d: duAn){
                if(d.getID() == idd){
                    xx.setDuAn(d);
                    bb = true;
                }
            }
            if(!bb){
                System.out.println("khong dung ma DA");
                return false;
            }
            System.out.println("Nhap so ngay: ");
            xx.setSoNgay(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap vi tri: ");
            xx.setViTri((sc.nextLine()));
            list.add(xx);
        }
        return true;
    }
    public boolean trung(int id, int idd){
        for(BPC b: list){
            if(b.getNhanVien().getID() == id && b.getDuAn().getID() == idd) return true;
        }
        return false;
    }
    
    public void xuatDA(){
        for(DA d: duAn){
            System.out.println(d.toString());
        }
        System.out.println("==============================================");
    }
    
    public void xuatNV(){
        for(NV n: nhanVien){
            System.out.println(n.toString());
        }
        System.out.println("==============================================");
    }
    
    public void xuatBPC(){
        for(BPC b: list){
            System.out.println(b.toString());
        }
        System.out.println("==============================================");
    }
    
    public void sortByName(){
        Collections.sort(list, new Comparator<BPC>() {
            @Override
            public int compare(BPC t, BPC t1) {
                if(t.getNhanVien().getName().compareTo(t1.getNhanVien().getName()) > 0) return 1;
                else if(t.getNhanVien().getName().compareTo(t1.getNhanVien().getName()) == 0) return 0;
                return -1;
            }
        });
    }
    
    public void sortBySoNgay(){
        Collections.sort(list, new Comparator<BPC>() {
            @Override
            public int compare(BPC t, BPC t1) {
                if(t.getSoNgay() < t1.getSoNgay()) return 1;
                else if(t.getSoNgay() == t1.getSoNgay()) return 0;
                return -1;
            }
        });
    }
    
    public void search(){
        String name;
        System.out.println("Enter a name.");
        name = sc.nextLine();
        for(BPC b: list){
            if(b.getNhanVien().getName().toLowerCase().matches(".*"+name+".*")){
                System.out.println(b.toString());
            }
        }
    }
}
