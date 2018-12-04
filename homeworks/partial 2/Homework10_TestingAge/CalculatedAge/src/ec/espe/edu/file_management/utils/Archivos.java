/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.file_management.utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
public class Archivos {
    String search;
   
    public void WriteFile(File fFichero,String cadena){
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
     public void ReadFile(String rut) throws FileNotFoundException,IOException {
        String cadena;
        String acumulador="";
        FileReader Ficheroread= new FileReader(rut);
        BufferedReader br = new BufferedReader(Ficheroread);
        while((cadena=br.readLine())!=null){
            acumulador = (acumulador +cadena)+"\n";
        }
         JOptionPane.showMessageDialog(null,"    REGISTRO DE EDADES (AA/MM/DD)\n"+acumulador);
        br.close();     
            
            }


    public void DeleteFile (File Ffichero)
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
    
    public String SearchDatas ( String ruta, String wordsearch)throws FileNotFoundException,IOException{
        FileReader fileold =new FileReader(ruta);
        String cad="";
        String cadena;
        BufferedReader br1 = new BufferedReader(fileold);
            while((cadena = br1.readLine())!= null) {
      if(cadena.indexOf(";")!= -1){
        if (cadena.split(";")[0].equalsIgnoreCase(wordsearch)) {
           JOptionPane.showMessageDialog(null,"Registro encontrado \n"+ cadena);
            cad=cadena;     
           
        }
    }
}
        br1.close();         
          return cad;    
        }       
    
    
    
    public void ModificationDatas(String wordsearch,String ruta,String ruta1,int a,String newword)throws IOException{
         String oldworld="";
         String copy;
         FileReader fileold=new FileReader(ruta);
         File filenew=new File(ruta1);
         oldworld=SearchDatas(ruta,wordsearch);
         BufferedReader br1= new BufferedReader(fileold);
         BufferedWriter bw1= new BufferedWriter(new FileWriter(filenew,true));
         while((oldworld=br1.readLine())!=null){
            if(oldworld.indexOf(";")!=-1){
                copy=oldworld.split(";")[a];
                copy=newword;               
            }
           // WriteFile();
            
        }
        
        
        
        
    }
         
   
     }
    
    