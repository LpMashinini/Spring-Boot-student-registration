package com.example.demo.student.config;

import com.example.demo.student.domain.entity.Student;
import com.example.demo.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.JULY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student lebogang = new Student(
                    "lebogangmatsinini@gmail.com",
                    "Lebogang Matshinini",
                    LocalDate.of(2002, APRIL, 20)
            );

            Student john = new Student(
                    "lebogangmatsinini@gmail.com",
                    "John Matshinini",
                    LocalDate.of(1934, JULY, 17)
            );

            repository.saveAll(
                    List.of(lebogang,john)
            );
        };
    }
}
