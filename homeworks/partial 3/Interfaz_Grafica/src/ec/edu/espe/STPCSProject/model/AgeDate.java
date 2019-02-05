/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;

/**
 *
 * @author DayannaSilva
 * @author Jose Zamora
 * @version 1.0
 * @version 0.2
 */
public class AgeDate {//Clase lista para pruebas
    //Actual AgeDate
    Calendar fecha = new GregorianCalendar();
    private final int actualYear = fecha.get(Calendar.YEAR);
    private int actualMonth = fecha.get(Calendar.MONTH);
    private int actualDay = fecha.get(Calendar.DAY_OF_MONTH);
    private final int actualMonthComp = actualMonth + 1;
    //Class variable
    private Date1 birthDate = new Date1(0,0,0);
    private Date1 ageDate = new Date1(0,0,0);
    private final ArrayList<Integer> monthsArray = new ArrayList<Integer>() {{
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
    public AgeDate (){
        
    }
    /**
     * Method that computes the actual age of a person.
     * @param dayOfBirth
     * @param monthOfBirth
     * @param yearOfBirth
     * @return If there is any error in the process a Date Object filed with 0; a Date Object with the actual age of a person.
     */
    public Date1 ageCalc(int dayOfBirth, int monthOfBirth, int yearOfBirth)//Metodo listo para pruebas
    {
        int auxYear;
        int auxMonth;
        int auxDay;
        auxYear = negativeValidation(yearOfBirth);
        auxMonth = negativeValidation(monthOfBirth);
        auxDay = negativeValidation(dayOfBirth);
        if (auxYear == 1 || auxMonth == 1 || auxDay == 1) {
            ageDate.setDay(0);
            ageDate.setMonth(0);
            ageDate.setYear(0);
            return ageDate;
        } else {
            auxYear = outOfBoundariesValidation(yearOfBirth, "anio", monthOfBirth);
            if (auxYear == 1) {
                ageDate.setDay(0);
                ageDate.setMonth(0);
                ageDate.setYear(0);
                return ageDate;
            } else {
                auxMonth = outOfBoundariesValidation(monthOfBirth, "mes", monthOfBirth);
                if (auxMonth == 1) {
                    ageDate.setDay(0);
                    ageDate.setMonth(0);
                    ageDate.setYear(0);
                    return ageDate;
                } else {
                    auxDay = outOfBoundariesValidation(dayOfBirth, "dia", monthOfBirth);
                    if (auxDay == 1) {
                        ageDate.setDay(0);
                        ageDate.setMonth(0);
                        ageDate.setYear(0);
                        return ageDate;
                    } else {
                        Date1 birthDateV = new Date1(0,0,0);
                        int auxLeap = leapValidation(birthDateV);
                        if (auxLeap == 0) {
                            ageDate.setDay(0);
                            ageDate.setMonth(0);
                            ageDate.setYear(0);
                            return ageDate;
                        } else {
                            actualMonth += 1;
                            auxMonth = actualMonth - 1;
                            int ageYear = actualYear - yearOfBirth;
                            ageDate.setYear(ageYear);
                            if (monthOfBirth <= actualMonth) {
                                int ageMonth = actualMonth - monthOfBirth;
                                ageDate.setMonth(ageMonth);
                            } else {
                                ageYear = ageYear - 1;
                                ageDate.setYear(ageYear);
                                actualMonth = actualMonth + 12;
                                int ageMonth = actualMonth - monthOfBirth;
                                ageDate.setMonth(ageMonth);
                            }
                            if (dayOfBirth <= actualDay) {
                                int ageDay = actualDay - dayOfBirth;
                                ageDate.setDay(ageDay);
                            } else {
                                ageDate.setMonth(ageDate.getMonth() - 1);
                                if (ageDate.getMonth() == -1) {
                                    ageDate.setMonth(ageDate.getMonth() + 12);
                                    ageYear = ageYear - 1;
                                    ageDate.setMonth(ageDate.getMonth());
                                    ageDate.setYear((ageYear));
                                    actualDay = actualDay + monthsArray.get(auxMonth);
                                    int ageDay = actualDay - dayOfBirth;
                                    ageDate.setDay((ageDay));
                                } else {
                                    ageDate.setMonth(ageDate.getMonth());
                                    actualDay = actualDay + monthsArray.get(auxMonth);
                                    int ageDay = actualDay - dayOfBirth;
                                    ageDate.setDay(ageDay);
                                }
                            }
                            return ageDate;
                        }
                    }

                }
            }

        }
    }

    /**
     * @return the list
     */
    public ArrayList getList() {//Metodo listo para pruebas
        return monthsArray;
    }
/**
 * This method scan from the user an auxilary integer, so its answer will be used to enter or not to a repetitive structure
 * @return Depends on what the user enter if is not 1 or 0 the system will kill itself
 */
    
    private int error() {
        int aux = 0;
        int aux2 = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Error");
        System.out.println("Desea ingresar nuevamente?");
        System.out.println("1. Ingresar el dato otra vez");
        System.out.println("0. Salir del programa");
        aux = scanner.nextInt();
        scanner.skip("\n");
        if (aux == 1) {
            aux = 1;
        } else if (aux == 0) {
            System.exit(0);
        } else {
            System.out.println("Error");
            System.out.println("Opcion Incorrecta");
            System.out.println("Saliendo del programa por favor ingrese nuevamente");
            System.exit(0);
        }
        return aux;
    }
    /**
     * Method that ensure the user will not enter negative numbers
     * @param date
     * @return The 0 if the process end succesfully; 1 if there is an error
     */
    public int negativeValidation(int date/*El parametro date se refiere al dia, al mes o al año*/)//Metodo listo para pruebas
    {
        int aux;
        if (date <= 0) {
            aux = 1;
            return aux;
        } else {
            aux = 0;
            return aux;
        }
    }
    /**
     * Method that validate if the year in a Date is leap or not
     * @param date
     * @return 1 if the year is a leap year and the day is in range; 0 if there is an error
     */
    public int leapValidation(Date1 date/*Para la validación de año bisiesto se envia de parametro la fecha ya ingresada y se verifica si es correcto o no*/)//Metodo listo para prueba
    {
        if(date.getYear()%4==0)
        {
            if(date.getMonth()==2)
            {
                if(date.getDay()>0 && date.getDay()<=29)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                return 1;
            }
        }
        else if (date.getMonth() == 2)
        {
            if(date.getDay()>0 && date.getDay()<=28)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return 1;
        }
    }
    /**
     * Method that validates if the day,month or year is inside the range of action of the algoritm; if the case is "mes" it will check if the month is between 1 and 12;if the case is "dia" it will check acording to the month if its day is inside the range and if its "anio" it will check that the yerar is between 1700 and the actual year
     * @param date
     * @param caso
     * @param month
     * @return 1 if there is an error; 0 if the date is inside of the range
     */
    public int outOfBoundariesValidation(int date,String caso,int month/*Se utiliza para verificar que no se ingresarion valores fuera de los limites*/)//Metodo listo para pruebas
    {
        int aux;
        if("mes".equals(caso))
        {
            if(date<0 || date>12)
            {
                return aux = 1;//Uno si esta fuera de los limites
            }
            else
            {
                return aux = 0;//Si es correcto
            }
        }
        else if ("anio".equals(caso))
        {
            if(date<1700 || date>actualYear)
            {
                return aux = 1;
            }
            else
            {
                return aux = 0;
            }
        }
        else if("dia".equals(caso))
        {
            if(date>monthsArray.get(month - 1))
            {
                return aux = 1;
            }
            else
            {
                return aux = 0;
            }
        }
        else
        {
            return aux = 0;
        }
    }
    /**
     * Method that helps with the data input; it chack if the date input is right; checks if the user enter by keyboard something that's not a number; checks if the day, mont or year of birth is higer than actual date.
     * @return A Date Object with the input information.
     */
    public Date1 dataInput() {
        int aux = 0;
        int aux2 = 0;
        String dayOfBirth;
        String monthOfBirth;
        String yearOfBirth;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        do {
            do {
                try {
                    System.out.print("Ingrese el año : ");
                    birthDate.setYear(scanner.nextInt());
                    aux = negativeValidation(birthDate.getYear());
                    aux = outOfBoundariesValidation(birthDate.getYear(),"anio",birthDate.getMonth());
                    scanner.skip("\n");
                } catch (InputMismatchException e) {
                    aux = error();
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                }
            } while (aux == 1);
            do {
                try {
                    System.out.print("Ingrese el mes : ");
                    birthDate.setMonth(scanner.nextInt());
                    aux = negativeValidation(birthDate.getMonth());
                    aux = outOfBoundariesValidation(birthDate.getMonth(),"mes",birthDate.getMonth());
                    scanner.skip("\n");
                } catch (InputMismatchException e) {
                    aux = error();
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                }
            } while (aux == 1);
            do {
                try {
                    System.out.print("Ingrese el día : ");
                    birthDate.setDay (scanner.nextInt());
                    aux = negativeValidation(birthDate.getDay());
                    aux = outOfBoundariesValidation(birthDate.getDay(),"dia",birthDate.getMonth());
                    scanner.skip("\n");
                    aux2 = 1;
                } catch (InputMismatchException e) {
                    aux = error();
                    scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                }
            } while (aux == 1);
            if (birthDate.getYear() >= actualYear) 
            {
                if(birthDate.getYear() > actualYear)
                {
                    
                    System.out.println("Error en anio");
                    System.out.println("Error la persona no pudo haber nacido en una fecha superior a la actual");
                    System.out.println("Desea ingresar los datos nuevamete?");
                    System.out.println("0. Ingresar nuevamente");
                    System.out.println("1. Salir");
                    aux2 = scanner.nextInt();
                    if (aux2 == 0) {
                        aux2 = 0;
                    } else if (aux2 == 1) {
                        System.exit(0);
                    } else {
                        System.out.println("Opcion incorrecta");
                        System.out.println("Saliendo de programa por favor ingrese nuevamente");
                        System.exit(0);
                    }
                }
                else
                {
                    if (birthDate.getMonth() >= actualMonthComp) 
                    {
                        
                        if(birthDate.getMonth() > actualMonthComp)
                        {
                            System.out.println("Error en mes");
                            System.out.println("Error la persona no pudo haber nacido en una fecha superior a la actual");
                            System.out.println("Desea ingresar los datos nuevamete?");
                            System.out.println("0. Ingresar nuevamente");
                            System.out.println("1. Salir");
                            aux2 = scanner.nextInt();
                            if (aux2 == 0) {
                                aux2 = 0;
                            } else if (aux2 == 1) {
                                System.exit(0);
                            } else {
                                System.out.println("Opcion incorrecta");
                                System.out.println("Saliendo de programa por favor ingrese nuevamente");
                                System.exit(0);
                            }
                        }
                        else
                        {
                            if (birthDate.getDay() > actualDay) {
                                System.out.println("Error en día");
                                System.out.println("Error la persona no pudo haber nacido en una fecha superior a la actual");
                                System.out.println("Desea ingresar los datos nuevamete?");
                                System.out.println("0. Ingresar nuevamente");
                                System.out.println("1. Salir");
                                aux2 = scanner.nextInt();
                                if (aux2 == 0) {
                                    aux2 = 0;
                                } else if (aux2 == 1) {
                                    System.exit(0);
                                } else {
                                    System.out.println("Opcion incorrecta");
                                    System.out.println("Saliendo de programa por favor ingrese nuevamente");
                                    System.exit(0);
                                }
                            }
                            else
                            {
                                aux2=1;
                            }
                        }
                    }
                } 
            } 
            else
            {
                aux2=1;
            }
        } while (aux2 == 0);
        return birthDate;
    }
}
