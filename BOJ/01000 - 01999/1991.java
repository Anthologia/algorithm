import java.io.*;
import java.util.*;

class Node{
    char name;
    Node left, right;

    Node(char name, Node left, Node right){
        this.name = name;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}

public class Main {

    private static final Node head = new Node('A', null, null);
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            insertNode(head, root,left,right);
        }

        preOrder(head);
        sb.append('\n');

        inOrder(head);
        sb.append('\n');

        postOrder(head);
        sb.append('\n');

        System.out.println(sb);
    }

    public static void insertNode(Node node, char root, char left, char right) {
        if (node.name == root) {
            node.left = (left == '.' ? null : new Node(left,null,null));
            node.right = (right == '.' ? null : new Node(right,null,null));
        } else {
            if (node.left != null) {
                insertNode(node.left, root, left, right);
            }
            if (node.right != null) {
                insertNode(node.right, root, left, right);
            }
        }
    }

    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        sb.append(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        sb.append(node);
        inOrder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        sb.append(node);
    }
}
