package Day5.com;
import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account Type: ");
        String accountType=sc.nextLine();
//        sc.nextLine();
        System.out.println("Enter Account Balance: ");
        double balance=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Amount to Withdraw: ");
        double amount=sc.nextDouble();
        Account account=new Account(id,accountType,balance);
        System.out.println(account.GetDetails());
        if(account.Withdraw(amount)){
            System.out.println("New Balance: "+account.getBalance());
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
