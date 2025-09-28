package Projects.employeeManagement;

public class Developer extends Employee{
    private final String des="Developer";

    public Developer( int id, String name,int age, double salary) {
        super(id, name, age, salary);
    }

    @Override
    double calculatedSalary(double base,double bonus) {
        return base+bonus;
    }

    @Override
    String work() {
        return "Writes Code";
    }
    @Override
    public String displayInfo() {
        return "Name:"+getName()+"\nAge:"+getAge()+"\nSalary:"+getSalary()+"\nDesignation:"+des;
    }
}
