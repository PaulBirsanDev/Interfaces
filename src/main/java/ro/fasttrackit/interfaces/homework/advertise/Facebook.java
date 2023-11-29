package ro.fasttrackit.interfaces.homework.advertise;

public class Facebook implements Advertise{
    private String companyName = "Facebook";
    private String[] offers = {"1.Basec exposure for 3 days on the main page and 1 day in top 10 / week -> 15$/week",
            "2.Enterprise exposure for 5 days on the main page and 3 days on top 10 /week -> 23$/week",
            "3.Premium Exposure - 7 days on the main page - 5 days in top 10 /week -> 35$/week"};

    private int moneyReceived = 0;

    int offerChosen = 0;

    public String[] getOffers() {
        return offers;
    }

    @Override
    public void setFinalOffer(int offerNumber) {
        this.offerChosen = offerNumber;
    }

    public boolean makePaymentForOffer() {
        switch (offerChosen) {
            case 1 -> moneyReceived += 15;
            case 2 -> moneyReceived += 23;
            case 3 -> moneyReceived =+ 35;
        }
        if (moneyReceived > 0) {
            return true;
        }
        return false;
    }

    public String setPeriodOfContract(int period) {
        if (period > 0) {
            return "Your contract with " + companyName + " will last " + period + " months";
        } else {
            return "No contract with " + companyName;
        }
    }

    public String advertise() {
        int index = offerChosen - 1;
        return offers[index];
    }
}
