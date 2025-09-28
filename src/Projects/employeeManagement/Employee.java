package Projects.employeeManagement;

public abstract class Employee extends  Person{
    private int id;
    private  double salary;

    public Employee(int age, String name, int id, double salary) {
        super(age, name);
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String displayInfo() {
       return "Name:"+getName()+"\nAge:"+getAge()+"\nSalary:"+salary;
    }
    abstract double calculatedSalary(double base, double bonus);
    abstract String work();
}
