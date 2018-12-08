/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.util;

/**
 * @author JDIsmael
 */
public class Operation {
    
    public Operation() {
    }
    
    public static int add(int operand1, int operand2){
        return operand1 + operand2;
    }
    
    public static int sub(int operand1, int operand2){
        return add(operand1, -(operand2));
    }
    
    public static int div(int operand1, int operand2){
        
        int cont=0;
        
        while ( operand1 >= operand2){
           
            operand1=add(operand1, (-operand2));
            cont++;
        }
        System.out.print("El residuo es: " + operand1);
        return cont;
    }
    
    public static int multi(int operand1, int operand2){
        int acum=0;
        int cont=0;
        boolean check = false;
        if(operand2<0){
            operand2 = (-operand2);
            check = true;
        } 
        while(cont < operand2){
            acum=add(acum, operand1);
            cont++;
        }
        if(check) return -acum;
        else return acum;
    }
}