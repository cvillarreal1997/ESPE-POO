package ec.edu.espe.STPCSProject.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Producto {
    private String idProducto;
    private String descripcion;
    private int precio;
    private int IVA; // 0=0%, 1=12%
    private String nota;
    private int maxProducto = 2000;
    private Producto misProductos[] = new Producto[maxProducto];
    private int contProductos = 0;
    
    public void grabarProductos() {
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try {
            fw = new FileWriter("Product.csv");
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < contProductos; i++) {
                pw.println(misProductos[i].toString());
            }
            
        } catch (Exception ex1) {
            ex1.printStackTrace();
            
        } finally {
            try {
                if (fw != null)
                    fw.close();

            } catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
    public void cargarProductos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File("Product.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux ;
            String linea;
            
            String idProducto;
            String descripcion;
            int precio;
            int IVA;
            String nota;
            
            while ( (linea = br.readLine()) != null )   {
                //extraemos id producto
                pos = linea.indexOf('|');
                aux = linea.substring(0, pos);
                idProducto = aux;
                linea = linea.substring(pos + 1);
                
                 //extraemos descripcion
                pos = linea.indexOf('|');
                aux = linea.substring(0, pos);
                descripcion = aux;
                linea = linea.substring(pos + 1);
                
                 //extraemos precio
                pos = linea.indexOf('|');
                aux = linea.substring(0, pos);
                precio = new Integer(aux);
                linea = linea.substring(pos + 1);
                
                 //extraemos igv y nota
                pos = linea.indexOf('|');
                aux = linea.substring(0, pos);
                IVA = new Integer(aux);
                linea = linea.substring(pos + 1);
                nota = linea;
                
                Producto miproProducto;
                miproProducto = new Producto(idProducto, descripcion, precio, IVA, nota);
                misProductos[contProductos] = miproProducto;
                contProductos++;
        
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        
        } finally   {
            try {
                if (fr != null)
                    fr.close();
                
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } 
    }
    public Producto[] getProductos() {
        return misProductos;
    }
    public int numeroProductos() {
        return contProductos;
    }
    public int posicionProducto(String producto) {
        for (int i = 0; i < contProductos; i++) {
            if (misProductos[i].getIdProducto().equals(producto)) 
                return 1;
        }
        
        return -1;
    }
    public String agregarProducto(Producto miProducto) {
        if (contProductos == maxProducto) {
            return "Se ha alcanzado el numbero maximo de usuarios";
        }
        
        misProductos[contProductos] = miProducto;
        contProductos++;
        return "Producto agregado correctamente";
    }
    public String modificarProducto(Producto miProducto, int pos) { 
        misProductos[pos].setDescripcion(miProducto.getDescripcion());
        misProductos[pos].setPrecio(miProducto.getPrecio());
        misProductos[pos].setIVA(miProducto.getIVA());
        misProductos[pos].setNota(miProducto.getNota());
        return "Producto modificado correctamente";
    }
    public String borrarProducto(int pos) {
        for (int i = pos; i < contProductos - 1; i++) {
            misProductos[i] = misProductos[i + 1];
        }
        contProductos--;
        return "Producto borrado correctamente";
    }
    

    public Producto(String idProducto, String descripcion, int precio, int IVA, String nota) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.IVA = IVA;
        this.nota = nota;
    }

    public String getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIVA() {
        return IVA;
    }
    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    
    @Override public String toString() {
        return idProducto + "|"
                + descripcion + "|"
                + precio + "|"
                + IVA + "|"
                + nota;
    }
    
}
