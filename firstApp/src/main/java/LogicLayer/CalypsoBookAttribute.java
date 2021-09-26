package LogicLayer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import java.io.FileReader;
import java.io.IOException;

public class CalypsoBookAttribute {

    @XmlElement
    private String attributeName;
    @XmlElement
    private String attributeValue;

    public CalypsoBookAttribute unmarshallXML(String fileName) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(CalypsoBookAttribute.class);
        return (CalypsoBookAttribute) context.createUnmarshaller().unmarshal(new FileReader(fileName));
    }

    @Override
    public String toString() {
        return "CalypsoBookAttribute{" +
                "attributeName='" + attributeName + '\'' +
                ", attributeValue='" + attributeValue + '\'' +
                '}';
    }
}
