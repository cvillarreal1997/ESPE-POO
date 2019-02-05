/*
 * To change this license header, choose License Headers Customer Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template Customer the editor.
 */
package ec.edu.espe.STPCSProject.model;

import ec.edu.espe.STPCSProject.util.FileManager;
import java.util.Scanner;
import ec.edu.espe.STPCSProject.util.Validations;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Carlos Villarreal
 * @author Jose Zamora
 * @version 1.0
 * @since 0.1
 */
// un cliente es una persona
public class Customer extends Person {// Clase parcialmente lista para pruebas
    Scanner dataInput = new Scanner(System.in);
    Validations validation = new Validations();
    private Date1 ageDate = new Date1(0,0,0);
    private Date1 birthDate= new Date1(0,0,0);;
    private AgeDate date = new AgeDate();
    private String typeOfWork = null;
    private String phoneNumber = null;
    private Address homeAddress = new Address("Calle 1", "Calle 2", "San Augustin", "Estados Unidos");
    
    /**
     * Method that register dataInput the file a new customer verifing first of the
 customer is alrady registered or not
     *
     * @param costumer
     * @param dataInput
     * @return 0 if the costumer is already dataInput file; 1 if the process ended
 succesfuly
     */
    public int newCostumer(String dataInput) { //Metodo listo para pruebas
        String auxString;
        List<String> dataSplit = Arrays.asList(dataInput.split(";"));
        auxString = searchCostumer(dataSplit.get(0));
        if(auxString == "0")
        {
            FileManager.writeFile(new File("Customer.csv"), dataInput);
            return 0;
        }
        else
        {
        List<String> dataSplit2 = Arrays.asList(auxString.split(";"));
        if (((String) dataSplit.get(0)).equals((String) (dataSplit2.get(0)))) {
            return 0;
        } else {
            FileManager.writeFile(new File("Customer.csv"), dataInput);
            return 1;
        }
        }
    }

    /**
     * Method that serach the information of a costumber by its ID Card number
     *Also changes de ageDate in every search, so the date is update
     * @param cedula
     * @return The informacion of the costumer if exists; "0" if there is an
     * error
     */
    public String searchCostumer(String cedula) { //Metodo listo para pruebas
        String auxStringForUpdateDate;
        List <String> dataOutput;
        List <String> dateSplit;
        auxStringForUpdateDate = FileManager.searchInFile(new File("Customer.csv"), cedula);
        System.out.println(auxStringForUpdateDate);
        if(auxStringForUpdateDate != "0")
        {
            dataOutput = Arrays.asList(auxStringForUpdateDate.split(";"));
            dateSplit = Arrays.asList(dataOutput.get(2).split("/"));
            setAgeDate(getDate().ageCalc(Integer.parseInt((String) dateSplit.get(0)), Integer.parseInt((String) dateSplit.get(1)), Integer.parseInt((String) dateSplit.get(2))));
            auxStringForUpdateDate = dataOutput.get(0)+";"+dataOutput.get(1)+";"+dataOutput.get(2)+";"+getAgeDate().getDay()+"/"+getAgeDate().getMonth()+"/"+getAgeDate().getYear()+";"+dataOutput.get(4)+ "\r\n";
            modifyAgeDate(this,  dataOutput.get(0), auxStringForUpdateDate);
            return auxStringForUpdateDate;
        }
        else
        {
            return "0";
        }
        
    }

    /**
     * modify a client by passing your ID as identification.
     *
     * @param costumer object that serves to enter the new values.
     * @param identifyCard String type parameter that receives the card of the
     * client to be modified.
     */
    public void modifyCostumer(Person costumer, String identifyCard) {
        FileManager.modifyFile(new File("Customer.csv"), identifyCard, dataInput());
    }
    /**
     * Modify a customer age date by passing his/her ID as identification.
     *
     * @param costumer object that serves to enter the new values.
     * @param identifyCard String type parameter that receives the card of the
     * client to be modified.
     */
    public void modifyAgeDate(Person costumer, String identifyCard,String newString)
    {
        FileManager.modifyFile(new File("Customer.csv"), identifyCard, newString);
    }

    @Override
    /**
     * Method where it asks the user to enter the customer's data.
     * @return returns the grouped text of all the variables that the user
     * entered.
     */
    public String dataInput() {
        boolean auxForIDValidation;
        String auxStringForReturn;
        do {
            System.out.println("Ingrese el número de cédula del cliente");
            setIdentifyCard(dataInput.nextLine());
            validation.onlyDigit(getIdentifyCard());
            auxForIDValidation = validation.validationOfIdentifyCard(getIdentifyCard());
        } while (!auxForIDValidation);
        System.out.println("Ingrese el nombre del cliente");
        setName(dataInput.nextLine());
        System.out.println("Ingrese la fecha de nacimiento");
        setBirthDate(getDate().dataInput());
        setAgeDate(getDate().ageCalc(getBirthDate().getDay(), getBirthDate().getMonth(), getBirthDate().getYear()));
        System.out.println("Ingrese la calle principal de la direccion");
        getHomeAddress().setMainStreet(dataInput.nextLine().toUpperCase());
        System.out.println("Ingrese la calle secundaria de la direccion");
        getHomeAddress().setSecondStreet(dataInput.nextLine().toUpperCase());
        System.out.println("Ingrese la ciudad de la direccion");
        getHomeAddress().setCity(dataInput.nextLine().toUpperCase());
        System.out.println("Ingrese el pais de la direccion");
        getHomeAddress().setCountry(dataInput.nextLine().toUpperCase());
        auxStringForReturn = getIdentifyCard() + ";"
                + getName().toUpperCase() + ";"
                + getBirthDate().getDay() + "/" + getBirthDate().getMonth()
                + "/" + getBirthDate().getYear() + ";" + getAgeDate().getDay() + "/" + getAgeDate().getMonth() + "/" + getAgeDate().getYear() + ";"
                + getHomeAddress().getMainStreet().toUpperCase() + "/" + getHomeAddress().getSecondStreet().toUpperCase()
                + "/" + getHomeAddress().getCity().toUpperCase() + "/" + getHomeAddress().getCountry().toUpperCase() + "\r\n";
        //returns the full text to be entered dataInput the file
        return auxStringForReturn;
    }

    /**
     * This method prints dataInput screen all the information saved dataInput the file No
 parameters; no return
     */
    public void reportCustumer() {
        int cont = 0;
        int num = 0;
        try {
            String chain;
            String acumtotal = "";
            FileReader Ficheroread = new FileReader("Customer.csv");
            BufferedReader br = new BufferedReader(Ficheroread);
            System.out.println("\033[32m   -----------------------------------[ CLIENTES ]----------------------------------");
            String title = "CEDULA;NOMBRES;DD//MM//MM;EDAD;";
            while ((chain = br.readLine()) != null) {
                cont++;
                String id = chain.split(";")[0];
                String nombre = chain.split(";")[1];
                String fecha = chain.split(";")[2];
                String age = chain.split(";")[3];
                acumtotal += id + ";" + nombre.toUpperCase() + ";" + fecha + ";" + age + ";";
                if (chain.split(";")[1].length() > num) {
                    num = chain.split(";")[1].length();
                }

            }

            int cont2 = -1;
            int espacios = 0;
            String[][] llenar = new String[cont][4];

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 4; j++) {
                    cont2++;
                    if (acumtotal.split(";")[cont].length() <= num) {
                        espacios = 0;
                        espacios = (num) - acumtotal.split(";")[cont2].length();
                    }

                    llenar[i][j] = acumtotal.split(";")[cont2] + espace(espacios);
                }
            }
            for (int i = 0; i < 4; i++) {
                if (title.split(";")[i].length() <= num) {
                    espacios = 0;
                    espacios = (num) - title.split(";")[i].length();
                }
                System.out.print("\033[33m\t" + title.split(";")[i] + espace(espacios));
            }
            System.out.println("\n");
            System.out.println("    -------------------------------------------------------------------------------");

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 4; j++) {
                    cont2++;
                    System.out.print("\t" + llenar[i][j]);

                }
                System.out.println("\n");
                System.out.println("    -------------------------------------------------------------------------------");
            }
            br.close();
        } catch (Exception e) {
        };

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

    public Customer() {
    }

    /**
     * @return the ageDate
     */
    public Date1 getAgeDate() {
        return ageDate;
    }

    /**
     * @param ageDate the ageDate to set
     */
    public void setAgeDate(Date1 ageDate) {
        this.ageDate = ageDate;
    }

    /**
     * @return the birthDate
     */
    public Date1 getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date1 birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the date
     */
    public AgeDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(AgeDate date) {
        this.date = date;
    }

    /**
     * @return the typeOfWork
     */
    public String getTypeOfWork() {
        return typeOfWork;
    }

    /**
     * @param typeOfWork the typeOfWork to set
     */
    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the homeAddress
     */
    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    

}
    

