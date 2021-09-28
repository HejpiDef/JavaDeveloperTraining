package LogicLayer;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Message {

    private ArrayList<CalypsoBook> calypsoBooks;
    private ArrayList<CalypsoBookAttribute> calypsoBookAttributes;

    @XmlElement
    public ArrayList<CalypsoBook> getCalypsoBooks() {
        return calypsoBooks;
    }

    @XmlElement
    public ArrayList<CalypsoBookAttribute> getCalypsoBookAttributes() {
        return calypsoBookAttributes;
    }
}
