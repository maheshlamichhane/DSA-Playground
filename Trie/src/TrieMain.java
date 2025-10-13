import java.util.LinkedList;

public class TrieMain {
    public static void main(String[] args) {
      Trie trie = new Trie();
      trie.insert("API");
      trie.insert("APIS");
      trie.search("API");
      trie.delete("API");
    }
}