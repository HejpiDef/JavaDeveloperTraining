package DataLayer;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;

public class ReadXML
{
    public static String readXMLtoString(String fileName)
    {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                stringBuilder.append(sCurrentLine);
            }
        }
        catch (Exception e) { e.printStackTrace();}
        return stringBuilder.toString();
    }

    public static void readXMLusingExLib(String fileName, ArrayList<String> output)
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try
        {
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(fileName));

            doc.getDocumentElement().normalize();

            NodeList list = doc.getElementsByTagName("calypsoBookAttribute");

            for (int i = 0; i < list.getLength(); i++)
            {
                Node node = list.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element) node;

                    String attributeName = element.getElementsByTagName("attributeName").item(0).getTextContent();
                    String attributeValue = element.getElementsByTagName("attributeValue").item(0).getTextContent();

                    String substring = attributeName + " = " + attributeValue;

                    output.add(substring);
                }
            }
        }
        catch (ParserConfigurationException | SAXException | IOException e) { e.printStackTrace(); }
    }
}
