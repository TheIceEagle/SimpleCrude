package org.example.jusan_sunday_practice_3rdmarch;

import lombok.RequiredArgsConstructor;
import org.example.jusan_sunday_practice_3rdmarch.model.School;
import org.example.jusan_sunday_practice_3rdmarch.model.Student;
import org.example.jusan_sunday_practice_3rdmarch.repository.SchoolRepository;
import org.example.jusan_sunday_practice_3rdmarch.repository.StudentRepository;
import org.example.jusan_sunday_practice_3rdmarch.service.SchoolService;
import org.hibernate.Session;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class JusanSundayPractice3rdMarchApplication implements CommandLineRunner {
    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;
    private final SchoolService service;
    private Session session;


    public static void main(String[] args) {
        SpringApplication.run(JusanSundayPractice3rdMarchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        School schoolBlank = new School(1L,"School12",null);
        schoolRepository.save(schoolBlank);
        Student student1 = new Student(1L,"Almas","Zherkenov","email1@mail.com",14,95,schoolBlank);
        Student student2 = new Student(2L,"Beybarys","Beybarys","email2@mail.com",15,98,schoolBlank);
        Student student3 = new Student(3L,"Farhad","Farhad","email3@mail.com",12,98,schoolBlank);

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);



        School school1 = schoolBlank.builder()
                .student_list(studentList)
                .name("School 13")
                .build();

        schoolRepository.save(school1);
        System.out.println(school1.getStudent_list().size());

    }
}
