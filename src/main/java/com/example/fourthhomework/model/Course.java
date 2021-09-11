package com.example.fourthhomework.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course extends AbstractBaseEntity{
    private String courseCode;
    private String courseName;
    private int creditPoint;

    @ManyToOne
    private Instructor instructor;

    @JsonManagedReference
    @OneToMany(mappedBy = "course")
    private List<Student> studentList = new ArrayList<>();
}
