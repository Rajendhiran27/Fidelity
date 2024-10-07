package Day8.com;
import java.util.*;
public class TraverseManagement {
//    Traversal head;
    public void Inorder(Traversal traversal){
        if(traversal==null){
            return ;
        }
        Inorder(traversal.left);
        System.out.print(traversal.value+" ");
        Inorder(traversal.right);
    }

    public void PreOrder(Traversal traversal){
        if(traversal==null){
            return ;
        }

        System.out.print(traversal.value+" ");
        PreOrder(traversal.left);
        PreOrder(traversal.right);
    }
    public void PostOrder(Traversal traversal){
        if(traversal==null){
            return ;
        }
        PostOrder(traversal.left);
        PostOrder(traversal.right);

        System.out.print(traversal.value+" ");

    }

    public static void main(String[] args) {
        Traversal traversal=new Traversal("+");
        traversal.left=new Traversal("-");
        traversal.left.left=new Traversal("A");
        traversal.left.right=new Traversal("*");
        traversal.left.right.left=new Traversal("/");
        traversal.left.right.left.left=new Traversal("C");
        traversal.left.right.left.right=new Traversal("5");
        traversal.left.right.right=new Traversal("2");
        traversal.right=new Traversal("%");
        traversal.right.left=new Traversal("*");
        traversal.right.left.left=new Traversal("D");
        traversal.right.left.right=new Traversal("5");
        traversal.right.right=new Traversal("4");
        TraverseManagement traverseManagement=new TraverseManagement();
        traverseManagement.Inorder(traversal);
        System.out.println();
        traverseManagement.PreOrder(traversal);
        System.out.println();
        traverseManagement.PostOrder(traversal);

    }
}
