/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave3;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pravien
 */
public class Producer extends Thread {

    BlockingQueue<Long> s1;
    BlockingQueue<Long> s2;

    public Producer(BlockingQueue<Long> s1, BlockingQueue<Long> s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        Boolean run = true;
        while (run) {
            Long data = s1.poll();
            if (data != null) {
                try {
                    Long temp = fib(data);
                    s2.put(temp);
                } catch (InterruptedException ex) {
                    System.out.println("failed to put");
                }
            } else {
                run = false;
            }
        }
    }
    
//    private Long fib (Long n){
//        if((n==0) || (n==1)){
//            return n;
//        }else{
//            return fib(n-1)+fib(n-2);
//        }
//    }
    
    private Long fib (Long n){
        
        long a = 0;
        long b = 1;
        long i = 0;
        
        while(i<n){
            long oldB = b;
            b = a+b;
            a = oldB;
            i++;
        }
        return a;
    }

}
