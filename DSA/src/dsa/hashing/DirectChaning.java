package dsa.hashing;


import java.util.LinkedList;

public class DirectChaning {
    LinkedList<String>[] hashTable;
    int maxChaning = 5;

    DirectChaning(int size) {
        hashTable = new LinkedList[size];
    }

    int modeASCIIHashFunction(String word, int M) {
        char ch[];
        ch = word.toCharArray();
        int i, sum;
        for (i = 0, sum = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public void insertHashTable(String word) {
        int newIndex = modeASCIIHashFunction(word, hashTable.length);
        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<>();

        }
        hashTable[newIndex].add(word);
    }
    public void displayHashTable(){
        if(hashTable==null){
            System.out.println("Size is 0/Empty");
        }else{
            for(int i=0;i<hashTable.length;i++){
                System.out.println("Index : "+i+" ,key : "+hashTable[i]);
            }
        }
    }
}
