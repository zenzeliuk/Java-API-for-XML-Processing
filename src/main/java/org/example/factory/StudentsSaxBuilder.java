package org.example.factory;

import org.example.entity.Student;
import org.example.handler.StudentHandler;
import org.xml.sax.XMLReader;

import java.util.Set;

public class StudentsSaxBuilder extends AbstractStudentsBuilder {
    private StudentHandler handler;
    private XMLReader reader;

    public StudentsSaxBuilder() {
    }

    public StudentsSaxBuilder(Set<Student> students) {
        super(students);
    }

    @Override
    public void buildSetStudents(String fileName) {
    }
}
