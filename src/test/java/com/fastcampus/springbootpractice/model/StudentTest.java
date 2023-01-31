package com.fastcampus.springbootpractice.model;

import org.junit.jupiter.api.Test;

import static com.fastcampus.springbootpractice.model.Student.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void lombokTest() {
        // Given
        Student fred1 = new Student("Fred", 21, Grade.A);
        Student fred2 = new Student("Fred", 21, Grade.A);
        Student martie = new Student("Martie", 31, Grade.B);

        // When & Then
        assertEquals(fred1, fred2);
        assertNotEquals(fred1, martie);

        System.out.println("I am a " + fred1);
        //getter 네이밍 컨벤션의 변화
        System.out.println("My name is " + fred1.name());
        System.out.println("I am a " + fred2);
        System.out.println("I am a " + martie);
    }
}