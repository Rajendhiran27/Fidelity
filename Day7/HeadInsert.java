package Day7.com;
import java.util.*;
public class HeadInsert {
    Heads head;
    public void HeadInserting(int value){
        Heads header=new Heads(value);
        header.node = head;
        head = header;
//        if(head==null){
//            head=header;
//        }
//        else{
//            Heads current=head;
//            while(current.node!=null){
//                current=current.node;
//            }
//            current.node=header;
//        }
    }

    public void show(){


        Heads current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.node;
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int value=sc.nextInt();
       HeadInsert headInsert=new HeadInsert();
       for(int i=1;i<=value;i++){
           headInsert.HeadInserting(sc.nextInt());
        }
       headInsert.show();
    }
}
