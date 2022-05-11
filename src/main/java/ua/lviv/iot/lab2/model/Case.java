package ua.lviv.iot.lab2.model;

import lombok.Getter;

@Getter
public class Case extends ComputerPart {

    private int weight;

    public Case(int price, String manufacturer, int weight) {
        super("Case", price, manufacturer);
        this.weight = weight;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "weight";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + weight;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Weight: %d kg", weight) + System.lineSeparator();
    }

}
