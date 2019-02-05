/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos Villarreal
 */
public class FileSTPCS {
    String search;
   
    public void writeFile(File file,String chain){
        BufferedWriter bw;
        try
        {
         if(!file.exists())
         {
             file.createNewFile();
             
         }
            bw = new BufferedWriter(new FileWriter(file,true));
            bw.write(chain);
            bw.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public void readFile(String route) throws FileNotFoundException,IOException {
        String chain;
        String accumulator="";
        FileReader Ficheroread= new FileReader(route);
        BufferedReader br = new BufferedReader(Ficheroread);
        while((chain=br.readLine())!=null){
            accumulator = (accumulator +chain)+"\n";
        }
        JOptionPane.showMessageDialog(null,"    REGISTRO DE EDADES (AA/MM/DD)\n"+accumulator);
        br.close();         
    }


    public void deleteFile (File fichero) {

    if (!fichero.exists()) {
        System.out.println("El archivo data no existe.");
    } else {
        fichero.delete();
        System.out.println("El archivo data fue eliminado.");
    }

}
    
    public String searchDatas ( String route, String wordsearch){
        String cad="";
        String chain;
        try{
        FileReader fileOld =new FileReader(route);
        
        BufferedReader br1 = new BufferedReader(fileOld);
        while((chain = br1.readLine())!= null) {
            if(chain.indexOf(";")!= -1){
                if (chain.split(";")[1].equalsIgnoreCase(wordsearch)) {
                   //JOptionPane.showMessageDialog(null,"Registro encontrado \n"+ chain);
                    System.out.println("Registro encontrado \n"+chain);
                    cad=chain;     
                }
            }
        }
        br1.close();  
        }catch(Exception e){};
        
          return cad;    
        } 
   
    public boolean searchboolean( String route, String wordsearch){
        String cad="";
        String chain;
        try{
        FileReader fileOld =new FileReader(route);
        
        BufferedReader br1 = new BufferedReader(fileOld);
        while((chain = br1.readLine())!= null) {
            if(chain.indexOf(";")!= -1){
                if (chain.split(";")[1].equalsIgnoreCase(wordsearch)) {
                   //JOptionPane.showMessageDialog(null,"Registro encontrado \n"+ chain);
                    return true;    
               
                }
            }
        }
        br1.close();  
        }catch(Exception e){};
        
     return false;
        }    
    
    /*
    method that receives as parameters a path,
    the name (identifier to modify),instring (the text to enter),
    check (if it is false deletes the record that is sent to search,
    true simply modifies it)
    */
    public void modifyFile(String path, String name, String inString, boolean check){
        ArrayList<String> line = new ArrayList<String>();
        line = reader(path);

        if(check){
            for (int i = 0; i < line.size()-1; i++)
                if(line.get(i).contains(name)){
                    line.set(i,inString);
                    System.out.println("line: "+ line.get(i));
                }
        }else{
            for (int i = 0; i < line.size()-1; i++)
                if(line.get(i).contains(name))
                    line.remove(i);
        }  
        try{

            BufferedWriter buffWriter = new BufferedWriter(
                    new FileWriter(path));
            for(int i = 0; i < line.size()-1; i++){
                buffWriter.write(line.get(i)+"\n");
                System.out.print(line.get(i));
            }
            buffWriter.close();

        }catch(IOException e){
            System.out.println("No se encontro el archivo o"
                    + " ha ocurrido un error fatal :)");
        }
    }
        
    //method that is used to help modify the file, is an auxiliary to the modifyFile method
    public ArrayList<String> reader(String path){
        ArrayList<String> line = new ArrayList<String>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            int i =0;
            line.add("");
            while(line.get(i) != null){
                line.add(reader.readLine());
                i++;
            }
            reader.close();
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
        return line;
    }
    
    
    //metodo de prueba se salario
       public DefaultTableModel readDatasTable(String route,DefaultTableModel model)  {
          int cont=0;
        String chain;
        String acumulator="";
        try {
        FileReader Ficheroread= new FileReader(route);
        BufferedReader br = new BufferedReader(Ficheroread);
        while((chain=br.readLine())!=null){
            StringTokenizer dato =new StringTokenizer(chain,";");
            Vector x = new Vector ();
            while (dato.hasMoreTokens()){
                x.addElement(dato.nextElement());
            }
           model.addRow(x);
        }
     
        br.close(); 
        }catch (Exception e){}     
        return model;
    }
       public int  Calculatedaño (int day,int mes,int age ) {
        
        Calendar cal = new GregorianCalendar();
        Operation calculo= new Operation();
        int rage,rmonth,rday;
        int ageactually=cal.get(Calendar.YEAR);
        int meslly=cal.get(Calendar.MONTH)+1;
        int daylly=cal.get(Calendar.DAY_OF_MONTH);
        rage=calculo.rest(ageactually, age);
        rmonth=calculo.rest(meslly, mes);
        if (day<0|day>31){
           
           
        }
        if (mes<0|mes>12){
           
         
        }
        if (age<0|age>ageactually){
           
        }
        if (day>daylly){
            rmonth=rmonth-1;
        }
          rday=calculo.rest(daylly, day);
        if(rday<0){
            rday=rday+31; 
    }
        if(meslly==mes){
            rmonth=0;
            
            
        }
        
    if(rage<0 |rmonth<0|rday<0 && age==ageactually){
        
      
      }
     if(mes>meslly){
          rmonth=rmonth+12;
      }
         if (ageactually==age&&day==daylly&&mes==meslly){
            ;
            
        }
        
       return rage;
        
    }
    
    public  void salaryModify(String path, String name, String inString, boolean check){
       ArrayList<String> line2 = new ArrayList<String>();
        line2 = reader(path);

        if(check){
            for (int i = 0; i < line2.size()-1; i++)
                if(line2.get(i).contains(name)){
                    line2.set(i,inString);
                    //System.out.println("line: "+ line.get(i));
                }
        }else{
            for (int i = 0; i < line2.size()-1; i++)
                if(line2.get(i).contains(name))
                    line2.remove(i);
        }  
        try{

            BufferedWriter buffWriter = new BufferedWriter(
                    new FileWriter(path));
            for(int i = 0; i < line2.size()-1; i++){
                buffWriter.write(line2.get(i)+"\n");
                //System.out.print(line.get(i));
            }
            buffWriter.close();

        }catch(IOException e){
            System.out.println("No se encontro el archivo o"
                    + " ha ocurrido un error fatal :)");
        }
}
        
}
    
    
