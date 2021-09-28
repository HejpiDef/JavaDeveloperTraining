package LogicLayer;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

public class CalypsoBookAttribute {

    private int calypsoTradeBookId;
    private String attributeName;
    private String attributeValue;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;

    @XmlElement
    public int getCalypsoTradeBookId() {
        return calypsoTradeBookId;
    }

    @XmlElement
    public String getAttributeName() {
        return attributeName;
    }

    @XmlElement
    public String getAttributeValue() {
        return attributeValue;
    }

    @XmlElement
    public Date getCreatedAt() {
        return createdAt;
    }

    @XmlElement
    public String getCreatedBy() {
        return createdBy;
    }

    @XmlElement
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @XmlElement
    public String getUpdatedBy() {
        return updatedBy;
    }
}
