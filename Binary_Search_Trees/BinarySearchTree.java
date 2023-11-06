public class BinarySearchTree {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public boolean insert(int data){
        Node newNode = new Node(data);

        if (root == null){
            root = newNode;
            return true;
        }

        Node temp = root;

        while (true){
            if (newNode.data == temp.data)
                return false;

            if (newNode.data < temp.data){
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;

            }else {
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }

        }
    }

    public boolean contains(int data){
        Node temp = root;

        while (temp != null){
            if (data < temp.data){
                temp = temp.left;
            } else if (data > temp.data) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
