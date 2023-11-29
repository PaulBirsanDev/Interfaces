package ro.fasttrackit.interfaces.person;

public class Romanian implements Citizen, Employee{
    private String citizenship;

    private long identifier;

    private int age;

    private int salary;

    public Romanian(String citizenship, long identifier, int age, int salary) {
        this.citizenship = citizenship;
        this.identifier = identifier;
        this.age = age;
        this.salary = salary;
    }

    public String getCitizenship() {
        return null;
    }

    public long getIdentifier() {
        return 0;
    }

    public int getAge() {
        return 0;
    }

    public String getName() {
        return null;
    }


    public String getCompany() {
        return null;
    }


    public int getSalary() {
        return 0;
    }
}
