package com.fastcampus.springbootpractice.model;

import org.junit.jupiter.api.Test;

import static com.fastcampus.springbootpractice.model.Student.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void lombokTest() {
        // Given
        Student fred1 = Student.builder()
                .name("Fred")
                .age(21)
                .grade(Grade.A)
                .build();

        Student fred2 = Student.builder()
                .name("Fred")
                .age(21)
                .grade(Grade.A)
                .build();

        Student martie = Student.builder()
                .name("Martie")
                .age(31)
                .grade(Grade.C)
                .build();

        // When & Then
        assertEquals(fred1, fred2);
        assertNotEquals(fred1, martie);

        System.out.println("I am a " + fred1);
        System.out.println("I am a " + fred2);
        System.out.println("I am a " + martie);
    }
}