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
public class PhongHoc {
    private String name, kieu;
    private int ID, soGhe;
    static int id = 10000;
    
    public PhongHoc(){
        ID = id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
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

    @Override
    public String toString() {
        return "PhongHoc{" + "ID= " + ID +", name= " + name + ", kieu= " + kieu  + ", soGhe= " + soGhe + '}';
    }
    
}
