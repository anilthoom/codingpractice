package com.anilt.cache.service;

import com.anilt.cache.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student getStudentByID(String id){
        try {
            System.out.println("In sleep for 5 seconds, to simulate the backend call.");
            Thread.sleep(5000);
        }
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
        return new Student(id, "Anil", "X");
    }
}
