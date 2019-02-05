/*
 * To change this license header, choose License Headers Customer Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template Customer the editor.
 */
package SPCSProjectMain;

import ec.edu.espe.Project_SPCS.GUI.model.AdminLog;
import ec.edu.espe.STPCSProject.model.Customer;
import ec.edu.espe.STPCSProject.model.Employee;
import ec.edu.espe.STPCSProject.model.Provider;
import ec.edu.espe.STPCSProject.model.Admin;
import ec.edu.espe.STPCSProject.model.Work;

import ec.edu.espe.STPCSProject.util.Validations;
import java.util.Scanner;
import ec.edu.espe.STPCSProject.util.Menu;

/**
 *
 * @author GangTI
 */
public class Project_SPCS {
//Variables globales

    static int i = 1;
    static int op = 0;
    static int op2 = 0;
    static String condi;
    static String password;
    static String embido = "admin2018";
//Instancias
    static Customer customer = new Customer();
    static Employee employee = new Employee();
    static Scanner scanner = new Scanner(System.in);
    static Work work = new Work();
    static Validations validation = new Validations();
    static Admin admin = new Admin(null,null);
    static Provider provider = new Provider();

    public static void main(String[] args) {
/*
        //salario.pruebasdesalario();
        //provider.newProvider();
        //provider.reportProvider();
        Menu menu = new Menu();
        int aux = 1;
        do {
            aux=menu.mainMenu();
            //aux = menu.mainMenuPassword();
        } while (aux == 1);
        do {
            aux = menu.mainMenu();
        } while (aux == 1);
        //prueba de registro de empleadooo
        //employee.newWorker(employee);//probado, correctamente funcionando
        //prueba de registro de trabajo
        //work.newWork();

        //customer.newCostumer(employee);
        //customer.modifyCostumer(employee, "1719314179");
        //Salary salaries=new Salary();
        //salaries.menuSalary();
        // customer.modifyCostumer(employee, "1805129630"); 
*/
        AdminLog adminLog = new AdminLog();
        adminLog.setVisible(true);
    }
        
}
