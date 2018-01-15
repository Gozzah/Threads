/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads_even_opgave;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Runes tryllemaskine
 */
public class Even {

    private int n = 0;

    public synchronized int next() 
    {
        n++;
        n++;
        return n;
    }
}



//public class Even {
//
//    
//    AtomicInteger n = new AtomicInteger(0);
//    
//
//    public synchronized AtomicInteger next() 
//    {
//        n.incrementAndGet();
//        n.incrementAndGet();
//        return n;
//    }
//}