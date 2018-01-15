/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author Runes tryllemaskine
 */
public class Consumer implements Runnable{
    
    ArrayBlockingQueue<Integer> s2;
    int fiboNumbers;

    public Consumer(ArrayBlockingQueue<Integer> s2) {
        this.s2 = s2;
    }
    
   @Override
  public void run() {
    //In this exercise, we start four threads, each producing 100 numbers, so we know how much to consume
    for (int i = 0; i <= 400; i++) {
      //  System.out.println(i);
           int num = 0; 
        try {
            num = s2.take();
         
         
            
        } catch (InterruptedException ex) {
        }
    }
  }
}
    
    
  
  
  