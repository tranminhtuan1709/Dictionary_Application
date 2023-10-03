import java.util.ArrayList;
import java.util.List;

public class Trie {
    public TrieNode root = new TrieNode();

    public void add(String wordTarget, String wordExplain) {
        wordTarget = wordTarget.toLowerCase();
        TrieNode current = new TrieNode(root);
        for (int i = 0; i < wordTarget.length(); i++) {
            int crt = (int)(wordTarget.charAt(i) - 97);
            if (current.next[crt] == null) {
                current.next[crt] = new TrieNode();
                current.next[crt].getWord().setWordTarget(current.getWord().getWordTarget() + wordTarget.charAt(i));
                if (i == wordTarget.length() - 1) {
                    current.next[crt].getWord().setWordExplain(wordExplain);
                }
            }
            current = current.next[crt];
        }
    }

    public List<String> matchingResult(TrieNode node) {
        return null;
    }

    public List<String> search(String word) {
        boolean result = false;
        return null;
    }
}