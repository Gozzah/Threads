/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksamensprojekt.opgave2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pravien
 */
public class ogpave2 {
    
    static final int amountOfThreads = 100;
    static opgave2Thread[] threads = new opgave2Thread[amountOfThreads];
    public static void main(String[] args) throws InterruptedException {
        AddFiveCounter add = new AddFiveCounter();
        for (int i = 0; i < amountOfThreads; i++) {
            threads[i] = new opgave2Thread(add);
        }
        // oprreter en Exceutorservice.
        ExecutorService es = Executors.newFixedThreadPool(amountOfThreads);
        // tager hver eneklt thread fra arrayet threads og starter den.
        for (int i = 0; i < amountOfThreads; i++) {
            es.execute(threads[i]);
        };
        
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(add.getValue());
    }
    
}
