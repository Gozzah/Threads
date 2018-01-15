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
public class Producer implements Runnable {
    
    
  public static final int MAX_NUMBERS_TO_PRODUCE = 100;
  public static final int MAX_RANDOM = 100;

    
    
    ArrayBlockingQueue<Integer> s1 ;
    ArrayBlockingQueue<Integer> s2;

    public Producer(ArrayBlockingQueue<Integer> s1, ArrayBlockingQueue<Integer> s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    
    
    

    public Producer(ArrayBlockingQueue<Integer> s1) {
        this.s1 = s1;
        
    }
     

    
    

    Producer() {
        
    }

   @Override
  public void run() {
      
   
    for (int i = 0; i < MAX_NUMBERS_TO_PRODUCE; i++) {
        try {
            int random = (int) ((Math.random() * MAX_RANDOM+1));
            s1.put(random);
            Thread.sleep(10);
            
            for (int j = 0; j < s1.size(); j++) {
               int unsorted = s1.take();
              
                int fibNumbers = fib(unsorted);
                System.out.println("Vi er Fibnumbers" + fibNumbers);
                s2.put(fibNumbers);
                   System.out.println("Jeg er s2 størrelse  :" + s2.size());
                
                
            }

        } catch (InterruptedException ex) {
        }
        
    }
  }
  
  
  
  private synchronized Integer fib(Integer n){
    
    if((n == 0) || (n==1)){
        return n;
     }else{
     return fib(n -1) + fib(n -2);
    }
  }

}


    
    
      
  
    



