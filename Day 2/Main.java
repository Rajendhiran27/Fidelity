import java.util.*;
public class Main{
   public static int cali(int a){
       return a*a;
    }
   public static int cal(int b,int c){
        return b*c;
    }
   public static int cal(int d){
        return 22/7 *d*d;
    }
    public static void main(String[] args){
        int s=4;
        int b=2;
        int w=4;
        int r=5;
        int ss=cali(s);
        int rr=cal(b,w);
        int cc=cal(r);
        System.out.println("Area of Square: "+ss);
        System.out.println("Area of Rectangle: "+rr);
        System.out.println("Area of Circle: "+cc);
    }
}