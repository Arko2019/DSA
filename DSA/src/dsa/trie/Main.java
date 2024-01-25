package dsa.trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("ABC");
        trie.insert("AML");
        trie.search("AML");
    }
}
