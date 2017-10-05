/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author AnhTTV
 */
public class NhaXB implements Serializable{
    private String maNXB;
    private String tenNXB;
    private String diachiNXB;
    private String dienthoai;
    public NhaXB(String maNXB){
        this.maNXB = maNXB;
        tenNXB="";
        diachiNXB="";
        dienthoai="";
    }

    public NhaXB(String maNXB, String tenNXB, String diachiNXB, String dienthoai) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
        this.diachiNXB = diachiNXB;
        this.dienthoai = dienthoai;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public String getDiachiNXB() {
        return diachiNXB;
    }

    public void setDiachiNXB(String diachiNXB) {
        this.diachiNXB = diachiNXB;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }
    @Override
    public String toString(){
        return maNXB+ "\t"+ tenNXB+"\t"+diachiNXB+"\t"+dienthoai;
    }
}
