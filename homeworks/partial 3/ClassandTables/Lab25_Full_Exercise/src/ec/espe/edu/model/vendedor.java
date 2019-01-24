/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.model;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Lenovo
 */
public class vendedor {
   
        
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
        
        
    
    
}
