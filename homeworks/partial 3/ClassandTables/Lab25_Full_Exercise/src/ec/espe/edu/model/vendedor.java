/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Lenovo
 */
public class vendedor {
         FileManager file = new FileManager();
        
        public  DefaultTableModel llenetartabla( ){
        
        DefaultTableModel model= new DefaultTableModel ();         
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Porcentaje");
         model.addColumn("Precio Final");
       FileSTPCS file = new FileSTPCS();       
       model=file.readvisualFile("Producto.csv", model);
       return model;
        
          
          
          
                  
          }
        public String modifyTable(String route, String wordsearch,int nmparam, int numelement, String newword){
        File route1 =new File ("Employee.csv");
        String acum="";    
        String cad="";
        String []elementos = new String [nmparam];
        String chain;
     
         
        
        try{
        FileReader fileOld =new FileReader(route);
        
        BufferedReader br1 = new BufferedReader(fileOld);
        while((chain = br1.readLine())!= null) {
            if(chain.indexOf(";")!= -1){
                if (chain.split(";")[1].equalsIgnoreCase(wordsearch)) {
                    for(int i =0;i<nmparam;i++){
                        if(i!=numelement){
                           elementos[i]=chain.split(";")[i];  
                        }else{
                            elementos[i]=newword;
                        }
                    }
                    for(int i =0;i<nmparam;i++){
           acum+=elementos[i];
                 }  
                       file.writeFile(route1, chain);
                }
            }
            file.writeFile(route1, chain);
        }
       
        br1.close();  
        }catch(Exception e){};
        
          return acum;    
        }
            
        }
        
        
    
    

