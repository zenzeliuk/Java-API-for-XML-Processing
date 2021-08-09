package org.example.handler;


import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class StudentErrorHandler implements ErrorHandler {
    private static Logger logger = LogManager.getLogManager().getLogger(StudentErrorHandler.class.getName());

    @Override
    public void warning(SAXParseException e) {
        logger.warning(getLineColumnNumber(e) + "-" + e.getMessage());
    }

    @Override
    public void error(SAXParseException e) {
        logger.severe(getLineColumnNumber(e) + " - " + e.getMessage());
    }

    @Override
    public void fatalError(SAXParseException e) {
        logger.severe(getLineColumnNumber(e) + " - " + e.getMessage());
    }

    private String getLineColumnNumber(SAXParseException e) {
        return e.getLineNumber() + " : " + e.getColumnNumber();
    }
}
