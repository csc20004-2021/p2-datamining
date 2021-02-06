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
          public class Main {
              public static final String CORPUS = "alice_in_wonderland_modified.txt";
              public static final String COMMONWORDS = "common_words.txt";

              public static void main(String[] args) {
                  try {
                      System.out.println("Reading file: " + CORPUS);
                      TextMiner tm1 = new MapTextMiner(CORPUS);
                      System.out.println("Read " + tm1.getCorpusSize() + " words");

                      System.out.println("Reading files: " + CORPUS + "and " + COMMONWORDS);
                      TextMiner tm2 = new MapTextMiner(CORPUS, COMMONWORDS);
                      System.out.println("Read " + tm2.getCorpusSize() + " words");

                      System.out.println("Printing first 10 words from TextMiner 1:");
                      tm1.printOut(10);

                      System.out.println("Printing first 10 words from TextMiner 2:");
                      tm2.printOut(10);

                      TextMiner tm3 = new ListTextMiner(CORPUS);
                      System.out.println("Printing first 10 words from TextMiner 3:");
                      tm3.printOut(10);

                      TextMiner tm4 = new ListTextMiner(CORPUS, COMMONWORDS, new FreqComparator());
                      System.out.println("Printing first 10 words from TextMiner 4:");
                      tm4.printOut(10);

                      TextMiner tm5 = new ListTextMiner(CORPUS, COMMONWORDS, new LexComparator());
                      System.out.println("Printing first 10 words from TextMiner 5:");
                      tm5.printOut(10);
        } catch (Exception e) {
            // Not a real handling of exceptions... simply prints out the error trace
            e.printStackTrace(System.err);
        }

    }
}
