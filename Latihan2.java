public class Latihan2 {
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

        public void Newnode(int data){
            root = Newnode(root, new Node(data));
        }

        private Node Newnode(Node root, Node newdata){
            if (root == null){
                root = newdata;
                return root;
            }

            if (newdata.data < root.data){
                root.left = Newnode(root.left, newdata);
            }else {
                root.right = Newnode(root.right, newdata);
            }
            return root;
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

        tree.Newnode(20);
        tree.Newnode(2);
        tree.Newnode(25);
        tree.Newnode(37);
        tree.Newnode(16);

        System.out.println("\npreorder: ");
        tree.preorder(tree.root);
        System.out.println("\ninorder: ");
        tree.inorder(tree.root);
        System.out.println("\npostorder: ");
        tree.postorder(tree.root);
    }
}
