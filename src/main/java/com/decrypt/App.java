package com.decrypt;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App{

public static void deserializeFromXML() {
    try {
        XmlMapper xmlMapper = new XmlMapper();

        // read file and put contents into the string
        String readContent = new String(Files.readAllBytes(Paths.get("to_deserialize.xml")));

        // deserialize from the XML into a Phone object
        PhoneDetails deserializedData = xmlMapper.readValue(readContent, PhoneDetails.class);

        // Print object details
        System.out.println("Deserialized data: ");
        System.out.println("\tName: " + deserializedData.getName());
        System.out.println("\tMemory: " + deserializedData.getMemory());
        System.out.println("\tDisplay Size: " + deserializedData.getDisplaySize());
    } catch (IOException e) {
        // handle the exception
        System.out.println("Error");
    }
}

public static void main(String[] args) {
    System.out.println("Deserializing to XML...");
    deserializeFromXML();
}
}