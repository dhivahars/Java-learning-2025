package PracticeCodes.springBoot.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/")
    public String greet(){
        return studentService.greet();
    }

    @GetMapping("/details")
    public ArrayList<Student> studentList(){
        return studentService.getList();
    }
    @GetMapping("/{id}")
    public Object getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/add")
    public String addNewStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Successfully added";
    }
    @PatchMapping("/update")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudents(student);
        return "Succesfully added";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Deletion Successful";
    }
}
