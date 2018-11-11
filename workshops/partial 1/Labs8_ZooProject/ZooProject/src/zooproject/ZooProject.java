
package zooproject;

import ec.edu.espe.www.zooproject.model.Worker;

/**
 *
 * @author Carlos Villarreal
 */
public class ZooProject { 
  
    public static void main(String[] args) {
        Worker worker;
        worker = new Worker("Carlos");
        System.out.println("Nombre es: "+worker.getName());
        worker.setName("Omarico");
        System.out.println("Nombre es: "+worker.getName());
        
        
    }
}
