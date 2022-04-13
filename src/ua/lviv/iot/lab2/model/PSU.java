package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.model.ComputerPart;

public class PSU extends ComputerPart {

    private int wattage;

    public PSU(int price, String manufacturer, int wattage){
        super(price, manufacturer);
        this.wattage = wattage;
    }

    public int getWattage( ) {
        return wattage;
    }
    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String toString(){
        return super.toString() + String.format("Wattage: %d Wtt", wattage) + System.lineSeparator();
    }
}
