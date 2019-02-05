/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.File;

/**
 *
 * @author Lenovo
 */
public class Calculated {
    FileManager file = new FileManager();
    File ruta = new File ("Employee.csv");
    public void calcular (String mensaje){
        file.writeFile(ruta, mensaje);
        
    }
    public static float TotalSalary(String nh, String vh){
        float sald;
        float numh,numvp;
        numh=Float.parseFloat(nh);
        numvp=Float.parseFloat(vh);
        sald=numh*numvp;
        return sald;
        
    }
    
}
