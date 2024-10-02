package Day7.com;
import java.util.*;
public class TailsInsert {
    Tail head;
//    Tail current;
    public void TailsInserting(int value) {
        Tail tail = new Tail(value);

        if(head==null){
            head=tail;
//            System.out.println(current);
        }
        else{
            Tail current=head;
            while(current.node!=null){
                current=current.node;
//                System.out.println(current);
            }
            current.node=tail;
        }

    }
    public void show(){
        Tail current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.node;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TailsInsert tails=new TailsInsert();
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
           tails.TailsInserting(sc.nextInt());
        }
        tails.show();
    }
}
