package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.model.ComputerPart;

public class PSU extends ComputerPart {

    private int wattage;

    public PSU(int price, String manufacturer, int wattage){
        super(price, manufacturer);
        this.wattage = wattage;
    }
}
