package com.lion.duqcx.Lambda;

import lombok.Data;

@Data
public class Student {

    private String name;

    private Integer age;

    private Integer stature;

    private SpecialityEnum specialityEnum;

    public Student(String name, Integer age, Integer stature) {
        this.name = name;
        this.age = age;
        this.stature = stature;
    }
}
