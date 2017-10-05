
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12_1;

/**
 *
 * @author Than
 */
public class XepLop {
    private Lop lop;
    private PhongHoc phong;
    private int kip;

    public XepLop() {
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

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }

    @Override
    public String toString() {
        return "XepLop{" + "Ma lop= " + lop.getID() + ", ten Lop = "+ lop.getName()
                + ",Ma phong= " + phong.getID() + ", ten Phong= "+ phong.getName()
                + ", kip= " + kip + '}';
    }
    
    
}
