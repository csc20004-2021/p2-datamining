/* ***********************
 * CSC-20004 PRACTICAL 2 *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Comparator;

public class FreqComparator implements Comparator<Token> {

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
