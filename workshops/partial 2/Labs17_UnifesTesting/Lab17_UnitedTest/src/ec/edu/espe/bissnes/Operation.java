/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bissnes;

/**
 *
 * @author Carlos Villarreal
 */
public class Operation {
    private short operand1;
    private short operand2;
    private short result;
    

public short add(short addend1,short addend2){
  result=(short)(addend1+addend2); 
    
  return result;  
}
}