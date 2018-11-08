/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Villarreal
 */
public class main {
   private static int birthage;
   private static int birthmes;
   private static int birthday;
   private static int resp;
    
     public  static void main(String[] args) {
        main a = new main();
         a.Ejecutar();            
    } 

     
     
      public  void Ejecutar(){
         do{
         ScannerData();
         resp=JOptionPane.showConfirmDialog(null,"Desea repetir el proceso");        
         }while (resp==JOptionPane.OK_OPTION);  
         JOptionPane.showMessageDialog(null, "Chaosss..");         
         
     }
        public  void ScannerData(){
         birthage=Integer.parseInt(JOptionPane.showInputDialog( "Decideme tu año "));  
         birthmes=Integer.parseInt(JOptionPane.showInputDialog("Decidme tu mes"));
         birthday=Integer.parseInt(JOptionPane.showInputDialog("Decidme tu dia"));
         Persona person = new Persona();
         person.Calculatedaño(birthage,birthmes,birthday);        
         
     }
}
