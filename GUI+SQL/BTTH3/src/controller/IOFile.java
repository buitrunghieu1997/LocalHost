/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author AnhTTV
 */
public class IOFile {
     public void outFile(List ob, String s) throws IOException{
        ObjectOutputStream outf = new ObjectOutputStream(new FileOutputStream(s));
        for(Object o1 : ob){
            outf.writeObject(o1);
        }
    }
    public void inFile(List ob,String s ) throws IOException,ClassNotFoundException{
       ob.clear();
        ObjectInputStream inf = new ObjectInputStream(new FileInputStream(s));
        Object obj = null;
        while ((obj = inf.readObject())!= null){
            Object o1 = (Object)obj;
            ob.add(o1);
        }
    }
}
