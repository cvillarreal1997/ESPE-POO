/*
 * To change this license header, choose License Headers dataInput Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template dataInput the editor.
 */
package ec.edu.espe.STPCSProject.model;

import java.util.Scanner;
import ec.edu.espe.STPCSProject.util.Validations;
import ec.edu.espe.STPCSProject.util.FileManager;
import ec.edu.espe.STPCSProject.util.FileSTPCS;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Villarreal
 */
public class Employee extends Person {//Clase lista para pruebas
FileSTPCS file = new FileSTPCS();
FileManager file1= new FileManager();
    Scanner dataInput = new Scanner(System.in);
    Validations validation = new Validations();
    private Date1 dateOfAdmission = new Date1(0, 0, 0);
    private Date1 ageDate = new Date1(0, 0, 0);
    private AgeDate date = new AgeDate();
    //Eliminar typeOfWorker
    private float salary = 0.0F;
    private Address homeAddress = new Address("Calle 1", "Calle 2", "San Augustin", "Estados Unidos");

    public Employee() {
    }

    public int newWorker(Person employee, String dataInput) {

        String auxString;
        List<String> dataSplit = Arrays.asList(dataInput.split(";"));
        auxString = searchEmployee(dataSplit.get(0));
        List<String> dataSplit2 = Arrays.asList(auxString.split(";"));
        if (dataSplit.get(0).equals(dataSplit2.get(0))) {
            return 0;
        } else {
            FileManager.writeFile(new File("Employee.csv"), dataInput);
            return 1;
        }
    }

    public String searchEmployee(String IDcard) {
        String aux;
        aux = FileManager.searchInFile(new File("Employee.csv"), IDcard);
        List<String> data = Arrays.asList(aux.split(";"));
        if (aux == "0") {
            System.out.println("El empleado no existe. Por favor creelo");
            return "0";
        } else {
            if (IDcard.equals(data.get(0))) {
                return aux;
            } else {
                System.out.println("El empleado no existe. Por favor creelo");
                return "0";
            }
        }
    }

    public int modifyEmployee(String IDcard) {
        String aux;
        aux = searchEmployee(IDcard);
        if (aux == "0") {
            return 1;
        } else {
            FileManager.modifyFile(new File("Employee.csv"), IDcard, dataInput());
            return 0;
        }
    }

    @Override
    /**
     * Method where it asks the user to enter the customer's data.
     *
     * @return returns the grouped text of all the variables that the user
     * entered.
     */
    public String dataInput() {
        String aux = "";
        int aux1 = 0;
        System.out.println("Bienvenido");
        System.out.println("Ingrese el número de cédula del empleado");
        setIdentifyCard(dataInput.nextLine());
        validation.validationOfIdentifyCard(getIdentifyCard());
        setIdentifyCard(getIdentifyCard());
        while (validation.validationOfIdentifyCard(getIdentifyCard()) == false) {
            System.out.println("Ingrese el número de cédula del empleado");
            setIdentifyCard(dataInput.nextLine());
            validation.validationOfIdentifyCard(getIdentifyCard());
            setIdentifyCard(getIdentifyCard());
        }
        System.out.println("Ingrese el nombre del empleado");
        setName(dataInput.nextLine().toUpperCase());
        System.out.println("Ingrese la fecha de nacimiento del empleado");
        setDateOfBirth(date.dataInput());
        ageDate = date.ageCalc(getDateOfBirth().getDay(), getDateOfBirth().getMonth(), getDateOfBirth().getYear());
        do {
            System.out.println("Ingresa la fecha de admisión del empleado");
            System.out.print("Ingrese el año: ");
            dateOfAdmission.setYear(validation.numberScanInt());
            System.out.print("Ingrese el mes: ");
            dateOfAdmission.setMonth(validation.numberScanInt());
            System.out.print("Ingrese el día: ");
            dateOfAdmission.setDay(validation.numberScanInt());
            if (dateOfAdmission.getYear() <= 0 || dateOfAdmission.getYear() < ageDate.getYear() || dateOfAdmission.getYear() > ageDate.getActualYear()) {
                aux1 = 1;
            } else if (dateOfAdmission.getMonth() <= 0 || (dateOfAdmission.getYear() == ageDate.getYear() && dateOfAdmission.getMonth() < ageDate.getMonth()) || ((dateOfAdmission.getYear() == ageDate.getActualYear()) && (dateOfAdmission.getMonth() > ageDate.getActualMonth() + 1))) {
                aux1 = 1;
            } else if (dateOfAdmission.getDay() <= 0 || (dateOfAdmission.getYear() == ageDate.getYear() || dateOfAdmission.getMonth() == ageDate.getMonth() && dateOfAdmission.getDay() < ageDate.getDay()) || ((dateOfAdmission.getYear() == ageDate.getActualYear()) && (dateOfAdmission.getMonth() == ageDate.getActualMonth() + 1)) && dateOfAdmission.getDay() > ageDate.getActualDay()) {
                aux1 = 1;
            } else {
                aux1 = 0;
            }
        } while (aux1 == 1);
        System.out.println("Ingrese la calle principal de la dirección");
        homeAddress.setMainStreet(dataInput.nextLine().toUpperCase());
        System.out.println("Ingrese la calle secundaria de la dirección");
        homeAddress.setSecondStreet(dataInput.nextLine().toUpperCase());
        System.out.println("Ingrese la ciudad de la dirección");
        homeAddress.setCity(dataInput.nextLine().toUpperCase());
        System.out.println("Ingrese el País de la dirección");
        homeAddress.setCountry(dataInput.nextLine().toUpperCase());
        System.out.println("Ingrese el sueldo mensual del empleado");
        salary = validation.numberScanInt();
        aux = (getIdentifyCard() + ";" + getName().toUpperCase() + ";" + getDateOfBirth().getDay() + "/" + getDateOfBirth().getMonth() + "/" + getDateOfBirth().getYear() + ";" + dateOfAdmission.getDay() + "/" + dateOfAdmission.getMonth() + "/" + dateOfAdmission.getYear() + ";" + ageDate.getYear() + ";" + homeAddress.getMainStreet().toUpperCase() + "/" + homeAddress.getSecondStreet().toUpperCase() + "/" + homeAddress.getCity().toUpperCase() + "/" + homeAddress.getCountry().toUpperCase() + ";" + salary) + "\n";
        return aux;
    }

    public DefaultTableModel reportEmployee() {
        DefaultTableModel model=new DefaultTableModel ();
        FileSTPCS file= new FileSTPCS ();
        model.addColumn("Cédula");
        model.addColumn("Nombre");
        model.addColumn("Edad");
        model.addColumn("Fecha de Ingreso");
        model.addColumn("Calle Principal");
        model.addColumn("Calle Secundaria");
        model.addColumn("Ciudad");
        model=file.readDatasTable("Employee.csv", model);
        
        return model;

    }
    
    
    public String modifyTable(String route, String wordsearch,int nmparam, int numelement, String newword){
      File route1 =new File ("Employee.csv");
        String acum=""; 
          String acum2="";  
        String []elementos = new String [nmparam];
        String chain;
     
         
        
        try{
        FileReader fileOld =new FileReader(route);
        
        BufferedReader br1 = new BufferedReader(fileOld);
        while((chain = br1.readLine())!= null) {
            if(chain.indexOf(";")!= -1){
                if (chain.split(";")[numelement].equalsIgnoreCase(wordsearch)) {
                    for(int i =0;i<nmparam;i++){
                        if(i!=numelement){
                           elementos[i]=chain.split(";")[i];  
                        }else{
                            elementos[i]=newword;
                        }
                    }
                    for(int i =0;i<nmparam;i++){
                    acum+=elementos[i]+";";
                    chain=acum;
                 }  
                       
                }
                acum2+=chain+"\n";
           
                 
            }
           
        }
            
             
       
        br1.close();  
         file.deleteFile(route1);
         file1.writeFile(route1, acum2);
        }catch(Exception e){};
        
          return acum;    
        }
            
        
            
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String espace(int esp) {
        int cont = 0;
        String es = "";
        while (cont <= esp) {
            cont++;
            es += " ";
        }
        return es;
    }
}


