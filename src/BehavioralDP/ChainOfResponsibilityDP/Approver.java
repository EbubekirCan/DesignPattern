package BehavioralDP.ChainOfResponsibilityDP;

// yetkii dagilimi icin abstract sinif
public abstract class Approver {

    Approver chief;

    // parametreli const.
    public Approver(Approver chief) {
        this.chief = chief;
    }

    // onaylamnabilecek kredi limiti
    abstract boolean approveLoan(int amount);
}
