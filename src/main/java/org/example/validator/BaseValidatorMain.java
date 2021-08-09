package org.example.validator;

import org.example.handler.StudentErrorHandler;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class BaseValidatorMain {

    public static void main(String[] args) {

        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "students.xml";
        String schemaName = "students.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);

        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            validator.setErrorHandler(new StudentErrorHandler());
            validator.validate(source);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }

    }

}
