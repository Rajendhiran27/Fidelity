package Day7.com;
public class TreePreOrder {

    public void treaversal(Tree tree){
        if(tree==null){
            return;
        }
//        Tree tree=new Tree(value);
        System.out.println(tree.value);
        treaversal(tree.left);
        treaversal(tree.right);

    }

    public static void main(String[] args) {
        Tree tree=new Tree(1);
        tree.right=new Tree(2);
        tree.right.right=new Tree(5);
        tree.right.right.left=new Tree(3);
        tree.right.right.right=new Tree(6);
        tree.right.right.left.right=new Tree(4);
        TreePreOrder treePreOrder=new TreePreOrder();
        treePreOrder.treaversal(tree);

    }
}
