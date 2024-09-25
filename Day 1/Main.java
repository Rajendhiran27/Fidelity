import java.util.*;
class Main{
   static int calc(int[] a){
        int b=0;
        for(int c:a){
            b+=c;
        }
        return (int)b/a.length;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6};
        int d=calc(a);
        System.out.println(d);
    }
}