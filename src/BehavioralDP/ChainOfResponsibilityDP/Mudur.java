package BehavioralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{


    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {

        if(amount<500) {
            System.out.println("Mudur onayladi");
            System.out.println("***************");
            return true;
        } else if (chief !=null) {

            System.out.println("Miktar mudurun onaylama siniri disinda, Sefe yonlendiriliyor");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
