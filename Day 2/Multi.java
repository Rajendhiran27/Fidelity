public class Multi {
    String storage;
    Multi(String storage){
        this.storage=storage;
    }
    void show(){
        System.out.println("System Storage: "+storage);
    }
}
class Win extends Multi{
    Win(String storage){
        super(storage);
    }
    void show(){
        super.show();
        System.out.println("Model is: Windows 10");
    }
}
class SSD extends Win{
    SSD(String storage){
        super(storage);
        // this.storage=storage;
        
    }
    void show(){
        super.show();
        System.out.println("SSD is: 512GB");
    }
}
class Main{
    public static void main(String[] args){
        SSD ss=new SSD("12GB RAM");
        ss.show();
    }
}
