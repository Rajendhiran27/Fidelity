package Day5.com;

import java.util.Scanner;

public class SquareAndCube {
    public static Double Square(double value){
        return value*value;
    }
    public static Double Cube(double value){
        return value*value*value;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double value=sc.nextDouble();
        double square=Square(value);
        double cube=Cube(value);
        System.out.println("Square of "+(int)value+" is "+(int)square);
        System.out.println("Cube of "+(int)value+" is "+(int)cube);

    }
}
