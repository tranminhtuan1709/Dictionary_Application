import java.util.ArrayList;
import java.util.List;

public class Trie {
    public TrieNode root = new TrieNode();

    /**
     * Default constructor.
     */
    public Trie() {

    }

    /**
     * Add an english word and its vietnamese meaning to Trie.
     * @param wordTarget given english word
     * @param wordExplain given vietnamese meaning
     */
    public void add(String wordTarget, String wordExplain) {
        wordTarget = wordTarget.toLowerCase();
        wordExplain = wordExplain.toLowerCase();
        TrieNode current = new TrieNode(root);
        for (int i = 0; i < wordTarget.length(); i++) {
            int crt = wordTarget.charAt(i) - 97;
            if (current.next[crt] == null) {
                current.next[crt] = new TrieNode();
            }
            current = current.next[crt];
        }
        current.setMeaning(wordExplain);
    }

    /**
     * Find all words whose prefix string is the string being searched by the search method.
     * @param node the node representing to the word is being searched
     * @param prefixString the word is being searched
     * @param res result list
     */
    public void matchingResult(TrieNode node, String prefixString, List<String> res) {
        if (node.getMeaning() != null) {
            res.add(prefixString);
        }
        for (int i = 0; i < 25; i++) {
            if (node.next[i] != null) {
                matchingResult(node.next[i], prefixString + (char)(i + 97), res);
            }
        }
    }

    /**
     * Search the given english word in Trie.
     * @param word given english word
     * @return list of all words whose prefix string is given word
     * @throws Exception if the given cannot be found
     */
    public List<String> search(String word) throws Exception {
        word = word.toLowerCase();
        boolean result = true;
        TrieNode current = new TrieNode(root);
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            int crt = word.charAt(i) - 97;
            if (current.next[crt] != null) {
                current = current.next[crt];
            } else {
                result = false;
                break;
            }
        }
        if (!result) {
            throw new Exception("No results found for the word " + word + "!");
        } else {
            matchingResult(current, word, res);
            return res;
        }
    }
}