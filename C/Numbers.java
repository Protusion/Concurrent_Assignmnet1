package Concurrent_Assignmnet1.C;

/**
 * Create class Numbers which instantiates 5 R_PrintID objects (with ID 1 to 5) and runs them.
 * 
 * 
 * @author Alberto and Rocio
 *
 */

public class Numbers {    
    public static void main (String[] Args){
        R_PrintID ids[] = new R_PrintID[5];
        for(int i = 1; i < 5; i++){
            (new Thread (new R_PrintID(i))).start();
        }
    }
}
