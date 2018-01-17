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
public class Consumer extends Thread {

    BlockingQueue<Long> s2;

    public Consumer(BlockingQueue<Long> s2) {
        this.s2 = s2;
    }

    @Override
    public void run() {
        Boolean run = true;
        for (int i = 0; i < 90; i++) {
            Long data;
            try {
                data = s2.take();

                System.out.println(data);

            } catch (InterruptedException ex) {
                run = false;
                System.out.println("failed in consumer");
            }
        }
    }
}
