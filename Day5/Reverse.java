package Day5.com;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] separate=sentence.split(" ");
        StringBuilder reverse=new StringBuilder();
        for(int i=separate.length-1;i>=0;i--){
            reverse.append(separate[i]).append(" ");
//            System.out.print(" ");
        }
        System.out.println(reverse);
    }
}
