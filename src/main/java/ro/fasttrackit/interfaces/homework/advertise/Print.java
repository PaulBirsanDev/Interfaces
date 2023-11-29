package ro.fasttrackit.interfaces.homework.advertise;

public class Print implements Advertise {
    private String companyName = "Facebook";
    private String[] offers = {"1.Basec exposure for 3 days on the main page and 1 day in top 10 / week -> 15$/week",
            "2.Enterprise exposure for 5 days on the main page and 3 days on top 10 /week -> 23$/week",
            "3.Premium Exposure - 7 days on the main page - 5 days in top 10 /week -> 35$/week"};

    private int moneyReceived = 0;

    int offerChosen = 0;

    public String[] getOffers() {
        return new String[0];
    }

    public void setFinalOffer(int offerNumber) {

    }

    public boolean makePaymentForOffer() {
        return false;
    }

    public String setPeriodOfContract(int period) {
        return null;
    }

    public String advertise() {
        return null;
    }
}
