/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.io.Serializable;

/**
 *
 * @author Than
 */
public class QLMS implements Serializable{
    private int soLuong;
    private String trangThai;
    private Sach sach;
    private BanDoc banDoc;

    public QLMS() {
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    @Override
    public String toString() {
        return "QLMS{"+ ", IDbanDoc= " +  banDoc.getID()+", ten ban doc = "+banDoc.getName() + 
                ", IDsach= " + sach.getID() + ", ten sach= " +sach.getName()
                 
                +", soLuong=" + soLuong + ", trangThai=" + trangThai + '}';
    }
    
}
