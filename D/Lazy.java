package Concurrent_Assignmnet1.D;

import java.util.Random;

/**
 * Lazy must: - Extend Thread - Enter in a loop which iterates a random number
 * of times between 2 to 8. - Sleep 1 second - At each iteration, it displays a
 * random message among: “I am dressing up…”, “Just a sec, please…”, or “These
 * clothes do not suit me…”. - If Hurry interrupts Lazy before it is finished,
 * Lazy claims: “That’s not cricket, please play the game!”. - If Lazy finishes
 * before being interrupted, it says “I am ready, the early bird catches the
 * worm!”.
 *
 * @author
 *
 */
public class Lazy extends Thread {

    public void run() {
        String[] phrases = {"I am dressing up…", "Just a sec, please…", "These "
            + "clothes do not suit me…"};
        Random r = new Random();
        int max = 2 + r.nextInt(7);
        int i;
        for ( i = 0; i < max && !Thread.interrupted(); i++) {
            System.out.println(phrases[r.nextInt(3)]);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                this.interrupt();
            } 
        }
        if (i != max){
            System.out.println("That’s not cricket, please play the game!");
        }else System.out.println("I am ready, the early bird catches the worm!");

    }
}
