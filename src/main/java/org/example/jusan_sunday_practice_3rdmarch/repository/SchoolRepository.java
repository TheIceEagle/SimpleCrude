package org.example.jusan_sunday_practice_3rdmarch.repository;

import org.example.jusan_sunday_practice_3rdmarch.model.School;
import org.example.jusan_sunday_practice_3rdmarch.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School,Long> {
    School findSchoolByName (String name);

}
