package PracticeCodes.springBoot.service;

import com.example.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class StudentService {
    ArrayList<Student> list=new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Clarke","IT"),
                    new Student(2,"Martin","IT"),
                    new Student(3,"Armas","EEE")
            )
    );

    public  void updateStudents(Student student) {
        for(int i=0;i<list.size();i++){
        if(student.getId()==list.get(i).getId()){
            list.remove(i);
            list.add(student);
        }

        }
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public String greet() {
        return "Hello user welcome to my application";
    }

    public Object getStudentById(int id) {
        for(int i=0;i< list.size();i++){
       if (id==list.get(i).getId()){
           return list.get(i);
       }
        }
        return "not found";
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public void deleteStudent(int id) {
        for(int i=0;i< list.size();i++){
            if (id==list.get(i).getId()){
                list.remove(i);
            }
        }

    }
}
