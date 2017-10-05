/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Than
 */
public class Tets {
    private ArrayList<PhongHoc> phong;
    private ArrayList<Lop> lop;
    private ArrayList<XepLop> list;
    
    static Scanner sc=  new Scanner(System.in);
    
    public Tets(){
        phong = new ArrayList();
        lop =new ArrayList();
        list = new ArrayList();
    }
    
    public static void main(String[] args) {
        Tets ex = new Tets();
        int lc = 0;
        do{
            System.out.println("===========MENU==========\n1.nhap phong.\n2.nhap lop"
                    + "\n3.nhap Xep lop.\n4.xuat phong.\n5.xuat lop.\n6.Xuat danh sach lop."
                    + "\n7.sap xep theo ten lop.\n8.sap xep theo kip hoc."
                    + "\n9.tim kiem theo phong hoc.\n0.Thoat.\nBan chon ? ");
            try{
                lc = Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("got an exception input.");
            }
            switch(lc){
                case 0: System.out.println("Bye."); break;
                case 1:{
                    ex.nhapPhong();
                    break;
                }
                case 2:{
                    ex.nhapLop();
                    break;
                }
                case 3:{
                    ex.nhapXL();
                    break;
                }
                case 4:{
                    ex.xuatPhong();
                    break;
                }
                case 5:{
                    ex.xuatLop();
                    break;
                }
                case 6:{
                    ex.xuatDSXepLop();
                    break;
                }
                case 7:{
                    ex.sortByTenLop();
                    break;
                }
                case 8:{
                    ex.sortByKipHoc();
                    break;
                }
                case 9:{
                    ex.searchByTenPhong();
                    break;
                }
            }
        } while(lc != 0);
    }
    
    public boolean isOK(int id, int kip){
        for(XepLop x: list){
            if(x.getPhong().getID() == id && x.getKip() == kip) return false;
        }
        return true;
    }
    
    public boolean nhapLop(){
        Lop l = new Lop();
        System.out.println("Nhap ten lop: ");
        l.setName(sc.nextLine());
        System.out.println("Nhap so SV: ");
        l.setSoSV(Integer.parseInt(sc.nextLine()));
        while(true){
            System.out.println("Nhap fanpage: vd: D14-nhom1-LTHDT");
            String s = sc.nextLine();
            if(s.matches("^[CD]{1}\\d{2}-nhom\\d+-[A-Z]{3}$") || 
                    s.matches("^[CD]{1}\\d{2}-nhom\\d+-[A-Z]{5}$")){
                l.setFanPage(s);
                break;
            }
            else System.out.println("Nhap sai dinh dang fanpage.");
        }
        lop.add(l);
        return false;
    }
    
    public boolean nhapPhong(){
        PhongHoc p = new PhongHoc();
        System.out.println("Nhap ten Phong: ");
        p.setName(sc.nextLine());
        System.out.println("Kieu phong: ");
        p.setKieu(sc.nextLine());
        System.out.println("So ghe: ");
        p.setSoGhe(Integer.parseInt(sc.nextLine()));
        phong.add(p);
        return false;
    }
    
    public boolean nhapXepLop(){
        XepLop x = new XepLop();
        int id;
        boolean bb = false;
        System.out.println("Nhap vao ma Lop: ");
        id = Integer.parseInt(sc.nextLine());
        for(Lop p: lop){
            if(p.getID() == id){
                x.setLop(p);
                bb = true;
            }
        }
        if(!bb){
            System.out.println("Khong dung ma lop.");
            return false;
        }
        
        while(true){
            int idd;
            int lc;
            XepLop xx = new XepLop();
            xx.setLop(x.getLop());
            System.out.println("Nhap vao lua chon: 0-thoat. #0 tiep tuc. ");
            lc =Integer.parseInt(sc.nextLine());
            if(lc == 0) break;
            bb = false;
            System.out.println("Nhap ma phong hoc: ");
            idd = Integer.parseInt(sc.nextLine());
            
            for(PhongHoc p: phong){
                if(p.getID() ==  idd){
                     xx.setPhong(p);
                     bb = true;
                     if(p.getSoGhe() < xx.getLop().getSoSV() ){
                         System.out.println("so ghe khong du cho so sinh vien.");
                         return false;
                     }
                }
            }
            if(!bb) {
                System.out.println("Nhap sai ma phong hoc");
                return false;
            }
            while(true){
                System.out.println("Nhap kip: ");
                int kip = Integer.parseInt(sc.nextLine());
                if(isOK(idd, kip)){
                    xx.setKip(kip);
                    break;
                }
                else System.out.println("trung kip. nhap lai");
                
            }
            list.add(xx);
        }
        return false;
    }
    
   public boolean nhapXL(){
       int id, lc, idd;
       boolean bb = false;
       XepLop x = new XepLop();
       System.out.println("Nhap ma lop: ");
       id = Integer.parseInt(sc.nextLine());
       for(Lop l: lop){
           if(l.getID() == id){
               x.setLop(l);
               bb = true;
           }
       }
       if(!bb){
           System.out.println("nhap sai ma lop.");
           return false;
       }
       while(true){
           bb = false;
           XepLop xx = new XepLop();
           xx.setLop(x.getLop());
           System.out.println("Nhap 0 de thoat, #0 de tiep tuc.");
           lc = Integer.parseInt(sc.nextLine());
           if(lc == 0){
               break;
           }
           System.out.println("Nhap ma phong hoc: ");
           idd = Integer.parseInt(sc.nextLine());
           for(PhongHoc p: phong){
               if(p.getID() == idd){
                   xx.setPhong(p);
                   if(p.getSoGhe() < xx.getLop().getSoSV()){
                       System.out.println("Khong du cho");
                       return false;
                   }
                   bb = true;
               }
           }
           if(!bb){
               System.out.println("ma khong hop le.");
               return false;
           }
           
           while(true){
               System.out.println("Nhap kip: ");
               int kip = Integer.parseInt(sc.nextLine());
               if(isOK(idd, kip)){
                   xx.setKip(kip);
                   break;
               }
               else System.out.println("Nhap trung kip");
           }
                   
           list.add(xx);
       }
       return true;
   }
    
    public void xuatPhong(){
        for(PhongHoc p: phong)
            System.out.println(p.toString());
        System.out.println("=====================================");
    }
    
    public void xuatLop(){
        for(Lop l: lop){
            System.out.println(l.toString());
        }
        System.out.println("=====================================");
    }
    
    public void xuatDSXepLop(){
        for(XepLop x: list)
            System.out.println(x.toString());
        System.out.println("=====================================");
    }
    
    public void sortByTenLop(){
        Collections.sort(list, new Comparator<XepLop>() {
            @Override
            public int compare(XepLop t, XepLop t1) {
                if(t.getLop().getName().compareTo(t1.getLop().getName()) > 0) return 1;
                else if(t.getLop().getName().compareTo(t1.getLop().getName()) == 0 ) return 0;
                return -1;
            }
        });
        System.out.println("=====================================");
    }
    
    public void sortByKipHoc(){
        Collections.sort(list, new Comparator<XepLop>() {
            @Override
            public int compare(XepLop t, XepLop t1) {
                if(t.getKip() > t1.getKip()) return 1;
                else if(t.getKip() == t1.getKip() ) return 0;
                return -1;
            }
        });
        System.out.println("=====================================");
    }
    
    public void searchByTenPhong(){
        int count = 0;
        String name;
        System.out.println("Nhap ten phong can tim kiem: ");
        name = sc.nextLine();
        for(XepLop x:list){
            if(x.getPhong().getName().toLowerCase().matches(".*"+name+".*")){
                System.out.println(++count+") "+ x.toString());
            }
        }
        System.out.println("=====================================");
    }
}
