/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author vip
 */
public class Sach implements Serializable{
    private String masach;
    private String tensach;    
    private String tacgia;
    private double gia;
    private int soluong;
    private LoaiSach loaisach;
    private NhaXB nxb;
    
    public Sach() {
    }
    public Sach(String masach) {
        this.masach = masach;
        this.tensach = "";
        this.tacgia = "";
        this.gia = 0;
        this.soluong = 0;
        this.loaisach = null;
        this.nxb=null;
    }

    public Sach(String masach, String tensach, String tacgia, 
            double gia, int soluong, LoaiSach loaisach,NhaXB nxb) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.gia = gia;
        this.soluong = soluong;
        this.loaisach = loaisach;
        this.nxb=nxb;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
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

    public NhaXB getNxb() {
        return nxb;
    }

    public void setNxb(NhaXB nxb) {
        this.nxb = nxb;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public LoaiSach getLoaisach() {
        return loaisach;
    }

    public void setLoaisach(LoaiSach loaisach) {
        this.loaisach = loaisach;
    }
    public String getMaloai() {
        return loaisach.getMaloai();
    }
    public String getTenloai() {
        return loaisach.getTenloai();
    }
    public String getMaNXB(){
        return nxb.getMaNXB();
    }
    public String getTenNXB(){
        return nxb.getTenNXB();
    }
//    @Override
//    public boolean equals(Object o) {
//	if (this == o)
//		return true;
//	if (o == null)
//		return false;
//	if (getClass() != o.getClass())
//		return false;
//	Sach other = (Sach) o;
//	if (masach == null) {
//		if (other.masach != null)
//			return false;
//	} else if (!masach.equals(other.masach))
//		return false;
//	return true;
//    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        if (!Objects.equals(this.masach, other.masach)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString(){
        return masach+"\t"+tensach+"\t"+getMaloai()+"\t"
                +getTenloai()+"\t"+tacgia+"\t"+getMaNXB()+"\t"+"\t"+gia+"\t"+soluong;
    } 
}
