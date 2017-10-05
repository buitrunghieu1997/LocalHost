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
public class Sach implements Serializable{
    private int ID, namXB, sluong;
    private String name, tg, cnganh;
    static int id = 10000;

    public Sach() {
        ID = id++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getCnganh() {
        return cnganh;
    }

    public void setCnganh(String cnganh) {
        this.cnganh = cnganh;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Sach.id = id;
    }

    @Override
    public String toString() {
        return "Sach{" + "ID=" + ID + ", namXB=" + namXB + ", sluong=" + sluong + ", name=" + name + ", tg=" + tg + ", cnganh=" + cnganh + '}';
    }

}
