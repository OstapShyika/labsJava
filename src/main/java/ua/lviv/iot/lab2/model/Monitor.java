package ua.lviv.iot.lab2.model;

import lombok.Getter;
import ua.lviv.iot.lab2.model.ComputerPart;
@Getter
public class Monitor extends ComputerPart {

    private int size;
    private String resolution;

    public Monitor(int price, String manufacturer, int size, String resolution) {
        super("Monitor", price, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "size, resolution";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + size + ", " + resolution;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Size: "
                + this.size
                + "cm, "
                + "Resolution: "
                + this.resolution + System.lineSeparator();
    }
}
