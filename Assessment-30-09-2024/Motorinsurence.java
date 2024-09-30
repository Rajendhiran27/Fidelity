package Assessment.com;

public class Motorinsurence extends Insurence {
    private double idv;
    private float depPercent;
    Motorinsurence(String insurenceNumber, String insurenceCovered, double amountCoverd,float depPercent){
        super(insurenceNumber,insurenceCovered,amountCoverd);
        this.depPercent=depPercent;
    }
//    private void CalculaTIdv(){
//        idv=amountCoverd-(amountCoverd*depPercent)/100;
//    }


    public double CalculatePremium(){
//        System.out.println(idv);
        idv=amountCoverd-(amountCoverd*depPercent)/100;
        return idv*0.03;
    }
}
