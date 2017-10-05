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
public class Lop {
    private int ID, soSV;
    private String name, fanPage;
    static int id = 100;
    
    public Lop(){
        ID = id++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFanPage() {
        return fanPage;
    }

    public void setFanPage(String fanPage) {
        this.fanPage = fanPage;
    }

    @Override
    public String toString() {
        return "Lop{" + "ID= " + ID + ", soSV= " + soSV + ", name= " + name + ", fanPage= " + fanPage + '}';
    }
    
    
}
