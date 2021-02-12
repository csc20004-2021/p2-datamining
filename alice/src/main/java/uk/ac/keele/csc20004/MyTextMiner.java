/* ***********************
 * CSC-20004 PRACTICAL 3 *
 * Java Collections (sol)*
 * ***********************/
package uk.ac.keele.csc20004;

import java.io.FileNotFoundException;

/**
 * A stub class to get you started with the practical. You need to provide the
 * implementation for all methods defined in the interface TextMiner
 * (implemented here via the AbstractTextMiner class). You are, of course, free
 * to add any additional method you need, with two caveats:
 * <ul>
 * <li>you *must* implement all methods of the TextMiner interface
 * <li>any additional method won't be visible if you access your object as
 * TextMiner instances (as opposed to MyTextMiner)
 * </ul>
 * 
 * @author Yourself
 * @see TextMiner
 */
public class MyTextMiner extends AbstractTextMiner {
    // TODO: you probably want to declare a private field here, representing the corpus

    /**
     * Constructs a TextMner object from the words contained in the file whose name
     * is passed as parameter.
     * 
     * @param corpusFileName the name of the file containing the text to be analysed
     * @throws FileNotFoundException Exception thrown if the specified file doesn't
     *                               exist
     */
    public MyTextMiner(String corpusFileName) throws FileNotFoundException {
        initCorpus(corpusFileName);
    }

    private int myMethod() {
        return 0;
    }

    @Override
    public void addWord(String w) {
        // TODO: remove the following line and provide your implementation here
        // consistent with the data structure you chose
        throw new UnsupportedOperationException("addWord: not implemented yet!");
    }

    @Override
    public void removeWord(String w) {
        // TODO: remove the following line and provide your implementation here
        // consistent with the data structure you chose
        throw new UnsupportedOperationException("removeWord: not implemented yet!");
    }

    @Override
    public void incrementWordFrequency(String w) {
        // TODO: remove the following line and provide your implementation here
        // consistent with the data structure you chose
        throw new UnsupportedOperationException("incrementWordFrequency: not implemented yet!");
    }

    @Override
    public boolean containsWord(String w) {
        // TODO: provide your implementation here, depending on the data structure you chose
        // Remember to modify the returned value as appropriate
        return false;
    }

    @Override
    public int getWordFrequency(String w) {
        // TODO: provide your implementation here, depending on the data structure you chose
        // Remember to modify the returned value as appropriate
        return 0;
    }

    @Override
    public int getCorpusSize() {
        // TODO: provide your implementation here, depending on the data structure you chose
        // Remember to modify the returned value as appropriate
        return 0;
    }

    @Override
    public void printOut(int numElem) {
        // TODO: remove the following line and provide your implementation here
        // consistent with the data structure you chose 
        // (you probably just want to iterate over your data structure ...)
        throw new UnsupportedOperationException("addWord: not implemented yet!");
    }

}
