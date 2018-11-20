
package abstractclass;
import ec.edu.espe.labs14.model.*;

/**
 *
 * @author G403
 */
public class cartoon {
    public static void main(String[] args) {
        Anime anime;
        Anime anime1;
        Anime anime2;
        Anime anime3;          
        anime = new DragonBall();
        anime1 = new Naruto();
        anime2= new DeathNote();
        anime3= new Another();
        
         anime.yearOfIssue();       
         anime.
        System.out.println("clase-->"+anime.getClass().getSimpleName());
        anime1.yearOfIssue();
        System.out.println("clase-->"+anime1.getClass().getSimpleName());
        anime2.yearOfIssue();
        System.out.println("clase-->"+anime2.getClass().getSimpleName());
        anime3.yearOfIssue();
        System.out.println("clase-->"+anime3.getClass().getSimpleName());
        
        
      
       
    }
    
}
