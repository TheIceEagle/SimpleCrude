package org.example.jusan_sunday_practice_3rdmarch.repository;

import org.example.jusan_sunday_practice_3rdmarch.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
     Student findStudentByFirstName(String firsName);

     Student findStudentByAge(int age);
}
