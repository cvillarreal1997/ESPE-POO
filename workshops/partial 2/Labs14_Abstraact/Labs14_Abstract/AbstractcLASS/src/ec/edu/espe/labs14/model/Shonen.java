/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.labs14.model;

/**
 *
 * @author G403
 */
public abstract class Shonen extends Anime{
    
    String name;
    String age;
    String sangr;
    @Override
    public void yearOfIssue(){
        
    }
    public void  caracterist(String name, String age, String sangriet){
        System.out.println("Name: "+name+"\nAge: "+age+"\nSangrient: "+sangr);
        
        
    }    
    
  

    
    
}
