package beans;
import java.awt.*;
import java.util.Date;


public class TechnologicalProcess {
    private long id;
    private String nameOperation;
    private long performance;
    private String  equipment;
    private long sequence;
    private byte [] image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOperation() {
        return nameOperation;
    }

    public void setNameOperation(String nameOperation) {
        this.nameOperation = nameOperation;
    }

    public long getPerformance() {
        return performance;
    }

    public void setPerformance(long performance) {
        this.performance = performance;
    }

    public String getEquipment() { return equipment; }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public byte [] getImage() {
        return image;
    }

    public void setImage(byte [] image) {
        this.image = image;
    }
}






