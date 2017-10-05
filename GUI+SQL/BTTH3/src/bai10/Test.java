/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Than
 */
public class Test {
    private ArrayList <PhongHoc> phong;
    private ArrayList <ThietBi> thietBi;
    private ArrayList<QLTB> list;
    static Scanner sc = new Scanner(System.in);
    
    public Test(){
        phong = new ArrayList();
        thietBi = new ArrayList();
        list = new ArrayList<>();
        this.setList();
        this.setPhong();
        this.setThietBi();
    }

    public ArrayList<PhongHoc> getPhong() {
        return phong;
    }

    public void setPhong() {
        this.phong = (ArrayList<PhongHoc>) docFile("PHONGHOC.DAT");
    }

    public ArrayList<ThietBi> getThietBi() {
        return thietBi;
    }

    public void setThietBi() {
        this.thietBi = (ArrayList<ThietBi>) docFile("THIETBI.DAT");
    }

    public ArrayList<QLTB> getList() {
        return list;
    }

    public void setList() {
        this.list = (ArrayList<QLTB>) docFile("QLTB.DAT");
    }
    
    public static void main(String[] args) {
        Test ex = new Test();
        
        int lc = 0;
        
        do{
            System.out.println("=========MENU=======\n1.Nhap thiet bi.\n2.Nhap phong hoc."
                    + "\n3.Nhap QLTB.\n4. xuat Thiet bi.\n5.Xuat phong hoc.\n6.Xuat QLTB."
                    + "\n7.sap xep theo ten phong hoc.\n8.sap xep theo so luong moi loai."
                    + "\n9.tm kiem theo ten phong va ten thiet bi.\n0.Thoat."
                    + "\nBan chon ? ");
            try{
                lc = Integer.parseInt(sc.nextLine());
            } catch(Exception e){
                System.out.println("got an exception.");
            }
            switch(lc){
                case 0: break;
                case 1:{
                    ex.nhapThietBi();
                    break;
                }
                case 2:{
                    ex.nhapPhongHoc();
                    break;
                }
                case 3:{
                    ex.nhapQL();
                    break;
                }
                case 4:{
                    ex.xuatTB();
                    break;
                }
                case 5:{
                    ex.xuatPH();
                    break;
                }
                case 6:{
                    ex.xuatQLTB();
                    break;
                }
                case 7:{
                    ex.sortByName();
                    break;
                }
                case 8:{
                    ex.sortBySL();
                    break;
                }
                case 9:{
                    ex.timKiem();
                    break;
                }
                default: System.out.println("nhap sai chuc nang.");
            }
        } while(lc != 0);
    }
    
    public boolean nhapThietBi(){
        ThietBi t = new ThietBi();
        System.out.println("Ten: ");
        t.setName(sc.nextLine());
        System.out.println("Nhap xuat xu: ");
        t.setXuatxu(sc.nextLine());
        System.out.println("nam san xuat: ");
        t.setNam(Integer.parseInt(sc.nextLine()));
        
        thietBi.add(t);
        this.ghiFile(thietBi, "THIETBI.DAT");
        return true;
     }
    
    public boolean nhapPhongHoc(){
        PhongHoc p = new PhongHoc();
        while(true){
            System.out.println("Nhap ten phong hoc: ");
            String name = sc.nextLine();
            if(name.matches("^\\d{3}-[Aa][32]{1}$")){
                p.setName(name);
                break;
            }
            else System.out.println("nhap sai dinh dang ten phong hoc.");
        }
        System.out.println("nhap so ghe: ");
        p.setSoGhe(Integer.parseInt(sc.nextLine()));
        phong.add(p);
        this.ghiFile(phong, "PHONGHOC.DAT");
        return true;
    }
    
    public boolean tonTai(int id, int maTB ){
        for(QLTB q: list){
            if(q.getPhongHoc().getID() == id && q.getThietBi().getID() == maTB) return true;
        }
        return false;
    }
    
    public boolean nhapQLTB(){
        QLTB q = new QLTB();
        System.out.println("Nhap ma Phong Hoc: ");
        int id;
        id = Integer.parseInt(sc.nextLine());
        boolean bb = false;
        for(PhongHoc p: phong){
            if(p.getID() == id) {
                q.setPhongHoc(p);
                bb = true;
            }
        }
        while(true){
            int lc;
            System.out.println("Nhap 0 de thoat. # 0 de tiep tuc.");
            if((lc = Integer.parseInt(sc.nextLine())) == 0 ) break;
                QLTB qq = new QLTB();
                qq.setPhongHoc(q.getPhongHoc());
            if(!bb) {
                System.out.println("Nhap sai ma Phong hoc.");
                return false;
            }
            bb = false;
            System.out.println("Nhap ma thiet bi:  ");
            int idd = Integer.parseInt(sc.nextLine());           
            if(tonTai(id, idd)) return false;
            
            for(ThietBi t: thietBi){
                if(t.getID() ==idd ){
                    qq.setThietBi(t);
                    bb = true;
                }
            }
            
            if(!bb) {
                System.out.println("Nhap sai ma thiet bi."); 
                return false;
            }
           System.out.println("Nhap vao so luong muon : ");
           qq.setSoLuong(Integer.parseInt(sc.nextLine()));
           System.out.println("Nhap tinh trang muon : ");
           qq.setTrangThai(sc.nextLine());
           list.add(qq);
           this.ghiFile(list, "QLTB.DAT");
        }                             
        return true;
    }
    
    /*
    ví dụ trong danh sách phòng có :
    mã      tên phòng.
    
    10000   402-a2
    10001   207-a3
    10002   302-a2
    trong danh sách thiết bị có:
    mã       tên thiết bị
    10000   loa
    10001   míc
    10002   máy chiếu
    10003   đài
    
    nếu nhập mã phòng từ 10000 tới 10002 thì ok, ngoài ra sẽ sai=> thoát
    tương tự cho nhập mã thiết bị.
    với mỗi phòng, số thiết bị đc mượn là ko giới hạn nhưng mỗi thiết bị 
    chỉ đc mượn một lần duy nhất. nếu nhập hai lần một mã thiết bị=> trùng=> thoát.
    nhập mã một lần, nhập các thiết bị cần mượn, sau đó chọn mượn tiếp hoặc thôi => đỡ phải nhập nhiều lần
    mã phòng
    .
    */
    
    public boolean nhapQL()
    {
        int id;// mã phòng học
        QLTB q = new QLTB(); // tạo một đối tượng quản lí mới
        boolean bb = false; // biến đánh dấu để đánh dấu khi nào nhập sai thì thoát
        System.out.println("nhap ID = ");
        id = Integer.parseInt(sc.nextLine()); // nhập vào mã phòng học
        for(PhongHoc p: phong){
            if(p.getID() ==id){
                q.setPhongHoc(p); // nếu mã vừa nhập trùng mã một phòng nào đó trong danh sách
                bb = true; // đánh dấu  đã thêm vào list, không thoát
            }
        }
        if(!bb) { // nếu bb giữ nguyên giá trị ban đầu thì thoát vì mã nhập vào ko khớp với thằng nào hết
            System.out.println("nhap sai ma.");
            return false;
        }
        bb = false; // cài lại biến đánh dấu
        while(true){ // với mỗi phòng học sẽ nhập các thiết bị mà phòng đó muốn mượn
            int lc;
            QLTB qq = new QLTB(); //  tạo lại một đối tượng quản lí mới
            qq.setPhongHoc(q.getPhongHoc()); // thiết lập thông tin phòng học cho nó
            System.out.println("Nhap 0 de thoat. #0 de tiep tuc.");
            lc = Integer.parseInt(sc.nextLine());
            if(lc == 0) break; // nếu nhập 0 thì thoát việc nhập
            
            int idd  = 0;
            System.out.println("Nhap ma thiet bi: ");
            idd = Integer.parseInt(sc.nextLine()); // nhập mã thiết bị
            if(tonTai(id, idd)){ // nếu mã phòng cùng với mã thiết bị đã tồn tại thì thoát vì mỗi thiết bị
                System.out.println("ma thiet bi da ton tai."); // chỉ đc mượn một lần
                return false;
            }
            
            for(ThietBi t: thietBi){ // nếu mã thiết bị mới == chưa có trong danh sách
                if(t.getID() == idd){
                    qq.setThietBi(t); // tìm thấy mã thiết bị tron danh sách thì thêm nó vào đối tượng qq
                    bb = true; // gán biến đánh dấu cấm thoát
                }
            }
            if(!bb) { // nếu qq = false thì ko có thiết bị nào có mã như đã nhập=> thoát
                System.out.println("khong dung ma thiet bi.");
                return false;
            }
            // nếu ko thoát thì nhập tiếp thông tin số lượng mượn, tình trạng lúc mượn.
            System.out.println("nhap so luong muon: ");
            qq.setSoLuong(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap trang thai muon: ");
            qq.setTrangThai(sc.nextLine());
            list.add(qq);
            this.ghiFile(list, "QLTB.DAT");
        }
        return true;
    }
    
    public void xuatTB(){
        for(ThietBi t: thietBi){
            System.out.println(t.toString());
        }
        System.out.println("=================================");
    }
    
    public void xuatPH(){
        for(PhongHoc t: phong){
            System.out.println(t.toString());
        }
        System.out.println("=================================");
    }
    
    public void xuatQLTB(){
        for(QLTB t: list){
            System.out.println(t.toString());
        }
        System.out.println("=================================");
    }
    
    public void sortByName(){
        Collections.sort(list, new Comparator<QLTB>() {
            @Override
            public int compare(QLTB t, QLTB t1) {
                if(t.getPhongHoc().getName().compareTo(t1.getPhongHoc().getName()) > 0) return 1;
                else if(t.getPhongHoc().getName().compareTo(t1.getPhongHoc().getName()) == 0) return 0;
                return -1;
            }
        });
        System.out.println("=================================");
    }
    
    public void sortBySL(){
        Collections.sort(list, new Comparator<QLTB>() {
            @Override
            public int compare(QLTB t, QLTB t1) {
                if(t.getSoLuong() < t1.getSoLuong() ) return 1;
                else if(t.getSoLuong() == t1.getSoLuong() ) return 0;
                return -1;
            }
        });
        System.out.println("=================================");
    }
    
    public void timKiem(){
        String name;System.out.println("Nhap ten thiet bi: ");
        name  =sc.nextLine();
        for(QLTB q: list){
            if(q.getThietBi().getName().toLowerCase().matches(".*"+name+".*")){
                System.out.println(q.toString());
            }
        }
        System.out.println("=================================");
    }
    
    public void ghiFile(List list, String filename ){
        try(FileOutputStream fos = new FileOutputStream(new File(filename))){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        }catch(Exception e){
            System.out.println("got an exception.");
        }
    }
    
    public List docFile(String filename){
        ArrayList list = new ArrayList();
        try(FileInputStream fis = new FileInputStream(new File(filename))){
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) (List) ois.readObject();
        }catch(Exception e){
            System.out.println("got an exception.");
        }
        return list;
    }
}
