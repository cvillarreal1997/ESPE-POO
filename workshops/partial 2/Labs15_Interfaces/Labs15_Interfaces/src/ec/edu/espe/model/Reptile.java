/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import interfaces.Animal;


/**
 *
 * @author Carlos Villarreal
 */
public class Reptile implements Animal{
        @Override
    public void feeet() {
        System.out.println("la culebra esta comiendo un ratones");
    }

    @Override
    public void assignnmentavitat() {
        System.out.println("avitat selva");
    }
    
}
