/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;

import ec.edu.espe.STPCSProject.util.FileManager;
import ec.edu.espe.STPCSProject.util.EncriptUtil;
import ec.edu.espe.STPCSProject.util.Encrypt;
import ec.edu.espe.STPCSProject.util.FileSTPCS;
import java.util.List;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class LogIn {
    //Atributes
    private String username;
    private String password;
    private String encriptUsername;
    private String encriptPassword;
    private int maxUsuario = 50;
    private Admin misUsuarios[] = new Admin[maxUsuario];
    private int contUsuarios = 0;

    //Mehods
    public List credentialData(String username)
    {
        List <String> dataOutput;
        dataOutput = null;
        String auxStringOutput = FileManager.searchInFile(new File("credential.txt"), username);
        if(auxStringOutput == null)
        {
            return dataOutput = null;
        }
        else
        {
            dataOutput = Arrays.asList(auxStringOutput.split(";"));
            return dataOutput;
        }
    }
    public void encriptUsernameAndPassword()
    {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Ingresa el nombre de usuario");
        username = dataInput.nextLine();
        System.out.println("Ingresa la contraseña");
        password = dataInput.nextLine();
        encriptPassword = EncriptUtil.encript(password);
        FileManager.writeFile(new File("credential.txt"), username+";"+encriptPassword+" \r\n");
        
    }
    public boolean usernameAndPasswordVerification(String password,List credentialData)
    {
        String auxPassword = null;
        try {
            auxPassword = EncriptUtil.decrypt((String) credentialData.get(1));
        } catch (Exception ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(password.equals(auxPassword))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void cambioClave(String usuario, String clave, String nuevaclave) {
        String newclave="";
        File fichero = new File("Data.txt");
        
        Encrypt encriptar = new Encrypt();
    encriptUsername=encriptar.encriptar(usuario);
    encriptPassword=encriptar.encriptar(clave);
    FileSTPCS file = new FileSTPCS ();
    if(((file.searchboolean("Data.txt", encriptUsername))&&(file.searchboolean("Data.txt", encriptPassword)))==true){
       newclave=(encriptUsername+";"+encriptar.encriptar(nuevaclave))+";";
      
       JOptionPane.showMessageDialog(null, "Clave cambiada ");
      
    }else{
    JOptionPane.showMessageDialog(null, "Error al cambiar");
    
}
    if (!fichero.exists()) {
        System.out.println("El archivo data no existe.");
    } else {
        fichero.delete();
        System.out.println("El archivo data fue eliminado.");
    }

    
    
    
    
    
    
     file.writeFile(fichero, newclave); 
}
}
