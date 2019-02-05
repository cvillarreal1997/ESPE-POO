/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public abstract class tableModel {
    public static DefaultTableModel listSeller(File nameOfTheFile, Vector headings){
        
        DefaultTableModel mdlTabla = new DefaultTableModel(headings,0);
        try {
            FileReader fr = new FileReader(nameOfTheFile);
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,";");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
    public static DefaultTableModel stringTableModel(String dataToTable, Vector headers)
    {
        DefaultTableModel mdlTabla = new DefaultTableModel(headers,0);
                StringTokenizer dato = new StringTokenizer(dataToTable,";");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
        return mdlTabla;
    }
    
    
}
