import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Trees {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n5 = new Node(5);
        n1.children.add(n2);
        n1.children.add(n5);

        Node n3 = new Node(3);
        n2.children.add(n3);

        Node n4 = new Node(4);
        n3.children.add(n4);


        Trees tree = new Trees(0);
        tree.root = n1;
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n3.children.add(n6);
        n2.children.add(n7);
        tree.dfs(n1);
    }
    Node root;

    Trees(int value){
        Node newNode = new Node(value);
        root = newNode;
    }

    public void dfs(Node node){
        if (node == null)
            return;

        System.out.println(node.value);
        for(Node child : node.children)
            dfs(child);
    }
}
class Node{
    int value;
    List<Node> children;

    Node(int value){
        this.value = value;
        children = new ArrayList<>();
    }
}