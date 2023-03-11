package com.anupamacode.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Anupama",
                        "anupama@gmail.com",
                        LocalDate.of(1997, Month.SEPTEMBER, 27),
                        27
                )
        );
    }
}
