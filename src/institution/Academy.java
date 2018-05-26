package institution;

public class Academy extends Institution {

    private int studentsCount;
    public Academy(String name, int workersCount, int studentsCount) {
        super(name, workersCount);
        this.studentsCount = studentsCount;
    }
}
