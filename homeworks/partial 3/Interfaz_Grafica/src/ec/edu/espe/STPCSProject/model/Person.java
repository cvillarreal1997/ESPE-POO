/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;
import ec.edu.espe.STPCSProject.util.FileSTPCS;

/**
 * @author JDIsmael
 */
public abstract class Person{
    private String name;
    private Date1 dateOfBirth = new Date1(0,0,0);
    private String identifyCard;

    public Person() 
    { 
        
    }
    public Person(String name, String identifyCard, Date1 dateOfBirth) {
        this.name = name;
        this.identifyCard = identifyCard;
        this.dateOfBirth = dateOfBirth;
    }
    /**
     * This is an abstract method, every class that extends to person must hava a dataInput Method
     * @return A String with the necesary input Information
     */
    public abstract String dataInput();

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

    /**
     * @return the dateOfBirth
     */
    public Date1 getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date1 dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the identifyCard
     */
    public String getIdentifyCard() {
        return identifyCard;
    }

    /**
     * @param identifyCard the identifyCard to set
     */
    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }
    
}
