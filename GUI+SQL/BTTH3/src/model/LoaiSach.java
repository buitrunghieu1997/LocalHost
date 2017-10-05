/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author vip
 */
public class LoaiSach implements Serializable{
    private String maloai;
    private String tenloai;

    public LoaiSach(String maloai) {
        this.maloai = maloai;
        this.tenloai = "";  
    }

    public LoaiSach(String maloai, String tenloai) {
        this.maloai = maloai;
        this.tenloai = tenloai;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
    @Override
    public String toString(){
        return maloai+"\t"+tenloai;
    }    
}
