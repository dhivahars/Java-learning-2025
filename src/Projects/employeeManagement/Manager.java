package Projects.employeeManagement;

public class Manager extends Employee{
    private String des="Manager";

    public Manager( int id, String name,int age, double salary) {
        super(  id,name,age,salary);
    }

    @Override
    double calculatedSalary(double base, double bonus) {
        return base+bonus;
    }

    @Override
    String work() {
        return "Manages the team";
    }
    @Override
    public String displayInfo() {
        return "Id"+getId()+"\nName:"+getName()+"\nAge:"+getAge()+"\nSalary:"+getSalary()+"\nDesignation"+des;
    }
}
