package list.singleLinkList;

import java.util.ArrayList;
import java.util.List;

public class SinglyListMain {
    public static void main(String args[]) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(2);
        list.add(4);
        list.add(3);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(5);
        list2.add(6);
        list2.add(4);

       // list.add(0, 90);
      //  list.display();
        int size = list.size();
        List<String> l = new ArrayList<>();

       /* System.out.println("Size:" + size);
        System.out.println("Middle Element:" + list.middleElemnt());*/
     Node response=   addTwoNumbers(list.head,list2.head);
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.head=response;
        list3.display();

    }
    public static Node addTwoNumbers(Node l1, Node l2) {
        int l1Value=0;
        int l2Value=0;
        int sum=0;
        Node headNode=null;
        Node tmp=headNode;
        while(l1!=null){
            l1Value=l1Value*10+l1.data;
            l1=l1.next;
        }
        while(l2!=null){
            l2Value=l2Value*10+l2.data;
            l2=l2.next;
        }
        sum=l1Value+l2Value;
        while(sum!=0){
            Node newNode=new Node(sum%10);

            if(headNode==null){
                headNode=newNode;
                tmp=newNode;

            }else{
                tmp.next=newNode;
                tmp=tmp.next;
            }
            sum/=10;

        }
        return headNode;
    }
}
