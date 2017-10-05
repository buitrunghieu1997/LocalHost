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
public class NV {
    private String name, addr, cMon;
    private int ID;
    static int id = 10000;
    
    public NV(){
        ID = id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getcMon() {
        return cMon;
    }

    public void setcMon(String cMon) {
        this.cMon = cMon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "NV{" + "name=" + name + ", addr=" + addr + ", cMon=" + cMon + ", ID=" + ID + '}';
    }
    
}
