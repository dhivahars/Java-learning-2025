package Projects.employeeManagement;

public class Main {
    public static void main(String[] args) {
        EmployeeManager emgr=new EmployeeManager();
        emgr.addItems(new Developer(1,"Bob",25,100000));
        emgr.addItems(new Manager(2,"Heissenberg",35,1000000));
        System.out.println(emgr.searchEmployee("Bob"));
        emgr.removeItems("Bob");
    }
}
