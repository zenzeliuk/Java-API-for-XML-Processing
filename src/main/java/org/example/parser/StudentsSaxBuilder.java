package org.example.parser;

import org.example.entity.Student;
import org.example.handler.StudentErrorHandler;
import org.example.handler.StudentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.Set;

public class StudentsSaxBuilder {

    private Set<Student> students;
    private StudentHandler handler = new StudentHandler();
    private XMLReader reader;

    public StudentsSaxBuilder() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = factory.newSAXParser();
            reader = saxParser.getXMLReader();
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace(); // log
        }
        reader.setErrorHandler(new StudentErrorHandler());
        reader.setContentHandler(handler);
    }
    public Set<Student> getStudents() {
        return students;
    }
    public void buildSetStudents(String filename) {
        try {
            reader.parse(filename);
        } catch (IOException | SAXException e) {
            e.printStackTrace(); // log
        }
        students = handler.getStudents();
    }
}
