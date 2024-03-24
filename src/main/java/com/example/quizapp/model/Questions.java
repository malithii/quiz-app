package com.example.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data //from lombok so we dont have to write getters and setters manually
@Entity
public class Questions {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String questiontitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightanswer;
    private String category;
    private String dlevel;




}
