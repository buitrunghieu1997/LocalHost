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
public class NV {
    private int ID;
    private String name, addr, cmon;
    static int id = 10000;
    public NV(){
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCmon() {
        return cmon;
    }

    public void setCmon(String cmon) {
        this.cmon = cmon;
    }

    @Override
    public String toString() {
        return "NV{" + "ID=" + ID + ", name=" + name + ", addr=" + addr + ", cmon=" + cmon + '}';
    }
    
}
