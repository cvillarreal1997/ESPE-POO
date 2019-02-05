/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.menu;

import ec.edu.espe.Project_SPCS.GUI.model.AdminLog;
import ec.edu.espe.STPCSProject.model.LogIn;



/**
 *
 * @author José Andrés Zamora Miranda
 */
public class Main {
    public static void main(String[] args)
    {
        LogIn log = new LogIn();
        log.encriptUsernameAndPassword();
    }
    
}
