/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.io.Serializable;

/**
 *
 * @author Than
 */
public class BanDoc implements Serializable{
    private String name, addr, phone;
    private int ID;
    static int id = 10000;

    public BanDoc() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "BanDoc{" + "name=" + name + ", addr=" + addr + ", phone=" + phone + ", ID=" + ID + '}';
    }
    
}
