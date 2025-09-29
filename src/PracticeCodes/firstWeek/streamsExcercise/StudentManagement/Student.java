package PracticeCodes.firstWeek.streamsExcercise.StudentManagement;

public class Student {
        int id;
        String name;
        String department;
        double marks;
        int age;

        public Student(int id, String name, String department, double marks, int age) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.marks = marks;
            this.age = age;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "\nid=" + id +
                "\nname='" + name + '\'' +
                "\ndepartment='" + department + '\'' +
                "\nmarks=" + marks +
                "\nage=" + age;
    }
}
