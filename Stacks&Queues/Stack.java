public class Stack {
    private Node top;
    private int height;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    Stack(int data){
        Node newNode = new Node(data);
        top = newNode;
        height = 1;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if (height == 0)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if (height == 0)
            return null;
        Node temp = top;
        top = temp.next;
        temp.next = null;
        height--;
        return temp;
    }

}
