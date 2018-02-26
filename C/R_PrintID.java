package Concurrent_Assignmnet1.C;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Modify class concurrent_assignment1.B.TPrintID so that it is created implementing Runnable 
 * (call the new class R_PrintID). 
 * And now the loop sleeps the thread a random time between 0 and 1.
 * 
 * @author Alberto and Rocio
 *
 */

public class R_PrintID implements Runnable{
   int ID;
    
    public R_PrintID(int ID){
        this.ID = ID;
    }
    
    public void run(){
        Random r = new Random();
        for(int i = 0; i < 10 ; i++){
            try {
                System.out.println(this.ID);
                Thread.sleep(r.nextInt(1000));
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
