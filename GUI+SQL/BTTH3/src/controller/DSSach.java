/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import model.LoaiSach;
import model.NhaXB;
import model.Sach;

/**
 *
 * @author AnhTTV
 */
public class DSSach {
    private ArrayList<Sach> listsach;
    private ArrayList<LoaiSach> listlsach;
    private ArrayList<NhaXB> nhaxb;
    private IOFile file = new IOFile();
    Scanner in=new Scanner(System.in);
    
    public DSSach(){
        listsach = new ArrayList<>();
        listlsach = new ArrayList<>(); 
        nhaxb = new ArrayList<>(); 
        setListsach();
        setListlsach();
        setNhaxb();
    }

    public ArrayList<Sach> getListsach() {
        return listsach;
    }

    public void setListsach() {
        try {
            file.inFile(listsach, "src/controller/sach.dat");
        } catch (IOException ex) {
            System.out.println("");
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi");
        }
    }

    public ArrayList<LoaiSach> getListlsach() {
        return listlsach;
    }

    public void setListlsach()  {
        try {
            file.inFile(listlsach, "src/controller/loaisach.dat");
        } catch (IOException ex) {
            System.out.println("");
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi");
        }
    }
    public ArrayList<NhaXB> getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb()  {
        try {
            file.inFile(nhaxb, "src/controller/nhaxb.dat");
        } catch (IOException ex) {
            System.out.println("");
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi");
        }
    }
    private boolean checkMaLoai(String s){
        for(LoaiSach ls : listlsach){
            if(ls.getMaloai().compareTo(s)== 0){
                return true;
            }
        }
        return false;
    }    
    private boolean checkManxb(String s){
        for(NhaXB nha : nhaxb){
            if(nha.getMaNXB().compareTo(s)== 0){
                return true;
            }
        }
        return false;
    }
    private String getMaLoai(){
        String maloai="";
        for(LoaiSach ls : listlsach)
            maloai+=ls.getMaloai()+" ";
        return maloai;
    }    
    private String getManxb(){
        String manxb="";
        for(NhaXB nn : nhaxb)
            manxb+=nn.getMaNXB()+" ";
        return manxb;
    }
    public boolean themLoaiSach() { 
        System.out.println("========= Them moi loai sach ==========");
        System.out.print("Ma loai: ");
        String ma = in.nextLine();
        if(checkMaLoai(ma))
            return false;
        System.out.print("Ten loai sach: ");
        String ten = in.nextLine();
        LoaiSach ls=new LoaiSach(ma, ten);
        listlsach.add(ls);        
        try {        
            file.outFile(listlsach, "src/controller/loaisach.dat");
        } catch (IOException ex) {
            System.out.println("Loi");
        }
	return true;                
     }
     public boolean themNhaxb() { 
        System.out.println("========= Them moi nha xuat ban ==========");
        System.out.print("Ma nha xuat ban: ");
        String ma = in.nextLine();
        if(checkManxb(ma))
            return false;
        System.out.print("Ten nha xuat ban: ");
        String ten = in.nextLine();
        System.out.print("Dia chi:");
        String dc = in.nextLine();
        System.out.print("Dien thoai: ");
        String dt = in.nextLine();
        NhaXB xb=new NhaXB(ma, ten, dc, dt);
        nhaxb.add(xb);        
        try {        
            file.outFile(nhaxb, "src/controller/nhaxb.dat");
        } catch (IOException ex) {
            System.out.println("Loi");
        }
	return true;                
     }
     public boolean themSach() { 
        System.out.println("=========== Them moi sach =============");
        System.out.print("Ma sach: ");
        String ma = in.nextLine();
        Sach s=new Sach(ma);
        if(listsach.contains(s))
            return false;        
        System.out.print("Ten sach: ");
        String ten = in.nextLine(); 
        s.setTensach(ten);
        System.out.print("Ten tac gia: ");
        String tentg = in.nextLine(); 
        s.setTacgia(tentg);
        System.out.print("Ma nha XB: ");
        System.out.println("Chi Nhap cac ma loai sau:"+getManxb());
        String maxb = in.nextLine(); 
        NhaXB xx =new NhaXB(maxb);
        for(NhaXB xb:nhaxb)
            if(xb.getMaNXB().equals(maxb)){
                xx.setTenNXB(xb.getTenNXB());
                xx.setDiachiNXB(xb.getDiachiNXB());
                xx.setDienthoai(xb.getDienthoai());
            }
        s.setNxb(xx);
        System.out.print("Don gia: ");         
        double gia = Double.parseDouble(in.nextLine());
        s.setGia(gia);        
        System.out.print("So luong: "); 
        int sl = Integer.parseInt(in.nextLine());
        s.setSoluong(sl);
        System.out.print("Ma loai sach: ");                
        System.out.println("Chi Nhap cac ma loai sau:"+getMaLoai());
        String maloai=in.nextLine(); 
        LoaiSach ll=new LoaiSach(maloai);
        for(LoaiSach ls:listlsach)
            if(ls.getMaloai().equals(maloai))
                ll.setTenloai(ls.getTenloai()); 
        s.setLoaisach(ll);
        listsach.add(s);        
        try {        
            file.outFile(listsach, "src/controller/sach.dat");
        } catch (IOException ex) {
            System.out.println("Loi");
        }
	return true;                
     }
     public boolean suaSach() throws IOException {        
        System.out.print("\n Nhap ma sach can sua: ");
        System.out.print("Ma sach: ");
        String ma = in.nextLine();
        Sach s=new Sach(ma);        
        if(!listsach.contains(s))
            return false; 
	s = listsach.get(listsach.indexOf(s));
        System.out.print("Ten sach: ");
        String ten = in.nextLine();
        s.setTensach(ten);
        System.out.print("Ten tac gia: ");
        String tentg = in.nextLine();
        s.setTacgia(tentg);
        System.out.print("Ma nha XB: ");
        System.out.println("Chi Nhap cac ma loai sau:"+getManxb());
        String maxb = in.nextLine(); 
        NhaXB xx =new NhaXB(maxb);
        for(NhaXB xb:nhaxb)
            if(xb.getMaNXB().equals(maxb)){
                xx.setTenNXB(xb.getTenNXB());
                xx.setDiachiNXB(xb.getDiachiNXB());
                xx.setDienthoai(xb.getDienthoai());
            }
        s.setNxb(xx);                
        System.out.print("Don gia: "); 
        double gia = Double.parseDouble(in.nextLine());
        s.setGia(gia);
        System.out.print("So luong: "); 
        int sl = Integer.parseInt(in.nextLine());
        s.setSoluong(sl);
        System.out.print("Ma loai sach: ");                
        System.out.println("Chi Nhap cac ma loai sau:"+getMaLoai());
        String maloai=in.nextLine(); 
        LoaiSach ll=new LoaiSach(maloai);
        for(LoaiSach ls:listlsach)
            if(ls.getMaloai().equals(maloai))
                ll.setTenloai(ls.getTenloai());                      
        s.setLoaisach(ll);
        file.outFile(listlsach, "src/controller/sach.dat");        
        return true;            
    }
    public boolean xoaSach(){
        Scanner input=new Scanner(System.in);
        System.out.print("\n Nhap ma sach can xoa: ");
        String ma = input.nextLine();
        
        Sach s = new Sach(ma);
	if(!listsach.contains(s))
		return false;
	return listsach.remove(s);
    } 
     public  void inDanhSach(){
        int i=0;        
        System.out.println("==========DANH SACH SACH=========");
        System.out.println("STT Ma sach Ten sach    Ma loai   Ten loai   Tac gia   Ma nha XB Ten nha xb   Don gia So luong ");
        for (Sach s: listsach) 
            System.out.println(" "+(++i)+"  "+s.toString());
        System.out.println("=====================================");
    }
}
