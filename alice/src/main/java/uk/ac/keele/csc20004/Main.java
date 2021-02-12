/* ***********************
 * CSC-20004 PRACTICAL 3 *
 * Java Collections (sol)*
 * ***********************/
package uk.ac.keele.csc20004;

/**
 * Main class to provide an example of use for the concrete implementation of a
 * TextMiner. Here, I show the different results when using an implementation 
 * based on Maps as compared to one based on a List.
 *
 * @see MapTextMiner
 * @see ListTextMiner
 */
public class Main {
    public static final String CORPUS = "alice_in_wonderland_modified.txt";
    public static final String COMMONWORDS = "common_words.txt";

    public static void main(String[] args) {
        try {
            System.out.println("*** MapTextMiner ***");
            System.out.println("Reading file: " + CORPUS);
            TextMiner tm1 = new MapTextMiner(CORPUS);
            System.out.println("Read " + tm1.getCorpusSize() + " words");

            System.out.println("*** MapTextMiner (excl common words) ***");
            System.out.println("Reading files: " + CORPUS + "and " + COMMONWORDS);
            TextMiner tm2 = new MapTextMiner(CORPUS, COMMONWORDS);
            System.out.println("Read " + tm2.getCorpusSize() + " words");

            System.out.println("Printing first 10 words from MapTextMiner 1:");
            tm1.printOut(10);

            System.out.println("Printing first 10 words from MapTextMiner 2:");
            tm2.printOut(10);

            System.out.println("*** ListTextMiner ***");
            TextMiner tm3 = new ListTextMiner(CORPUS);
            System.out.println("Printing first 10 words from ListTextMiner:");
            tm3.printOut(10);

            System.out.println("*** ListTextMiner (excl common words) - freq comp ***");
            TextMiner tm4 = new ListTextMiner(CORPUS, COMMONWORDS, new FreqComparator());
            System.out.println("Printing first 10 words from TextMiner:");
            tm4.printOut(10);

            System.out.println("*** ListTextMiner (excl common words) - lex comp ***");
            TextMiner tm5 = new ListTextMiner(CORPUS, COMMONWORDS, new LexComparator());
            System.out.println("Printing first 10 words from TextMiner:");
            tm5.printOut(10);
        } catch (Exception e) {
            // Not a real handling of exceptions... simply prints out the error trace
            e.printStackTrace(System.err);
        }

    }
}
