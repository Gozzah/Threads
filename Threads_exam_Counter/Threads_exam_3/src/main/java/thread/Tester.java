/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Peter Riis
 */
public class Tester {
 
  static final int NUMBER_OF_THREADS = 50;
  static ThreadStack[] threads = new ThreadStack[NUMBER_OF_THREADS];

  public static void main(String[] args) throws InterruptedException {
    //This is the shared Counter used by all threads
    ThreadCounter sharedCounter = new ThreadCounter();

    for (int i = 0; i < NUMBER_OF_THREADS; i++) {
      threads[i] = new ThreadStack(sharedCounter);
       System.out.println("Hello from " + threads[i]);
    }
      

    //This example uses a ThreadPool to handle threads
    ExecutorService es = Executors.newCachedThreadPool();

    for (int i = 0; i < NUMBER_OF_THREADS; i++) {
      es.execute(threads[i]);
        
      
    
    }
     
    es.shutdown();
    es.awaitTermination(10, TimeUnit.SECONDS);

    System.out.println("All threads are done");
    
    //Print the updated value
    
    System.out.println(sharedCounter.getValue());
  }
}
