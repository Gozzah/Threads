/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Runes tryllemaskine
 */
public class Tester {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
 
    
     ArrayBlockingQueue<Integer> s1 = new ArrayBlockingQueue(5);
     ArrayBlockingQueue<Integer> s2 = new ArrayBlockingQueue(5);
    ExecutorService es = Executors.newCachedThreadPool();
    
    //Create and start four producers (P1-P4 in the exercise-figure)
    es.execute(new Producer(s1,s2));
    es.execute(new Producer(s1,s2));
    es.execute(new Producer(s1,s2));
    es.execute(new Producer(s1,s2));
     
    //Create and start single consumer (C1 in the exercise-figure)
    Consumer consumer = new Consumer(s1);
    es.execute(consumer);    
    
    es.shutdown();
    es.awaitTermination(10, TimeUnit.SECONDS);
    
   // System.out.println("Total of all random numbers: " + consumer.getSumTotal());
    
}
}
