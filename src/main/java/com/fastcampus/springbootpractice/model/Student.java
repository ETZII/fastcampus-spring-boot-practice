package com.fastcampus.springbootpractice.model;

import lombok.*;

@Data
@Builder
@Value(staticConstructor = "of")
public class Student {
    String name;
    Integer age;
    Grade grade;
    public enum Grade {
      A, B, C, D, F
    }
}
