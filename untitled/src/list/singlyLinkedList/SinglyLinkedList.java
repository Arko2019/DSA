package list.singlyLinkedList;

public class SinglyLinkedList {
    Node head;
    Node tail;

    void add(int value){
        Node node=new Node(value);
        if(head==null){
            head =node;
        }

    }
}
