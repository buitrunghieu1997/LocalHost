/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author Than
 */
public class XepLop {
    private int kip;
    private Lop lop;
    private PhongHoc phong;

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public PhongHoc getPhong() {
        return phong;
    }

    public void setPhong(PhongHoc phong) {
        this.phong = phong;
    }

    @Override
    public String toString() {
        return "XepLop{" +  "Ma lop= " + lop.getID() + ", ten lop= "+lop.getName()
                + ", Ma phong= " + phong.getID() + ", ten Phong = "+phong.getName()
                +", kip=" + kip + '}';
    }
    
    
}
