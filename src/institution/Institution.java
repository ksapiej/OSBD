package institution;

public abstract class Institution {

    protected String name;
    protected int workersCount;

    public Institution(String name, int workersCount) {
        this.name = name;
        this.workersCount = workersCount;
    }
}
