/*
 * To change this license header, choose License Headers Customer Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template Customer the editor.
 */
package ec.edu.espe.STPCSProject.model;

import ec.edu.espe.STPCSProject.util.FileManager;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JDIsmael
 * @author Jose Zamora
 * @version 1.0
 * @since 0.1
 *
 */
public class Admin extends Person {//Lista en el diagrama

    //Eliminar typeOFTransportation del modelo
    private String adminUsername;//Agregar al modelo
    private String adminPassword;//Agregar al modelo
    private final String masterUsername = "Admin@2018";
    private final String masterPassword = "GURL7MjeyZBhCDb";
    private final Scanner scanner = new Scanner(System.in);

    public Admin(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    /**
     * Method that register a new administrator with its password in the file
     *
     * @param masterUsername
     * @param masterPassword
     * @param usernameAndPasswordString
     * @return int 0 if the process ended succesfully; 1 if the process has an
     * error
     */
    public int adminUserNamePasswordCreation(String masterUsername, String masterPassword, String usernameAndPasswordString) {
        FileManager.createFile(new File("DataP.txt"));
        List<String> auxListActualInput = Arrays.asList(usernameAndPasswordString.split(";"));
        List<String> auxListSearchInfile;
        auxListSearchInfile = searchCredentialData(auxListActualInput.get(0));
        if (((String) auxListActualInput.get(0)).equals(((String) auxListActualInput.get(0)))) {
            System.out.println("Nombre de usuario ya registrado");
            return 1;
        } else {
            if (this.masterUsername.equals(masterUsername) && this.masterPassword.equals(masterPassword)) {
                FileManager.writeFile(new File("DataP.txt"), usernameAndPasswordString);
                System.out.println("Guardado exitoso");
                return 0;
            } else {
                System.out.println("Error");
                System.out.println("Nombre de usuario o contraseña maestra incorrectos");
                return 1;
            }
        }
    }

    @Override
    /**
     * Method that helps with the data input, it validates if the administrator
     * username is in the file or not.
     *
     * @return A String containing the necesary data to save in the file
     */
    public String dataInput() {
        FileManager.createFile(new File("DataP.txt"));
        String auxStringDataSearch;
        List<String> auxListDataOutput;
        System.out.println("Bienvenido administrador maestro");
        System.out.println("Por favor ingrese el nombre de usuario del administrador que desea añadir");
        adminUsername = scanner.nextLine();
        auxStringDataSearch = FileManager.searchInFile(new File("DataP.txt"), adminUsername);
        auxListDataOutput = Arrays.asList(auxStringDataSearch.split(";"));
        if ("0".equals(auxListDataOutput.get(0))) {
            System.out.println("El nombre de administrador esta disponible");
            System.out.println("Ingrese la contrasena del administrador");
            adminPassword = scanner.nextLine();
            return adminUsername + ";" + adminPassword + "\r\n";
        } else if (adminUsername.equals(auxListDataOutput.get(0))) {
            System.out.println("El nombre de usuario ya existe");
            return "0";//Revisar que return debe tener para continuar el programa, ademas poner la funcion aux() para pregunatr si quiere seguir en el ingreso o salir del programa
        } else {
            System.out.println("El nombre de administrador esta disponible");
            System.out.println("Ingrese la contrasena del administrador");
            adminPassword = scanner.nextLine();
            return adminUsername + ";" + adminPassword + "\r\n";
        }
    }

    /**
     * Method that serach the information of an administrator by its username
     *
     * @param username
     * @return A null List of Strings if the process has errors else returns a
     * List of Strings with the data of an administrator
     */
    public List searchCredentialData(String username) {
        String auxStringDataSearch;
        List<String> dataOutput;
        auxStringDataSearch = FileManager.searchInFile(new File("DataP.txt"), username);
        dataOutput = Arrays.asList(auxStringDataSearch.split(";"));
        if ("0".equals(dataOutput.get(0))) {
            System.out.println("El nombre de usuario no existe");
            System.out.println("Por favor ingrese como administrador maestro y creelo");
            return null;
        } else if (username.equals(dataOutput.get(0))) {
            return dataOutput;
        } else {
            System.out.println("El nombre de usuario no existe");
            System.out.println("Por favor ingrese como administrador maestro y creelo");
            return null;
        }
    }

    /**
     * @return the adminUsername
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * @param adminUsername the adminUsername to set
     */
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * @return the adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * @param adminPassword the adminPassword to set
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * @return the masterUsername
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * @return the masterPassword
     */
    public String getMasterPassword() {
        return masterPassword;
    }
}
