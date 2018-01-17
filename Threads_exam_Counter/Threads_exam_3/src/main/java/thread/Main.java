/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter Riis
 */
//public class Main {

//    static volatile int threadAmount = 51;
//    static int count2 = 50;
//    static int sum = 0;
//    static int count1 = 2; 

    //public static void main(String[] args) throws InterruptedException {

//        ThreadStack[] threads = new ThreadStack[threadAmount];
//        for (int i = 0; i < threads.length; i++) {
//            threads[i] = new ThreadStack(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("I am " + threads[count1].getName());
//                }
//            });
//            threads[i].start();
//            ThreadStack.sleep(1000);
//            count1++;
//        }
//        ThreadStack[] threads = new ThreadStack[threadAmount];
//        for(int i = 50; i >= 0; i--){
//            threads[i] = new ThreadStack(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("I am " + threads[count2].getName());
//                    count2--;
//                }
//            });
//            threads[i].start();
//            ThreadStack.sleep(1000);
//        }

 

//        ThreadStack[] threads = new ThreadStack[threadAmount];
//        for (int i = 0; i <= threads.length; i++) {
//            threads[i] = new ThreadStack(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j <= 100; j++) {
//                    int startAmount = 0;
//                    sum += startAmount;
//                    }
//                }
//                
//            });
//            threads[count1].start();
//            ThreadStack.sleep(1500);
//            System.out.println("I am " + threads[count1].getName() + " and the sum is: " + sum);
//            count1++;
//        }
//    }
//}
