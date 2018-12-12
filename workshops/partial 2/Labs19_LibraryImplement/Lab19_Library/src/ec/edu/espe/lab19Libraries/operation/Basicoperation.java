/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab19Libraries.operation;

/**
 *
 * @author Carlos Villarreal
 */
public class Basicoperation {
    private float operand1;
    private float operand2;
    private float result;

   public Basicoperation(){
       
   }

    public void setOperand1(float operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(float operand2) {
        this.operand2 = operand2;
    }

    public float getResult() {
        return result;
    }

    public Basicoperation(float operand1, float operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result=0;
    }
    
    public float addOperation(){
        result=operand1+operand2;
        return result;
    }
      public float subtractOperation(){
        result=operand1-operand2;
        return result;
    }
       public float multOperation(){
        result=operand1*operand2;
        return result;
    }
        public float divrestOperation(){
        result=operand1/operand2;
        return result;
    }
    
}
