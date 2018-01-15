package create_end_start_threads;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Create_End_Start_Threads {

    private volatile static boolean bool = true;
    
    public static void main(String[] args) throws InterruptedException {

        
        // a) Da jeg bruger volatile på min bool på task 3 så har jeg ikke brug for synchronization på en metode fx. get i++
        // b) Gøre brug af volatile på variablen bool
        // c) Jeg vil argumentere for min løsning ved at jeg bruge volatile på min variable bool og ikke laver en anden metoden uden for main med at tælle I op samt at jeg sætter sleep på med 10 sekunder også sætter boolen til false så løkken slutter

        
        Thread t1 = new Thread() {
            @Override
            
            public void run() {
                
                int sum = 0;
                for (long i = 0; i <= 1000; i++) {
                    sum += i;
                    System.out.println(sum);
                }
            }
        };
         Thread t2 = new Thread()  {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(i);
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
        };
         
          Thread t3 = new Thread()  {
            @Override
            public void run() {
                int i = 0;
                while(bool){
                    System.out.println(i);
                    i++;
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException ex) {
                      
                    }
                }
                }
            
        };
         
        
        t1.start();
        t2.start();
        t3.start();
        
        Thread.sleep(10000);
        bool = false;


    }
}