/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab25_full_exercise;

import ec.espe.edu.model.vendedor;

/**
 *
 * @author Lenovo
 */
public class Lab25_Full_Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       vendedor vend = new vendedor ();
        System.out.println("es....."+vend.modifyTable("Producto.csv", "Erika", 5, 1,"Juan"));
    }
    
}
