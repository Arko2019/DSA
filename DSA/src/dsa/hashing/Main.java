package dsa.hashing;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        DirectChaning chaning = new DirectChaning(15);
        chaning.insertHashTable("Hello");
        chaning.insertHashTable("Hii");
        chaning.insertHashTable("How Are You");
        chaning.insertHashTable("Rock");
        chaning.insertHashTable("Hello");

        chaning.displayHashTable();
    }
}
