package com.sherzod.Service;

import com.sherzod.Dao.StudentDao;
import com.sherzod.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    private StudentDao studentDao = new StudentDao();

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
}
