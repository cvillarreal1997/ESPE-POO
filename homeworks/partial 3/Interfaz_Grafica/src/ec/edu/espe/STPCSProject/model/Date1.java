/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This class storage the date information
 * @author Jose Zamora
 * @since 0.1
 * @version 1.0
 */
public class Date1 {
    private int day;
    private int month;
    private int year;
    private Calendar fecha = new GregorianCalendar();
    private final int actualYear = fecha.get(Calendar.YEAR);
    private int actualMonth = fecha.get(Calendar.MONTH);
    private int actualDay = fecha.get(Calendar.DAY_OF_MONTH);
    private ArrayList<Integer> monthsArray = new ArrayList<Integer>() {{
    add(31);
    add(29);
    add(31);
    add(30);
    add(31);
    add(30);
    add(31);
    add(31);
    add(30);
    add(31);
    add(30);
    add(31);
}};

    /**
     * @return the setDay
     */
    public int getDay() {//Listo para prueba
        return day;
    }

    /**
     * @param setDay the setDay to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {//Listo para prueba
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {//Listo para prueba
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    public Date1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        
    }
//Metodos de esta linea para abajo listos para probar
    /**
     * @return the actualYear
     */
    public int getActualYear() {
        return actualYear;
    }

    /**
     * @return the actualMonth
     */
    public int getActualMonth() {
        return actualMonth;
    }

    /**
     * @return the actualDay
     */
    public int getActualDay() {
        return actualDay;
    }

    /**
     * @return the monthsArray
     */
    public ArrayList<Integer> getMonthsArray() {
        return monthsArray;
    }
    
    
    
}
