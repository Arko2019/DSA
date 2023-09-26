package list.singleLinkList;

public class SinglyLinkedList {
    Node head;
    Node tail;
    SinglyLinkedList(){}
 int count =0;
    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = head;

        } else {
            tail.next = node;
            tail = tail.next;
        }
        count++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    int size() {
       /* Node tmp = head;
        Node p2 = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }*/
        return count;
    }

    int middleElemnt() {
        Node p1 = head;
        Node p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        return p1.data;
    }

    void add(int index, int element) {
        Node node = new Node(element);
        Node tmp = head;
        Node previousElement=tmp;
        int count = 0;
        if(index ==0){
            node.next=head;
            head=node;
            return;
        }
        while (tmp != null) {
            if (count == index) {
                node.next = tmp;
                previousElement.next = node;
                break;
            }
            previousElement=tmp;
            tmp = tmp.next;
            count++;
        }
        if (index < 0 || index > count) {
            throw new ArrayIndexOutOfBoundsException("Given Index is greater then list size");
        }
    }
}
