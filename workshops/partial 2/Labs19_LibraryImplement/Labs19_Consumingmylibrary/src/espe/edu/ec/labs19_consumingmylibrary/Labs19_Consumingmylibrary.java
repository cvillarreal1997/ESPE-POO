/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.labs19_consumingmylibrary;

import ec.espe.edu.lab19_library_area.Figure;
import ec.espe.edu.lab19_library_area.Triangle;
import ec.edu.espe.lab19Libraries.operation.Basicoperation;



/**
 *
 * @author Carlos Villarreal
 */
public class Labs19_Consumingmylibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Basicoperation operation=new Basicoperation(1.2f,2.4f);
        Figure  figure= new Triangle(1,2);
        float localArea;
        //localArea=figure.computeArea();
        //System.out.println("el area es "+localArea);
        operation.addOperation();
        System.out.println("la suma es: ");
        System.out.println(operation.addOperation());
         System.out.println("la resta es: ");
        System.out.println(operation.subtractOperation());
         System.out.println("la multiplicacion es: ");
        System.out.println(operation.multOperation());
         System.out.println("la divicion es: ");
        System.out.println(operation.divrestOperation());
        
        
    }
    
}
