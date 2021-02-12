/* ***********************
 * CSC-20004 PRACTICAL 3 *
 * Java Collections (sol)*
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Comparator;

/**
 * An example of implementation of a Comparator.
 * Note that you do not necessarily need to use this class;
 * it depends on which data structure you choose for your implementation
 */
public class LexComparator implements Comparator<Token> {

    /**
     * A lexicographic ordering (i.e.: normal alphabetical)
     * is established by relying on the compareTo() method from class String
     * 
     * @see String#compareTo(String)
     */
    @Override
    public int compare(Token o1, Token o2) {
        return -o1.getWord().compareTo(o2.getWord());
    }
}
