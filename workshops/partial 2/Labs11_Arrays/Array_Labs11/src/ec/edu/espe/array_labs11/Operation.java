/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array_labs11;

import java.util.Scanner;

/**
 *
 * @author Carlos Villarreal
 */
public class Operation {
     private int result;

    public Operation() {
        
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
 
   public  int add(int op1,int op2){
      int result;
      result=op1+op2;     
      return result;
  }
  public  int rest(int op1,int op2){
      int result;
      result=add(op1,-op2);     
      return result;
  }
   public  int mult(int op1,int op2){
       int cont=1;
       int ade=0;
       int result;
       int n1,n2;
       n1=-(op1);
           n2=-(op2);
       if((op1==-op1)&&(op2==-op2)){
           while (n1>=cont){
                  cont++;
                  ade=add(ade,n2);
              }
          }else{
              while (n2>=cont){
                  cont++;
                  ade=add(ade,n1);              
          }
       }
       if(op1>=op2){
              while (op1>=cont){
                  cont++;
                  ade=ade+op2;
              }
          }else{
              while (op2>=cont){
                  cont++;
                  ade=ade+op1;              
          }
              }     
          
   
      return ade;
       }
  
    public  int div(int op1,int op2){
      int result,cont=-1,add=0;
      int aup1=op1;
      int aup2=op1;
       if(op1>=op2){
              while (aup1>=0){
                  cont++;
                  aup1=rest(aup1,op2);
              }
          }else{
              while (aup2>=0){
                  cont++;
                  aup2=aup2-op2;              
          }
      }    
      return cont;
  }
 }   

