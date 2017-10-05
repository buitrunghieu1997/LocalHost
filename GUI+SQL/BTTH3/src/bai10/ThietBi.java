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
public class ThietBi implements Serializable, GiaoTiep{
    private int ID, nam;
    private String name,  xuatxu;
    static int id = 10000;
    
    public ThietBi(){
        ID = id++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    @Override
    public String toString() {
        return "ThietBi{" + "ID= " + ID + ", nam= " + nam + ", name= " + name + ", xuatxu= " + xuatxu + '}';
    }

    @Override
    public Object[] toObject() {
        return new Object[]{
            this.getID(), this.getName(), this.getXuatxu(), this.getNam()
        };
    }
    
    
}
