/* ***********************
 * CSC-20004 PRACTICAL 2 *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Map;
import java.util.TreeMap;
import java.io.FileNotFoundException;

public class MapTextMiner extends AbstractTextMiner {
    private Map<String, Integer> corpus = new TreeMap<>();

    public MapTextMiner(String corpusFileName) throws FileNotFoundException {
        initCorpus(corpusFileName);
    }

    public MapTextMiner(String corpusFileName, String commonWordsFileName) throws FileNotFoundException {
        this(corpusFileName);

        purge(commonWordsFileName);
    }

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
