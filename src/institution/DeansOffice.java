package institution;

public class DeansOffice extends Institution {

    private boolean haveSecretary;

    public DeansOffice(String name, int workersCount, boolean haveSecretary) {
        super(name, workersCount);
        this.haveSecretary = haveSecretary;
    }
}
