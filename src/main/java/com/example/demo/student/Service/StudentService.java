package com.example.demo.student.Service;

import com.example.demo.student.domain.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){

        return List.of(
                new Student(
                        "lebogangmatsinini@gmail.com",
                        1,
                        "Lebogang Matshinini",
                        LocalDate.of(2002, Month.APRIL, 20),
                        24
                )
        );
    }
}
