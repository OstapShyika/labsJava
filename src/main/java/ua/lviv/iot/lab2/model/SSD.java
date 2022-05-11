package ua.lviv.iot.lab2.model;

import lombok.Getter;
import ua.lviv.iot.lab2.model.ComputerPart;


@Getter
public class SSD extends ComputerPart {

    private int storageCapacity;
    private int readSpeed;
    private int writeSpeed;



    public SSD(int price, String manufacturer, int storageCapacity, int readSpeed, int writeSpeed) {
        super("SSD", price, manufacturer);
        this.storageCapacity = storageCapacity;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "storageCapacity, readSpeed, writeSpeed";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + storageCapacity + ", " + readSpeed + ", " + writeSpeed;
    }

    public String toString() {
        return super.toString() + String.format("Storage: %d GB, "
                + "Read Speed: %d mb/s, "
                + "Write Speed: %d mb/s", storageCapacity, readSpeed, writeSpeed) + System.lineSeparator();
    }
}
