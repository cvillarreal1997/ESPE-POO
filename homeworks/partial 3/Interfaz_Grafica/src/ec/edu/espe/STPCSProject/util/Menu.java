/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.util;

import java.util.InputMismatchException;
import java.util.Scanner;
import ec.edu.espe.STPCSProject.model.Customer;
import ec.edu.espe.STPCSProject.model.Work;
import ec.edu.espe.STPCSProject.model.Inventory;
import ec.edu.espe.STPCSProject.model.Provider;
import ec.edu.espe.STPCSProject.model.Employee;
import ec.edu.espe.STPCSProject.model.Admin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    private final Validations validation = new Validations();
    private final Work job = new Work();
    private final Inventory inventory = new Inventory();
    private final Provider provider = new Provider();
    private final Employee employee = new Employee();
    private final Admin admin = new Admin(null, null);
    //Auxiliar variables
    List<String> dataOut;
    private int auxUserAnswerInput1 = 0;
    private int auxUserAnswerInput2 = 0;
    private int userMenuAnswer = 0;
    private String auxString;

    //Admin Master credentials
    //Username: Admin@2018
    //Password: GURL7MjeyZBhCDb
    public int mainMenuPassword() {
        System.out.println("Bienvenido");
        System.out.println("Por favor identificate");
        System.out.println("Ingrese su nombre de usuario.");
        admin.setAdminUsername(scanner.nextLine());
        System.out.println("Ingrese su contraseña");
        admin.setAdminPassword(scanner.nextLine());
        if (admin.getAdminPassword().equals(admin.getMasterPassword()) && admin.getAdminUsername().equals(admin.getMasterUsername())) {
            do {
                System.out.println("Bienvenido administrador maestro");
                System.out.println("Del siguiente menú escoja una opción");
                System.out.println("1. Registar un nuevo administrador");
                System.out.println("2. Buscar la contraseña de un administrador");
                System.out.println("3. Imprimir un reporte de los administradores registrados");//Hacer lo mas estetico posible 
                System.out.println("4. Ingresar al menú del programa");
                System.out.println("0. Salir");
                userMenuAnswer = validation.numberScanInt();
                switch (userMenuAnswer) {
                    case 0:
                        System.exit(0);
                    case 1:
                        auxString = admin.dataInput();
                        if ("0".equals(auxString)) {
                            System.out.println("Desea regresar al menú?");
                            System.out.println("1. Si");
                            System.out.println("0. Salir");
                            auxUserAnswerInput1 = validation.numberScanInt();
                            if (auxUserAnswerInput1 == 1) {
                                auxUserAnswerInput1 = 1;
                            } else if (auxUserAnswerInput1 == 0) {
                                System.exit(0);
                            } else {
                                System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                                System.exit(0);
                            }
                        } else {
                            admin.adminUserNamePasswordCreation(admin.getMasterUsername(), admin.getMasterPassword(), auxString);
                            System.out.println("Desea regresar al menú?");
                            System.out.println("1. Si");
                            System.out.println("0. Salir");
                            auxUserAnswerInput1 = validation.numberScanInt();
                            if (auxUserAnswerInput1 == 1) {
                                auxUserAnswerInput1 = 1;
                            } else if (auxUserAnswerInput1 == 0) {
                                System.exit(0);
                            } else {
                                System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                                System.exit(0);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese su nombre de usuario a buscar");
                        admin.setAdminUsername(scanner.nextLine());
                        List<String> dataOutput;
                        dataOutput = admin.searchCredentialData(admin.getAdminUsername());
                        if (dataOutput != null) {
                            if (dataOutput.get(0).equals(admin.getAdminUsername())) {
                                System.out.println("Nobre de usuario -------------------------> " + dataOutput.get(0));
                                System.out.println("Contraseña -------------------------------> " + dataOutput.get(1));
                                System.out.println("Desea regresar al menú?");
                                System.out.println("1. Si");
                                System.out.println("0. Salir");
                                auxUserAnswerInput1 = validation.numberScanInt();
                                if (auxUserAnswerInput1 == 1) {
                                    auxUserAnswerInput1 = 1;
                                } else if (auxUserAnswerInput1 == 0) {
                                    System.exit(0);
                                } else {
                                    System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                                    System.exit(0);
                                }
                            } else {
                                System.out.println("El usuario no existe");
                                System.out.println("Por favor creelo");
                                System.out.println("Desea regresar al menú?");
                                System.out.println("1. Si");
                                System.out.println("0. Salir");
                                auxUserAnswerInput1 = validation.numberScanInt();
                                if (auxUserAnswerInput1 == 1) {
                                    auxUserAnswerInput1 = 1;
                                } else if (auxUserAnswerInput1 == 0) {
                                    System.exit(0);
                                } else {
                                    System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                                    System.exit(0);
                                }

                            }
                        } else {
                            System.out.println("Desea regresar al menú?");
                            System.out.println("1. Si");
                            System.out.println("0. Salir");
                            auxUserAnswerInput1 = validation.numberScanInt();
                            if (auxUserAnswerInput1 == 1) {
                                auxUserAnswerInput1 = 1;
                            } else if (auxUserAnswerInput1 == 0) {
                                System.exit(0);
                            } else {
                                System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                                System.exit(0);
                            }
                        }
                        break;
                    case 3:
                        try {
                            String chain;
                            String accumulator = "";

                            FileReader Ficheroread = new FileReader("DataP.txt");
                            BufferedReader br = new BufferedReader(Ficheroread);
                            System.out.println("--------------------------- Usuarios Administradores ---------------------------");
                            System.out.println("Usuario" + "           " + "Contraseña");

                            while ((chain = br.readLine()) != null) {
                                String dato1 = chain.split(";")[0];
                                String dato2 = chain.split(";")[1];
                                System.out.println(dato1 + "           " + dato2 + "             ");
                            }
                            br.close();
                        } catch (Exception e) {
                        }
                        ;
                        System.out.println("Desea regresar al menú?");
                        System.out.println("1. Si");
                        System.out.println("0. Salir");
                        auxUserAnswerInput1 = validation.numberScanInt();
                        if (auxUserAnswerInput1 == 1) {
                            auxUserAnswerInput1 = 1;
                        } else if (auxUserAnswerInput1 == 0) {
                            System.exit(0);
                        } else {
                            System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                            System.exit(0);
                        }
                        break;
                    case 4:
                        auxUserAnswerInput1 = 0;
                        break;
                    default:
                        System.out.println("Error, la opción seleccionada no se encuentra en el menú");
                        System.out.println("Desea regresar al menú?");
                        System.out.println("1. Si");
                        System.out.println("0. Salir");
                        auxUserAnswerInput1 = validation.numberScanInt();
                        if (auxUserAnswerInput1 == 1) {
                            auxUserAnswerInput1 = 1;
                        } else if (auxUserAnswerInput1 == 0) {
                            System.exit(0);
                        } else {
                            System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                            System.exit(0);
                        }
                        break;
                }
            } while (auxUserAnswerInput1 == 1);
            return 0;
        } else {
            List<String> dataOutput;
            dataOutput = admin.searchCredentialData(admin.getAdminUsername());
            if (dataOutput != null) {
                if (admin.getAdminPassword().equals(dataOutput.get(1)) && admin.getAdminUsername().equals(dataOutput.get(0))) {
                    System.out.println("Bievenido al sistema");
                    return 0;
                } else {
                    System.out.println("Nombre de usuario o contraseña incorrectos");
                    System.out.println("Desea intentar nuevamente?");
                    System.out.println("1. Si");
                    System.out.println("0. Salir del sistema");
                    auxUserAnswerInput1 = validation.numberScanInt();
                    if (auxUserAnswerInput1 == 1) {
                        auxUserAnswerInput1 = 1;
                        return auxUserAnswerInput1;
                    } else if (auxUserAnswerInput1 == 0) {
                        System.exit(0);
                        return 0;
                    } else {
                        System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                        System.exit(0);
                        return 0;
                    }
                }
            } else {
                System.out.println("Desea intentar nuevamente?");
                System.out.println("1. Si");
                System.out.println("0. Salir del sistema");
                auxUserAnswerInput1 = validation.numberScanInt();
                if (auxUserAnswerInput1 == 1) {
                    auxUserAnswerInput1 = 1;
                    return auxUserAnswerInput1;
                } else if (auxUserAnswerInput1 == 0) {
                    System.exit(0);
                    return 0;
                } else {
                    System.out.println("Error de ingreso, saliendo del sistema, por favor ingrese nuevamente");
                    System.exit(0);
                    return 0;
                }
            }
        }
    }

    public int mainMenu() {
        do {
            System.out.println("Bienvenido");
            System.out.println("Por favor seleccione una opción del siguiente menú");
            System.out.println("1. Clientes");
            System.out.println("2. Trabajos");
            System.out.println("3. Inventarios");
            System.out.println("4. Reportes");
            System.out.println("5. Trabajadores");
            System.out.println("6. Proveedores");
            System.out.println("0. Salir");
            do {
                try {
                    userMenuAnswer = scanner.nextInt();
                    scanner.skip("\n");
                    auxUserAnswerInput2 = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Error, ingrese solo números");
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                    auxUserAnswerInput2 = 1;
                }
            } while (auxUserAnswerInput2 == 1);
            switch (userMenuAnswer) {
                case 0:
                    System.out.println("Gracias por usar el programa!!!!!!!!!!!!");
                    System.exit(0);
                    return 0;
                case 1:
                    auxUserAnswerInput1 = costumerMenu();
                    break;
                case 2:
                    auxUserAnswerInput1 = workMenu();
                    break;
                case 3:
                    auxUserAnswerInput1 = inventoryMenu();
                    break;
                case 4:
                    auxUserAnswerInput1 = reportsMenu();
                    break;
                case 5:
                    auxUserAnswerInput1 = workersMenu();
                    break;
                case 6:
                    auxUserAnswerInput1 = providerMenu();
                    break;
                default:
                    auxUserAnswerInput1 = error();
                    break;
            }
        } while (auxUserAnswerInput1 == 0);
        return 0;
    }

    private int costumerMenu() {//Completo
        Customer customer = new Customer();
        do {
            System.out.println("Menú de clientes");
            System.out.println("1. Regresar a el menú principal");
            System.out.println("2. Crear cliente");
            System.out.println("3. Modificar cliente");
            System.out.println("4. Buscar cliente");

            System.out.println("0. Salir");
            do {
                try {
                    userMenuAnswer = scanner.nextInt();
                    scanner.skip("\n");
                    auxUserAnswerInput2 = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Error, ingrese solo números");
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                    auxUserAnswerInput2 = 1;
                }
            } while (auxUserAnswerInput2 == 1);
            switch (userMenuAnswer) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    return 0;
                case 2:
                    do {
                        auxString = customer.dataInput();
                        auxUserAnswerInput2 = customer.newCostumer(auxString);
                        if (auxUserAnswerInput2 == 0) {
                            System.out.println("El cliente ya existe");
                            System.out.println("Desea intentar nuevamente");
                            System.out.println("0. Para si");
                            System.out.println("1. Para salir al menu");
                            auxUserAnswerInput2 = validation.numberScanInt();
                        } else {
                            auxUserAnswerInput2 = 1;
                        }
                    } while (auxUserAnswerInput2 == 0);
                    System.out.println("Menú secundario = menú");
                    auxUserAnswerInput1 = userAnswerInTextAux("Clientes");
                    break;
                case 3:
                    String cedula1;//Revisar funcionamiento
                    do {
                        System.out.println("Bienvenido ingrese el número de cédula a buscar");
                        cedula1 = scanner.nextLine();
                    } while (validation.validationOfIdentifyCard(cedula1) == false);
                    customer.modifyCostumer(customer, cedula1);
                    auxUserAnswerInput1 = userAnswerInTextAux("Clientes");
                    break;
                case 4:
                    String cedula;
                    do {
                        System.out.println("Bienvenido ingrese el número de cédula a buscar");
                        cedula = scanner.nextLine();
                    } while (validation.validationOfIdentifyCard(cedula) == false);
                    cedula = customer.searchCostumer(cedula);
                    if ("0".equals(cedula)) {

                    } else {
                        dataOut = Arrays.asList(cedula.split(";"));
                        System.out.println("Nombre -------------------------------->" + dataOut.get(1));
                        System.out.println("Cédula de identidad ------------------->" + dataOut.get(0));
                        System.out.println("Fecha de nacimiento(dd/mm/aaaa)-------->" + dataOut.get(2));
                        System.out.println("Edad ---------------------------------->" + dataOut.get(3));
                        System.out.println("Dirección del domicilio --------------->" + dataOut.get(4));
                    }
                    auxUserAnswerInput1 = userAnswerInTextAux("Clientes");
                    break;

                default:
                    auxUserAnswerInput1 = error();
            }
        } while (auxUserAnswerInput1 == 1);
        return 0;
    }

    private int workMenu()//Completo
    {
        do {
            System.out.println("Menú de trabajos");
            System.out.println("1. Regresar el menú principal");
            System.out.println("2. Crear trabajo");
            System.out.println("3. Modificar trabajo");
            System.out.println("4. Buscar trabajo");
            System.out.println("5. Mostar valor a cobrar de trabajo");
            System.out.println("0. Salir");
            do {
                try {
                    userMenuAnswer = scanner.nextInt();
                    scanner.skip("\n");
                    auxUserAnswerInput2 = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Error, ingrese solo números");
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                    auxUserAnswerInput2 = 1;
                }
            } while (auxUserAnswerInput2 == 1);
            switch (userMenuAnswer) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    return 0;
                case 2:
                    job.newWork();
                    auxUserAnswerInput1 = userAnswerInTextAux("Trabajadores");
                    break;
                case 3://Modificar
                    job.modifyWork();
                    auxUserAnswerInput1 = userAnswerInTextAux("Trabajadores");//Para preguntar si quiere o no seguir en el menu secundario
                    break;
                case 4:
                    System.out.println("Ingrese el identificador del proceso a buscar");
                    do {
                        auxString = scanner.nextLine();
                        if (auxString == null) {
                            System.out.println("El identificador no puede estar en blanco");
                            System.out.println("Ingreselo nuevamente");
                            auxUserAnswerInput1 = 0;
                        } else {
                            auxUserAnswerInput1 = 1;
                        }
                    } while (auxUserAnswerInput1 == 0);
                    auxString = job.searchWork(auxString);
                    System.out.println(auxString);
                    auxUserAnswerInput1 = userAnswerInTextAux("Trabajadores");
                    break;
                case 5:
                    System.out.println("Ingrese el identificador del proceso a buscar");
                    do {
                        auxString = scanner.nextLine();
                        if (auxString == null) {
                            System.out.println("El identificador no puede estar en blanco");
                            System.out.println("Ingreselo nuevamente");
                            auxUserAnswerInput1 = 0;
                        } else {
                            auxUserAnswerInput1 = 1;
                        }
                    } while (auxUserAnswerInput1 == 0);
                    float valor = job.valorACobrar(auxString);
                    System.out.println(valor);
                    auxUserAnswerInput1 = userAnswerInTextAux("Trabajadores");
                    break;
                default:
                    auxUserAnswerInput1 = error();
            }
        } while (auxUserAnswerInput1 == 1);
        return 0;
    }

    private int inventoryMenu()//Completo
    {
        do {

            ArrayList data = new ArrayList();
            System.out.println("Menú de inventarios");
            System.out.println("1. Regresar el menú principal");
            System.out.println("2. Ingresar elementos al inventario");
            System.out.println("3. Buscar en el inventario");
            System.out.println("4. Modificar elemento en el inventario");
            System.out.println("5. Imprimir el inventario");
            System.out.println("0. Salir");
            do {
                try {
                    userMenuAnswer = scanner.nextInt();
                    scanner.skip("\n");
                    auxUserAnswerInput2 = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Error, ingrese solo números");
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                    auxUserAnswerInput2 = 1;
                }
            } while (auxUserAnswerInput2 == 1);
            switch (userMenuAnswer) {
                case 0:
                    System.exit(0);
                    break;
                case 1:

                    return 0;
                case 2:
                    do {
                        data = inventory.dataInput();
                        String aux3;
                        aux3 = inventory.inventoryNewInput((String) data.get(0), (String) data.get(1), (String) data.get(2), (int) data.get(3), (int) data.get(4));
                        auxUserAnswerInput2 = Integer.parseInt(aux3);
                        if (auxUserAnswerInput2 == 0) {
                            System.out.println("El producto ya esta en el inventario");
                            System.out.println("Desea intentar nuevamente");
                            System.out.println("0. Para si");
                            System.out.println("1. Para salir al menu");
                            auxUserAnswerInput2 = validation.numberScanInt();
                        } else {
                            auxUserAnswerInput2 = 1;
                        }
                    } while (auxUserAnswerInput2 == 0);
                    auxUserAnswerInput1 = userAnswerInTextAux("Inventarios");
                    break;
                case 3:
                    String stringAux;
                    System.out.println("Ingrese el ID del producto a buscar");
                    stringAux = scanner.nextLine();
                    stringAux = inventory.searchInInventory(stringAux);
                    if (stringAux.equals("0")) {
                        System.out.println("El producto no esta en el inventario");
                        System.out.println("Por favor regístrelo");
                    } else {
                        dataOut = Arrays.asList(stringAux.split(";"));
                        System.out.println("Código -------------------->" + dataOut.get(0));
                        System.out.println("Nombre -------------------->" + dataOut.get(1));
                        System.out.println("Tipo de elemento ---------->" + dataOut.get(2));
                        System.out.println("Bodega -------------------->" + dataOut.get(3));
                        System.out.println("Cantidad en bodega -------->" + dataOut.get(4));
                    }
                    auxUserAnswerInput1 = userAnswerInTextAux("Inventarios");
                    break;
                case 4:
                    String stringAux2;
                    System.out.println("Ingrese el ID del producto a modificar");
                    stringAux = scanner.nextLine();
                    stringAux = inventory.modifyInventory(stringAux);
                    System.out.println(stringAux);
                    auxUserAnswerInput1 = userAnswerInTextAux("Inventarios");
                    break;
                case 5:
                    System.out.println("Código;Nombre;Tipo;Bodega;Cantidad");
                    inventory.reportInventory();
                    auxUserAnswerInput1 = userAnswerInTextAux("Inventarios");
                    break;
                default:
                    auxUserAnswerInput1 = error();
                    return auxUserAnswerInput1;
            }
        } while (auxUserAnswerInput1 == 1);
        return 0;
    }

    private int reportsMenu() {
        do {
            Customer customer = new Customer();
            Provider provider = new Provider();
            Employee employee = new Employee();
            Inventory inventory = new Inventory();
            System.out.println("Menú de Reportes");
            System.out.println("1. Regresar el menú principal");
            System.out.println("2. Reporte de clientes");
            System.out.println("3. Reporte de proveedores");
            System.out.println("4. Reporte de empleados");
            System.out.println("5. Reporte de inventario");
            System.out.println("0. Salir");
            do {
                try {
                    userMenuAnswer = scanner.nextInt();
                    scanner.skip("\n");
                    auxUserAnswerInput2 = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Error, ingrese solo números");
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                    auxUserAnswerInput2 = 1;
                }
            } while (auxUserAnswerInput2 == 1);
            switch (userMenuAnswer) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    return 0;
                case 2:
                    customer.reportCustumer();
                    auxUserAnswerInput1 = userAnswerInTextAux("Reportes");
                    break;
                case 3:
                    provider.reportProvider();
                    auxUserAnswerInput1 = userAnswerInTextAux("Reportes");
                    break;
                case 4:
                    employee.reportEmployee();
                    auxUserAnswerInput1 = userAnswerInTextAux("Reportes");
                    break;
                case 5:
                    inventory.reportInventory();
                    auxUserAnswerInput1 = userAnswerInTextAux("Reportes");
                    break;
                default:
                    auxUserAnswerInput1 = error();
                    return auxUserAnswerInput1;
            }
        } while (auxUserAnswerInput1 == 1);
        return 0;
    }

    private int workersMenu()//Completo
    {
        do {
            System.out.println("Menú de trabajadores");
            System.out.println("1. Regresarl el menú principal");
            System.out.println("2. Crear empleado");
            System.out.println("3. Modificar empleado");
            System.out.println("4. Buscar empleado");
            System.out.println("0. Salir");
            do {
                try {
                    userMenuAnswer = scanner.nextInt();
                    scanner.skip("\n");
                    auxUserAnswerInput2 = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Error, ingrese solo números");
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                    auxUserAnswerInput2 = 1;
                }
            } while (auxUserAnswerInput2 == 1);
            switch (userMenuAnswer) {
                case 0:
                    System.exit(0);
                    break;
                case 1:

                    return 0;
                case 2:
                    do {
                        auxString = employee.dataInput();
                        auxUserAnswerInput2 = employee.newWorker(employee, auxString);
                        if (auxUserAnswerInput2 == 0) {
                            System.out.println("El empleado ya existe");
                            System.out.println("Desea intentar nuevamente");
                            System.out.println("0. Para si");
                            System.out.println("1. Para salir al menu");
                            auxUserAnswerInput2 = validation.numberScanInt();
                        } else {
                            auxUserAnswerInput2 = 1;
                        }
                    } while (auxUserAnswerInput2 == 0);
                    System.out.println("Menú secundario = menú");
                    auxUserAnswerInput1 = userAnswerInTextAux("Clientes");
                    break;
                case 3:
                    System.out.println("Ingrese el número de cédula del empleado a modificar");
                    auxString = scanner.nextLine();
                    employee.modifyEmployee(auxString);
                    auxUserAnswerInput1 = userAnswerInTextAux("Empleados");
                    break;
                case 4:
                    System.out.println("Ingrese el número de cédula del empleado a buscar");
                    auxString = scanner.nextLine();
                    auxString = employee.searchEmployee(auxString);
                    System.out.println(auxString);
                    auxUserAnswerInput1 = userAnswerInTextAux("Empleados");
                    break;
                default:
                    auxUserAnswerInput1 = error();
                    return auxUserAnswerInput1;
            }
        } while (auxUserAnswerInput1 == 1);
        return 0;
    }

    private int providerMenu() {
        do {
            System.out.println("Menú de proveedores");
            System.out.println("1. Regresarl el menú principal");
            System.out.println("2. Crear proveedores");
            System.out.println("3. Modificar proveedores");
            System.out.println("4. Buscar proveedores");
            System.out.println("5. Reporte de provedor");
            System.out.println("0. Salir");
            do {
                try {
                    userMenuAnswer = scanner.nextInt();
                    scanner.skip("\n");
                    auxUserAnswerInput2 = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Error, ingrese solo números");
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                    auxUserAnswerInput2 = 1;
                }
            } while (auxUserAnswerInput2 == 1);
            switch (userMenuAnswer) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    return 0;
                case 2:
                    provider.newProvider();
                    auxUserAnswerInput1 = userAnswerInTextAux("Proveedores");
                    return auxUserAnswerInput1;
                case 3:
                    provider.modifyProvider();
                    auxUserAnswerInput1 = userAnswerInTextAux("Proveedores");
                    return auxUserAnswerInput1;
                case 4:
                    provider.searchProvider();
                    auxUserAnswerInput1 = userAnswerInTextAux("Proveedores");
                    return auxUserAnswerInput1;

                case 5:
                    provider.reportProvider();
                    auxUserAnswerInput1 = userAnswerInTextAux("Proveedores");
                    return auxUserAnswerInput1;
                default:
                    auxUserAnswerInput1 = error();
                    return auxUserAnswerInput1;
            }
        } while (auxUserAnswerInput1 == 1);
        return auxUserAnswerInput1;
    }

    private int error() {
        do {
            System.out.println("Error");
            System.out.println("Desea ingresar de nuevo?");
            System.out.println("0. Para salir del programa");
            System.out.println("1. Para intentar nuevamente");
            System.out.println("2. Para regresar al menú");
            try {
                auxUserAnswerInput1 = scanner.nextInt();
                auxUserAnswerInput2 = 0;
                scanner.skip("\n");
            } catch (InputMismatchException e) {
                System.out.println("Error, ingrese solo números");
                scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                auxUserAnswerInput2 = 1;
            }
        } while (auxUserAnswerInput2 == 1);
        if (auxUserAnswerInput1 == 0) {
            System.exit(0);
            return 0;
        } else if (auxUserAnswerInput1 == 1) {
            return 1;
        } else if (auxUserAnswerInput1 == 2) {
            return 0;
        } else {
            System.out.println("Error saliendo del programa");
            System.exit(0);
            return 0;
        }

    }

    private int userAnswerInTextAux(String name) {
        System.out.println("Seleccione una opción");
        System.out.println("1. Regresar al menú de " + name);
        System.out.println("2. Regresar al menú principal");
        System.out.println("0. Salir");
        do {
            try {
                userMenuAnswer = scanner.nextInt();
                scanner.skip("\n");
                auxUserAnswerInput2 = 0;
            } catch (InputMismatchException e) {
                System.out.println("Error, ingrese solo números");
                scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                auxUserAnswerInput2 = 1;
            }
        } while (auxUserAnswerInput2 == 1);
        if (userMenuAnswer == 1) {
            return 1;
        } else if (userMenuAnswer == 2) {
            return 0;
        } else {
            System.exit(0);
            return 0;
        }
    }

}
