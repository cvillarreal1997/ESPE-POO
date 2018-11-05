/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculatedage.lab9;

import java.util.Scanner;


/**
 *
 * @author Carlos Villarreal
 */
public class main {
    private static int age;
    private static int mes;
    private static int day;
   
     public static void main(String[] args) {
         Scanner prs = new Scanner(System.in);
         System.out.println("Ingrese año");  
         age=prs.nextInt();
         System.out.println("Ingrese mes"); 
         mes=prs.nextInt();
         System.out.println("Ingrese dia"); 
         day=prs.nextInt();
     
         
     }
    
}
