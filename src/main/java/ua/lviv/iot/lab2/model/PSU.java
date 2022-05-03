package ua.lviv.iot.lab2.model;

import lombok.Getter;
import ua.lviv.iot.lab2.model.ComputerPart;

@Getter
public class PSU extends ComputerPart {

    private int wattage;

    public PSU(int price, String manufacturer, int wattage){
        super("PSU", price, manufacturer);
        this.wattage = wattage;
    }

    public String toString(){
        return super.toString() + String.format("Wattage: %d Wtt", wattage) + System.lineSeparator();
    }
}
