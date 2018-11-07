/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

import static java.lang.System.console;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Carlos Villarreal
 */
public class Persona {

    public Persona() {
    }
   
    
    public void  Calculatedaño (int age,int mes,int day ){
        Calendar cal = new GregorianCalendar();
        Operation calculo= new Operation();
        int rage,rmonth,rday;
        int ageactually=cal.get(Calendar.YEAR);
        int meslly=cal.get(Calendar.MONTH)+1;
        int daylly=cal.get(Calendar.DAY_OF_MONTH);
        rage=calculo.rest(ageactually, age);
        rmonth=calculo.rest(meslly, mes);
        if (day<0|day>30){
            System.out.println("Ha ingresado mal el dia");
            System.exit(0);
        }
        if (mes<0|mes>30){
            System.out.println("Ha ingresado mal el mes");
            System.exit(0);
        }
        if (age<0|age>ageactually){
            System.out.println("Ha ingresado mal el año");
            System.exit(0);
        }
        if (day>daylly){
            rmonth=rmonth-1;
        }
          rday=calculo.rest(daylly, day);
        if(rday<0){
            rday=rday+30;               
    }
      
        System.out.println("dia acutual "+daylly);
        System.out.println("año acutual "+ageactually);
        System.out.println("mes acutual "+meslly);
        System.out.println("Tiene "+rage+"años  "+rmonth+" meses "+rday+" dias");
        
    }
    
    
    
    
   
    

    
    
    
}
