/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author Than
 */
public class QLDA {
    private DuAn duAn;
    private NV nhanVien;
    private int soNgay;
    private String viTri;


    @Override
    public String toString() {
        return "QLDA{" + "Ma nhanVien= " + nhanVien.getID() + ", ten NV= "+nhanVien.getName() 
                +  ", Ma duAn= " + duAn.getID() + ", ten Du An = "+duAn.getName()+
                ", soNgay tham gia = " + soNgay + ", viTri= " + viTri + '}';
    }

    public DuAn getDuAn() {
        return duAn;
    }

    public void setDuAn(DuAn duAn) {
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
    
    
}
