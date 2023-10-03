public class Word {
    private String wordTarget;
    private String wordExplain;

    /**
     * Default constructor.
     */
    public Word() {
        wordTarget = "";
        wordExplain = "";
    }

    /**
     * Constructor copy, deep copy value of other word to this word.
     * @param word other word
     */
    public Word(Word word) {
        this.wordTarget = word.wordTarget;
        this.wordExplain = word.wordExplain;
    }

    /**
     * Constructor with parameter.
     * @param wordTarget wordTarget
     * @param wordExplain wordExplain
     */
    public Word(String wordTarget, String wordExplain) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
    }

    /**
     * Returns english word.
     * @return a String type represent the english word
     */
    public String getWordTarget() {
        return wordTarget;
    }

    /**
     * Returns vietnamese word.
     * @return a String type represent the vietnamese word
     */
    public String getWordExplain() {
        return wordExplain;
    }

    /**
     * Set the value of parameter to the english word.
     * @param wordTarget new english word value
     */
    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    /**
     * Set the value of parameter to the vietnamese word.
     * @param wordExplain new vietnamese word value
     */
    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }
}
