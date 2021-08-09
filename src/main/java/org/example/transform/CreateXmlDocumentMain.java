package org.example.transform;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;

public class CreateXmlDocumentMain {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Document document = documentBuilder.newDocument();
        String root = "book";
        Element rootElement = document.createElement(root);
        document.appendChild(rootElement);
        Element elementName = document.createElement("name");
        String name = "Java from EPAM";
        elementName.appendChild(document.createTextNode(name));
        Element elementAuthor = document.createElement("author");
        String author = "Blinov";
        elementAuthor.appendChild(document.createTextNode(author));
        elementAuthor.setAttribute("id", "777");
        rootElement.appendChild(elementName);
        rootElement.appendChild(elementAuthor);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileWriter("book.xml"));
            transformer.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace();
        }


    }
}
