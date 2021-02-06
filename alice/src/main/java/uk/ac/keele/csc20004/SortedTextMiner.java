/* ***********************
 * CSC-20004 PRACTICAL 2 *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Comparator;
import java.util.Iterator;

public class SortedTextMiner implements TextMiner {
    Iterator<String> words;
    private TextMiner tm;

    public SortedTextMiner(TextMiner tm, Comparator<Token> c) {
        this.tm = tm;
    }

    @Override
    public void addWord(String w) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("addWord: not implemented yet!");
    }

    @Override
    public void removeWord(String w) {
        // TODO Auto-generated method stub

    }

    @Override
    public void incrementWordFrequency(String w) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean containsWord(String w) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getWordFrequency(String w) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getCorpusSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public void sort() {
        // TODO Auto-generated method stub

    }

    @Override
    public void printOut(int numElem) {
        // TODO Auto-generated method stub

    }
    
}