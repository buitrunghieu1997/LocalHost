/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth3;

import java.io.Serializable;

/**
 *
 * @author Than
 */
public class NXB implements Serializable{
    private String ID, name, phone, addr;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public NXB() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NXB{" + "ID=" + ID + ", name=" + name + ", phone=" + phone + ", addr=" + addr + '}';
    }
    
}
