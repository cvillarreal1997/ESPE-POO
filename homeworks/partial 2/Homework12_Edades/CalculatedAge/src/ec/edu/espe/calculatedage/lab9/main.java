/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

import ec.espe.edu.file_management.utils.Archivos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
   private static String nameperson;
   private static String ruta="C:\\Users\\USER\\Desktop\\edades.csv";
   private static String contenet;
   private static Archivos arch= new Archivos();
   private static String workshear;
   private static main a = new main();
  
    
     public  static void main(String[] args) throws IOException {
         a.menu();
                            
         }    
     
     
     
     
     
     
     
     
     public void menu()throws IOException{
      int op=Integer.parseInt(JOptionPane.showInputDialog(null, "             CALCULATED OF AGE\n"+"1.Nueva Persona\n"+"2.Visualizar Registro\n"+"3.Buscar Persona\n"+"4.Modificar Datos\n"+"5.Salir"));
      
      switch(op){
         case 1:                 
         Ejecutar();
         Return();         
         break;
         case 2:
         arch.ReadFile(ruta);
         Return();
         break;
         case 3:
         workshear=JOptionPane.showInputDialog(null,"Ingrese el nombre de la persona");
         arch.SearchDatas(ruta,workshear);
         Return();
         break;
         case 4:
         Modification();
         case 5:
         System.exit(0);   
         
     }
     }

     
     
      public  void Ejecutar()throws IOException{
        
         do{
         
         ScannerData();
         SaveDatas();
         resp= JOptionPane.showConfirmDialog(null,"Desea ingresar otra persona"); 
         }while (resp==JOptionPane.OK_OPTION);  
        
         
     }
        public  void ScannerData(){
         nameperson=(JOptionPane.showInputDialog( "Ingrese el nombre "));
         birthage=Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el  año "));  
         birthmes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
         birthday=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
         Persona person = new Persona();
         
        
         
     }
        public void SaveDatas()throws IOException{
        
        Persona person=new Persona();
        contenet=person.Calculatedaño(nameperson, birthage, birthmes,birthday);
        File file=new File(ruta);
        arch.WriteFile(file, contenet);           
            
        }
        
        public void Return() throws IOException {        
        resp=JOptionPane.showConfirmDialog(null,"Desea regresar al menu");
         if (resp==JOptionPane.OK_OPTION){
             a.menu();
         }          
            
    }
        public void Modification()throws IOException{
            String work=JOptionPane.showInputDialog(null,"Ingrese nombre de la persona a modificar");
            String result=arch.SearchDatas(ruta, work);
            int op=Integer.parseInt(JOptionPane.showInputDialog(result+"\nQue desea cambiar\n"+"1.Nombre\n"+"2.Año\n"+"3.Mes\n"+"4.Dia"));
            switch(op){
                        case 1:
                            JOptionPane.showInputDialog("Ingrese nuevo Nombre");
                        break;
                        case 2:
                            JOptionPane.showInputDialog("Ingrese nuevo Año");
                        break;
                        case 3:
                            JOptionPane.showInputDialog("Ingrese nuevo Mes");
                        break;
                        case 4:
                            JOptionPane.showInputDialog("Ingrese nuevo Dia");
                        break;
        }
            }
}
 
