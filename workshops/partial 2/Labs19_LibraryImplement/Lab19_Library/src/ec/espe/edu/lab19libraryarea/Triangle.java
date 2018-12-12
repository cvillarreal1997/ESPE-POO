/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.lab19libraryarea;

import ec.edu.espe.lab19Libraries.operation.Basicoperation;

/**
 *
 * @author Carlos Villarreal
 */
public  class Triangle  extends Figure {
    private float base;
    private float altura;

    public Triangle(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float computeArea() {
        area=(base*altura)/2;
        return area;
        
            }

  
    
    
    
}
