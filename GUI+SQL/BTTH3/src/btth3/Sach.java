/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth3;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Than
 */
public class Sach implements Serializable{
    private String ID, name, tacgia;
    private double gia;
    private int soLuong;
    private NXB nhaXb;
    private LoaiSach loaiSach;

    public Sach() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public NXB getNhaXb() {
        return nhaXb;
    }

    public void setNhaXb(NXB nhaXb) {
        this.nhaXb = nhaXb;
    }

    public LoaiSach getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(LoaiSach loaiSach) {
        this.loaiSach = loaiSach;
    }

    @Override
    public String toString() {
        return "Sach{" + "ID= " + ID + ", name= " + name + ", "
                +", Ma Loai = "+this.loaiSach.getID()+",ten Loai= "+this.loaiSach.getName()
                +", ma NXB= "+this.nhaXb.getID()+", ten NXB= "+this.nhaXb.getName()
                + "tacgia= " + tacgia + ", gia= " + gia + ", soLuong= " + soLuong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sach other = (Sach) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }
    
    
}
