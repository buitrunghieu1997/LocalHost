/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Than
 */
public class Test {
    private ArrayList<Sach> sach;
    private ArrayList<BanDoc> banDoc;
    private ArrayList<QLMS> quanLy;
    static Scanner sc = new Scanner(System.in);

    public Test() {
        sach = new ArrayList();
        banDoc=  new ArrayList();
        quanLy = new ArrayList();
    }

    public ArrayList<Sach> getSach() {
        return sach;
    }

    public void setSach(ArrayList<Sach> sach) {
        this.sach = sach;
    }

    public ArrayList<BanDoc> getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(ArrayList<BanDoc> banDoc) {
        this.banDoc = banDoc;
    }

    public ArrayList<QLMS> getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(ArrayList<QLMS> quanLy) {
        this.quanLy = quanLy;
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
            System.out.println("============MENU=============\n1.Nhap sach.\n2.nhap ban doc."
                    + "\n3.nhap qlms.\n4.xuat qlms.\n5.sua.\n6.xoa.\n7.sap xep.\n8.tim kiem."
                    + "\n0.Thoat.\nBan chon ? ");
            try{
                lc = Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println(e.getCause());
            }
            switch(lc){
                case 0: System.out.println("bye!"); break;
                case 1:{
                    ex.nhapSach();
                    break;
                }
                case 2:{
                    ex.nhapBAnDoc();
                    break;
                }
                case 3:{
                    ex.NhapQLMS();
                    break;
                }
                case 4:{
                    ex.xuatAll();
                    break;
                }
                case 5:{
                    int id;
                    System.out.println("nhap id can sua: ");
                    id = Integer.parseInt(sc.nextLine());
                    ex.sua(id);
                    break;
                }
                case 6:{
                    int id;
                    System.out.println("nhap id can xoa: ");
                    id = Integer.parseInt(sc.nextLine());
                    ex.xoa(id);
                    break;
                }
                case 7:{
                    ex.sort();
                    break;
                }
                case 8:{
                    int id;
                    String name;
                    System.out.println("nhap id = ");
                    id = Integer.parseInt(sc.nextLine());
                    name = sc.nextLine();
                    ex.timKiem(id, name);
                    break;
                }
                default:System.out.println("nhap sai chuc nang.");
            }
        } while(lc !=0 );
    }
    
    public boolean nhapSach(){
        Sach s = new Sach();
        System.out.println("Ten sach: ");
        s.setName(sc.nextLine());
        System.out.println("Ten TG: ");
        s.setTg(sc.nextLine());
        System.out.println("Chuyen nganh: ");
        s.setCnganh(sc.nextLine());
        System.out.println("nam xb: ");
        s.setNamXB(Integer.parseInt(sc.nextLine()));
        System.out.println("So luong: ");
        s.setSluong(Integer.parseInt(sc.nextLine()));
        sach.add(s);
        return true;
    }
    
    public boolean isFull(int id){
        int count = 0;
        for(QLMS q: quanLy){
            if(q.getBanDoc().getID() == id) count++;
        }
        if(count>= 5) return true;
        return false;
    }
    
    public boolean xuatAll(){
        int i = 0;
        for(QLMS q: quanLy)
            System.out.println(++i +", "+q.toString());
            
        return true;
    }
        
    public boolean nhapBAnDoc(){
        BanDoc b = new BanDoc();
        System.out.println("Ten: ");
        b.setName(sc.nextLine());
        System.out.println("DC: ");
        b.setAddr(sc.nextLine());
        while(true){
            System.out.println("Phone: ");
            b.setPhone(sc.nextLine());
            if(b.getPhone().matches("^\\d{10}$") || b.getPhone().matches("^\\d{11}$")) break;
            else System.out.println("sai dinh dang.");
        }
        banDoc.add(b);
        return true;
    }
    
    public boolean NhapQLMS(){
        QLMS q = new QLMS();
        int id;
        System.out.println("Nhap ma ban doc: ");
        id = Integer.parseInt(sc.nextLine());
        while(true){
            if(isFull(id)){
                System.out.println("ban doc da muon qua so luong quy dinh.");
                return false;
            }
            while(true){
                boolean bb= false;
                for(BanDoc b: banDoc){
                    if(b.getID() == id){
                        q.setBanDoc(b);
                         bb= true;                     
                    }
                }
                if(bb) break;
                else System.out.println("nhap lai.");
            }

            while(true){
                boolean bb  = false;
                System.out.println("Nhap ma sach: ");
                int sID = Integer.parseInt(sc.nextLine());
                for(Sach s: sach){
                    if(s.getID() == sID) {
                        q.setSach(s);
                        bb = true;
                    }
                }
                if(bb) break;
                else System.out.println("nhap sai ma, nhap lai.");
            }

            System.out.println("Nhap so luong muon: ");
            while(true){
                q.setSoLuong(Integer.parseInt(sc.nextLine()));
                if(q.getSoLuong() > 0 && q.getSoLuong() <= 3)
                    break;
                else System.out.println("nhap qua so luong quy dinh.");
            }
            System.out.println("nhap trang thai sach: ");
            q.setTrangThai(sc.nextLine());
            quanLy.add(q);
            System.out.println("Nhap 1 de tiep tuc muon them sach, nhap 0 de thoat.");
            int chon;
            chon = Integer.parseInt(sc.nextLine());
            if(chon == 0) break;
        }
        return true;
    }
    
    public void sua(int id){
        for(int i = 0; i< quanLy.size(); i++)
            if(quanLy.get(i).getBanDoc().getID() == id){
                QLMS q = quanLy.get(i);
                System.out.println("nhap so luong moi: ");
                q.setSoLuong(Integer.parseInt(sc.nextLine()));
                quanLy.set(i, q);
            }
    }
    
    public void xoa(int id){
        for(int i = 0; i< quanLy.size(); i++)
            if(quanLy.get(i).getBanDoc().getID() == id)
            {
                quanLy.remove(i);
                i--;
            }
    }
    
    public void sort(){
        Collections.sort(quanLy, new Comparator<QLMS>() {
            @Override
            public int compare(QLMS t, QLMS t1) {
                if(t.getSoLuong() < t1.getSoLuong()) return 1;
                else if(t.getSoLuong() == t1.getSoLuong()) return 0;
                return -1;
            }
        });
    }
    
    public void timKiem(int id, String name){
        for(QLMS q: quanLy){
            String s1 = "";
            s1+= id;
            String s2 = "";
            s2+= q.getBanDoc().getID();
            
            if(s2.matches(".*"+s1+".*") || q.getBanDoc().getName().toLowerCase().matches(".*"+name+".*")){
                System.out.println(q.toString());
            }
        }
    }
        
    public void ghi(List list, String filename ) throws IOException{ // chua dung toi
        try (FileOutputStream fos = new FileOutputStream(new File(filename))){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List doc(String filename) // chua dung toi
            throws FileNotFoundException, IOException, ClassNotFoundException{
        List list = null;
        try (FileInputStream fis = new FileInputStream(new File(filename))){
            ObjectInputStream oos = new ObjectInputStream(fis);
            list = (List) oos.readObject();
        }
        return list;
    }
        
}
