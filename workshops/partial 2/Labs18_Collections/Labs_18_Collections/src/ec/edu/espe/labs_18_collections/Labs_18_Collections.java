/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.labs_18_collections;

import ec.espe.edu.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Carlos Villarreal
 */
public class Labs_18_Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Collection things;
        things = new ArrayList();
        Person persona = new Person(1, "Carlos", 400.0f);
        System.out.println("size of things: " + things.size());
        things.add(18000);
        things.add("Hello Quito");
        things.add(5000.25f);
        things.add(persona);
        System.out.println("size of things: " + things.size());
        System.out.println("this elementes of List are: " + things);

        Object[] thingarray = new Object[things.size()];
        thingarray = things.toArray();
        System.out.println("third element: " + thingarray[2]);

        System.out.println("ejercicio 2: ");
        things.remove(5000.25f);
        System.out.println("size of things: " + things.size());
        System.out.println("this elementes of List are: " + things);

        System.out.println("ejercicio 3: ");
        things.add(3);
        things.add(3);
        things.add(3);
        System.out.println("size of things: " + things.size());
        System.out.println("this elementes of List are: " + things);

        System.out.println("ejercicio 4: ");
        things.remove(3);
        System.out.println("size at the ends: " + things.size());
        System.out.println("this elementes of List are: " + things);

        System.out.println("ejercicio 5: ");
        things.add(5);
        things.add(8);
        things.add(4);
        things.add(8);
        things.add(9);
        things.add(8);
        System.out.println("size at the ends: " + things.size());
        System.out.println("this elementes of List are: " + things);
        System.out.println("borrar el numero 8");
        things.remove(8);
        System.out.println("sizeat the ends: " + things.size());
        System.out.println("this elementes of List are: " + things);

        System.out.println("ejercicio 6: remover la persona");
        things.remove(persona);
        System.out.println("size at the ends: " + things.size());
        System.out.println("this elementes of List are: " + things);

        //System.out.println("ejercicio 7: arraylist solo enteros");
        Collection<Integer> integers = new ArrayList();
        integers.add(1);
        //integers.add(1.7f);
        Collection<Person> persons;
        persons = new ArrayList();

        for (int i = 0; i < 5; i++) {
            persons.add(new Person(i + 1, "Carlos" + (i + 1), (i + 1) * 1000));
        }

        for (Person p : persons) {
            System.out.println("Person -->" + p);
        }

    }
}
