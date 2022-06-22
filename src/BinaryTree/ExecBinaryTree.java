package BinaryTree;

public class ExecBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // memanggil konstraktor binarytree( ) line ke 11

        tree.root = new Node(1); //sebab root type nya node //tree.root krna tree type data binary tree jadi root nya di line 4. new node = memanggil konstraktor dinode.java line7
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4); // tree typenya binary tree //left type data node

    }
}
