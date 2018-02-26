package Concurrent_Assignmnet1.A;

/**
 * Get the reference of the main thread
 */
public class Reference {

    public static void thread() {
        try {
            Thread h = Thread.currentThread();
            System.out.println(h.getName());
            h.setName("much slower main :)");
            for (int i = 1; i < 100; i = i + 2) {
                System.out.println(i + " " + h.getName());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("A wild Interruped Exception appared");
        }
    }
    
    public static void main (String[] Args){
        Reference reference = new Reference();
        reference.thread();
    }
}
