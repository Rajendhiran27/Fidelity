package Day7.com;
import java.util.*;
public class SpecificNodeInserting {
    SpecificNode head;
    public void Insert(int value, int position){
        SpecificNode specificNode=new SpecificNode(value);

        if(position==0){
            specificNode.node=head;
            head=specificNode;
            return;
        }
        SpecificNode current=head;
        for(int i=0;i<position-1;i++){
            current=current.node;
        }

            specificNode.node=current.node;
            current.node=specificNode;

    }
    public void show(){
        SpecificNode current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.node;
        }
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int value=sc.nextInt();
        SpecificNodeInserting specificNodeInserting=new SpecificNodeInserting();
        specificNodeInserting.Insert(16,0);
        specificNodeInserting.Insert(13,1);
        specificNodeInserting.Insert(7,2);
        specificNodeInserting.Insert(1,2);
        specificNodeInserting.show();

    }
}
