

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BinarySearch {
    public static void main(String[] args) {
        LabdakiTarz bst = new LabdakiTarz();

        bst.insert(5);
        bst.insert(8);
        bst.insert(2);
        bst.insert(9);
        bst.insert(1);
        bst.insert(13);
    }
    private Node root;



    BinarySearch(int rootValue){
        Node newNode = new Node(rootValue);
    }

    public boolean insert(int value){
        Node newNode = new Node(value);

        if (root == null){
            root = newNode;
            return true;
        }

        Node temp = root;

        while(true){
            if(newNode.getValue() == temp.getValue())
                return false;

            if (newNode.getValue() < temp.getValue()) {
                if (temp.getLeft() == null) {
                    root.setLeft(temp);
                    return true;

                }
                temp = temp.getLeft();
            }else {
                if (temp.getRight() == null) {
                    root.setRight(temp);
                    return true;

                }
                temp = temp.getRight();
            }
        }
    }
}
class Node{
    private int value;
    private Node right;
    private Node left;

    Node(int value){
        this.value = value;
    }

    public Node getRight(){
        return right;
    }
    public Node getLeft(){
        return left;
    }

    public void setRight(Node node){
        this.right = node;
    }

    public void setLeft(Node node){
        this.left = node;
    }
    public int getValue(){
        return value;
    }

}
class LabdakiTarz{
    private Node root;
    public void insert(int value){
        this.root = insert (root, value);
    }

    private Node insert (Node currNode, int value){
        if(currNode == null){
            currNode = new Node(value);
            return currNode;
        }

        if(currNode.getValue() < value){
            currNode.setLeft(insert(currNode.getLeft(), value));
        }else {
            currNode.setRight(insert(currNode.getRight(), value));
        }
        return currNode;
    }

    private void inorder(Node currNode){
        if(currNode == null)
            return;
        inorder(currNode.getLeft());
        System.out.println(currNode.getValue() + " ");
        inorder(currNode.getRight());
    }

    private void preorder (Node currNode){
        if(currNode == null)
            return;
        System.out.println(currNode.getValue() + " ");
        preorder(currNode.getLeft());
        preorder(currNode.getRight());

    }
}