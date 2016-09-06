/*
 * The thread-class with the overriding run()-method
 * Based on Lervik-Havdal chapter 16
 * 
 */
package numbersThreadSync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ib
 */
public class NumberWriterSync extends Thread {
  private SequenceWriter writer;
  private int threadNo;
  
  /**
   * The constructor with argument: a reference to the common writer-resource
   * @param writer 
     * @param threadNo 
   */
  public NumberWriterSync(SequenceWriter writer, int threadNo) {
    this.writer = writer;
    this.threadNo = threadNo;
  }
  
  /**
   * run() overrides the Thread-class' run()-method
   */
  public void run() {
    while (true) {
        try {
            writer.writeSequence(threadNo);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NumberWriterSync.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  }
}
