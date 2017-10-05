/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11_2;

/**
 *
 * @author Than
 */
public class DA {
    private int ID;
    static int id = 10000;
    private String name, kieu;
    private double kinhPhi;
    
    public DA(){
        ID = id++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public double getKinhPhi() {
        return kinhPhi;
    }

    public void setKinhPhi(double kinhPhi) {
        this.kinhPhi = kinhPhi;
    }

    @Override
    public String toString() {
        return "DA{" + "ID=" + ID + ", name=" + name + ", kieu=" + kieu + ", kinhPhi=" + kinhPhi + '}';
    }
    
}
