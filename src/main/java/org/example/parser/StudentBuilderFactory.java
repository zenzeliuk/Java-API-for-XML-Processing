package org.example.parser;

import org.example.factory.AbstractStudentsBuilder;

public class StudentBuilderFactory{
    private enum TypeParser {
        SAX, STAX, DOM
    }

    private StudentBuilderFactory() {
    }

    public static AbstractStudentsBuilder createStudentBuilder(String typeParser) {
        TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
        switch (type) {
            case DOM -> {
                return new StudentsDomBuilder();
            }
            case STAX -> {
                return new StudentsStaxBuilder();
            }
            case SAX -> {
                return new StudentsSaxBuilder();
            }
            default -> throw new EnumConstantNotPresentException(type.getDeclaringClass(), type.name());
        }
    }
}
