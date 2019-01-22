/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;


import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author Lenovo
 */
public class Loginstart {
      FileManager file= new FileManager();
         File arch = new File("Passwords.csv");
     
     public void saveUser(String user ,String pas){
       
         
         String userecr=encriptar(user);
         String passecr=encriptar(pas);
         String acum="";
         acum=userecr+";"+passecr+"\n";          
        
        file.writeFile(arch, acum);      
                  
     }
     
     public boolean enter(String user, String password){
         String userecr= encriptar(user);
          String pasecr= encriptar(password);
         String chain=file.searchInFile(arch, userecr);
         System.out.println("ch----"+chain);
         
         if ((userecr.equals(chain.split(";")[0])) && (pasecr.equals(chain.split(";")[1]))){
             JOptionPane.showMessageDialog(null,"Bienvenido");
             return true;
             
         }else{
             return false;
         }
         
         
         
         
     }
     
     
     
     
     
     
     
     public static String encriptar(String mensaje){
         char array[]=mensaje.toCharArray(); 
          for(int i=0;i<array.length;i++){ 
            array[i]=(char)(array[i]+(char)3); 
} 
         String encriptado =String.valueOf(array); 
         return encriptado;
         
     }
     
     
     
     public  static String desencriptar(String mensaje){
         char arrayD[]=mensaje.toCharArray(); 
        for(int i=0;i<arrayD.length;i++){ 
            arrayD[i]=(char)(arrayD[i]-(char)3); 
        } 
      String desencriptado =String.valueOf(arrayD); 
        System.out.println(desencriptado);  
        return desencriptado;
         
     }

     
     
     
     
 
 
}
