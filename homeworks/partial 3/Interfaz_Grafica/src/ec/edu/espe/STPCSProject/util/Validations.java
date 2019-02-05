/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.util;

import com.sun.glass.events.KeyEvent;
import java.util.InputMismatchException;
import java.util.regex.Pattern;
import java.util.Scanner;
import ec.edu.espe.STPCSProject.model.AgeDate;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import ec.edu.espe.STPCSProject.model.Date1;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

/**
 *
 * @author JDIsmael
 * @author Dayanna Silva
 */
public class Validations {//Clase lista para pruebas
    Scanner scanner = new Scanner(System.in);
    Date1 date = new Date1(0,0,0);
    
    /**
     * You should receive a string type parameter, which will only contain numbers.
     * @param digit 
     * @return 
     * returns true if the digit parameter contains only numbers,otherwise,
     * false if it does not comply with the condition of the pattern.
     */
    public static boolean onlyDigit(String digit){
        Pattern patron = Pattern.compile("^[0-9]+$");
        return patron.matcher(digit).find();
    }    
    /**
     * This method receives as a parameter the identity card, validates first if the chain has the size of 10. 
     * First verify the first two digits according to the province, 
     * then the third digit verifies if it is less than 6, 
     * and for the last uses coefficients to verify the tenth digit of the card, through "Module 10".
     * @param identifyCard
     * @return False || True
     */

    public static boolean validationOfIdentifyCard(String identifyCard) {
        
        boolean correct_Identify_Card = false;
        try {
            if (identifyCard.length() == 10) // ConstantesApp.LongitudCedula
            {
                int digit_region = Integer.parseInt(identifyCard.substring(0,2));
                if (digit_region >= 1 && digit_region <=24 ){//Varifica segun la provincia
                    int digitThree = Integer.parseInt(identifyCard.substring(2, 3));
                if (digitThree < 6) { //El tercer dígito es un número menor a 6 (0,1,2,3,4,5).
                    int[] coefValCard = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };//Los coeficientes usados para verificar el décimo dígito de la cédula, mediante el “Módulo 10”.
                    int checker = Integer.parseInt(identifyCard.substring(9,10));
                    int add = 0;
                    int digit = 0;
                    for (int i = 0; i < (identifyCard.length() - 1); i++) {
                        digit = Integer.parseInt(identifyCard.substring(i, i + 1))* coefValCard[i];
                        add += ((digit % 10) + (digit / 10));
                    }
                    if ((add % 10 == 0) && (add % 10 == checker)) {
                        correct_Identify_Card = true;
                    }
                    else if ((10 - (add % 10)) == checker) {
                        correct_Identify_Card = true;
                    } else {
                        correct_Identify_Card = false;
                    }
                } else {
                    correct_Identify_Card = false;
                }
                
                }else {
                    correct_Identify_Card = false;
                }                
                
            } else {
                correct_Identify_Card = false;
            }
        } catch (NumberFormatException e) {
            correct_Identify_Card = false;
        } catch (Exception er) {
            
            correct_Identify_Card = false;
        }
        if (!correct_Identify_Card) {
            
        }
        return correct_Identify_Card;
    }
    /**
     * This method verifies that it consists of 
     * 13 digits, first verify that the first 10 corresponds to the 
     * RUC and the last ones end in 001
     * @param RUC
     * @return True || False
     */
    public static boolean validationRuc (String RUC){
        boolean correct_RUC = false, aux;
        if(RUC.length() == 13){
        int cedula = Integer.parseInt(RUC.substring(0,10));
        String cadena = Integer.toString(cedula);
        aux=validationOfIdentifyCard(cadena);
        if (aux==true){
            int digitEleven= Integer.parseInt(RUC.substring(10,11));
            int digitTwelve= Integer.parseInt(RUC.substring(11,12));
            int digitThirteen=Integer.parseInt(RUC.substring(11,13));
            if(digitEleven==0&&digitTwelve==0&&(digitThirteen>=1||digitThirteen<=9)){
            correct_RUC=true;
            }else{
                correct_RUC=false;
            }
        }else{
            correct_RUC=false;
        }            
        }else{
            correct_RUC = false;
        }
        if (!correct_RUC) {
            System.out.println("La RUC es Incorrecta");
        }
        return correct_RUC;
    }


            

    public static void validationMonth(int num){
    if(num<1|num>12 ) {
        System.out.println("Ingreso incorrecto digite un numero entre 1-12");
    }        
        
    } 
    public static void validationDay(int num){
    if(num<1 | num>31 ) {
        System.out.println("ingreso incorrecto digite un numero entre 1-32");
    }        
        
    } 
    public  static void validationAge(int num){
    if(num>1500 | num<12 ) {
        System.out.println("ingreso correcto digite un numero entre 1-12");
    }  
    }
    
    public static boolean validationPhoneNumber(String phoneNumber){
        boolean correct_PhoneNumber = false;
        try{
            if (phoneNumber.length()  == 10){
                int primer_digito = Integer.parseInt(phoneNumber.substring(0,1));
                int segundo_digito = Integer.parseInt(phoneNumber.substring(1,2));
                if (primer_digito == 0 && segundo_digito==9){
                    correct_PhoneNumber = true;
                }else {
                    correct_PhoneNumber = false;
                }    
            }else {
                correct_PhoneNumber = false;
            }
        }catch (NumberFormatException e) {
            correct_PhoneNumber = false;
        } catch (Exception er) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            correct_PhoneNumber = false;
        }
        if (!correct_PhoneNumber) {
            System.out.println("La numero ingresada es Incorrecto");
        }
        return correct_PhoneNumber;
    }
    public static boolean validationPhoneNumber2 (String phoneNumber2){
        boolean correct_PhoneNumber2 = false;
        try{
            if (phoneNumber2.length()  == 9){
                int primer_digito = Integer.parseInt(phoneNumber2.substring(0,1));
                int segundo_digito = Integer.parseInt(phoneNumber2.substring(1,2));
                if (primer_digito==0 && (segundo_digito>=2||segundo_digito<=8)){
                    correct_PhoneNumber2 = true;              
                }else{
                    correct_PhoneNumber2 = false;
                }
            }else {
                correct_PhoneNumber2 = false;
            }
        }catch (NumberFormatException e){
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            correct_PhoneNumber2 = false;
        }
        if (!correct_PhoneNumber2) {
            System.out.println("La numero ingresada es Incorrecto");
        }
        return correct_PhoneNumber2;
    }
    /**
     * Validate if the users input is a integer number; ask the user for a integer number until it verifys is an integer
     * @return An integer with the number entered by keyboard
     */
    
    public int numberScanInt()
    {
        int numberReturn = 0;
        int aux =0;
        do
        {
            try
            {
                
                numberReturn = scanner.nextInt();
                aux =1;
                scanner.skip("\n");
            }
            catch(InputMismatchException e)
            {
                System.out.println("Error, ingrese solo numeros enteros");
                aux=0;
                System.out.println("Ingrese nuevamente");
                scanner.nextLine();
            }
            
        }while(aux == 0);
        return numberReturn;
    }
    /**
     * Validate if the users input is a float number; ask the user for a float number until it verifys is a float
     * @return A float with the number entered by keyboard
     */
    public float numberScanFloat()
    {
        float numberReturn = 0;
        int aux =0;
        do
        {
            try
            {
                
                numberReturn = scanner.nextFloat();
                scanner.skip("\n");
                aux =1;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Error, ingrese solo numeros enteros");
                aux=0;
                System.out.println("Ingrese nuevamente");
                scanner.nextLine();
            }
            
        }while(aux == 0);
        return numberReturn;
    }
    /**
     * Verify if the day is inside a range
     * @return The day if it's right; else 0
     */
    public int validationDay()
    {
        int aux = 0;
        int aux2 = 0;//Usado para almacenar temporalmente el ingreso de datos
        ArrayList<Integer> monthsArray = new ArrayList<Integer>();
        monthsArray = date.getMonthsArray();
        do
        {
            aux2 = numberScanInt();
            if(aux2 <= monthsArray.get(date.getActualMonth()-1) ||aux2>0)
            {
                return aux2;
            }
            else
            {
                aux = 0;
                return 0;
            }
        }while(aux == 0);
    }
    /**
     * Verify if the month is inside a range
     * @return The month if it's right; else 0
     */
    public int validationMonth()
    {
        int aux = 0;
        int aux2 = 0;//Usado para almacenar temporalmente el ingreso de datos
        do
        {
            aux2 = numberScanInt();
            if(aux2 <= 12||aux2>0)
            {
                return aux2;
            }
            else
            {
                aux = 0;
                return 0;
            }
        }while(aux == 0);
    }
    /**
     * Verify if the year is inside a range
     * @return The year if it's right; else 0
     */
    public int validationYear()
    {
        int aux = 0;
        int aux2 = 0;//Usado para almacenar temporalmente el ingreso de datos
        do
        {
            aux2 = numberScanInt();
            if(aux2 <= date.getActualYear()||aux2>=1900)
            {
                return aux2;
            }
            else
            {
                aux = 0;
                return 0;
            }
        }while(aux == 0);
    }
    public static void verificationJustNumbers(JTextField nameOfTheTextField)
    {
        
        String auxStringInputFunction = nameOfTheTextField.getText();
        try
        {
            double auxForVerification = Double.parseDouble(auxStringInputFunction);
            nameOfTheTextField.setBackground(Color.WHITE);
        }
        catch (NumberFormatException exc)
        {
            nameOfTheTextField.setBackground(Color.red);
        }
    }
    public static void verificationJustLetters(char charValidation, JTextField nameOfTheTextField)
    {
        if(Character.isDigit(charValidation))
        {
            nameOfTheTextField.setBackground(Color.red);
        }
        else
        {
            nameOfTheTextField.setBackground(Color.WHITE);
            
        }
    }
    public static boolean IDVerification(JTextField txtIDNumber) {
        String auxStringInputFunction = txtIDNumber.getText();
        boolean IDVerification = validationOfIdentifyCard(auxStringInputFunction);
        if (IDVerification == true) {
            txtIDNumber.setBackground(Color.WHITE);
            IDVerification = true;
            return IDVerification;
        } else {
            txtIDNumber.setBackground(Color.red);
            IDVerification = false;
            showMessageDialog(null, "Número de cédula erroneo");
            return IDVerification;
        }
    }
    public static boolean RUCVerification(JTextField txtRUC) {
        String auxStringInputFunction = txtRUC.getText();
        boolean RUCVerification = validationRuc(auxStringInputFunction);
        if (RUCVerification == true) {
            txtRUC.setBackground(Color.WHITE);
            RUCVerification = true;
            return RUCVerification;
        } else {
            txtRUC.setBackground(Color.red);
            RUCVerification = false;
            showMessageDialog(null, "Numero de RUC erroneo");
            return RUCVerification;
        }
    }
    public static boolean birthDateValidation(Date1 birthDate)
    {
        boolean validation = false;
        if(birthDate.getYear() >= birthDate.getActualYear())
        {
            if(birthDate.getYear() == birthDate.getActualYear())
            {
                if(birthDate.getMonth()>= birthDate.getActualMonth())
                {
                   if(birthDate.getMonth()== birthDate.getActualMonth())
                   {
                       if(birthDate.getDay() >= birthDate.getActualDay())
                       {
                            validation = false;
                            return validation;
                       }
                       else
                       {
                            validation = true;
                            return validation;
                       }
                   }
                   else
                   {
                        validation = false;
                        return validation;
                   }
                }
                else
                {
                    validation = true;
                    return validation;
                }
            }
            else
            {
                validation = false;
                return validation;
            }
             
        }
        else
        {
            validation = true;
            return validation;
        }
    }
    public static boolean checkOpenFile(File name)
    {
        
        FileWriter write;
        try {
            write = new FileWriter(name,true);
            write.close();
            return false;
        } catch (IOException ex) {
            return true;
        }
        
    }
    public static boolean keyEnterPressed(java.awt.event.KeyEvent evt)
    {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
    

    

