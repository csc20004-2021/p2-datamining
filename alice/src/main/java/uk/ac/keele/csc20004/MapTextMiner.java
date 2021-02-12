/* ***********************
 * CSC-20004 PRACTICAL 3 *
 * Java Collections (sol)*
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Map;
import java.util.TreeMap;
import java.io.FileNotFoundException;

/**
 * A concrete implementation for a TextMiner, whose innner data structure is
 * a Map. More specifically a TreeMap<String, Integer>. 
 * 
 */
public class MapTextMiner extends AbstractTextMiner {
    private Map<String, Integer> corpus = new TreeMap<>();

    /**
     * A constructor that will process the corpus and read in all strings, storing
     * them in the data structure chosen for this implementation (a TreeMap).
     * Note that the initCorpus() method will be called from the superclass, which in turn 
     * will call methods like addWord() which are *not* provided in the abstract super class, 
     * but in this class. 
     * 
     * @param corpusFileName the name of the file containing the text to be analysed
     * @throws FileNotFoundException Exception thrown if the specified file doesn't exist
     */
    public MapTextMiner(String corpusFileName) throws FileNotFoundException {
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
    public MapTextMiner(String corpusFileName, String commonWordsFileName) throws FileNotFoundException {
        this(corpusFileName);

        purge(commonWordsFileName);
    }

    @Override
    public int getCorpusSize() {
        return corpus.size();
    }

    @Override
    public void printOut(int numElem) {
        int counter = 0;
        for(String w : corpus.keySet()) {
            if (counter++ > numElem) break;
            //if(w.getFrequency() >= 50) {
                System.out.println(w + ": "+ getWordFrequency(w));
            //}
        }
    }

    @Override
    public void addWord(String w) {
        if(!containsWord(w)) {
            corpus.put(w, 1);
        }
    }

    @Override
    public void removeWord(String w) {
        corpus.remove(w);
    }

    @Override
    public void incrementWordFrequency(String w) {
        if(!containsWord(w)) {
            corpus.put(w, 1);
        } else {
            corpus.put(w, getWordFrequency(w) + 1);
        }
    }

    @Override
    public boolean containsWord(String w) {
        return corpus.containsKey(w);
    }

    @Override
    public int getWordFrequency(String w) {
        if(containsWord(w)) {
            return corpus.get(w);
        } else {
            return 0;
        }
    }
}
