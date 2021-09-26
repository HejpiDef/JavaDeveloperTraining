import DataLayer.ReadingXMLtoString;
import DataLayer.ReadingXMLusingExtLib;
import LogicLayer.CalypsoBookAttribute;
import LogicLayer.ParsingXMLFromString;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;

public class ParsingApplication {

    final static String fileName = "src/main/resources/message.xml";
    public static void main(String[] args) {

        ReadingXMLtoString XMLtoStringReader = new ReadingXMLtoString();
        String xmlFileToParse = XMLtoStringReader.readingXMLtoString(fileName);

        System.out.println(xmlFileToParse);

        //Operacje na stringu
        ParsingXMLFromString fromXMLtoStringParser = new ParsingXMLFromString();
        ArrayList<String> attributesFromParsedString = fromXMLtoStringParser.ParsingXMLFromString(xmlFileToParse);

        for (String a:attributesFromParsedString)
            System.out.println(a);

        System.out.println("\nUzycie zew biblioteki");

        //Uzycie zew biblioteki
        ReadingXMLusingExtLib extLibReader = new ReadingXMLusingExtLib();
        ArrayList<String> attributesExtLib = extLibReader.readingXMLusingExtLib(fileName);

        for (String a:attributesExtLib)
            System.out.println(a);

        //Uzycie JAXB
        CalypsoBookAttribute cba = new CalypsoBookAttribute();
        try {
            cba.unmarshallXML(fileName);
        }
        catch (IOException | JAXBException exception) {
            exception.printStackTrace();
        }
        cba.toString();
    }
}
