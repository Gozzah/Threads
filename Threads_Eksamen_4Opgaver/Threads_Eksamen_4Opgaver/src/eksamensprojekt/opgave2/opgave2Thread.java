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
public class opgave2Thread implements Runnable {

    private AddFiveCounter add;

    public opgave2Thread(AddFiveCounter add) {
        this.add = add;
    }
    
    
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            add.add5();
            
        }
        
    }
    
    
    
}
