/* ***********************
 * CSC-20004 PRACTICAL 2 *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;

public class ListTextMiner extends AbstractTextMiner {
    private ArrayList<Token> corpus = new ArrayList<>();

    public ListTextMiner(String corpusFileName) throws FileNotFoundException {
        initCorpus(corpusFileName);
    }

    public ListTextMiner(String corpusFileName, String commonWordsFileName) throws FileNotFoundException {
        this(corpusFileName);

        purge(commonWordsFileName);
    }

    public ListTextMiner(String corpusFileName, String commonWordsFileName, Comparator<Token> c) throws FileNotFoundException {
        this(corpusFileName);

        purge(commonWordsFileName);

        corpus.sort(c);
    }

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
