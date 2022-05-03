package ua.lviv.iot.lab2.model;

import lombok.Getter;
import ua.lviv.iot.lab2.model.ComputerPart;

@Getter
public class CPU extends ComputerPart {

    private double frequency;

    public CPU(int price, String manufacturer, double frequency){
        super("CPU", price, manufacturer);
        this.frequency = frequency;
    }


    @Override
    public String toString(){
        return super.toString() + String.format("Frequency: %.1f HZ", frequency) + System.lineSeparator();
    }
}

