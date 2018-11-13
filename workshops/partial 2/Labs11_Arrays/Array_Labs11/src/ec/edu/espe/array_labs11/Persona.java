/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array_labs11;

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
    private String nombre;
    private String age;
    private String ageo;
    private String month;
    private String day;

    public Persona() {
        nombre="";     
        age="";
        ageo="";
        month="";
        day="";
    }
    public Persona(String n,String a,String a1,String mo,String d){
        nombre=n;
        age=a;
         ageo=a1;
        month=mo;
        day=d;
        
        
    }

    public String getAgeo() {
        return ageo;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String  Calculatedaño (String nameperson,int age,int mes,int day ) throws IOException{
        
        Calendar cal = new GregorianCalendar();
        Operation calculo= new Operation();
        int rage,rmonth,rday;
        int ageactually=cal.get(Calendar.YEAR);
        int meslly=cal.get(Calendar.MONTH)+1;
        int daylly=cal.get(Calendar.DAY_OF_MONTH);
        rage=calculo.rest(ageactually, age);
        rmonth=calculo.rest(meslly, mes);
        if (day<0|day>31){
            System.out.println("Ha ingresado mal el dia");
           
        }
        if (mes<0|mes>12){
             System.out.println("Ha ingresado mal el mes");
       
         
        }
        if (age<0|age>ageactually){
             System.out.println("Ha ingresado mal el año");
            
            
        }
        if (day>daylly){
            rmonth=rmonth-1;
        }
          rday=calculo.rest(daylly, day);
        if(rday<0){
            rday=rday+31; 
    }
        
    if(rage<0 |rmonth<0|rday<0 && age==ageactually){
          System.out.println("Usted auno nace");
          
      }
     if(mes>meslly){
          rmonth=rmonth+12;
      }
         if (ageactually==age&&day==daylly&&mes==meslly){
            System.out.println("Nacio hoy");
           
            
        }
        
        JOptionPane.showMessageDialog(null,nameperson+" tu tienes "+rage+" años "+rmonth+" meses y "+rday+" dias de vida");
        String datas=nameperson+";"+rage+";"+rmonth+";"+rday;
       return datas;
        
    }
     


} 

   
    
    
    

