package person;

public class BlueCollar extends Worker{

    private String department;



    public BlueCollar(int salary, String name, String department) {

        super(salary,name);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "BlueCollar{" +
                "department='" + department + '\'' +
                '}';
    }
}
