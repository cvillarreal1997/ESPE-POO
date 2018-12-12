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
public class Myexeption extends Exception{
     
    private int codigoError;
     
    public Myexeption(int codigoError){
        super();
        this.codigoError=codigoError;
    }
     
    @Override
    public String getMessage(){
         
        String mensaje="";
         
        switch(codigoError){
            case 111:
                mensaje="Error, el numero esta entre 0 y 10";
                break;
            case 222:
                mensaje="Error, el numero esta entre 11 y 20";
                break;
            case 333:
                mensaje="Error, el numero esta entre 21 y 30";
                break;
        }
         
        return mensaje;
         
    }
     
}
