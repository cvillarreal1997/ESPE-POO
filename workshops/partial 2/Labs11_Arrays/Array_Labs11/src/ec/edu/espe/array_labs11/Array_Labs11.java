/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array_labs11;
import java.io.FileReader;
import java.io.BufferedReader;


/**
 *
 * @author Carlos Villarreal
 */
public class Array_Labs11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name="";
         String age="";
         String age1="";
         String month="";
         String day="";
         
          int i=0;
          Persona person[]=new Persona[10];
         
          //person = new String[10];
        String ruta="C:\\Users\\USER\\Desktop\\edades.csv ";
        try{
        FileReader oldfile= new FileReader(ruta);
        BufferedReader br= new BufferedReader(oldfile);
                   
        String line;
      
        while(((line=br.readLine())!=null)&& i<person.length){ 
        if(line.indexOf(";")!= -1){ 
            name=line.split(";")[0];
            age1=line.split(";")[1];
            month=line.split(";")[2];
            day=line.split(";")[3];
            age=line.split(";")[4];
            
            person[i]=new Persona(name,age1,month,day,age);                     
        }
        i++;
    }
        br.close();
         }catch(Exception e){
         }
        for(int p=0;p<10;p++){
            int ind=p+1;
            System.out.println("                 Regitro "+ind+"\n");            
            System.out.println("Nombre:"+person[p].getNombre()+"\nFecha de nacmiento:"
               +person[p].getAgeo()+"/"+person[p].getMonth()+"/"+person[p].getAge()+"\nEdad:"+person[p].getDay());           
            
        }     
        

        }
    }
                
            
    //priemro separa lineas y cada linea es un objeto y des pues hacer el arreglo de objetos 
            
            
        
        
        
        
    
    

