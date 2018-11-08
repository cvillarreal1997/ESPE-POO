/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.file_management.utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Carlos Villarreal
 */
public class Archivos {
    void WriteFile(File fFichero,String cadena)
    {
        BufferedWriter bw;
        try
        {
         if(!fFichero.exists())
         {
             fFichero.createNewFile();
         }

           // Luego de haber creado el archivo procedemos a escribir dentro de el.
            bw = new BufferedWriter(new FileWriter(fFichero,true));
            bw.write(cadena);
            bw.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }


    void DeleteFile (File Ffichero)
    {
        try
        {
            if(Ffichero.exists())
            {
                Ffichero.delete();
                System.out.println("Ficherro Borrado");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
   
    
   /* void modificar(File fAntiguo,String aCadena,String nCadena)    {
       
        Random numaleatorio = new Random(3816L);
        String nFnuevo = fAntiguo.getParent()+"/auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt()))+".txt";

     
        File fNuevo= new File(nFnuevo);
        // Declaro un nuevo buffer de lectura
        BufferedReader br;
        try
        {

            if(fAntiguo.exists())
            {
                br = new BufferedReader(new FileReader(fAntiguo));

                String linea;

                while((linea=br.readLine()) != null)
                {
                    if(linea.equals(aCadena))
                    {
                        Escribir(fNuevo,nCadena);

                    }
                    else
                    {
                        Escribir(fNuevo,linea);
                    }
                }

              // Cierro el buffer de lectura
                br.close();
                String nAntiguo = fAntiguo.getName();
                borrar(fAntiguo);
                fNuevo.renameTo(fAntiguo);




            }
            else
            {
                System.out.println("Fichero no Existe");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }*/


      }
    



