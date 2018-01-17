/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksamensprojekt.opgave2;

/**
 *
 * @author pravien
 */
public class AddFiveCounter {
    private long number = 0 ;
    
    public long getValue(){
        return number;
    }
    public synchronized void add5(){
        number++;
        number++;
        number++;
        number++;
        number++;
    }
    
}
