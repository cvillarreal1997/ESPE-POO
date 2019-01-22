/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This class has all the necesary methods to manage files
 * @author Jose
 * @version 1.0
 * @version 0.1
 */
public class FileManager 
{
    /**
     * Creates a file by passing its name as a file objec
     * @param name 
     * @throws IOException if the file is not created
     */
    public static void createFile (File name)
    {
        if(!name.exists())
        {
            try
            {
                name.createNewFile();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    /**
     * Write in a file by passing the file name as a file object and a String with the data
     * @param name
     * @param string 
     */
    public void writeFile (File name,String string)
    {
        try 
        {
            FileWriter write=new FileWriter(name,true);
            BufferedWriter bw = new BufferedWriter(write);
            write.write(string);
            bw.newLine();
            write.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Read and print in screen all the file if it's found
     * @param name 
     */
    public static String readFile (File name)
    {
        String linea = null;
        try 
        {
            FileReader read = new FileReader(name);
            Scanner entrada = null;
            entrada = new Scanner(name);
            
            int c=0;
            while (entrada.hasNext())
            {
                linea = entrada.nextLine();
            }
            read.close();
        }
        catch (IOException ex) 
        {
            System.out.println("No se ha encontrado el archivo");
        }
        return linea;
    }
    /**
     * Search in a file an specific information by passing the infomation string an the file name as a File Object
     * @param name
     * @param searchPerson
     * @return The string found or "0" if it's not found
     */
    public  String searchInFile (File name,String searchPerson)
    {
        Scanner entrada;
        entrada = null;
        String linea;
        linea = "";
        String aux = null;
        boolean contains = false;
        try
        {
           
            entrada = new Scanner(name);
            while (entrada.hasNext())
            {
                linea = entrada.nextLine();
                if(linea.contains(searchPerson))
                {
                    
                    aux = linea;
                    contains = true;
                    
                }
            }
            if (!contains)
            {
                String exe = "0";
                return exe;
            }
            entrada.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.toString());
        }  
        catch (NullPointerException e) 
        {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
        } 
        return aux;
    }
    
    /**
     * method that searches through an identifying word in a file and modifies all its data.
     * @param fNew File type where it contains the path of the file.
     * @param idString parameter that contains the identification word with which it can be modified.
     * @param InputString contains all the text that will replace the existing one.
     * @return 
     * returns 0 if the modification was successful. 
     * returns -1 if the record to be modified was not found.
     */
   /* public static int modifyFile(File fNew,String idString,String InputString)
    {
        if(!searchInFile(fNew, idString).equals("0")){
        File fOverride= new File("Override");
        overrideFIle(fNew, fOverride);
        BufferedReader br;
        try
        {
                br = new BufferedReader(new FileReader(fOverride));
                String linea;
                while((linea=br.readLine()) != null)
                {
                    if(linea.contains(idString))
                    {
                        writeFile(fNew,InputString);

                    }
                    else
                    {
                        writeFile(fNew,linea+"\n");
                    }
                }
                br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        fOverride.delete();
        return 0;
        }else
            return -1;
    }
    
    /**
     * method that changes all the contents of a file to an Override file.
     * it is an auxiliary to the modifyFile method.
     * @param fNew File type parameter that has the path of the file that contains all the information to be copied.
     * @param fOverride File type parameter that has the path of the file to write.
     */
  /*  public static void overrideFIle(File fNew,File fOverride){ 
    BufferedReader br;
    try{
        if(fNew.exists()){
            br = new BufferedReader(new FileReader(fNew));
            String linea;
            while((linea=br.readLine()) != null)
            {
                    writeFile(fOverride,linea+"\n");
            }
            br.close();
        }
        else
        {
            System.out.println("Fichero no Existe");
        }
        fNew.delete();

        }catch(Exception e){
            System.out.println(e);
        }
    }
    
     void delete (String name)
    {
        File file = new File(name);
        try
        {
            if(file.exists())
            {
                file.delete();
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
     
     /**
      * method that separates a text grouped by ";". and stores it in an array of type String.
      * @param aux parameter that contains the text grouped by ";".
      * @return returns an array of type String that contains all the words separated from the aux parameter.
      * returns null if text is not separated
      */
    public static String[] dataSplit(String aux)//Funcion para separar los datos 
    {
        String[] data = null;
        data = aux.split(";");
        return data;
    }

    public FileManager() 
    {
         
    }   
    
}
