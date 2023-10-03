import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Trie {
    public TrieNode root = new TrieNode();

    public Trie() {

    }

    public void add(String wordTarget, String wordExplain) {
        wordTarget = wordTarget.toLowerCase();
        wordExplain = wordExplain.toLowerCase();
        TrieNode current = new TrieNode(root);
        for (int i = 0; i < wordTarget.length(); i++) {
            int crt = wordTarget.charAt(i) - 97;
            if (current.next[crt] == null) {
                current.next[crt] = new TrieNode();
                current.next[crt].getWord().setWordTarget(current.getWord().getWordTarget() + wordTarget.charAt(i));
            } else {
                current = current.next[crt];
            }
        }
        current.getWord().setWordExplain(wordExplain);
    }

    public List<String> matchingResult(TrieNode node) {
        List<String> res = new ArrayList<>();
        ArrayDeque<TrieNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(node);
        while (!arrayDeque.isEmpty()) {
            TrieNode tmp = arrayDeque.removeFirst();
            if (tmp.getWord().getWordExplain() != null) {
                res.add(tmp.getWord().getWordTarget());
            }
            for (int i = 0; i < 25; i++) {
                if (tmp.next[i] != null) {
                    arrayDeque.add(tmp.next[i]);
                }
            }
        }
        return res;
    }

    public List<String> search(String word) throws Exception {
        word = word.toLowerCase();
        boolean result = true;
        TrieNode current = new TrieNode(root);
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
            return matchingResult(current);
        }
    }
}