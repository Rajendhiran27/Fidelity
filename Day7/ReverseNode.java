package Day7.com;
import java.util.*;
public class ReverseNode {
    Reverse head;
    public void Reversing(int value){
        Reverse reverse=new Reverse(value);
        reverse.node=head;
        head=reverse;
    }
    public void show(){
        Reverse current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.node;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        ReverseNode reverseNode=new ReverseNode();
        for(int i=0;i<value;i++){
            reverseNode.Reversing(sc.nextInt());
        }
        reverseNode.show();
    }
}
