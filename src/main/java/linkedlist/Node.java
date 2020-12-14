package linkedlist;

public class Node {
    private int val;
    private Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public int getVal(){
        return this.val;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

