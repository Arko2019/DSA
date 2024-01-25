package dsa.list.singleLinkList;

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
        Node result = null;
        Node temp = result;
        int num = 0;
        int carry = 0;
        while(l1 != null || l2 !=null){
            int a=0;
            int b=0;
            if(l1!=null){
                a=l1.data;
                l1 = l1.next;
            }
            if(l2!=null){
                b=l2.data;

                l2 = l2.next;
            }
            int sum = a + b + carry;
            carry = sum / 10;
            num = sum % 10;
            Node node = new Node(num);
            if(result==null){
                result=node;
                temp=result;
            }else{
                temp.next=node;
                temp = temp.next;
            }
            //temp.next=node;
            //System.out.println(headNode.val);
            //  System.out.println(headNode.next);


        }
        if (carry != 0) {
            temp = new Node(carry);
        }
        return result;
    }
}
