package com.lion.duqcx.Lambda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCase {
    public static void main(String[] args) {
        Function<Student, String> function =Student::getName;
        List<Student> studentList = Stream.of(new Student("路飞", 22, 175),
                new Student("红发", 40, 180),
                new Student("白胡子", 50, 185)).collect(Collectors.toList());
        studentList.forEach(item -> {
            String apply = function.apply(item);
            System.out.println(apply);
        });
    }
}
