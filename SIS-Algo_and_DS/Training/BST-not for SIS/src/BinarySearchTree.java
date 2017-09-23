public class BinarySearchTree {

    class Node{
        int key;
        Node left, right;
        public Node(int key){this.key = key; left = right = null;}
    }
    Node root;
    public BinarySearchTree(){
        root = null;
    }
    public void delete(int key){
        root = deleteRec(root, key );
    }

    public Node deleteRec(Node root, int key) {
        if (root == null){return root;}

        if ( key < root.key)
        {
            root.left = deleteRec(root.left, key);
        }
        else if ( key > root.key)
        {
            root.right = deleteRec(root.right, key);
        }
        else
            {
                if ( root.right == null) return root.left;
                else if ( root.left == null)return root.right;

                root.key = minValue(root.right);
                root.right = deleteRec(root.right, root.key);
            }
        return root;
    }

    public int minValue(Node root) {
        int min = root.key;

        while (root != null)
        {
            root = root.left;
            min = root.left.key;
        }
        return min;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }


    public  Node insertRec(Node root, int key) {
         if ( root == null)
         {
             root = new Node(key);
             return root;
         }
         if ( key < root.key)
         {
             root.left = insertRec(root.left, key);
         }
         else if ( key > root.key)
         {
             root.right = insertRec(root.right, key);
         }
         return root;
    }
    public void inOrder(){
        inOrderRec(root);
    }

    public void inOrderRec(Node root) {
        if (root != null){
            inOrderRec(root.left);
            System.out.print(root.key);
            inOrderRec(root.right);
        }
    }
    public static void main ( String args[])
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(40);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);

        binarySearchTree.insert(50);
        binarySearchTree.insert(60);
        binarySearchTree.insert(70);
       binarySearchTree.delete(30);
        binarySearchTree.inOrder();

    }
}
