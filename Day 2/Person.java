class Person {
    private String Name;
    public String Gender;
    public int Age;
    Person(String Name,String Gender,int Age){
        this.Name=Name;
        this.Gender=Gender;
        this.Age=Age;
    }
    public String getName(){
        return Name;
    }
    // public void show(){
    //     System.out.println("Name: "+getName());
    //     System.out.println("Gender: "+Gender);
    //     System.out.println("Age: "+Age);
    // }
}
class Main{
    public static void main(String[] args){
        Person per=new Person("Rajendhiran","Male",22);
        String a=per.getName();
        String b=per.Gender;
        int c=per.Age;
        System.out.println("Name: "+a);
        System.out.println("Gender: "+b);
        System.out.println("Age: "+c);
        // per.show();
    }
}
