/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import Operations.Operation;
import ec.edu.espe.model.Animal;

/**
 *
 * @author Carlos Villarreal
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Operation operation = new Operation();
      float result;
      result=operation.divide(10, 2);
      System.out.println("El resultado es: "+result);
        result=operation.divide(897, 386);
        System.out.println("El resultado es: "+result);
        result=operation.divide(8.4f, 3.2f);
        System.out.println("El resultado es: "+result);
         result=operation.divide(8, 0);
        System.out.println("El resultado es: "+result);
        result=operation.add(1.2f, 2.9f);
        System.out.println("La suma es: "+result);
        result=operation.add(1.2f, 4);
        System.out.println("La suma es: "+result);
        Animal animal = null;
        System.out.println(""+animal.eyes);
    }
    
}
