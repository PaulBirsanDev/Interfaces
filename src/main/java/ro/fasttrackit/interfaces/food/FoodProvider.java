package ro.fasttrackit.interfaces.food;

public interface FoodProvider {
    boolean pay(double amount);

    String deliverFood();

    int getDeliveredQuantity();
}
