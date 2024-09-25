import java.util.*;
class Emp{
   int id;
   String name;
   float bsal;
   float bonus;
   float nsal;
   Emp(int id,String name,float bsal){
    this.id=id;
    this.name=name;
    this.bsal=bsal;
    // this.bonus=bonus;
    // this.nsal=nsal;
   } 
//    void show(){
//     System.out.println("Emp Id: "+id);
//     System.out.println("Emp Name: "+name);
//     System.out.println("Emp Base Salary: "+bsal);
//     System.out.println("Emp Bonus: "+bonus);
//     System.out.println("Emp Net Salary: "+nsal);
//    }
}
class PerEmp extends Emp{
    int pf;
    PerEmp(int id,String name,float bsal,int pf){
        super(id,name,bsal);
        this.pf=pf;
    }
    void CalNetsal(){
        nsal=bsal-pf;
    }
    public float CalBns(){
        if(pf<1000){
            bonus=0.1f *bsal;
            return bonus;
            // System.out.println("Bonus: "+bonus);
            // return bonus;
        }
        else if(pf>=1000 && pf<1500){
            bonus=0.15f *bsal;
            return bonus;
            // System.out.println("Bonus: "+bonus);
        }
        else if(pf>=1500 && pf<1800){
            bonus=0.12f *bsal;
            return bonus;
            // System.out.println("Bonus: "+bonus);
        }
        else {
            bonus=0.15f*bsal;
            return bonus;
            // System.out.println("Bonus: "+bonus);
        }
    }
    void show(){
        // PerEmp pe=new PerEmp();
        System.out.println("Emp Id: "+id);
        System.out.println("Emp Name: "+name);
        System.out.println("Basic Salary: "+bsal);
        System.out.println("PF: "+pf);
        float bonuss=CalBns();
        System.out.println("Bonus: "+bonuss);
        // CalBns();
        // System.out.println(CalBns());
        System.out.println("Net Salary: "+nsal);
    }
}
class TempEmp extends Emp{
    int d;
    int ndays;
    TempEmp(int id,String name,int d,int ndays){
        super(id,name,d*ndays);
        this.d=d;
        this.ndays=ndays;
    }
   void CalNetsal(){
        nsal=d*ndays;
    }
    public float CalBns(){
        if(d<1000){
            bonus=0.15f *nsal;
            return bonus;
            // System.out.println("Bonus: "+bonus);
        }
        else if(d>=1000 && d<1500){
            bonus=0.12f *nsal;
            return bonus;
            // System.out.println("Bonus: "+bonus);
        }
        else if(d>=1500 && d<1750){
            bonus=0.11f *nsal;
            return bonus;
            // System.out.println("Bonus: "+bonus);
        }
        else {
            bonus=0.08f *nsal;
            return bonus;
            // System.out.println("Bonus: "+bonus);
        }
    }
    void show(){
        System.out.println("Emp Id: "+id);
        System.out.println("Emp Name: "+name);
        System.out.println("Daily Wagas: "+d);
        System.out.println("No.of Days: "+ndays);
        System.out.println("Net Salary: "+nsal);
        float bonuss=CalBns();
        // CalBns();
        System.out.println("Bonus: "+bonuss);
    }
}
class Main{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        int pid=101;
        String pempname="Esther";
        float pbsal=25000;
        int ppf=1500;
        int tid=102;
        String tempname="Ganesh";
        int td=1500;
        int tndays=20;
        PerEmp per=new PerEmp(pid,pempname,pbsal,ppf);
        per.CalNetsal();
        per.CalBns();
        per.show();
        TempEmp tem=new TempEmp(tid,tempname,td,tndays);
        tem.CalNetsal();
        tem.CalBns();
        
        tem.show();
    }
}