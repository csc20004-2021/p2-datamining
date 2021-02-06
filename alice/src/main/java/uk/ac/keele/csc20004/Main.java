/* ***********************
 * CSC-20004 PRACTICAL 2 *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

/**
 * Main class to provide an example of use for your implementation of a TextMiner.
 * You will need to implement all methods in MyTextMiner or the code will raise
 * exceptions and won't run.
 *
 */
public class Main {
    public static final String CORPUS = "alice_in_wonderland_modified.txt";
    public static final String COMMONWORDS = "common_words.txt";

    public static void main(String[] args) {
        try {
            System.out.println("Reading file: " + CORPUS);
            TextMiner tm = new MyTextMiner(CORPUS);
            System.out.println("Read " + tm.getCorpusSize() + " words");

            System.out.println("Printing first 10 words from TextMiner 1:");
            tm.printOut(10);

        } catch (Exception e) {
            // Not a real handling of exceptions... simply prints out the error trace
            e.printStackTrace(System.err);
        }

    }
}
