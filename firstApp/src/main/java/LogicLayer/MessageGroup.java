package LogicLayer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@XmlRootElement
public class MessageGroup {

    private ArrayList<Message> messages = new ArrayList<>();

    @XmlElement
    public ArrayList<Message> getMessages() {
        return messages;
    }

    public MessageGroup unmarshallXML(String fileName) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(MessageGroup.class);
        return (MessageGroup) context.createUnmarshaller().unmarshal(new FileReader(fileName));
    }
}
