/* ***********************
 * CSC-20004 PRACTICAL 3 *
 * Java Collections (sol)*
 * ***********************/
package uk.ac.keele.csc20004;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * A concrete implementation for a TextMiner, whose innner data structure is
 * an ArrayList. 
 * 
 */
public class ListTextMiner extends AbstractTextMiner {
    private ArrayList<Token> corpus = new ArrayList<>();

    /**
     * A constructor that will process the corpus and read in all strings, storing
     * them in the data structure chosen for this implementation (an ArrayList).
     * Note that the initCorpus() method will be called from the superclass, which in turn 
     * will call methods like addWord() which are *not* provided in the abstract super class, 
     * but in this class. 
     * 
     * @param corpusFileName the name of the file containing the text to be analysed
     * @throws FileNotFoundException Exception thrown if the specified file doesn't exist
     */
    public ListTextMiner(String corpusFileName) throws FileNotFoundException {
        initCorpus(corpusFileName);
    }

    /**
     * An overloaded version of the constructor that, besides processing the corpus and 
     * reading in all strings, also expunges common words specified in the second file
     * passed as parameter.
     * 
     * @param corpusFileName the name of the file containing the text to be analysed
     * @param commonWordsFileName the name of the file containing the common words to be expunged 
     * @throws FileNotFoundException Exception thrown if the specified file doesn't exist
     */
    public ListTextMiner(String corpusFileName, String commonWordsFileName) throws FileNotFoundException {
        this(corpusFileName);

        purge(commonWordsFileName);
    }

    /**
     * Another overloaded version of the constructor: takes as input the file with the corpus, the
     * file of common words and a Comparator specialised for the tyoe Token (this will e used to sort 
     * the words).
     * 
     * @param corpusFileName the name of the file containing the text to be analysed
     * @param commonWordsFileName the name of the file containing the common words to be expunged 
     * @param c the Comparator used to sort the words
     * @throws FileNotFoundException Exception thrown if the specified file doesn't exist
     */
    public ListTextMiner(String corpusFileName, String commonWordsFileName, Comparator<Token> c) throws FileNotFoundException {
        this(corpusFileName);

        purge(commonWordsFileName);

        corpus.sort(c);
    }

    /**
     * Helper method that, given a word, returns the Token stored in this TextMiner.
     * 
     * @param w the word to be looked up
     * @return the Token corresponding to the word searched for (null if the word was not present)
     */
    private Token findWord(String w) {
        for (Token t : corpus) {
            if (t.getWord().equals(w)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public void addWord(String w) {
        corpus.add(new Token(w, 1));
    }

    @Override
    public void removeWord(String w) {
        corpus.remove(new Token(w, 1));

    }

    @Override
    public void incrementWordFrequency(String w) {
        Token t = findWord(w);

        if (t != null) {
            corpus.remove(t);
            corpus.add(new Token(t.getWord(), t.getFrequency() + 1));
        } else {
            corpus.add(new Token(w, 1));
        }
    }

    @Override
    public boolean containsWord(String w) {
        return corpus.contains(new Token(w, 1));
    }

    @Override
    public int getWordFrequency(String w) {
        Token t = findWord(w);

        if (t != null) {
            return t.getFrequency();
        } else {
            return 0;
        }
    }

    @Override
    public int getCorpusSize() {
        return corpus.size();
    }

    @Override
    public void printOut(int numElem) {
        int counter = 0;
        for (Token t : corpus) {
            if (counter++ > numElem)
                break;
            System.out.println(t);
        }
    }

}
