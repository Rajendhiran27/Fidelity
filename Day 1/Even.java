import java.util.*;
class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();

        }
        int c=0;
        for(int d:b){
            if(d%2==0){
                c+=d;
            }
        }
        System.out.println(c);
    }
}