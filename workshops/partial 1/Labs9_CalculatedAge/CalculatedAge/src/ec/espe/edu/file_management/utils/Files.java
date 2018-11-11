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
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Villarreal
 */
public class Files {
    public void WriteFile(String namefile,String cadena)  {   
   File fFichero = new File(namefile);
        BufferedWriter bw;
        
        try
        {
            
         if(!fFichero.exists())
         {
             fFichero.createNewFile();
         }
            bw = new BufferedWriter(new FileWriter(fFichero,true));
            bw.write(cadena);
            bw.newLine();
            bw.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
   public void ReadFile(String namefile)  {   
   File fFichero = new File(namefile);
   String line=" ";
   String line2="\n";
   String result;
        BufferedReader br;
        
        try
        {
            
         if(!fFichero.exists())
         {
             fFichero.createNewFile();
         }
            br = new BufferedReader(new FileReader(fFichero));
               while(line!=null){
                   //line=br.readLine(); 
                   //line2=line2+line;
                    }
               //JOptionPane.showMessageDialog(null,line2);
                    br.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }


   public void DeleteFile (String namefile) 
    {
           File Ffichero=new File(namefile);
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
    



