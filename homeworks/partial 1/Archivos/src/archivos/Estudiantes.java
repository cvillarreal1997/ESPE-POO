/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

/**
 *
 * @author Carlos Villarreal
 */
public class Estudiantes {
    String name;
    int edad;
    String telefono;

    public Estudiantes(String name, int edad, String telefono) {
        this.name = name;
        this.edad = edad;
        this.telefono = telefono;
    }
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  
    }

 
