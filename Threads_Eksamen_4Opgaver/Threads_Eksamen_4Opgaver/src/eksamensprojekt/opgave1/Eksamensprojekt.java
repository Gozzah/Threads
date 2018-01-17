/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksamensprojekt.opgave1;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pravien
 */
public class Eksamensprojekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            long sum = 0;
            for (int i = 1; i <= 999999999; i++) {
                if ((i % 2) == 0) {
                    sum += i;
                }

            }
            System.out.println("summen: " + sum);
        });
        Thread t3 = new Thread(() -> {
            int sum = 0;
            while (true) {
                System.out.println("*");
                try {
                    TimeUnit.SECONDS.sleep(2);
                    sum+=1;
                    if(sum==6){
                        break;
                    }
                } catch (InterruptedException ex) {
                    System.out.println("sleep failed");
                }
            }
            System.out.println("DONE");
        });
        Thread t2 = new Thread(() -> {
            char ch;
            for (ch = 'a'; ch <= 'z'; ch++) {
                System.out.println(ch);
                try {
                    TimeUnit.MILLISECONDS.sleep(400);
                } catch (InterruptedException ex) {
                    System.out.println("sleep failed");
                }
            }

        }
        );

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

    }

}
