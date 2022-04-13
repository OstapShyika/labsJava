package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.model.ComputerPart;

public class CPU extends ComputerPart {

    private double frequency;

    public CPU(int price, String manufacturer, double frequency){
        super(price, manufacturer);
        this.frequency = frequency;
    }

    public double getFrequency( ) {
        return frequency;
    }
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}

