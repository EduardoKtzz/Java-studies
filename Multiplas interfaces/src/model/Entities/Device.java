package model.Entities;

public abstract class Device {

    //Attributes
    private String serialNumber;

    //Constructor
    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Getters e Setters
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Methods
    public abstract void processDoc();

    public abstract void processDoc(String doc);
}
