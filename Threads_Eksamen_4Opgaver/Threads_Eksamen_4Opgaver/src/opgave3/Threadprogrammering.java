/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave3;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pravien
 */
public class Threadprogrammering {

    /**
     * @param args the command line arguments
     */
    static final int amountProducers = 4;
    static Producer[] producer = new Producer[amountProducers];

    public static void main(String[] args) throws InterruptedException {
        final Long[] number = new Long [90];
        for (int i = 0; i < number.length; i++) {
            number[i]=new Long(i+1);
            
        }
        //danner blockingque
        final BlockingQueue<Long> s1 = new ArrayBlockingQueue<>(90);
        final BlockingQueue<Long> s2 = new ArrayBlockingQueue<>(90);
        //tilføjer tal til s1 .
        for (int i = 0; i < number.length; i++) {
            s1.add(number[i]);
        }
        
        //Opretter 4 instancer af klasssen producer og gemmer dem i arryet producer.
        for (int i = 0; i < amountProducers; i++) {
            producer[i] = new Producer(s1, s2);
        }
        
        // oprreter en Exceutorservice.
        ExecutorService es = Executors.newCachedThreadPool();
        // tager hver eneklt process fra arrayet producer og starter den.
        for (int i = 0; i < amountProducers; i++) {
            es.execute(producer[i]);
        }
        // danner consumer klassen og starter den.
        Consumer c1 = new Consumer(s2);
        es.execute(c1);
        
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
    }

}
