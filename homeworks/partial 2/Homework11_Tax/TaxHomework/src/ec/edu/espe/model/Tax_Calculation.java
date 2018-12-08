/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import ec.edu.espe.util.Operation;
import static ec.edu.espe.util.Operation.multi;
import static ec.edu.espe.util.Operation.sub;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JDIsmael
 */
public class Tax_Calculation {
    
    Person person = new Person();
    
    int sri=convertToCents(9.45f);
    String id;
    float livingplace,education,clothing,health,salary;
    Scanner in= new Scanner (System.in);
    
    
    
    
    public void indatas(){
        
        System.out.println("Ingrese cedula o ruc");
        person.setId(in.nextLine());
        System.out.println("Ingrese Sueldo");
        person.setSalary(in.nextFloat());        
        System.out.println("              Ingrese Gatos");
        System.out.println("Vivienda:");
        person.setLivingplace(in.nextFloat());
        System.out.println("Educacion:");
        person.setEducation(in.nextFloat());
        System.out.println("Vestimenta:");
        person.setClothing(in.nextFloat());
        System.out.println("Salud:");
        person.setHealth(in.nextFloat());
   
        
    }
    public int inmonthneto(){
        int salaryint=convertToCents(person.getSalary());
        int srit;
        srit = ((sri*salaryint)/10000);
        int monthneto;
        monthneto=sub(salaryint,srit);
        return monthneto;
    }
    public int incomeage(){
        int valoranual=multi(inmonthneto(),12);
    return valoranual;
    }
    public int deductiblExpenses(){
        int deductible;
        deductible=convertToCents(person.getHealth()+person.getLivingplace()+person.getEducation()+person.getClothing());
        if(deductible>incomeage()) {
            System.out.println("no puede gastas mas de lo que gana");
            System.out.println("su sueldo es solo de"+inmonthneto());
            return -1;
        }
       
        return deductible;
    }
    
    
    
    
    
    
    
    private ArrayList<Integer> limitFractionTax;
    private ArrayList<Integer> basicFractionTax;

    public Tax_Calculation() {
        this.limitFractionTax = new ArrayList<>();
        this.basicFractionTax = new ArrayList<>();
        this.basicFractionTax.clear();
        this.limitFractionTax.clear();
        constantTax();
    }
    
    
    public int convertToCents(float dolars){
        String dolarString = ""+dolars;
        String[] separator = dolarString.split("\\.");
        int partInt= Integer.parseInt(separator[0]);
        int partDecimal = Integer.parseInt(separator[1]);
        
        return Operation.add(Operation.multi(partInt, 100),partDecimal);
    } 
    
    
    public ArrayList<Integer> defineInTable(int taxBase){
        int cont = 0;
        int cont2 = 0;
        ArrayList<Integer> establishedBase = new ArrayList<>();
        
        if(taxBase>=limitFractionTax.get(7)){
            establishedBase.add(basicFractionTax.get(14));
            establishedBase.add(basicFractionTax.get(15));
            return establishedBase;
        }
        
        if(taxBase<limitFractionTax.get(0)){
            establishedBase.add(0);
            establishedBase.add(0);
            return establishedBase;
        }
            
        do{
            if(taxBase>=limitFractionTax.get(cont) 
                    && taxBase < limitFractionTax.get((cont+1))){
                establishedBase.add(basicFractionTax.get(cont2));
                establishedBase.add(basicFractionTax.get(cont2 +1));
                cont = 6;
            }
            cont++;
            cont2+=2;
            
        }while(cont != 7);
        return establishedBase;
    }
    
    
    private void constantTax(){
        //set constant limit tax
        limitFractionTax.add(convertToCents(11270f));
        limitFractionTax.add(convertToCents(14360f));
        limitFractionTax.add(convertToCents(17950f));
        limitFractionTax.add(convertToCents(21550f));
        limitFractionTax.add(convertToCents(43100f));
        limitFractionTax.add(convertToCents(64630f));
        limitFractionTax.add(convertToCents(86180f));
        limitFractionTax.add(convertToCents(114890f));
        
        //set values to pay
        
        basicFractionTax.add(0);
        basicFractionTax.add(5);
        basicFractionTax.add(convertToCents(155f));
        basicFractionTax.add(10);
        basicFractionTax.add(convertToCents(514f));
        basicFractionTax.add(12);
        basicFractionTax.add(convertToCents(946f));
        basicFractionTax.add(15);
        basicFractionTax.add(convertToCents(4178));
        basicFractionTax.add(20);
        basicFractionTax.add(convertToCents(8484));
        basicFractionTax.add(25);
        basicFractionTax.add(convertToCents(13872));
        basicFractionTax.add(30);
        basicFractionTax.add(convertToCents(22485));
        basicFractionTax.add(35);
        
        
    }
    
    
}
