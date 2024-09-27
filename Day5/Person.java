package Day5.com;
import java.sql.SQLOutput;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
public class Person {
    private String firstName;
    private String lastName;
    private  LocalDate dob;

    public Person(String firstName, String lastName,LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob=dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String Adult(){
        int age=getage();
        if(age>18){
            return "Adult";
        }
        else{
            return "Child";
        }

    }
    public int getage(){
        LocalDate currentAge=LocalDate.now();
        Period period=Period.between(dob,currentAge);
        return period.getYears();
    }
    public void displayDetails(){
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+getage());
        System.out.println(Adult());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName=sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastname=sc.nextLine();
        System.out.println("Enter Your Date of Birth in yyyy-mm-dd format: ");
        LocalDate dob=LocalDate.parse(sc.nextLine());
        Person person=new Person(firstName,lastname,dob);
        person.displayDetails();
    }
}
