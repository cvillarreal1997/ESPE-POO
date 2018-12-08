/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxhomework;

import ec.edu.espe.model.Tax_Calculation;

/**
 *
 * @author Carlos Villarreal
 */
public class TaxHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tax_Calculation tax = new Tax_Calculation();
        tax.indatas();
        System.out.println("salario mensual en centavos: "+tax.inmonthneto());
        System.out.println("salario anual en centavos: "+tax.incomeage());
        System.out.println("deducibles deducibles en centavos"+tax.deductiblExpenses());
        
    }
    
}
