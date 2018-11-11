/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

import ec.espe.edu.file_management.utils.Files;
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
   private static int option;
   private static String nameperson;
   private static Files arch = new Files();
   private static String ruta="C:\\Users\\USER\\Desktop\\edades.txt";
   
      

    
     public  static void main(String[] args) {
        
        Persona person2 = new Persona();
        main a = new main();
         a.Ejecutar();
         String datasages=person2.Calculatedaño(birthage, birthmes, birthday, nameperson);
        arch.WriteFile(ruta, datasages);
        a.ViewDatas();
                 
    } 

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      public  void Ejecutar(){
         do{
         ScannerData();
         resp=JOptionPane.showConfirmDialog(null,"Desea repetir el proceso");        
         }while (resp==JOptionPane.OK_OPTION); 
         JOptionPane.showConfirmDialog(null,"Desea ver los datos registrados");
        if(JOptionPane.OK_OPTION==resp){
           
        }
         
                 
         
     }
        public  void ScannerData(){
            Persona person = new Persona();
         nameperson=JOptionPane.showInputDialog("Ingrese su nombre "); 
         birthage=Integer.parseInt(JOptionPane.showInputDialog( "Ingrese  año "));  
         birthmes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese  mes"));
         birthday=Integer.parseInt(JOptionPane.showInputDialog("Ingrese  dia"));
       
         person.Calculatedaño(birthage,birthmes,birthday,nameperson);        
         
     }
        public void ViewDatas (){
             arch.ReadFile(ruta);
            
        }
}
