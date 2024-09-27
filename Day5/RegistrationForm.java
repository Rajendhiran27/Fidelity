package Day5.com;

import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Register Here!");
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Country: ");
        String country = sc.nextLine();
        System.out.println("Welcome " + name + ". Your age is " + age + " You are from " + country);
        sc.close();
    }
}