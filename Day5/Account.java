package Day5.com;

public class Account {
    private int id;
    private String accountType;
    private double balance;

    public Account() {
        this.id=0;
        this.accountType="";
        this.balance=0.0;
    }

    public Account( int id, String accountType,Double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getAccountType(){
        return accountType;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public Double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public boolean Withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return true;
        }
        else{
            return false;
//            System.out.println("Insufficient Amount");
        }
    }
    public String GetDetails(){
        return "Account Id: "+id+"\n"+"AccountType :"+accountType+"\n"+"Account Balance: "+balance;

    }
}
