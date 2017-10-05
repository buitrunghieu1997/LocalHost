/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11_1;

/**
 *
 * @author Than
 */
public class BPC {
    private DA duAn;
    private NV nhanVien;
    private int soNgay;
    private String viTri;
    
    public BPC(){
    }

    public DA getDuAn() {
        return duAn;
    }

    public void setDuAn(DA duAn) {
        this.duAn = duAn;
    }

    public NV getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NV nhanVien) {
        this.nhanVien = nhanVien;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "BPC{" + "Ma nhanVien = " + nhanVien.getID() +", ten NV= "+ nhanVien.getName()
                + ",Ma duAn= " + duAn.getID() + ", ten DA= "+duAn.getName()  
                + ", soNgay= " + soNgay + ", viTri= " + viTri + '}';
    }
    
}
