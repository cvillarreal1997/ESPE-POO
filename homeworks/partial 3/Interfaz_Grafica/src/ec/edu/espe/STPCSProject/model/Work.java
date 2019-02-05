/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;

import ec.edu.espe.STPCSProject.util.FileManager;
import ec.edu.espe.STPCSProject.util.Validations;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DayannaSilva
 */
public class Work {
    private Date1 initialDate = new Date1(0,0,0);
    private Date1 endDate = new Date1(0,0,0);
    private AgeDate date = new AgeDate();
    private Address placeOfTheWork = new Address("Calle 1","Calle 2","San Augustin","Estados Unidos");
    private Validations validation = new Validations();
    private float initialValue;
    private float payedValue;
    private String comments;
    private String IDCustomer;//Ingresar al modelo de atributos y metodos y al UML
    private boolean status;//Ingresar al modelo de atributos y metodos y al UML
    private String workID;//Ingresar al modelo de atributos y metodos y al UML
    Scanner scanner = new Scanner(System.in);

    /**
     * @return the initialDate
     */
    public Date1 getInitialDate() {
        return initialDate;
    }

    /**
     * @param initialDate the initialDate to set
     */
    public void setInitialDate(Date1 initialDate) {
        this.initialDate = initialDate;
    }

    /**
     * @return the endDate
     */
    public Date1 getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date1 endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the placeOfTheWork
     */
    public Address getPlaceOfTheWork() {
        return placeOfTheWork;
    }

    /**
     * @param placeOfTheWork the placeOfTheWork to set
     */
    public void setPlaceOfTheWork(Address placeOfTheWork) {
        this.placeOfTheWork = placeOfTheWork;
    }

    /**
     * @return the initialValue
     */
    public float getInitialValue() {
        return initialValue;
    }

    /**
     * @param initialValue the initialValue to set
     */
    public void setInitialValue(float initialValue) {
        this.initialValue = initialValue;
    }

    /**
     * @return the payedValue
     */
    public float getPayedValue() {
        return payedValue;
    }

    /**
     * @param payedValue the payedValue to set
     */
    public void setPayedValue(float payedValue) {
        this.payedValue = payedValue;
    }

    public Work() 
    {
        
    }
    public void newWork()
    {
        Customer person = new Customer();
        String data;
        String ID;
        System.out.println("Bienvenido");
        System.out.println("Ingrese el número de cédula del cliente por favor");
        ID = scanner.nextLine();
        data = person.searchCostumer(ID); 
        System.out.println(data);
        FileManager.createFile(new File("Works.csv"));
        /*if ("0".equals(data))
        {
            System.out.println("El cliente no esta registrado, por favor regrese el menu principal y registre al cliente");
        }
        else
        {*/
            String aux;//Almacena la cadena a guardarse en el archivo
            aux = inText(person, false, ID);
            if("0".equals(aux))
            {
                System.out.println("Trabajo Registrado");
            }
            else
            {
            FileManager.writeFile(new File("Works.csv"), aux);
            System.out.println(aux);
            }
        //}
    }
    
    public String searchWork(String ID){//Requiere que se le pase el ID del trabajo en el main o en la clase que lo utilice, devuelve un arreglo de String con los dato separados en CSV
        String aux = "";
        String[] dataSplitWork = null;
        String[] dataSplitCustomer = null;
        String dataOut = "";
        aux = FileManager.searchInFile(new File("Works.csv"), ID);
        if("0".equals(aux))
        {
            System.out.println("Regrese el menú principal. Trabajo no encontrado");
            return "0";
        }
        else
        {
        dataSplitWork = FileManager.dataSplit(aux);
        if(dataSplitWork[8].equals(ID))
        {
        aux = FileManager.searchInFile(new File("Works.csv"), dataSplitWork[0]);
        dataSplitCustomer = FileManager.dataSplit(aux);
        dataOut =(dataSplitCustomer[0]+";"+dataSplitCustomer[1]+";"+dataSplitWork[8]+";"+dataSplitWork[1]+";"+dataSplitWork[2]+";"+dataSplitWork[3]+";"+dataSplitWork[6]+";"+dataSplitWork[7]+";"+dataSplitWork[4]+";"+dataSplitWork[5]);
        return dataOut;
        }
        else
        {
            System.out.println("Trabajo no encontrado");
            return "0";
        }
        }
    }

    /**
     * This method performs the function of modifying a job, 
     * within which the user will be asked to enter an identifier which will serve to identify 
     * the text to be modified.
     */
    public void modifyWork(){
        String data="";
        System.out.println("Ingrese el número de cédula del encargado del trabajo");
        workID = scanner.nextLine();
        FileManager.modifyFile(new File("Works.csv"), workID, inText(new Customer(), true,workID));
    }
    
    /**
     * method where it asks the user to enter the work data.
     * @param person object that stores all the variables entered by the user
     * @param checkModifyOrNew this parameter is used together to modifyWork,
     * if it is true it will print a text that says that it enters new data, 
     * false it is used if data is entered for the first time.
     * @param id String type parameter that receives the card of the client to be modified.
     * @return 
     * returns the grouped text of all the variables that the urinal entered.
     */
    public String inText(Customer person, boolean checkModifyOrNew, String id){
        int aux = 0;
        int aux3=0;
        String aux2;//Almacena la cadena de comparacion para verificar la existencia o no del trabajo
        String preID;
        if(checkModifyOrNew){
            System.out.println("*** Ingrese los nuevos datos ***");
            System.out.println("Ingrese el nuevo número de cédula del encargado(si no se desea cambiar su cédula digite 0) ");
            preID = scanner.nextLine();
            if(!preID.equals("0"))
                id = preID;
        }
        do
        {
        System.out.println("Ingrese el ID con el cual se identificará al trabajo");
        workID = scanner.nextLine();
        List <String> auxList = Arrays.asList(searchWork(workID).split(";"));
        if(workID.equals(auxList.get(0)))
        {
            System.out.println("La obra ya existe");
            System.out.println("Asigne otro ID al trabajo?");
            aux = 1;//El trabajo ya existe
        }
        else
        {
            aux = 0;
        }
        }
        while(aux == 1);
        System.out.println("Ingrese la fecha de inicio del trabajo");
        System.out.println("La fecha actual (DD/MM/AA)es: "+initialDate.getActualDay()+"/"+initialDate.getActualMonth()+"/"+initialDate.getActualYear());
        do
        {
            initialDate = date.dataInput();
            if(initialDate.getYear()<2017)
            {
                System.out.println("No puede ingresar una fecha de inicio menor al año 2017");
                aux =1;
            }
            else
            {
                aux = 0;
            }
        }while(aux == 1);
        System.out.println("Ingrese la fecha de finalizacion esperada del trabajo");
        do
        {
            System.out.println("Ingrese el año");
            endDate.setYear(validation.numberScanInt());
            System.out.println("Ingrese el mes");
            endDate.setMonth(validation.numberScanInt());
            System.out.println("Ingrese el día");
            endDate.setDay(validation.numberScanInt());
            if(endDate.getYear()<initialDate.getYear() || endDate.getYear()<2017)
            {
                System.err.println("Error");
                System.err.println("Usted no puede ingresar una fecha inferior a la fecha de inicio del proyecto");
                System.out.println("Intentelo otra vez");
                aux = 1;
            }
            else if(endDate.getYear() == initialDate.getYear() && endDate.getMonth()<initialDate.getMonth())
            {
                System.err.println("Error");
                System.err.println("Usted no puede ingresar una fecha inferior a la fecha de inicio del proyecto");
                System.out.println("Intentelo otra vez");
                aux = 1;
            }
            else if(endDate.getYear() == initialDate.getYear() && endDate.getMonth() == initialDate.getMonth() && endDate.getDay()<initialDate.getDay())
            {
                System.err.println("Error");
                System.err.println("Usted no puede ingresar una fecha inferior a la fecha de inicio del proyecto");
                System.out.println("Intentelo otra vez");
                aux = 1;
            }
            else
            {
                aux = 0;
            }
        }while(aux == 1);
        
        System.out.println("Ingrese la dirección de la obra");
        System.out.println("Calle Principal:");
        placeOfTheWork.setMainStreet(scanner.nextLine().toUpperCase());
        System.out.println("Calle Secundaria:");
        placeOfTheWork.setSecondStreet(scanner.nextLine().toUpperCase());
        System.out.println("Ciudad:");
        placeOfTheWork.setCity(scanner.nextLine().toUpperCase());
        System.out.println("País:");
        placeOfTheWork.setCountry(scanner.nextLine().toUpperCase());
        System.out.println("Ingrese el valor total de la obra");
        initialValue = validation.numberScanFloat();
        do
        {
            System.out.println("Ingrese el valor pagado, en caso de ser a credito totalmente ingrese 0");
            payedValue = validation.numberScanFloat();
            if(payedValue > initialValue)
            {
                System.err.println("No puede ingresar un valor de pago superior al valor de la obra");
                System.out.println("Intentelo otra vez");
                aux = 1;
                
            }
            else
            {
                aux = 0;
            }
        }while(aux == 1);
        System.out.println("Comentarios");
        comments = scanner.nextLine();
        comments.toUpperCase();
        status = true;
        return  id +";" + initialDate.getDay() + "/" 
                + initialDate.getMonth() + "/" + initialDate.getYear() 
                + ";" + endDate.getDay() + "/" + endDate.getMonth() + "/" 
                + endDate.getYear() + ";" + placeOfTheWork.getMainStreet().toUpperCase()
                + "/" + placeOfTheWork.getSecondStreet().toUpperCase() + "/" 
                + placeOfTheWork.getCity().toUpperCase() + "/" + placeOfTheWork.getCountry().toUpperCase()
                + ";" + initialValue + ";" + payedValue + ";" + status + ";" 
                + comments.toUpperCase()+";"+workID+"\n";
        /*
        data2 = FileManager.dataSplit(aux2);
        if(data2[8].equals(workID) && !checkModifyOrNew){
            System.out.println("El ID del trabajo ya esta registrado");
            System.out.println("Asigando al cliente: "+ dataMembers[1]);
            System.out.println("Fecha de finalizacion esperada: "+data2[2]);
            return "0";
        
    }*/
    }
    public float valorACobrar(String ID)
    {
        String aux = null;
        aux = searchWork(ID);
        float valor=0;
        List<String> workData = Arrays.asList(aux.split(";"));
        System.out.println(workData);
        valor = Float.parseFloat(workData.get(8))-Float.parseFloat(workData.get(9));
        return valor;
    }
}
