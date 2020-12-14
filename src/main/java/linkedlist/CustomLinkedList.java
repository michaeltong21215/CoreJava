package linkedlist;

public class CustomLinkedList {
    private static Node head;

    public static void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getVal());
            System.out.print(" ");
            temp = temp.getNext();
        }
    }
    //1->4->3->5->6
    //2-> 1
    //head: 1
    //head: 2
    //this will add a new node to the front of the linkedlist
    public static void addToFront(Node newNode){
        newNode.setNext(head);
        head = newNode;
    }
    //traverse until the current node.next is null, then add newNode
    //this will add a new node to the end of the linkedlist
    public static void addToEnd(Node newNode){
        Node temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }
    //1 -> 2 ->4 -> 5 ->6
    //2 : current
    //4: next
    //temp = current.next
    //current.next = newNode
    //newNode.next = temp
    public static void addToPosition(Node newNode, int pos){
        Node current = head;
        int index = 0;
        while(index < pos - 1){
            index++;
            current = current.getNext();
        }
        Node temp = current.getNext();
        current.setNext(newNode);
        newNode.setNext(temp);
    }
    //1->2->3->4->5->6->7->8->9->10
    //slow: 1 2 3 4 5 6
    //fast: 1 3 5 7 9
    public static int getMiddleIndex(){
        Node temp = head;
        int val = 0;
        while(temp != null){
            temp = temp.getNext();
            val++;
        }
        return (val + 1)/2;
    }

    public static Node findMiddleNode(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    public static void swap(int firstIdx, int secondIdx){
        Node first = head;
        Node second = head;
        Node firstPrev = null;
        Node secondPrev = null;
        int i = 1;
        while(i < firstIdx && first != null){
            firstPrev = first;
            first = first.getNext();
            i++;
        }
        i = 1;
        while(i < secondIdx) {
            secondPrev = second;
            second = second.getNext();
            i++;
        }

        if (firstPrev != null)
            firstPrev.setNext(second);
        else //make y the new head
            head = second;

        // If y is not head of linked list
        if (second != null)
            secondPrev.setNext(first);
        else // make x the new head
            head = first;

        // Swap next pointers
        Node temp = first.getNext();
        first.setNext(second.getNext());
        second.setNext(temp);
    }

    public static void reverse(){
        Node temp = head; // 1
        Node newList = null;

        while(temp != null){
            Node newNode = new Node(temp.getVal()); //3
            if(newList == null){ //true
                newList = newNode; //newList: 1
            }else {
                newNode.setNext(newList); //newList: 1 newNode:3-> 1
                newList = newNode; //newList: 3
            }
            temp = temp.getNext();
        }
        head = newList;
    }

    public static boolean isLoop(){
        Node fast = head;
        Node slow = head;
        while(fast != null && slow != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        head = n1;
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        reverse();
        traverse();
    }
}

/*Homework
- going through list api (Java SE 8)
- learning merge sort

Next session
- Cors policy
- further info on linkedlist(CircularLinkedList, DoublyLinkedlist)
- Doing coding problems on linkedlist
 */