package person;

public abstract class Worker implements Person {
    protected String name;
    protected int salary;

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

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}