package org.example.jusan_sunday_practice_3rdmarch.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String secondName;

    private String email;
    private int age;

    private int grade;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student")
    private School school;


}
