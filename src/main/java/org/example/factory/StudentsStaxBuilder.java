package org.example.factory;

import org.example.entity.Student;

import javax.xml.stream.XMLInputFactory;
import java.util.Set;

public class StudentsStaxBuilder extends AbstractStudentsBuilder {
    private XMLInputFactory inputFactory;

    public StudentsStaxBuilder() {
    }

    public StudentsStaxBuilder(Set<Student> students) {
        super(students);
    }

    @Override
    public void buildSetStudents(String fileName) {
    }
}