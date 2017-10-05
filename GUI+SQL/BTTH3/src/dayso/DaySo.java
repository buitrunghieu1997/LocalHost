/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author vip
 */
public class DaySo {
   public int[] doc(){
       int[] t;
       String str=null; 
       Scanner in = null;                
       try {   
          FileInputStream f = new FileInputStream("src/dayso/input.txt");
          in = new Scanner(f,"UTF-8");          
          str=in.nextLine(); 
       } catch (FileNotFoundException ex) {
           System.out.println("khong thay file");
       }                            
       String[] temp = null;
       temp = str.split("\\s+");
       t=new int[temp.length];
       for(int i=0;i<temp.length;i++)
           t[i]=Integer.parseInt(temp[i]);       
       return t;
   }
   public void viet(String st) {
       FileOutputStream f;
       PrintWriter out;
       try {
           f = new FileOutputStream("src/dayso/output.txt");
           out = new PrintWriter(f);
           out.println(st);
           if(out!=null)
              out.close();
       } catch (FileNotFoundException ex) {
           System.out.println("Khong thay file");
       }                            
    }
    public int tong(int[]a){
        int t=0;
        for(int i=0;i<a.length;i++)
            t+=a[i];
        return t;
    }
    public int max(int[]a){
        int t=a[0];
        for(int i=0;i<a.length;i++)
            if(t<a[i])
                t=a[i];
        return t;
    }
    public static void main(String[] args) {
        DaySo s=new DaySo();
        int[] a;
        a=s.doc();
        String kq = "Tong:"+ s.tong(a)+ "\n Lon nhat:"+s.max(a);
        s.viet(kq);              
    }
}
