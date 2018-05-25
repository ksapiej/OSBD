package person;

public class Worker implements Person {
    private String name;

    public Worker(String name){
        this.name = name;

    }
    Worker(){}


    @Override
    public String getName() {
        return this.name;
    }
}