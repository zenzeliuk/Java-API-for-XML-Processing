package org.example.factory;

import org.example.entity.Student;

import javax.xml.parsers.DocumentBuilder;
import java.util.Set;

public class StudentsDomBuilder extends AbstractStudentsBuilder {
    private DocumentBuilder docBuilder;

    public StudentsDomBuilder() {
    }

    public StudentsDomBuilder(Set<Student> students) {
        super(students);
    }

    @Override
    public void buildSetStudents(String fileName) {
    }
}

