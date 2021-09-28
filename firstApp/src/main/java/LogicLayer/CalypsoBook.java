package LogicLayer;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

public class CalypsoBook {

    private int calypsoTradeBookId;
    private String bookName;
    private String processingOrganisation;
    private String baseCurrency;
    private String tccIdProcessingOrg;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;

    @XmlElement
    public int getCalypsoTradeBookId() {
        return calypsoTradeBookId;
    }

    @XmlElement
    public String getBookName() {
        return bookName;
    }

    @XmlElement
    public String getProcessingOrganisation() {
        return processingOrganisation;
    }

    @XmlElement
    public String getBaseCurrency() {
        return baseCurrency;
    }

    @XmlElement
    public String getTccIdProcessingOrg() {
        return tccIdProcessingOrg;
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
