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
public class Animal {
    protected int id;
    protected int arrivalyear;
    protected  String namecientifc="";
    protected int yearofstated;

  
    public Animal(){
        
    }
  
    

    public Animal(int id,  String namecientifcint,int arrivalyear) {
        this.id = id;
        this.arrivalyear = arrivalyear;
        this.namecientifc= namecientifcint;
    }
 
    
    public int ComputeOfState(int ar){
        Calendar cal  = new GregorianCalendar();
        int ageactuallity=cal.get(Calendar.YEAR);
        yearofstated=ageactuallity-ar;
        
        
        return yearofstated;
    }

    public int getYearofstated() {
        return yearofstated;
    }
    public String getNamecientifc() {
        return namecientifc;
    }
    
    
}
