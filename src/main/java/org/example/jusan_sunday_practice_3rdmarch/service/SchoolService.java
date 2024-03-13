package org.example.jusan_sunday_practice_3rdmarch.service;

import lombok.RequiredArgsConstructor;
import org.example.jusan_sunday_practice_3rdmarch.model.School;
import org.example.jusan_sunday_practice_3rdmarch.model.Student;
import org.example.jusan_sunday_practice_3rdmarch.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

public int sumOfStudents(String name) {
        School school = schoolRepository.findSchoolByName(name);
        return school.getStudent_list().size();
    }
}
