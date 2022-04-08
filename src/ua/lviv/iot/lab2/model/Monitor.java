package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.model.ComputerPart;

public class Monitor extends ComputerPart {

    private int size;
    private String resolution;

    public Monitor(int price, String manufacturer, int size, String resolution){
        super(price, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
}
