package ua.lviv.iot.lab2.model;

import lombok.Getter;
import ua.lviv.iot.lab2.model.ComputerPart;
@Getter
public class Motherboard extends ComputerPart {

    private int maxRAM;

    public Motherboard(int price, String manufacturer, int maxRAM) {
        super("Motherboard", price, manufacturer);
        this.maxRAM = maxRAM;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "maxRAM";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + maxRAM;
    }

    public String toString() {
        return super.toString() + String.format("Max RAM: %d GB", maxRAM) + System.lineSeparator();
    }
}
