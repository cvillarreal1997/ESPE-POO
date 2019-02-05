/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;

import ec.edu.espe.Project_SPCS.GUI.model.Factura;
import ec.edu.espe.STPCSProject.util.FileManager;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class Bill {
    Calendar miCalendario = Calendar.getInstance();
    private Date1 date = new Date1(miCalendario.get(Calendar.DAY_OF_MONTH),miCalendario.get(Calendar.MONTH)+1,miCalendario.get(Calendar.YEAR));
    private Vector dataTable = new Vector();
    private String dataCustomer;
    private String dataService;
    private String dataWork;
    private int billNumber;
    private double finalValue;
    
    
    public double basePreIVA()
    {
        double finalValuePreIVA = 0;
        for(int i = 0 ; i<dataTable.size();i++)
        {
            String auxString = (String) dataTable.get(i);
            List dataCalc = Arrays.asList(auxString.split(";"));
            
            finalValuePreIVA = finalValuePreIVA + Double.parseDouble((String) dataCalc.get(4));
            System.out.println(finalValuePreIVA);
        }
        return finalValuePreIVA;
    }
    public int totalServices()
    {
        int total = 0;
        for(int i = 0 ; i<dataTable.size();i++)
        {
            String auxString = (String) dataTable.get(i);
            List dataCalc = Arrays.asList(auxString.split(";"));
            
            total = total + Integer.parseInt((String) dataCalc.get(4));
        }
        return total;
    }
    public double finalBillValue()
    {
        finalValue = basePreIVA()*1.12d;
        return finalValue;
    }
    public int actualNumber()
    {
        int actualNumber = Integer.parseInt(FileManager.readFile(new File("count.txt")));
        return actualNumber;
    }
    public int billNumber(int actualNumber)
    {
        billNumber = actualNumber + 1;
        FileManager.modifyFile(new File("count.txt"), ""+actualNumber, "5");
        return billNumber;
    }
    public void newNumber()
    {
        
    }

    /**
     * @return the date
     */
    public Date1 getDate() {
        return date;
    }

    /**
     * @param dataTable the dataTable to set
     */
    public void setDataTable(Vector dataTable) {
        this.dataTable = dataTable;
    }

    /**
     * @param dataCustomer the dataCustomer to set
     */
    public void setDataCustomer(String dataCustomer) {
        this.dataCustomer = dataCustomer;
    }

    /**
     * @param dataService the dataService to set
     */
    public void setDataService(String dataService) {
        this.dataService = dataService;
    }

    /**
     * @param dataWork the dataWork to set
     */
    public void setDataWork(String dataWork) {
        this.dataWork = dataWork;
    }
    
    
    
}
