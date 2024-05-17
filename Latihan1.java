public class Latihan1 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class binarytree{
        public Node root;
        public binarytree(){
            root = null;
        }

        public void addroot(int data){
            root = new Node(data);
        }

        public void inorder(Node node){
            if (node != null){
                inorder(node.left);
                System.out.println(node.data + " ");
                inorder(node.right);
            }
        }

        public void preorder(Node node){
            if (node != null){
                System.out.println(node.data + " ");
                preorder(node.left);
                preorder(node.right);
            }
        }

        public void postorder(Node node){
            if (node != null){
                postorder(node.left);
                postorder(node.right);
                System.out.println(node.data + " ");
            }
        }
    }

    public static void main(String[] args) {
        binarytree tree = new binarytree();

        tree.addroot(20);
        tree.root.left = new Node(2);
        tree.root.right = new Node(25);
        tree.root.left.left = new Node(37);
        tree.root.left.right = new Node(12);
        tree.root.right.right = new Node(16);

        System.out.println("\npreorder: ");
        tree.preorder(tree.root);
        System.out.println("\ninorder: ");
        tree.inorder(tree.root);
        System.out.println("\npostorder: ");
        tree.postorder(tree.root);
    }
}
