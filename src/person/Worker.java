package person;

public abstract class Worker implements Person {
    private String name;
    private int salary;

    public Worker(int salatry, String name){
        this.name = name;
        this.salary= salatry;
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public String getName() {
        return this.name;
    }
}