package ec.edu.espe.www.zooproject.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Animal {
     private int id;
     private String name;
    
    public Animal(){
        id=0;
    }
   
    public void setId (int id){
        this.id=id;
    }
    public int  getId (){
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
     public Animal(int id,String name){
        this.id=id;
        this.name=name;
    }
    
}
