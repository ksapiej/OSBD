package person;

public class Lecturer extends Worker {

    private String rank;
    public Lecturer(int salary, String name,String rank) {


        super(salary,name);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
