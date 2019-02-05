/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;
import ec.edu.espe.STPCSProject.util.FileManager;
import java.util.Scanner;
import ec.edu.espe.STPCSProject.util.Validations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author DayannaSilva
 * @author Jose Zamora
 * @version 1.0
 * @since 0.1
 */
public class Inventory  {//Clase parcialmente lista para pruebas
    protected Material material = new Material();
    private FileManager file = new FileManager();
    private Scanner scanner = new Scanner(System.in);
    private Validations validation = new Validations();
    protected int quantity;
    protected int placeCode;//Codigo de la bodega - EJ:001 Bodega 1
    protected String notes;
    private String name;//Agregar al modelo

    /**
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the placeCode
     */
    public int getPlaceCode() {
        return placeCode;
    }

    /**
     * @param placeCode the placeCode to set
     */
    public void setPlaceCode(int placeCode) {
        this.placeCode = placeCode;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Inventory() {
        
    }
    /**
     * This method register in the file a new product verifing first if the produt is already registered
     * @param IDCode
     * @param name
     * @param typeOfMaterial
     * @param placeCode
     * @param quantity
     * @return "0" if there is an error; "1" if the product is succesfuly registered
     */
    public String inventoryNewInput(String IDCode,String name,String typeOfMaterial,int placeCode,int quantity)//Lista para pruebas
    {
        material.setIdentificationCode(IDCode);
        material.setTypeOfMaterial(typeOfMaterial);
        this.placeCode = placeCode;
        this.quantity = quantity;
        this.name = name;
        String aux = material.getIdentificationCode()+";"+this.name.toUpperCase()+";"+material.getTypeOfMaterial().toUpperCase()+";"+this.placeCode+";"+this.quantity+"\n";
        List <String> auxList = Arrays.asList(searchInInventory(IDCode).split(";"));
        if(IDCode.equals(auxList.get(0)))
        {
            return "0";
        }
        else
        {
            FileManager.writeFile(new File("Inventory.csv"),aux);
            return "1";
        }
    }
    /**
     * Metohd with no parameters that ask the user tho enter by keyboard the requiered information
     * @return An Array List with the necesary information
     */
    public ArrayList dataInput()
    {
        ArrayList dataInput = new ArrayList();
        System.out.println("Ingrese el código de identificación del producto");
        dataInput.add(scanner.nextLine());
        System.out.println("Ingrese el nombre del prodcuto");
        dataInput.add(scanner.nextLine());
        System.out.println("Ingrese el tipo de producto");
        dataInput.add(scanner.nextLine());
        System.out.println("Ingrese el código de la bodega del producto");
        dataInput.add(validation.numberScanInt());
        System.out.println("Ingrese la cantidad de producto a ingresar");
        dataInput.add(validation.numberScanInt());
        System.out.println(dataInput.get(4));
        return dataInput;
    }
    /**
     * This method serach in the file a product by its ID Code
     * @param IDCode
     * @return "0" if there is an error; the product information if ended succesfuly
     */
    public String searchInInventory(String IDCode)//Lista para pruebas
    {
        String aux;
        aux = file.searchInFile(new File("Inventory.csv"),IDCode);
        if(aux == "0")
        {
            return "0";
        }
        else
        {
            List <String> dataOutput = Arrays.asList(aux.split(";"));
            if(dataOutput.get(0).equals(IDCode))
            {
                return aux;
            }
            else
            {
                return "0";
            }
        }
    }
    /**
     * modify an element of the file by passing its ID code. 
     * @param IDCode
     * @return a null String if there is an error; the information of the new product if the process ended succesfuly
     */
    public String modifyInventory(String IDCode)//Lista para pruebas
    {
        String aux,aux2;
        aux = searchInInventory(IDCode);
        if(aux == "0")
        {
            return null;
        }
        else
        {
            ArrayList data = new ArrayList();
            data = dataInput();
            aux2 = data.get(0)+";"+data.get(1)+';'+data.get(2)+";"+data.get(3)+";"+data.get(4)+"\n";
            FileManager.modifyFile(new File("Inventory.csv"),IDCode,aux2);
            return aux2;
        }
    }
    
    /**
     * This method prints in screen all the information saved in the file
     * No parameters; no return
     */
    public void reportInventory() {
        int cont = 0;
        int num = 0;
        try {
            String chain;
            String acumtotal = "";
            FileReader Ficheroread = new FileReader("Inventory.csv");
            BufferedReader br = new BufferedReader(Ficheroread);
            System.out.println("\033[32m   ------------------------------------------------------------------[ INVENTARIO ]------------------------------------------------------");
            String title = "NUM;NOMBRE;TIPO;CODIGO;CANTIDAD;";
            while ((chain = br.readLine()) != null) {
                cont++;
                String id = chain.split(";")[0];
                String nombre = chain.split(";")[1];
                String type = chain.split(";")[2];
                String cod = "0"+chain.split(";")[3];
                String cant = chain.split(";")[4];
                acumtotal += id + ";" + nombre.toUpperCase() + ";" + type.toUpperCase() + ";" + cod+ ";" + cant + ";";
                if (chain.split(";")[1].length() > num) {
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
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

            for (int i = 0; i < cont; i++) {
                for (int j = 0; j < 5; j++) {
                    cont2++;
                    System.out.print("\t"+llenar[i][j]);

                }
                System.out.println("\n");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
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

  

}
