/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.model;

import java.io.File;

/**
 *
 * @author Lenovo
 */
public class Digitador {
    FileManager file = new FileManager ();
    File route = new File ("Producto.csv");
    
    public void saveDatas(String a, String b, String c, String d){
         float num1,num2,pv;
         num1=Float.parseFloat(c);
         num2=Float.parseFloat(d)/100;
         pv=(num1*num2)+num1;
         String pvt;
         pvt=String.valueOf(pv);
        String acum;
        acum=a+";"+b+";"+c+";"+d+";"+pvt+"\n";
        file.writeFile(route, acum);
        
        
    }
    
    
    
    
}
