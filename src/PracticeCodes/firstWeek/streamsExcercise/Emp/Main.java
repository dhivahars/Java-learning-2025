package PracticeCodes.firstWeek.streamsExcercise.Emp;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> Emp=new ArrayList<>();
        Emp.add(new Employee(1,"Larry","IT",100000,true));
        Emp.add(new Employee(2,"Tom","IT",50000,true));
        Emp.add(new Employee(3,"Lana","Accounts",75000,true));
        Emp.add(new Employee(4,"Justin","Testing",100000,true));
        Emp.add(new Employee(5,"Shakira","Accounts",100000,true));
        Emp.add(new Employee(6,"Billie","HR",100000,true));
        //Excercise-1
        System.out.println("Employees woking under IT department");
        System.out.println("_______________________________________");
        Emp.stream()
                .filter(a->a.getDepartment().equalsIgnoreCase("IT"))
                .forEach(System.out::println);
        //Exercise-2
        System.out.println("\nEmployees with Salary Greater than 5000");
        System.out.println("____________________________________________");
        HashMap<String,List<String>> eMaxSalList=(HashMap<String, List<String>>) Emp.stream().filter(a->a.getSalary()>50000)
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(eMaxSalList);
        //Exercise-3
        System.out.println("\nHighest Paid Employee/Employees in Each Department");
        System.out.println("_______________________________________");
        Map<String, Employee> highSalList= Emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen((Collectors.maxBy((a, b)-> (int) (a.getSalary()-b.getSalary()))),Optional::get)));
        System.out.println(highSalList);
        //Excersice-4
        System.out.println("\nNumber of Employees in Each Department");
        System.out.println("_______________________________________");
        Map<String, Long> empCount=Emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getDepartment,Collectors.counting())));
        System.out.println(empCount);
        //Exercise-5
        System.out.println("\nList of Employees working");
        System.out.println("_______________________________________");
        List<String> EmpList=Emp.stream()
                .map(Employee::getName)
                .toList();
        EmpList.stream()
                .forEach(System.out::println);
    }
}
