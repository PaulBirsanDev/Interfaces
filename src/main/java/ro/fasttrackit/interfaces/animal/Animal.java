package ro.fasttrackit.interfaces.animal;

public interface Animal {
    String KINGDOM = "Africa";

    String getName();

    private void commonBehaviour() {
        System.out.println("I am an animal from " + KINGDOM);
        System.out.println("Most animals");
    }
}
