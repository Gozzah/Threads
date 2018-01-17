/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;


public class ThreadCounter {
  static final long DELAY_VAL = 10000;
  long count = 0;

  public synchronized long getValue() {
    return count;
  }

  public synchronized void incr() {
    count++;
  }
}
