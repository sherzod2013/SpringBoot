package com.sherzod.Controller;

import com.sherzod.Entity.Student;
import com.sherzod.Service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService  studentService= new StudentService();

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
