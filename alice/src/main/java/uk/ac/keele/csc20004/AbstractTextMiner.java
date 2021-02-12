/* ***********************
 * CSC-20004 PRACTICAL 3 *
 * Java Collections (sol)*
 * ***********************/
package uk.ac.keele.csc20004;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * A (partial) implementation of the TextMiner interface. 
 * In fact, none of the methods of the interface are implemented, but this
 * abstract class provides two "helper" methods that you may find useful when
 * producing your own concrete implementation.
 */
public abstract class AbstractTextMiner implements TextMiner {

    // No need to provide a constructore for an abstract class
    // You can safely delete this, if you prefer
    public AbstractTextMiner() {
    }

    /**
     * This helper method effectively builds the word frequency map by reading all strings 
     * from `fileName` and storing them into the TextMiner (in a data structure you must provide 
     * for your concrete implementation). 
     * It just relies on some methods that your implementation *must* provide, because
     * it needs to implement the `TextMiner` interface 
     * 
     * @param fileName the name of the file containing the text to be analysed
     * @throws FileNotFoundException Exception thrown if the specified file doesn't exist
     */
    public void initCorpus(String fileName) throws FileNotFoundException {
        Scanner words = new Scanner(new File(fileName));
        words.useDelimiter("[^a-zA-Z]+"); // Use any character other than a-z or A-Z as delimiter

        while (words.hasNext()) {
            String w = words.next().toLowerCase();

            if (this.containsWord(w)) {
                this.incrementWordFrequency(w);
            } else {
                this.addWord(w);
            }
        }
        words.close();
    }

    /**
     * A helper method to "clean up" the corpus from common words.
     * 
     * @param fileName the name of the file containing the common word to be eliminated from the corpus
     * @throws FileNotFoundException Exception thrown if the specified file doesn't exist
     */
    public void purge(String fileName) throws FileNotFoundException {
        Scanner words = new Scanner(new File(fileName));
        words.useDelimiter("[^a-zA-Z]+"); // Use any character other than a-z or A-Z as delimiter

        while (words.hasNext()) {
            String w = words.next().toLowerCase();

            if (this.containsWord(w)) {
                this.removeWord(w);
            }
        }
        words.close();
    }

}