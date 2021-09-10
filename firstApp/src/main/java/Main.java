import DataLayer.ReadXML;
import LogicLayer.StringOperations;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> attributesString = new ArrayList<>();
        ArrayList<String> attributesMethod = new ArrayList<>();

        String xmlFile = ReadXML.readXMLtoString("src/main/resources/message.xml");

        System.out.println(xmlFile);

        //Operacje na stringu
        StringOperations.splitString(xmlFile,attributesString);

        for (String a:attributesString)
            System.out.println(a);

        System.out.println("\nUzycie zew biblioteki");

        //Uzycie zew biblioteki
        ReadXML.readXMLusingExLib("src/main/resources/message.xml", attributesMethod);

        for (String a:attributesMethod)
            System.out.println(a);
    }
}
