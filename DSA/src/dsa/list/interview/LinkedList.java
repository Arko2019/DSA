package dsa.list.interview;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createNode(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void removeDublicates() {
        Node current = head;
        Node prev=null;
        Set<Integer> set = new HashSet<>();
        while (current != null) {
            int value=current.value;
            if (set.contains(current.value)) {
                prev.next = current.next;

                size--;
            } else {
                set.add(value);
                prev=current;
            }
            current = current.next;
        }
    }

    public void print() {
        Node tmp = head;

        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
}
