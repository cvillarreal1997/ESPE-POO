/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.STPCSProject.model;
import java.awt.*;
import java.awt.print.*;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import javax.swing.JInternalFrame;

/**
 *
 * @author José Andrés Zamora Miranda
 */

public class Print {
    public static int print(Graphics graf, PageFormat pagfor, int page,JInternalFrame factura) throws PrinterException
    {
        if(page > 0)//Esto porque solo es una página que se imprime
        {
            return NO_SUCH_PAGE;
        }
        Graphics2D bot = (Graphics2D) graf;
        bot.translate(pagfor.getImageableX() + 30, pagfor.getImageableY()+ 30);
        bot.scale(1.0, 1.0);//Tamaño normal, si quisieramos el doble seria 2.0, 2.0
        factura.printAll(graf);//Imprime todo lo que hay en el JPanel factura
        return PAGE_EXISTS;
    }
}
