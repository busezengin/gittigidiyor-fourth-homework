package com.example.fourthhomework.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instructor")
public class Instructor extends  AbstractBaseEntity{

    private String instructorName;
    private String instructorAddress;
    private String instructorPhoneNumber;


    @JsonManagedReference
    @OneToMany(mappedBy = "instructor")
    List<Course> instructorCourses = new ArrayList<>();
}
