package ua.lviv.iot.lab2.model;

import lombok.Getter;

@Getter
public class PSU extends ComputerPart {

    private int wattage;

    public PSU(int price, String manufacturer, int wattage) {
        super("PSU", price, manufacturer);
        this.wattage = wattage;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "wattage";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + wattage;
    }

    public String toString() {
        return super.toString() + String.format("Wattage: %d Wtt", wattage) + System.lineSeparator();
    }
}
