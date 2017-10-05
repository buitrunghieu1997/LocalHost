/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.io.Serializable;

/**
 *
 * @author Than
 */
public class QLTB implements Serializable, GiaoTiep{
    private ThietBi thietBi;
    private PhongHoc phongHoc;
    private int soLuong;
    private String trangThai;
    
    public QLTB(){
        
    }

    public ThietBi getThietBi() {
        return thietBi;
    }

    public void setThietBi(ThietBi thietBi) {
        this.thietBi = thietBi;
    }

    public PhongHoc getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(PhongHoc phongHoc) {
        this.phongHoc = phongHoc;
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

    @Override
    public String toString() {
        return "QLTB{" + "ID thietBi= " + thietBi.getID()+ ", Ten TB= "+thietBi.getName()
                + ", ID phongHoc= " + phongHoc.getID() + ", Ten Phong hoc= " +phongHoc.getName()
                + ", soLuong= " + soLuong + ", trangThai= " + trangThai + '}';
    }

    @Override
    public Object[] toObject() {
        return new Object[]{
            this.getPhongHoc().getID(), this.getPhongHoc().getName(),
            this.getThietBi().getID(), this.getThietBi().getName(),
                this.getSoLuong(), this.getTrangThai()
        };
    }
    
}
