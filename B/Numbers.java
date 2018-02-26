package Concurrent_Assignmnet1.B;

/**
 * Create class Numbers which instantiates 5 T_PrintID objects (with ID 1 to 5) and runs them.
 * Can you detect some problem? Can you explain the reason?
 * 
 * @author Rocío y Alberto
     *
 */

public class Numbers {
 
    
    public static void main (String[] Args){
        T_PrintID ids[] = new T_PrintID[5];
        for(int i = 1; i < 5; i++){
            ids[i] = new T_PrintID(i);
            ids[i].start();
        }
    }
}
