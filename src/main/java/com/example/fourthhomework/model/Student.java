package com.example.fourthhomework.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student extends AbstractBaseEntity{
    private String studentName;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;
    private String address;
    private String gender;

    @JsonManagedReference
    @ManyToMany(mappedBy = "student")
    private List<Course> studentCourses = new ArrayList<>();
}
