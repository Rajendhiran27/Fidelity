import  java.util.*;
public class Account {
    int accno;
    String accname;
    int accbal;
    public Account(int accno,String accname,int accbal){
        this.accno=accno;
        this.accname=accname;
        this.accbal=accbal;
    }
    public void depo(int amo){
        accbal+=amo;
        System.out.print("Successfully Deposited. The new Amount is: "+accbal);

    }
    public void with(int wit){
        if(wit<=accbal){
            accbal-=wit;
            System.out.println("Amount Withdrawn Successfully. Now Account Balanace: "+accbal);

        }
        else{
            System.out.println("Insufficent Amount");
        }
    }
    public void chec(){
        System.out.println("Current balance: "+accbal);
    }
    public void show(){
        System.out.println("Account Number: "+accno);
        System.out.println("Account Holder Name: "+accname);
        System.out.println("Account Balanace: "+accbal);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int accno=123456;
        String accname="Rajendhiran";
        int accbal=50000;
        Account account=new Account(accno,accname,accbal);
        while(true){
            System.out.println();
            System.out.println("Welcome Choose an Below Options:");
            System.out.println("1.Deposite");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Choose Your Options :");
            int a=sc.nextInt();
            if(a<=4){
            switch(a){
                case 1:
                System.out.println("Enter the amount to deposite: ");
                int b=sc.nextInt();
                account.depo(b);
                break;
                
                case 2:
                System.out.println("Enter the amount to withdraw: ");
                int c=sc.nextInt();
                account.with(c);
                break;

                case 3:
                account.chec();
                break;

                case 4:
                System.out.println("Thanks for Using");
                break;


            }
        }
        else{
            System.out.println("Invalid Inputs");
        }
        }
    }
}
