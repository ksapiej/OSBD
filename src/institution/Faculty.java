package institution;

public class Faculty extends Institution {

    private String dean;

    public Faculty(String name, int workersCount, String dean) {
        super(name, workersCount);
        this.dean = dean;
    }
}
