/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Than
 */
public class Test {
    ArrayList<Sach> sach;
    ArrayList<LoaiSach> loaiSach;
    ArrayList<NXB> nxb;
    static Scanner sc=  new Scanner(System.in);
    
    public void setSach(){
        try {
            sach = (ArrayList<Sach>) doc("SACH.DAT");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setLoaiSach(){
        try {
            loaiSach = (ArrayList<LoaiSach>) doc("LOAISACH.DAT");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setNXB(){
        try {
            nxb = (ArrayList<NXB>) doc("NXB.DAT");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Test(){
        sach = new ArrayList();
        nxb = new ArrayList();
        loaiSach = new ArrayList();
        this.setLoaiSach();
        this.setNXB();
        this.setSach();
    } 
    
    public static void main(String[] args) {
        Test ex = new Test();
        
        int lc = 0;
        do{
            System.out.println("=============MENU============\n1.them loai sach.\n2.them nha XB."
                    + "\n3.them Sach.\n4.Xuat DS sach.\n5.sua sach.\n6.xoa sach."
                    + "\n7.Sap xep.\n8.Tim kiem sach.\n9.Hien thi tat ca loai sach.\n10."
                    + "Hien thi tat ca nha xuat ban.\n0.Thoat."
                    + "\nBan chon ?");
            try{
                lc = Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            switch(lc){
                case 0: System.out.println("Bye!"); break;
                case 1:{
                    while(true){
                        if(ex.nhapLoaiSach()) break;
                        else System.out.println("Ma loai sach da ton tai.");
                    }
                    break;
                }
                case 2:{
                    while(true){
                        if(ex.nhapNXB()) break;
                        else System.out.println("Ma NXB da ton tai.");
                    }
                    break;
                }
                case 3:{
                    while(true){
                        if(ex.nhapSach()) break;
                        else System.out.println("Ma sach da ton tai.");
                    }
                    break;
                }
                case 4:{
                    ex.xuatAll();
                    break;
                }
                case 5:{
                    String id;
                    System.out.println("nhap id= ");
                    id = sc.nextLine();
                    ex.sua(id);
                    break;
                }
                case 6:{
                    String id;
                    System.out.println("nhap id= ");
                    id = sc.nextLine();
                    ex.xoa(id);
                    break;
                }
                case 7:{
                    ex.sort();
                    break;
                }
                case 8:{
                    String id, name;
                    System.out.println("nhap vao id: ");
                    id = sc.nextLine();
                    System.out.println("nhap vao ten: ");
                    name = sc.nextLine();
                    ex.timKiem(id, name);
                    break;
                }
                case 9:{
                    ex.xuatAllLOAISACH(); break;
                }
                case 10:{
                    
                    ex.xuatAllNXB(); break;
                }
                default: System.out.println("Khong dung chuc nang. Nhap lai lua chon.");
            }
        } while(lc != 0);
    }
    
    public boolean nhapNXB(){
        NXB n = new NXB();
        System.out.println("Nhap ma: ");
        n.setID(sc.nextLine());
        if(isNXBExist(n.getID())) return false;
        System.out.println("Nhap ten NXB: ");
        n.setName(sc.nextLine());
        System.out.println("Address: ");
        n.setAddr(sc.nextLine());
        System.out.println("Phone: ");
        n.setPhone(sc.nextLine());
        nxb.add(n);
        try {
                ghi(nxb,"NXB.DAT");
        } catch (ClassNotFoundException ex) {
            System.out.println("got exception in write NXB file.");
        }
        System.out.println("====================================");
        return true;
    } 
    
    public boolean nhapSach(){
        System.out.println("Nhap ma: ");
        Sach s = new Sach();
        s.setID(sc.nextLine());
        if(isSachExist(s.getID())) return false;
        System.out.println("Nhap ten sach: ");
        s.setName(sc.nextLine());
        System.out.println("nhap gia: ");
        s.setGia(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap so luong: ");
        s.setSoLuong(Integer.parseInt(sc.nextLine()));
 
        while(true){
            boolean b = false;
            System.out.println("Nhap ma Loai sach: ");
            String id = sc.nextLine();
            for(LoaiSach l: loaiSach)
                if(l.getID().compareTo(id) == 0) {
                    s.setLoaiSach(loaiSach.get(loaiSach.indexOf(l)));
                    b = true;
                    break;
                }
            if(b) break;
            else System.out.println("Nhap lai ma loai sach");
        }
        
        while(true){
            boolean b = false;
            System.out.println("Nhap ma NXB: ");
            String id = sc.nextLine();
            for(NXB l: nxb)
                if(l.getID().compareTo(id) == 0) {
                    s.setNhaXb(nxb.get(nxb.indexOf(l)));
                    b = true;
                    break;
                }
            if(b) break;
            else System.out.println("Nhap lai ma loai sach");
        }
        sach.add(s);
        try {
            ghi(sach,"SACH.DAT");
        } catch (ClassNotFoundException ex) {
            System.out.println("got an exception in write SACH.DAT file.");
        }
        System.out.println("====================================");
        return true;
    }
    
    public boolean nhapLoaiSach(){
        System.out.println("Nhap ma Loai sach: ");
        LoaiSach s = new LoaiSach();
        s.setID(sc.nextLine());
        if(isLoaiSachExist(s.getID())) return false;
        System.out.println("Ten sach: ");
        s.setName(sc.nextLine());
        loaiSach.add(s);
        try {
            ghi(loaiSach,"LOAISACH.DAT");
        } catch (ClassNotFoundException ex) {
            System.out.println("got an exception in write to file LOAISACH.DAT.");
        }
        System.out.println("====================================");
        return true;
    }
    
    public boolean isSachExist(String id){
        for(Sach s: sach){
            if(s.getID().compareTo(id) == 0) return true;
        }
        return false;
    }
    
    public boolean isLoaiSachExist(String id){
        for(LoaiSach l: loaiSach)
            if(l.getID().compareTo(id) == 0) return true;
        return false;
    }
    
    public boolean isNXBExist(String id){
        for(NXB n: nxb){
            if(n.getID().compareTo(id) == 0) return true;
        }
        return false;
    }
    
    public void xuatAll(){
        int count = 0;
        for(Sach s: sach){
            System.out.println(++count+". "+s.toString());
        }
        System.out.println("====================================");
    }
    
    public void xuatAllNXB(){
        int count = 0;
        for(NXB s: nxb){
            System.out.println(++count+". "+s.toString());
        }
        System.out.println("====================================");
    }
    
    public void xuatAllLOAISACH(){
        int count = 0;
        for(LoaiSach s: loaiSach){
            System.out.println(++count+". "+s.toString());
        }
        System.out.println("====================================");
    }
    
    public void sort(){
        Collections.sort(sach, (Sach t, Sach t1) -> {
            if(t.getSoLuong() < t1.getSoLuong() ) return 1;
            else if(t.getSoLuong() == t1.getSoLuong()) return 0;
            return -1;
        });
        System.out.println("====================================");
    }
    
    public void sua(String id){
        for(int i = 0; i < sach.size();i++ ){
            if(sach.get(i).getID().compareTo(id) == 0){
                Sach s = sach.get(i);
                System.out.println("Nhap gia moi: ");
                s.setGia(Double.parseDouble(sc.nextLine()));
                sach.set(i, s);
            }
        }
        System.out.println("====================================");
    }
    
    public void xoa(String id){
        for (int i = 0; i < sach.size(); i++) {
            if(sach.get(i).getID().compareTo(id) == 0){
                sach.remove(i);
            }
        }
        System.out.println("====================================");
    }
    
    public void timKiem(String id, String name){
        int i = 0;
        for(Sach s: sach){
            if(s.getName().toLowerCase().matches(".*"+name+".*") 
                    || s.getID().toLowerCase().matches(".*"+id+".*")){
                System.out.println(i+", "+s.toString());
            }
        }
        System.out.println("====================================");
    }
    
    public List doc(String filename) throws IOException, ClassNotFoundException{
        List list = null;
        try(FileInputStream fis = new FileInputStream(filename)){
            ObjectInputStream oos = new ObjectInputStream(fis);
            list = (List) oos.readObject();
     //       oos.readObject();
        } catch(IOException e){
            System.out.println("got an exception in readfile.");
        }
        return list;
    }
    
    public void ghi(List list, String filename) throws ClassNotFoundException{
        try(FileOutputStream fos = new FileOutputStream(filename)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch(IOException e){
            System.out.println("got an exception in readfile.");
        }
        System.out.println("====================================");
    }

}
