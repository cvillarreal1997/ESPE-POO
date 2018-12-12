/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce.edu.espe.labs19_myexception;

/**
 *
 * @author Carlos Villarreal
 */
public class Labs19_MyException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int num;
 
        try {
 
            num = 8;
 
            if (num >= 0 && num <= 10) {
                throw new Myexeption(111);
            } else if (num > 10 && num <= 20) {
                throw new Myexeption(222);
            } else if (num > 20 && num <= 30) {
                throw new Myexeption(333);
            }
 
        } catch (Myexeption ex) {
            System.out.println(ex.getMessage());
        }
 
    }
    
    
}
