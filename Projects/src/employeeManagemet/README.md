# Employee Management System (Java OOPs)

This is a simple **Employee Management System** implemented in Java using the concepts of **Object-Oriented Programming (OOPs)** such as **abstraction, inheritance, polymorphism, and encapsulation**.

The project demonstrates how to manage employees (Developers, Managers, etc.) with features like adding, searching, and removing employees.

---

## 📂 Project Structure

employeeManagemet/
│
├── Person.java # Abstract base class (common attributes for all persons)
├── Employee.java # Abstract class extending Person (common employee behavior)
├── Developer.java # Developer class extending Employee
├── Manager.java # Manager class extending Employee
├── EmployeeManager.java # Handles employee list (add, search, remove operations)
└── Main.java # Entry point (runs the program)
---

## ✨ Features

- Add new employees (Developer / Manager).
- Search employees by:
    - **ID**
    - **Name**
- Remove employees by:
    - **ID**
    - **Name**
- Display detailed employee information.
- Demonstrates:
    - **Abstraction** (abstract classes `Person` and `Employee`)
    - **Inheritance** (Developer and Manager extend Employee)
    - **Polymorphism** (method overriding like `displayInfo()`)
    - **Encapsulation** (private fields with getters/setters)

---

## 🧑‍💻 Example Usage

```java
public class Main {
    public static void main(String[] args) {
        EmployeeManager emgr = new EmployeeManager();

        // Adding Employees
        emgr.addItems(new Developer(1, "Bob", 25, 100000));
        emgr.addItems(new Manager(2, "Heissenberg", 35, 1000000));

        // Searching by name
        System.out.println(emgr.searchEmployee("Bob"));

        // Removing by name
        emgr.removeItems("Bob");
    }
}
```
Sample Output
Employee found
Name:Bob
Age:25
Salary:100000.0
Designation:Developer

Employee Removed Successfully
```
1.How to Run

2.Clone the repository:


3.Open the project in IntelliJ IDEA / Eclipse / VS Code.

4.Compile and run Main.java.
```
Technologies Used

Java 8+

OOP Concepts

Collections (ArrayList)