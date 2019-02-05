/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

import java.io.IOException;
import static java.lang.System.console;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Villarreal
 */
public class Persona {
    int resp1;
    main repetir = new main();
    public Persona() {
    }
   
    
    public int  Calculatedaño (String nameperson,int age,int mes,int day ) throws IOException{
        
        Calendar cal = new GregorianCalendar();
        Operation calculo= new Operation();
        int rage,rmonth,rday;
        int ageactually=cal.get(Calendar.YEAR);
        int meslly=cal.get(Calendar.MONTH)+1;
        int daylly=cal.get(Calendar.DAY_OF_MONTH);
        rage=calculo.rest(ageactually, age);
        rmonth=calculo.rest(meslly, mes);
        if (day<0|day>31){
           
           
        }
        if (mes<0|mes>12){
           
         
        }
        if (age<0|age>ageactually){
           
        }
        if (day>daylly){
            rmonth=rmonth-1;
        }
          rday=calculo.rest(daylly, day);
        if(rday<0){
            rday=rday+31; 
    }
        if(meslly==mes){
            rmonth=0;
            
            
        }
        
    if(rage<0 |rmonth<0|rday<0 && age==ageactually){
        
      
      }
     if(mes>meslly){
          rmonth=rmonth+12;
      }
         if (ageactually==age&&day==daylly&&mes==meslly){
            ;
            
        }
        
       return rage;
        
    }
     public void Pregunta() throws IOException{
    do{
         resp1=JOptionPane.showConfirmDialog(null,"Desea repetir el proceso"); 
         repetir.Ejecutar();
         }while (resp1==JOptionPane.OK_OPTION);  
         JOptionPane.showMessageDialog(null, "Chaosss..");         
         
     }
    
   
     



} 

   
    
    
    

