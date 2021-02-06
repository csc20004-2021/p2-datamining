/* ***********************
 * CSC-20004 PRACTICAL 2 *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Comparator;

/**
 * An example of implementation of a Comparator.
 * Note that you do not necessarily need to use this class;
 * it depends on which data structure you choose for your implementation
 */
public class FreqComparator implements Comparator<Token> {

  /**
   * Token ordering based on the frequency of the words in the text
   */
    @Override
    public int compare(Token o1, Token o2) {
        if(o1.getFrequency() < o2.getFrequency()) {
            return 1;
        } else if(o1.getFrequency() > o2.getFrequency()) {
            return -1;
        } else {
            return 0;
        }
    }

}
