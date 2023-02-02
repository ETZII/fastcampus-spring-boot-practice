package com.fastcampus.springbootpractice.model;

public record Student( //변화한 불변 객체 만들기 (record)
        String name,
        Integer age,
        Grade grade) {

    public enum Grade {
      A, B, C, D, F
    }
}
