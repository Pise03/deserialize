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
        String readContent = new String(Files.readAllBytes(Paths.get("src/main/java/com/decrypt/to_deserialize.xml")));

        // deserialize from the XML into a Phone object
        root deserializedData = xmlMapper.readValue(readContent, root.class);

        // Print object details
        System.out.println("Deserialized data: ");
        System.out.println("La classe " + deserializedData.getClasse() + "" + deserializedData.getSpecializzazione() + " si trova nell'aula " + deserializedData.getAula().getNome() + "ed e' composta dai seguenti alunni:" + "\n");

        for (int i = 0; i < deserializedData.getStudenti().size(); i++) {
            System.out.println("-" + deserializedData.getStudenti().get(i).getCognome());
        }
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