/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Than
 */
public class Test {
    private ArrayList<PhongHoc> phong;
    private ArrayList<Lop> lop;
    private ArrayList<XepLop> list;
    static Scanner sc = new Scanner(System.in);
    
    public Test(){
        lop = new ArrayList();
        phong = new ArrayList();
        list = new ArrayList();
    }
    
    public static void main(String[] args) {
        Test ex = new Test();
        int lc = 0;
        do{
            System.out.println("========MENU=======\n1.Nhap Phong.\n2.nhap lop.\n3.Nhap Xep Lop."
                    + "\n4.xuat Phong.\n5.Xuat lop.\n6.Xuat DS xep lop.\n7.sap xep theo ten lop."
                    + "\n8.SX theo kip hoc.\n9.tim kiem theo ten phong hoc.\n0.Thoat."
                    + "\nBan chon ? ");
            try{
                lc = Integer.parseInt(sc.nextLine());
            } catch(Exception e){
                System.out.println("got an exception.");
            }
            switch(lc){
                case 0: break;
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
                    ex.xuatXL();
                    break;
                }
                case 7:{
                    ex.sortByName();
                    break;
                }
                case 8:{
                    ex.sortByKip();
                    break;
                }
                case 9:{
                    ex.timKiem();
                    break;
                }
            }
        } while(lc != 0);
    }
    
    public boolean nhapLop(){
        Lop l = new Lop();
        System.out.println("Ten Lop: ");
        l.setName(sc.nextLine());
        System.out.println("So SV: ");
        l.setSoSV(Integer.parseInt(sc.nextLine()));
        while(true){
            String s;
            System.out.println("nhap fanpage, vd: D14-nhom9-LTHDT.");
            s = sc.nextLine();
            if(s.matches("^[CD]{1}\\d{2}-nhom\\d+-[A-Z]{3}$") || 
                    s.matches("^[CD]{1}\\d{2}-nhom\\d+-[A-Z]{5}$")){
                l.setFanPage(s);
                break;
            }
            else System.out.println("sai dinh dang.");
        }
        lop.add(l);
        return true;
    }
    
    public boolean nhapPhong(){
        PhongHoc p = new PhongHoc();
        System.out.println("Ten Phong: ");
        p.setName(sc.nextLine());
        System.out.println("So ghe: ");
        p.setSoGhe(Integer.parseInt(sc.nextLine()));
        System.out.println("Kieu Phong: ");
        p.setKieu(sc.nextLine());
        phong.add(p);
        return true;
    }
    
    public boolean nhapXepLop(){
        int id, idd, lc;
        boolean bb = false;
        XepLop x = new XepLop();
        System.out.println("Nhap ma Lop: ");
        id = Integer.parseInt(sc.nextLine());
        for(Lop l: lop){
            if(l.getID() == id){
                x.setLop(l);
                bb = true;
            }
        }
        
        if(!bb){
            System.out.println("Ma lop bi nhap sai.");
            return false;
        }
        while(true){
            XepLop xx = new XepLop();
            xx.setLop(x.getLop());
            bb = false;
            System.out.println("Chon 0 de thoat, #0 de tiep tuc.");
            lc = Integer.parseInt(sc.nextLine());
            if( lc == 0 ) break;
            System.out.println("Nhap ma Phong: ");
            idd = Integer.parseInt(sc.nextLine());
            
            for(PhongHoc p: phong){
                if(p.getID() == idd){
                    if(p.getSoGhe() < xx.getLop().getSoSV()){
                        System.out.println("Khong du cho ngoi.");
                        return false;
                    }
                    xx.setPhong(p);
                    bb = true;
                }
            }
            if(!bb){
                System.out.println("nhap sai ma phong.");
                return false;
            }
            while(true){
                int kip;
                System.out.println("Nhap kip: ");
                kip = Integer.parseInt(sc.nextLine());
                if(!trung(idd, kip)){
                    xx.setKip(kip);
                    break;
                }
                else System.out.println("Trung kip.");
            }
            list.add(xx);
         }
        return true;
    }
    
   public boolean nhapXL(){
       int id, idd, lc;
       boolean bb = true;
       XepLop x = new XepLop();
       System.out.println("Nhap ma lop: 3cs");
       id = Integer.parseInt(sc.nextLine());
       for(Lop l: lop){
           if(l.getID() == id){
               x.setLop(l);
               bb = true;
           }
       }
       if(!bb){
           System.out.println("khong dung ma lop.");
           return   false;
       }
       while(true){
           bb = false;
           XepLop xx = new XepLop();
           xx.setLop(x.getLop());
           System.out.println("Nhap 0 de thoat, # 0 de tiep tuc.");
           lc  = Integer.parseInt(sc.nextLine());
           if(lc == 0 ) break;
           System.out.println("Nhap ma Phong hoc: 5cs");
           idd = Integer.parseInt(sc.nextLine());
           
           for(PhongHoc p: phong){
               if(p.getID() == idd){
                   if(p.getSoGhe() < xx.getLop().getSoSV()){
                       System.out.println("Khong du ghe ngoi.");
                       return false;
                   }
                   xx.setPhong(p);
                   bb = true;
               }
           }
           if(!bb) {
               System.out.println("nhap sai ma Phong");
               return false;
           }
           while(true){
               int kip;
               System.out.println("Nhap kip: ");
               kip = Integer.parseInt(sc.nextLine());
               if(!trung(idd,kip)){
                   xx.setKip(kip);
                   break;
               }
               else System.out.println("Trung kip, nhap lai");
           
            }
           list.add(xx);
       }
       return true;
   }
   
   public boolean trung(int id, int kip){
       for(XepLop x: list){
           if(x.getKip() == kip && x.getPhong().getID() == id) return true;
       }
       return false;
   }
   
   public void xuatLop(){
       for(Lop l: lop){
           System.out.println(l.toString());
       }
       System.out.println("====================================");
   }
   public void xuatPhong(){
       for(PhongHoc l: phong){
           System.out.println(l.toString());
       }
       System.out.println("====================================");
   }
   public void xuatXL(){
       for(XepLop l: list){
           System.out.println(l.toString());
       }
       System.out.println("====================================");
   }
   
   public void sortByName(){
       Collections.sort(list, new Comparator<XepLop>() {
           @Override
           public int compare(XepLop t, XepLop t1) {
               if(t.getLop().getName().compareTo(t1.getLop().getName()) > 0) return 1;
               else if(t.getLop().getName().compareTo(t1.getLop().getName()) == 0) return 0;
               return -1;
           }
       });
   }
    public void sortByKip(){
       Collections.sort(list, new Comparator<XepLop>() {
           @Override
           public int compare(XepLop t, XepLop t1) {
               if(t.getKip() > t1.getKip()) return 1;
               else if(t.getKip() == t1.getKip()) return 0;
               return -1;
           }
       });
   }
    
    public void timKiem(){
        int i = 0;
        String name;
        System.out.println("Nhap ten phong can tim: ");
        name = sc.nextLine();
        for(XepLop x: list){
            if(x.getPhong().getName().toLowerCase().matches(".*"+name+".*")){
                System.out.println(++i+") "+x.toString());
            }
        }
        if(i == 0) System.out.println("Khong tim thay phong nao thao man.");
    }
}
