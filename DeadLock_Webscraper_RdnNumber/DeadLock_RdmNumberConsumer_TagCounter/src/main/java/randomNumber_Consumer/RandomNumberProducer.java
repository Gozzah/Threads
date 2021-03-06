package randomNumber_Consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RandomNumberProducer implements Runnable{

  public static final int MAX_NUMBERS_TO_PRODUCE = 100;
  public static final int MAX_RANDOM = 100;

  ArrayBlockingQueue<Integer> numbersProduced ;

  public RandomNumberProducer(ArrayBlockingQueue<Integer> numbersProduced) {
    this.numbersProduced = numbersProduced;
  }
  
  @Override
  public void run() {
    //Todo: Produce MAX_NUMBERS_TO_PRODUCE of random numbers between 0 and MAX_RANDOM and
    //      place the numbers in numbersProduced
    for (int i = 0; i < MAX_NUMBERS_TO_PRODUCE; i++) {
        try {
            int random = (int) ((Math.random() * MAX_RANDOM+1));
            numbersProduced.put(random);
        } catch (InterruptedException ex) {
        }
    }
  }
  
  //By now, you should know how to produce random numbers, but if not, use/run this as a guide
  public static void main(String[] args) {
    int MAX_RAND = 2;
    for (int i = 0; i < MAX_RANDOM; i++) {
      int random = (int) ((Math.random() * MAX_RANDOM+1));
      System.out.println(random);
    }
  }

  
  
}
