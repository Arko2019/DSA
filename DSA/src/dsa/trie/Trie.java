package dsa.trie;

public class Trie {
    public TrieNode root;

    Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                currentNode.children.put(ch, node);
            }
            currentNode = node;
        }
        currentNode.endOfString = true;
    }

    public void search(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            TrieNode node = currentNode.children.get(c);
            if (node == null) {
                System.out.println("word doesnot exist");
                return;
            }
            currentNode=node;

        }
        if(currentNode.endOfString==true){
            System.out.println("Word Matchable");
            return;
        }else{
            System.out.println("Substring presnt");
        }
    }
}
