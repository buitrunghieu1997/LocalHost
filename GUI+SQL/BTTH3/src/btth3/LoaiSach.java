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
public class LoaiSach implements Serializable{
    private String ID,name;

    public LoaiSach() {
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
        return "LoaiSach{" + "ID=" + ID + ", name=" + name + '}';
    }
    
}
