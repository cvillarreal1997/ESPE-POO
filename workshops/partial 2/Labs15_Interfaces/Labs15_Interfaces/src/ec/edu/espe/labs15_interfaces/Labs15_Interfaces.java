/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.labs15_interfaces;

import ec.edu.espe.model.Mammal;
import ec.edu.espe.model.Reptile;
import interfaces.Animal;

/**
 *
 * @author Carlos Villarreal
 */
public class Labs15_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal animal;
       Animal animal1;
       animal = new Mammal();
      
       animal.assignnmentavitat();
       animal.feeet();
        animal= new Reptile();
       animal.feeet();
       animal.assignnmentavitat();
       
    }
    
}
