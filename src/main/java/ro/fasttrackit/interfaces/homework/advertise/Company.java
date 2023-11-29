package ro.fasttrackit.interfaces.homework.advertise;

public class Company {
    private int budget;

    private Advertise source;

    public Company(int budget, Advertise source) {
        this.budget = budget;
        this.source = source;
    }
}
