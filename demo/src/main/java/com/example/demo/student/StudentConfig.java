package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {
    @Bean //kyu??
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mithilesh = new Student(

                    "Mithilesh",
                    LocalDate.of(1998, NOVEMBER,12),
                    "goyalmithilesh89@gmail.com"

            );
            Student ram = new Student(
                    "Ram",
                    LocalDate.of(1999, NOVEMBER,2),
                    "ram99@gmail.com"

            );
            repository.saveAll(List.of(mithilesh,ram));
        };
    }
}
