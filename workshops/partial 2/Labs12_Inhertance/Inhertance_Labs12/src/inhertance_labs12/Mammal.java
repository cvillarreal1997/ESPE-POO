/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhertance_labs12;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Carlos Villarreal
 */
public class Mammal extends Animal{
    private int numberofnipple;
    protected int numcomida;

    public int getNumcomida() {
        return numcomida;
    }
    
    public Mammal(){
        
    }

    public int getNumberofnipple() {
        return numberofnipple;
    }
    

    public Mammal(int numberofnipple, int id, int arrivalyear, String namecientifc) {
        super(id, namecientifc, arrivalyear);
        this.numberofnipple = numberofnipple;
    }

    public int getArrivalyear() {
        return arrivalyear;
    }

    
    
    
    public int Eatkg(){
        int n=50;
        String eat="";
       numcomida=(int)(Math.random()*n)+1;
             
        return numcomida;
        
    }
    public String Pesokg(){ 
          int num;
        int n=50;
        String peso="";
       num=(int)(Math.random()*n)+1;
        peso="Peso:"+num+"lb";      
        return peso;      
    }
    
    
    
    
    
    
}
