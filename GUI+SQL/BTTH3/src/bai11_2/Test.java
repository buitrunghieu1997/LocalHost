/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Than
 */
public class Test {
     private ArrayList<NV> nhanVien;
    private ArrayList<DA> duAn;
    private ArrayList<BPC> list;
    static Scanner sc = new Scanner(System.in);
    
    public Test(){
        nhanVien  = new ArrayList();
        duAn = new ArrayList();
        list = new ArrayList();
    }
    
    public static void main(String[] args) {
        Test ex = new Test();
        int lc = 0;
        do{
            System.out.println("=======MENU======\n1.nhap DA.\n2.Nhap NV.\n3.Nhap BPC."
                    + "\n4.xuat DA.\n5.Xuat NV.\n6.Xuat BPC.\n7.Sap xep theo ten.\n8.sap xep theo so ngay."
                    + "\n9.Tim kiem.\n0.Thoat.\nBan chon ? ");
            try{
                lc = Integer.parseInt(sc.nextLine());
            } catch(Exception e){
                System.out.println("got an exception.");
            }
            switch(lc){
                case 0: System.out.println("Bye."); break;
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
                }
                case 4:{
                    ex.xuatDA();
                    break;
                }
                case 5:{
                    ex.xuatNV();
                    break;
                }
                case 6:{
                    ex.xuatBPC();
                    break;
                }
                case 7:{
                    ex.sortByName();
                    break;
                }case 8:{
                    ex.sortBySoNgay();
                    break;
                }
                
                case 9:{
                    ex.timKiem();
                    break;
                }
                
            }
        } while(lc != 0);
    }
    
    public boolean nhapDA(){
        DA d = new DA();
        System.out.println("Ten DA: ");
        d.setName(sc.nextLine());
        System.out.println("Kieu DA: ");
        d.setKieu(sc.nextLine());
        System.out.println("Tong kinh phi: ");
        d.setKinhPhi(Double.parseDouble(sc.nextLine()));
        duAn.add(d);
        return true;
    }
    
    public boolean nhapNV(){
        NV n = new NV();
        System.out.println("Nhap ten NV: ");
        n.setName(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        n.setAddr(sc.nextLine());
        System.out.println("nhap chuyen mon: ");
        while(true){
            String s = sc.nextLine();
            if(s.matches("^[a-zA-Z]{2}-[A-Za-z]{2}$")|| s.matches("^[a-zA-Z]{2}-[A-Za-z]{4}$")
                    ||s.matches("^[a-zA-Z]{4}-[A-Za-z]{2}$") || s.matches("^[a-zA-Z]{4}-[A-Za-z]{4}$")){
                n.setCmon(s);
                break;
            }
            else System.out.println("Nhap sai dinh dang.");
        }
        nhanVien.add(n);
        return true;
    }
    
    public boolean  isOK(int id, int idd){
        for(BPC b: list){
            if(b.getNhanVien().getID() == id && b.getDuAn().getID() == idd) return false;
        }
        return true;
    }
    
    public boolean nhapBPC(){
        int id, idd, lc;
        boolean bb = false;
        BPC b = new BPC();
        System.out.println("Nhap ma nhan vien: ");
        id = Integer.parseInt(sc.nextLine());
        for(NV n: nhanVien){
            if(n.getID() == id){
                b.setNhanVien(n);
                        bb = true;
            }
        }
        if(!bb){
            System.out.println("ma khong khop.");
            return false;
        }
        
        while(true){
            bb = false;
            BPC xx = new BPC();
            xx.setNhanVien(b.getNhanVien());
            System.out.println("Nhap #0 de tiep tuc. nhap 0 de thoat.");
            lc = Integer.parseInt(sc.nextLine());
            if(lc == 0){
                break;
            }
            System.out.println("Nhap ma DA: ");
            idd = Integer.parseInt(sc.nextLine());
            if(!isOK(id, idd)){
                System.out.println("trung DA.");
                return false;
            }
            for(DA d: duAn){
                if(d.getID() == idd){
                    xx.setDuAn(d);
                    bb = true;
                }
            }
            if(!bb){
                System.out.println("ma DA khong dung.");
                return false;
            }
            System.out.println("Nhap so ngay tham gia: ");
            xx.setSoNgay(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap vi tri: ");
            xx.setViTri(sc.nextLine());
            list.add(xx);
        }
        return true;
    }
    
    public void xuatDA(){
        for(DA d: duAn){
            System.out.println(d.toString());
        }
        System.out.println("====================================");
    }
    public void xuatNV(){
        for(NV d: nhanVien){
            System.out.println(d.toString());
        }
        System.out.println("====================================");
    }
    public void xuatBPC(){
        for(BPC d: list){
            System.out.println(d.toString());
        }
        System.out.println("====================================");
    }
    
    public void sortByName(){
        Collections.sort(list, new Comparator<BPC>() {
            @Override
            public int compare(BPC t, BPC t1) {
                if(t.getNhanVien().getName().compareTo(t1.getNhanVien().getName()) > 0) return 1;
                else if(t.getNhanVien().getName().compareTo(t1.getNhanVien().getName()) ==0  ) return 0;
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
    
    public void timKiem(){
        int count = 0;
        String name;
        System.out.println("Nhap ten NV: ");
        name = sc.nextLine();
        for(BPC b: list){
            if(b.getNhanVien().getName().toLowerCase().matches(".*"+name+".*")){
                System.out.println(++count + ") " + b.toString());
            }
        }
    }
}
