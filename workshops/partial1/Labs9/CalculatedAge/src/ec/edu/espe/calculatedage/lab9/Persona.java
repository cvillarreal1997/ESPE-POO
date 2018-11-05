/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

/**
 *
 * @author Carlos Villarreal
 */
public class Persona {
    private int age;
    private int mes;
    private int day;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Persona(int age, int mes, int day) {
        this.age = age;
        this.mes = mes;
        this.day = day;
    }
    
    
    
}
