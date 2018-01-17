/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;


public class ThreadStack implements Runnable {
    
   private final ThreadCounter counter;
  //This represents the "local" counts done by a specific thread instance
 
  private int count;

  final int COUNT_MAX = 100;

  ThreadStack(ThreadCounter c) {
    counter = c;
  }

  public int getCount() {
    return count;
  }

  @Override
  public void run() {
    for (int i = 0; i < COUNT_MAX; i++) {
      counter.incr();
      count++;
    }
  }
}
