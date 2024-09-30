package Assessment.com;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Insurence Number: ");
        String insurenceNumber=sc.nextLine();
        System.out.println("Enter the Insurence Name: ");
        String insurenceName=sc.nextLine();
        System.out.println("Enter the Amount Covered: ");
        double amountCoverd=sc.nextDouble();
        System.out.println("Choose an Option!");
        System.out.println("1.Motor Insurence");
        System.out.println("2.Life Insurence");
        int a=sc.nextInt();
        if (a==1){
            System.out.println("Enter depression Percent: ");
            float depPercent=sc.nextFloat();
            Motorinsurence motorinsurence=new Motorinsurence(insurenceNumber,insurenceName,amountCoverd,depPercent);
            System.out.println("Calculated premium: "+motorinsurence.CalculatePremium());
        }
        else if(a==2){
            System.out.println("Enter Policy Term: ");
            int policyterm=sc.nextInt();
            System.out.println("Enter Benefit Percentage: ");
            float benfitPercent=sc.nextFloat();
            LifeInsurence lifeInsurence=new LifeInsurence(insurenceNumber,insurenceName,amountCoverd,policyterm,benfitPercent);
            System.out.println("Calculated Premium: "+lifeInsurence.CalculatePremium());
        }
    }
}
