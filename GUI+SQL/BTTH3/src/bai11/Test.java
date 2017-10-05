/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Than
 */
public class Test {
    private ArrayList<DuAn> duAn;
    private ArrayList<NV> nhanVien;
    private ArrayList<QLDA> list;
    static Scanner sc = new Scanner(System.in);
    
    public Test(){
        duAn = new ArrayList();
        nhanVien = new ArrayList();
        list = new ArrayList();
    }

    public ArrayList<DuAn> getDuAn() {
        return duAn;
    }

    public void setDuAn(ArrayList<DuAn> duAn) {
        this.duAn = duAn;
    }

    public ArrayList<NV> getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(ArrayList<NV> nhanVien) {
        this.nhanVien = nhanVien;
    }

    public ArrayList<QLDA> getList() {
        return list;
    }

    public void setList(ArrayList<QLDA> list) {
        this.list = list;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Test.sc = sc;
    }
    
    
    public static void main(String[] args) {
        Test ex = new Test();
        int lc = 0;
        do{
            System.out.println("========MENU=======\n1.Nhap du an.\n2.Nhap nhan vien."
                    + "\n3.Nhap QLDA.\n4.Xuat DA.\n5.xuatNV.\n6.Xuat QLDA.\n7.sap xep theo ten NV.\n8"
                    + "sap xep theo so ngay tham gia.\n9.Tim kiem theo ten nhan vien.\n0.Thoat."
                    + "\nBam chon ? ");
            try{
                lc = Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("got an exception. ");
                
            }
            
            switch(lc){
                case 0: break;
                case 1:{
                    ex.nhapDA();
                    break;
                }
                case 2:{
                    ex.nhapNV();
                    break;
                }
                case 3:{
                    ex.nhapQL();
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
                    ex.xuatQLDA();
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
                    ex.searchByName();
                    break;
                }
                default: System.out.println("Nhap sai chuc nang.");
            }
        }while(lc != 0);
    }
    
    public boolean nhapDA(){
        DuAn d = new DuAn();
        System.out.println("Nhap ten DA: ");
        d.setName(sc.nextLine());
        System.out.println("Nhap kieu du an: ");
        d.setKieu(sc.nextLine());
        System.out.println("Nhap tong von: ");
        d.setKinhPhi(Double.parseDouble(sc.nextLine()));
        duAn.add(d);
        return true;
    }
    
    public boolean nhapNV(){
        NV n = new NV();
        System.out.println("Ten: ");
        n.setName(sc.nextLine());
        System.out.println("DC: ");
        n.setAddr(sc.nextLine());
        String s;
        while(true){
            System.out.println("Nhap chuyen mon: ");
            s = sc.nextLine();
            if(s.matches("^[a-zA-Z]{2}-[a-zA-Z]{2}$")||s.matches("^[a-zA-Z]{2}-[a-zA-Z]{4}$")
                    ||s.matches("^[a-zA-Z]{4}-[a-zA-Z]{2}$")||s.matches("^[a-zA-Z]{4}-[a-zA-Z]{4}$")){
                n.setCmon(s);
                break;
            }
            else System.out.println("Nhap sai dinh dang.");
            
            
        }
        nhanVien.add(n);
        return true;
    }
    
    public boolean nhapQLDA(){
        QLDA q = new QLDA();
        int id;
        boolean bb = false;
        System.out.println("Nhap ma nhan vien: ");
        id = Integer.parseInt(sc.nextLine());
        for(NV n: nhanVien){
            if(n.getID() == id){
                q.setNhanVien(n);
                bb = true;
            }
        }
        if(!bb){
            System.out.println("Ma NV khong hop le.");
            return false;
        }
        
        while(true){
            bb = false;
            int idd;
            int lc;
            QLDA qq = new QLDA();
            qq.setNhanVien(q.getNhanVien());
            System.out.println("Nhap 0 de thoat, #0 de tiep tuc.");
            lc = Integer.parseInt(sc.nextLine());
            if(lc == 0) break;
            System.out.println("Nhap ma DA: ");
            idd = Integer.parseInt(sc.nextLine());
            if(tonTai(id, idd)){
                System.out.println("Ma DA da ton tai.");
                return false;
            }
            for(DuAn d: duAn){
                if(d.getID() == idd){
                    qq.setDuAn(d);
                    bb = true;
                }
            }
            if(!bb){
                System.out.println("Nhap sai ma DA.");
                return false;
            }
            System.out.println("Nhap vao so ngay tham gia: ");
            qq.setSoNgay(Integer.parseInt(sc.nextLine()));
            System.out.println("Vi tri: ");
            qq.setViTri(sc.nextLine());
            
            list.add(qq);
        }
        return true;
    }
    
    public boolean nhapQL(){
        QLDA q = new QLDA();
        int id;
        boolean bb = false;
        System.out.println("Nhap ma nhan vien: ");
        id  = Integer.parseInt(sc.nextLine());
        for(NV n: nhanVien){
            if(n.getID() == id){
                q.setNhanVien(n);
                bb = true;
            }
        }
        if(!bb) {
            System.out.println("Nhap sai ma nhan vien");
            return false;
        }
        while(true){
            int lc;
            bb = false;
            QLDA qq = new QLDA();
            qq.setNhanVien(q.getNhanVien());
            System.out.println("Nhap 0 de thoat, #0 de tiep tuc.");
            lc = Integer.parseInt(sc.nextLine());
            if(lc == 0) break;
            int idd;
            System.out.println("Nhap ma du an: ");
            idd = Integer.parseInt(sc.nextLine());
            if(tonTai(id, idd)){
                System.out.println("ma du an nay da ton tai.");
                return false;
            }
            for(DuAn d: duAn){
                if(d.getID() == idd){
                    qq.setDuAn(d);
                    bb = true;
                }
            }
            if(!bb){
                System.out.println("Nhap sai ma nhan vien.");
                return false;
            }
            System.out.println("Nhap vao so ngay tham gia: ");
            qq.setSoNgay(Integer.parseInt(sc.nextLine()));
            System.out.println("Vi tri: ");
            qq.setViTri(sc.nextLine());
            list.add(qq);
        }
        return true;
    }
    
    public boolean tonTai(int id, int idd){
        for(QLDA q: list){
            if(q.getNhanVien().getID() ==id && q.getDuAn().getID() ==idd) return true;
        }
        return false;
    }
    
    public void xuatDA(){
        for(DuAn d: duAn){
            System.out.println(d.toString());
        }
        System.out.println("==============================");
    }
    public void xuatNV(){
        for(NV d: nhanVien){
            System.out.println(d.toString());
        }
        System.out.println("==============================");
    }
    public void xuatQLDA(){
        for(QLDA d: list){
            System.out.println(d.toString());
        }
        System.out.println("==============================");
    }
    
    public void sortByName(){
        Collections.sort(list, new Comparator<QLDA>() {
            @Override
            public int compare(QLDA t, QLDA t1) {
                if(t.getNhanVien().getName().compareTo(t1.getNhanVien().getName())> 0) return 1;
                else if(t.getNhanVien().getName().compareTo(t1.getNhanVien().getName()) == 0) return 0;
                return -1;
            }
        });
        System.out.println("==============================");
    }
    
    public void sortBySoNgay(){
        Collections.sort(list, new Comparator<QLDA>() {
            @Override
            public int compare(QLDA t, QLDA t1) {
                if(t.getSoNgay() < t1.getSoNgay()) return 1;
                else if(t.getSoNgay() == t1.getSoNgay()) return 0;
                return -1;
            }
        });
        System.out.println("==============================");
    }
    
    public void searchByName(){
        String name;
        int count = 0;
        System.out.println("Nhap ten nhan vien can tim kiem: ");
        name = sc.nextLine();
        for(QLDA q: list){
            if(q.getNhanVien().getName().toLowerCase().matches(".*"+name+".*")){
                System.out.println(++count+", " + q.toString());
            }
        }
        System.out.println("==============================");
    }
}
