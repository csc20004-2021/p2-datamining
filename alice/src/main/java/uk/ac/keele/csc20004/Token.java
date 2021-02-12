/* ***********************
 * CSC-20004 PRACTICAL 3 *
 * Java Collections (sol)*
 * ***********************/
package uk.ac.keele.csc20004;

/**
 * A simple class to store a word and its frequency together.
 * It might be useful depending on the implementation you choose for the TextMiner.
 * Its methods should be pretty self-explanatory.
 */
class Token {

    private final String word;
    private final int frequency;

    public Token(String theWord, int theFrequency) {
        word = theWord;
        frequency = theFrequency;
    }

    public Token(String theWord) {
        this(theWord, 0);
    }

    public String getWord() {
        return word;
    }

    public int getFrequency() {
        return frequency;
    }

    /**
     * Equality is defined only as regards words, not their frequency
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Token) {
            Token toCompare = (Token) o;
            return this.word.equals(toCompare.word);
        } else {
            return false;
        }
    }

    /**
     * Hashcode is computed simply relying on the implementation from String.
     */
    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public String toString() {
        return word + " (" + frequency + ")";
    }

}
