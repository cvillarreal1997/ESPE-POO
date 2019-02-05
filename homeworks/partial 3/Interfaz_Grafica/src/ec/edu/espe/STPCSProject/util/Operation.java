/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.util;

import ec.edu.espe.Project_SPCS.GUI.menu.MainDesktop;
import ec.edu.espe.Project_SPCS.GUI.model.SearchCustomerResultScreen;
import java.awt.Color;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

    public static void mainSearchAction(JTextField txtIDField,JInternalFrame windowShow) {
        if (txtIDField.getBackground() == Color.red || Validations.IDVerification(txtIDField) == false) {
            JOptionPane.showMessageDialog(null, "Error numero de cedula no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            MainDesktop.Desktop.add(windowShow);
            windowShow.show();
        }
    }

    public static void mainResultAction(JTextField txtIDField,JInternalFrame windowShow) {
        String auxVerificationString;
        auxVerificationString = FileManager.searchInFile(new File("Customer.csv"), txtIDField.getText());
        if (auxVerificationString.equals("0")) {
            JOptionPane.showMessageDialog(null, "Error número de cédula no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Operation.mainSearchAction(txtIDField,windowShow);
        }
    }
    public static List dataSearchAndSplit(JTextField textField,JLabel label,File nameOfFile)
    {
        String auxString;
        List <String> dataOutput;
        if(textField == null)
        {
            auxString = FileManager.searchInFile(nameOfFile, label.getText());
            if (auxString.equals("0")) {
                return null;
            } else {
                dataOutput = Arrays.asList(auxString.split(";"));
                return dataOutput;
            }
        }
        else
        {
            auxString = FileManager.searchInFile(nameOfFile, textField.getText());
            if (auxString.equals("0")) {
                return null;
            } else {
                dataOutput = Arrays.asList(auxString.split(";"));
                return dataOutput;
            }
        }
        
        
    }
}

