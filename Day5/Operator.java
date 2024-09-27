package Day5.com;
import java.util.*;
public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
//        double quotient=0.0;
        double[] remainder=new double[1];
//        sc.next();
        String c=sc.next();
        Calculator calculator=new Calculator();
        if(c.equals("+")){
            System.out.println(calculator.Addition(a,b));
        }
        else if(c.equals("-")){
            System.out.println(calculator.Subtraction(a,b));
        }
        else if(c.equals("*")){
            System.out.println(calculator.Multiplication(a,b));

        }
        else if(c.equals("/")){
            System.out.println(calculator.Division(a,b,remainder));
            System.out.println(remainder[0]);
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}
