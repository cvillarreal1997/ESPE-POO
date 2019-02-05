/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.complicacion;

import ec.edu.espe.STPCSProject.model.Customer;
import ec.edu.espe.STPCSProject.model.Person;
import ec.edu.espe.STPCSProject.util.FileManager;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class Billing {
    //Atribute Definition
    private int billNumber = 0;
    private Customer person = new Customer();
    private String auxOutputInputString = null;
    //Add Services Atribute - May be an ArrayList
    //Add Payment Methods - Just two payment methods, cash and credit/credit may have the option to make it in parts and save in the bill file the payment due.

    //Methods
    public void saveBill()
    {
        
    }
    public int billNumber ()
    {
        String billNumberStringAux = null;
        billNumber = getActualBillNumber();
        String billNumberAux = billNumber + "";
        billNumber = billNumber + 1;
        billNumberStringAux = billNumber + "\n";
        FileManager.modifyFile(new File("count.txt"), billNumberAux, billNumberStringAux);
        return billNumber;
    }
    public int getActualBillNumber()
    {
        String billNumberStringAux = null;
        billNumberStringAux = FileManager.readFile(new File("count.txt"));
        List <String> billNumberStringDataOut = Arrays.asList(billNumberStringAux);
        billNumber = Integer.parseInt(billNumberStringDataOut.get(0));
        return billNumber;
    }
    
    
    
}
