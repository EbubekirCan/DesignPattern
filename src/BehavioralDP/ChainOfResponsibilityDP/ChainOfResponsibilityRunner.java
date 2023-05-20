package BehavioralDP.ChainOfResponsibilityDP;

public class ChainOfResponsibilityRunner {

    void chainOfResponsibilityDemo(){

        Approver genelMudur = new GenelMudur();
        Approver mudur = new Mudur(genelMudur);
        Approver memur = new Memur(mudur);

        System.out.println("Kredi verme limitleri : ");
        System.out.println("Memur icin maksimum : <100");
        System.out.println("Mudur icin maksimum : <500");
        System.out.println("Genel Mudur icin limit yok");

        // islemler hep memur sinifi uzerinden yapilacak
        System.out.println("******************************");
        System.out.println("Musterinin memurdan talep ettigi kredi miktari : 50");
        memur.approveLoan(50);

        System.out.println("******************************");
        System.out.println("Musterinin memurdan talep ettigi kredi miktari : 450");
        memur.approveLoan(450);

        System.out.println("******************************");
        System.out.println("Musterinin memurdan talep ettigi kredi miktari : 1050");
        memur.approveLoan(1050);


    }


    public static void main(String[] args) {

        ChainOfResponsibilityRunner cor = new ChainOfResponsibilityRunner();
        cor.chainOfResponsibilityDemo();

    }
}
