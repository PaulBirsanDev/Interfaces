package ro.fasttrackit.interfaces.food;

public class InterfaceMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.setFoodSource(new KFC());
        company.sendFoodToEmployees();
        System.out.println("-".repeat(20));
        company.makePayment();
    }
}
