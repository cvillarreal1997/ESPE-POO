
package ec.edu.espe.STPCSProject.model;


import ec.edu.espe.STPCSProject.util.FileManager;
import ec.edu.espe.STPCSProject.util.Validations;
import ec.edu.espe.STPCSProject.util.FileSTPCS;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jose
 */
public class Provider {
Validations validation = new Validations();
    Scanner in = new Scanner(System.in);
    private String phoneNumber, phoneNumber2;
    private String typeOfTransportation;
    private String nameProvider, nameCompany;
    private String identifycard;
    private String ruc;
    private String wordsearch;
    FileManager file1 = new FileManager();
    FileSTPCS file2 = new FileSTPCS();

    
    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getRuc() {
        return ruc;
    }

    /**
     * @return the phoneNumber
     */
    public void setRuc(String ruc) {    
        this.ruc = ruc;
    }

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
     * @return the typeOfTransportation
     */
    public String getTypeOfTransportation() {
        return typeOfTransportation;
    }

    /**
     * @param typeOfTransportation the typeOfTransportation to set
     */
    public void setTypeOfTransportation(String typeOfTransportation) {
        this.typeOfTransportation = typeOfTransportation;
    }

    public Provider(String phoneNumber, String typeOfTransportation) {
        this.phoneNumber = phoneNumber;
        this.typeOfTransportation = typeOfTransportation;
    }

    public Provider() {

    }

    /**
     * This method performs the function of modifying a provider, 
     * within which the user will be asked to enter an identifier which will serve to identify 
     * the text to be modified.
     */
    public void modifyProvider() {
        String data = "";
        String idProvider = "";
        System.out.println("Ingrese el número de cédula del proveedor que desee modificar");
        idProvider = in.nextLine();

        FileManager.modifyFile(new File("Provider.csv"), idProvider, inText(true));
    }

    public void newProvider() {
        String cadena;
        cadena = inText(false);
        FileManager.writeFile(new File("Provider.csv"), cadena);

    }

    /**
     * method where it asks the user to enter the provider`s data.
     * @param checkModify this parameter is used together to modifyWork,
     * if it is true it will print a text that says that it enters new data, 
     * false it is used if data is entered for the first time.
     * @return 
     * returns the grouped text of all the variables that the urinal entered.
     */
    public String inText(boolean checkModify) {
        boolean aux, aux2, aux3;
        if (checkModify) {
            System.out.println("Ingrese los nuevos datos");
        } else {
            System.out.println("                   *****Provedores*******");
        }
        System.out.println("Ingrese el Nombre del Provedor");
        nameProvider = in.nextLine().toUpperCase();
       
        System.out.println("Ingrese el Nombre la Empresa");
        nameCompany = in.nextLine().toUpperCase();
        
        do {
            System.out.println("Ingrese RUC");
            ruc = in.nextLine();
            validation.onlyDigit(ruc);
            aux=validation.validationRuc(ruc);
        } while (!aux);
        do {
            System.out.println("Ingrese el número del celular del provedor");
            phoneNumber = in.nextLine();
            validation.onlyDigit(phoneNumber);
            aux2 = validation.validationPhoneNumber(phoneNumber);
        } while (!aux2);
        do {
            System.out.println("Ingrese el número de teléfono Convencional del provedor anteponiendo el c[odigo provincial (02_____)");
            phoneNumber2 = in.nextLine();
            validation.onlyDigit(phoneNumber2);
            aux3 = validation.validationPhoneNumber2(phoneNumber2);
        } while (!aux3);
        return ruc + ";" + nameProvider.toUpperCase() + ";" + nameCompany.toUpperCase() + ";" + phoneNumber + ";" + phoneNumber2 + "\n";
    }

    public void reportProvider() {
        int cont = 0;
        int num = 0;
        try {
            String chain;
            String acumtotal = "";
            FileReader Ficheroread = new FileReader("Provider.csv");
            BufferedReader br = new BufferedReader(Ficheroread);
            System.out.println("\033[32m   --------------------------------------------------[ PROVEDORES ]--------------------------------------------");
            String title = "RUC;NOMBRES;EMPRESA;TELÉFONO;CELULAR;";
            while ((chain = br.readLine()) != null) {
                cont++;
                String id = chain.split(";")[0];
                String nombre = chain.split(";")[1];
                String comp = chain.split(";")[2];
                String telf = "0"+chain.split(";")[3];
                String phone = chain.split(";")[4];
                acumtotal += id + ";" + nombre.toUpperCase() + ";" + comp.toUpperCase() + ";" + telf + ";" + phone + ";";
                if (chain.split(";")[0].length() > num) {
                    num = chain.split(";")[1].length();
                }

            }

            int cont2 = -1;
            int espacios = 0;
            String[][] llenar = new String[cont][5];

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 5; j++) {
                    cont2++;
                    if (acumtotal.split(";")[cont].length() <= num) {
                        espacios = 0;
                        espacios = (num) - acumtotal.split(";")[cont2].length();
                    }

                    llenar[i][j] = acumtotal.split(";")[cont2] + espace(espacios);
                }
            }
            for (int i = 0; i < 5; i++) {
                if (title.split(";")[i].length() <= num) {
                    espacios = 0;
                    espacios = (num) - title.split(";")[i].length();
                }
                System.out.print("\033[33m\t" + title.split(";")[i] + espace(espacios));
            }
            System.out.println("\n");
            System.out.println("    ---------------------------------------------------------------------------------------------------------");

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 5; j++) {
                    cont2++;
                    System.out.print("\t"+llenar[i][j]);

                }
                System.out.println("\n");
                System.out.println("    ---------------------------------------------------------------------------------------------------------");
            }
            br.close();
        } catch (Exception e) {
        };

    }

    public String searchProvider() {
        System.out.println("Ingrese la cédula del proveedor");
        String identyfy = in.nextLine();
        String cad = "";
        String chain;
        try {
            FileReader fileOld = new FileReader("Provider.csv");

            BufferedReader br1 = new BufferedReader(fileOld);
            while ((chain = br1.readLine()) != null) {
                if (chain.indexOf(";") != -1) {
                    if (chain.split(";")[0].equalsIgnoreCase(identyfy)) {
                        //JOptionPane.showMessageDialog(null,"Registro encontrado \n"+ chain);
                        System.out.println("Registro encontrado \n" + chain);
                        cad = chain;
                    }
                }
            }
            br1.close();
        } catch (Exception e) {
        };

        return cad;

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