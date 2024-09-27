package Day5.com;
import java.util.*;
public class BooleanResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean result=a>b;
        if(result){
            System.out.println("The result of whether a is less then b is true");
        }
        else{
            System.out.println("The result of whether b is less then a is true");
        }
    }
}
