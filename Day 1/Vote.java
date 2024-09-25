import java.util.*;
class Vote{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=18){
            System.out.println("User can Eligble to Vote");
        }
        else{
            System.out.println("User not Eligble to Vote");
        }
    }
}