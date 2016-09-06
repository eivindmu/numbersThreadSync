/**
 * NumbersShowerSync.java - as in "Programmering i Java", 4.utgave - 2009-07-01
 *
 * This example demonstrates the use of threads:
 * creating 5 instances (threads) and starts the threads
 * The threads' common resource is now synchronized, i.e. the
 * thread lock's the resource object
 * 
 * Based on Lervik-Havdal chapter 16
 *
 */
package numbersThreadSync;

/**
 *
 * @author ib
 */
public class NumbersShowerSync {
  public static void main(String[] args) {
    
    // create a common resource oneWriter
    SequenceWriter oneWriter = new SequenceWriter();
    
    // create 5 threads
    NumberWriterSync writer1 = new NumberWriterSync(oneWriter, 1);
    NumberWriterSync writer2 = new NumberWriterSync(oneWriter, 2);
    NumberWriterSync writer3 = new NumberWriterSync(oneWriter, 3);
    NumberWriterSync writer4 = new NumberWriterSync(oneWriter, 4);
    NumberWriterSync writer5 = new NumberWriterSync(oneWriter, 5);
    
    // and start the threads (Java will call their run()-method)
    writer1.start();
    writer2.start();
    writer3.start();
    writer4.start();
    writer5.start();
  }

}
