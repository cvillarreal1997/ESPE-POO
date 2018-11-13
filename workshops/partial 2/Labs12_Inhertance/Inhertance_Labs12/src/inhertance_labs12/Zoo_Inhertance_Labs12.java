/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhertance_labs12;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Villarreal
 */
public class Zoo_Inhertance_Labs12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hola");
        int numberNipple;
        int id;
        Mammal mam = new Mammal();
        int arrivalyear;
        String namecientifc;
        int yearofstated;
        int numpatas;
        int yearState;
        String tamescams="";
        int cnateat;
        String cantpeso;
        
        Mammal mammal[]=new Mammal[1];
        Reptile reptile[]=new Reptile[1];
        for(int i=0;i<1;i++){
            int cont=i+1;
            System.out.println("         Mamifero "+cont);
            System.out.println("Ingrese nombre cientifico:");  
            namecientifc=input.nextLine();   
            System.out.println("Ingrese numero de tetillas");            
            numberNipple=input.nextInt();
            System.out.println("Ingrese año de ingreso");
            arrivalyear=input.nextInt();
            System.out.println("Ingrese ID");
            id=input.nextInt();
            mammal[i]=new Mammal(numberNipple, id, arrivalyear, namecientifc);
            yearState=mam.ComputeOfState(arrivalyear);
            mammal[i].yearofstated=yearState;
            cnateat=mam.Eatkg();
            mammal[i].numcomida=cnateat;
            input.nextLine();
            
           
                    
        }
        for( int p=0;p<1;p++){
            System.out.println("        MAMMAL\n"+"\nID:"+mammal[p].id
            +"\nNombre cientifico: "+mammal[p].namecientifc+"\nNumero de tetillas: "+mammal[p].getNumberofnipple()
            +"\nAño de llegado:"+mammal[p].arrivalyear+"\nTimepo de alojamiento: "+mammal[p].getYearofstated()+"\nCant comida: "  
            +mammal[p].numcomida+" kg");
           
            
            
        }
        
        
        
        
    }
    
}
