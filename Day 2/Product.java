// import java.util.*;
class Product {
    int proid;
    String proname;
    int price;

    public Product(int proid,String proname,int price){
        this.proid=proid;
        this.proname=proname;
        this.price=price;
    }
    public void display(){
        System.out.println("Product Id: "+proid);
        System.out.println("Product Name: "+proname);
        System.out.println("Product Price: "+price);
    }
}
class Main{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        Product[] products=new Product[3];
        products[0]=new Product(1,"Mobile",10000);
        products[1]=new Product(2,"Tab",20000);
        products[2]=new Product(3,"Laptop",50000);
        for(Product p:products){
            p.display();
        }

    }
}
