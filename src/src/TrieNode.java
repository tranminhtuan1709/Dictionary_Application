public class TrieNode {
    private Word word;
    public TrieNode[] next = new TrieNode[25];

    /**
     * Default constructor.
     */
    public TrieNode() {
        this.word = new Word();
    }

    /**
     * Constructor.
     * @param word word
     */
    public TrieNode(Word word) {
        this.word = new Word(word);
    }

    /**
     * Constructor.
     * @param wordTarget english word
     * @param wordExplain vietnamese word
     */
    public TrieNode(String wordTarget, String wordExplain) {
        word = new Word();
        this.word.setWordTarget(wordTarget);
        this.word.setWordExplain(wordExplain);
    }

    /**
     * Constructor copy, deep copy another node to this node.
     * @param node other node
     */
    public TrieNode(TrieNode node) {
        this.word = new Word(node.word);
        this.next = node.next;
    }

    /**
     * Returns value of word.
     * @return a word of this node
     */
    public Word getWord() {
        return this.word;
    }

    /**
     * Sets the value of word in this node equal to another word.
     * @param word other word
     */
    public void setWord(Word word) {
        this.word = new Word(word);
    }

    /**
     * Sets the value of word in this node by english string and vietnamese string.
     * @param wordTarget english word
     * @param wordExplain vietnamese word
     */
    public void setWord(String wordTarget, String wordExplain) {
        this.word.setWordTarget(wordTarget);
        this.word.setWordExplain(wordExplain);
    }
}
