package Assessment.com;

public class LifeInsurence extends Insurence {
    private int policyTerm;
    private float benifitPercent;
    LifeInsurence(String insurenceNumber, String insurenceCovered, double amountCoverd,int policyTerm,float benifitPercent ){
        super(insurenceNumber,insurenceCovered,amountCoverd);
        this.policyTerm=policyTerm;
        this.benifitPercent=benifitPercent;
    }
    public double CalculatePremium(){
        return (amountCoverd-((amountCoverd*benifitPercent)/100))/policyTerm;
    }
}
