package org.example;

import org.example.parser.StudentsSaxBuilder;


public class App {
    public static void main(String[] args) {
        StudentsSaxBuilder saxBuilder = new StudentsSaxBuilder();
        saxBuilder.buildSetStudents("students.xml");
        System.out.println(saxBuilder.getStudents());
    }
}
