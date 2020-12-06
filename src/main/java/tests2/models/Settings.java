package tests2.models;

import lombok.*;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Data
@Builder
@AllArgsConstructor
public class Settings {
    private static final String filePath = "C:\\Users\\Ken\\IdeaProjects\\Schooool\\settings.xml";
    private String username;
    private String password;
    private String domain;
    private String baseUrl;
    private int width;
    private int height;


    public Settings() throws ParserConfigurationException, IOException, SAXException {
        if(!Files.exists(Paths.get(filePath))) throw new IllegalStateException("Problem file with settings does not exists");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File(filePath));
        this.baseUrl = document.getElementsByTagName("baseUrl").item(0).getChildNodes().item(0).getNodeValue();
        this.username = document.getElementsByTagName("username").item(0).getChildNodes().item(0).getNodeValue();
        this.password = document.getElementsByTagName("password").item(0).getChildNodes().item(0).getNodeValue();
        this.domain = document.getElementsByTagName("domain").item(0).getChildNodes().item(0).getNodeValue();
        this.width = Integer.parseInt(document.getElementsByTagName("width").item(0).getChildNodes().item(0).getNodeValue());
        this.height = Integer.parseInt(document.getElementsByTagName("height").item(0).getChildNodes().item(0).getNodeValue());
    }
}
