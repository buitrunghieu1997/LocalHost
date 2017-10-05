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
public class PhongHoc implements Serializable, GiaoTiep{
    private int ID, soGhe;
    static int id = 10000;
    private String name;
    
    public PhongHoc(){
        ID = id++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhongHoc{" + "ID= " + ID + ", soGhe= " + soGhe + ", name= " + name + '}';
    }

    @Override
    public Object[] toObject() {
        return new Object[]{
            this.ID, this.name, this.soGhe
        };
    }
    
    
}
