/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.util.Scanner;


/**
 *
 * @author Carlos Villarreal
 */
public class Main {
    
    static String name;
    static int edad=21;
    static String telefono="09965433";
public static void main(String[] args) {
        Scanner estudiante= new Scanner(System.in);
        int cantestu;

        Archivos arch = new Archivos();
        Estudiantes est = new Estudiantes(name,edad,telefono);
        File fNuevo = new File("C:\\Users\\USER\\Desktop\\ESPE-POO\\workshops\\partial1\\Labs8\\archivo.txt");
        System.out.println("Numero de estudiantes");
        cantestu= estudiante.nextInt();
        for(int i=1;i<=cantestu;i++){
            System.out.println("Estudiante :"+i);
            System.out.println("Nombre:");
            name =estudiante.next();
            arch.Escribir(fNuevo, "Nombre: "+name);
            System.out.println("Edad:");
            edad =estudiante.nextInt();
            String edads = Integer.toString(edad);
            arch.Escribir(fNuevo, "Edad: "+edads);
            System.out.println("Telefono:");
            telefono =estudiante.next();
            arch.Escribir(fNuevo, "Telefono: "+telefono);
            arch.modificar(fNuevo,"carlos","pedro");
        }
       


    }

    
    
    
}
