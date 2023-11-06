public class Queue {
    private Node last;
    private Node first;
    private int length;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    Queue(int data){
        Node newNode = new Node(data);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (length == 0){
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){
        if (length == 0)
            return null;
        Node temp = first;
        if (length == 1){
            first = null;
            last = null;
        }else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
