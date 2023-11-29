package ro.fasttrackit.interfaces.homework.advertise;

public interface Advertise {
    String[] getOffers();

    void setFinalOffer(int offerNumber);

    boolean makePaymentForOffer();

    String setPeriodOfContract(int period);

    String advertise();
}
