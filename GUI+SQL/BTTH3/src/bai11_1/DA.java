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
public class DA {
    private String name, kieu;
    private int ID;
    private double kinhPhi;
    static int id = 10000;
    public DA(){
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

    public double getKinhPhi() {
        return kinhPhi;
    }

    public void setKinhPhi(double kinhPhi) {
        this.kinhPhi = kinhPhi;
    }

    @Override
    public String toString() {
        return "DA{" + "name=" + name + ", kieu=" + kieu + ", ID=" + ID + ", kinhPhi=" + kinhPhi + '}';
    }
    
}
