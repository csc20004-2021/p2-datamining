/* ***********************
 * CSC-20004 PRACTICAL 2 *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

/**
 * The interface for a generic TextMiner.
 * 
 * A TextMiner is assumed to contain a corpus of textual data, made up of words
 * and their associated frequency in the text.
 * 
 * This interface specifies the methods that any textual data miner must
 * implement (in the context of this exercise)
 *
 * @author Marco Ortolani
 */
public interface TextMiner {

    /**
     * Adds a word to the corpus. If the word is already present, it won't modify
     * it; otherwise it will add it with a frequency of 1
     * 
     * @param w the word to be added to the corpus
     */
    public void addWord(String w);

    /**
     * Removes a word from the corpus. If the word is not present, it won't have any
     * effect
     * 
     * @param w the word to be removed from the corpus
     */
    public void removeWord(String w);

    /**
     * Increases the frequency of the given word by 1.
     * If the word is not already present in the corpus, it will be added
     * with a frequency of 1
     * 
     * @param w the word whose frequency needs to be incremented 
     */
    public void incrementWordFrequency(String w);

    /**
     * Checks if a word is already present in the corpus
     * 
     * @param w the work to be looked up 
     * @return true if the word is present
     */
    public boolean containsWord(String w);

    /**
     * Returns the frequency of a word in the corpus.
     * If the word is not present it will return 0
     * 
     * @param w the work to be looked up 
     * @return the frequency currently stored for the word 
     */
    public int getWordFrequency(String w);

    /**
     * Returns the number of words contained in the corpus
     * 
     * @return the number of words contained in the corpus
     */
    public int getCorpusSize();

    /**
     * Prints the first `numElem` words into the standard output.
     * 
     * @param numElem how many words to include in the output
     */
    public void printOut(int numElem);
}