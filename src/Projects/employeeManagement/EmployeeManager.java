package Projects.employeeManagement;

import java.util.ArrayList;

public class EmployeeManager {
    ArrayList<Employee> emp=new ArrayList<>();
    Employee toRemove;
    public void addItems(Employee item){
        emp.add(item);
    }
    public void removeItems(int id){

        for(Employee e:emp){
            if(e.getId()==id){
                toRemove=e;
                break;
            }
        }
        if(toRemove!=null){
            emp.remove(toRemove);
            System.out.println("Employee Removed Successfully");
            toRemove=null;
        }
        else{
            System.out.println("Employee Not found");
        }
    }
    public void removeItems(String name){
        for(Employee e:emp){
            if(e.getName().equalsIgnoreCase(name)){
                toRemove=e;
                break;
            }
        }
        if(toRemove!=null){
            emp.remove(toRemove);
            System.out.println("Employee Removed Successfully");
            toRemove=null;
        }
        else{
            System.out.println("Employee Not found");
        }
    }
    String searchEmployee(int id){
        for (Employee e:emp){
            if(e.getId()==id){
                System.out.println("Employee found");
                return e.displayInfo();
            }
        }
        return null;
    }
    String searchEmployee(String name){
        for (Employee e:emp){
            if(e.getName().equalsIgnoreCase(name)){
                System.out.println("Employee found");
                return e.displayInfo();
            }
        }
        return null;
    }
}
