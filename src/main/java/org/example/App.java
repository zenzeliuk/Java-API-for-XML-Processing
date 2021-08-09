package org.example;

import org.example.factory.AbstractStudentsBuilder;
import org.example.parser.StudentBuilderFactory;
import org.example.parser.StudentsDomBuilder;
import org.example.parser.StudentsSaxBuilder;
import org.example.parser.StudentsStaxBuilder;


public class App {
    public static void main(String[] args) {
        String type = "stax";
        AbstractStudentsBuilder builder = StudentBuilderFactory.createStudentBuilder(type);
        builder.buildSetStudents("students.xml");
        System.out.println(builder.getStudents());

//        StudentsSaxBuilder saxBuilder = new StudentsSaxBuilder();
//        saxBuilder.buildSetStudents("students.xml");
//        System.out.println(saxBuilder.getStudents());
//
//        System.out.println("-------------------");
//
//        StudentsDomBuilder domBuilder = new StudentsDomBuilder();
//        domBuilder.buildSetStudents("students.xml");
//        System.out.println(domBuilder.getStudents());
//
//        System.out.println("-------------------");
//
//        StudentsStaxBuilder staxBuilder = new StudentsStaxBuilder();
//        staxBuilder.buildSetStudents("students.xml");
//        System.out.println(staxBuilder.getStudents());
//
//        System.out.println("-------------------");
    }
}
