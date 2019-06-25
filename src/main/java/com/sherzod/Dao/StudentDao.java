package com.sherzod.Dao;

import com.sherzod.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer,Student>(){
            {
                put(1, new Student(1,"Someone", "Math"));
                put(2, new Student(2,"Someone1", "Math"));
                put(3, new Student(3,"Someone2", "Math"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return students.values();
    }
}
