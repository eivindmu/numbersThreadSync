package numbersThreadSync;

 /**
 *
 * This class demonstrates the use of the reserved word synchronized
 * An instance of SequenceWriter is used as common resource
 *
 */

public class SequenceWriter {
 
  /**
   * The numbers should be written in the correct sequence,
   * the method cannot be interrupted by another thread while excecuting
   * However, it is possible that a context switch
   * may influence on the excecution
   * 
   * Try this method without the reserved synchronized-word
     * @param threadNo
   */
  public synchronized void writeSequence(int threadNo) {
      System.out.println("Thread no: " + threadNo + " prints:");
      for (int i=1; i< 6; i++)
      {
        System.out.print("" + i + "  ");
      }
      System.out.println("");
      notifyAll();
  }
  
  // This should be removed

}
