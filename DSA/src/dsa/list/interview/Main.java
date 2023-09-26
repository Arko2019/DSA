package list.interview;

public class Main {
    public static void main(String arg[]){
        LinkedList list=new LinkedList();
       list.insertNode(1);
        list.insertNode(4);
       list.insertNode(2);
       list.insertNode(3);
       list.insertNode(3);
        list.insertNode(4);
       list.print();
       list.removeDublicates();
       list.print();
    }
}
