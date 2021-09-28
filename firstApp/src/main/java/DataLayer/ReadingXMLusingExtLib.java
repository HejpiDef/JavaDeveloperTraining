package DataLayer;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingXMLusingExtLib {

    private final String calypsoBookAttribute = "calypsoBookAttribute";
    private final String attributeName = "attributeName";
    private final String attributeValue = "attributeValue";

    public ArrayList<String> readingXMLusingExtLib(String fileName) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        ArrayList<String> output = new ArrayList<>();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(fileName));

            doc.getDocumentElement().normalize();

            NodeList list = doc.getElementsByTagName(calypsoBookAttribute);

            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String aN = element.getElementsByTagName(attributeName).item(0).getTextContent();
                    String aV = element.getElementsByTagName(attributeValue).item(0).getTextContent();

                    String subString = aN + " = " + aV;

                    output.add(subString);
                }
            }
        }
        catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return output;
    }
}
