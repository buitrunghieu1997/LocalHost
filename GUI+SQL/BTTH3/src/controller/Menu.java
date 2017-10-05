/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AnhTTV
 */
public class Menu {
    public static void main(String[] args) throws IOException  {
    System.out.println("*****QUAN LY SACH*****");
    DSSach list = new DSSach();    
    Scanner sc=new Scanner(System.in);
    while(true) {
        System.out.println("=================================");
        System.out.println("1. Them Loai sach");
        System.out.println("2. Them nha xuat ban");
        System.out.println("3. Them sach");
        System.out.println("4. Sua thong tin sach");
        System.out.println("5. Xoa sach");
        System.out.println("6. In danh sách sach");
        System.out.println("0. Thoát");
        System.out.println("=================================");
        System.out.print("\t Moi chon (1..6 hoac 0): ");
        int c = sc.nextInt();
        switch(c) {
            case 1:
                while(true){
                    if(!list.themLoaiSach())
                        System.out.println("\n Da co ma loai nhap lai!!");
                    else
                        break;
                } 
                break;
            case 2:
                while(true){
                    if(!list.themNhaxb())
                        System.out.println("\n Da co ma nha xb nay nhap lai!!");
                    else
                        break;
                } 
                break;    
            case 3:
                while(true){
                    if(!list.themSach())
                        System.out.println("\n Khong ton tai sach nay!!");
                    else
                        break;
                } 
                break;
            case 4:
                while(true){
                    if(!list.suaSach())
                        System.out.println("\n Khong ton tai sach nay!!");
                    else
                        break;
                } 
                break;
            case 5:        
                while(true){
                    if(!list.xoaSach())
                        System.out.println("\n Khong ton tai ma sach nay!!");
                    else
                        break;
                } 
                break;        
       
        case 6:
                list.inDanhSach();break;
        case 0:
            System.out.println("\n Bye!!!!");
            System.exit(0);
        }
        }
}
}
