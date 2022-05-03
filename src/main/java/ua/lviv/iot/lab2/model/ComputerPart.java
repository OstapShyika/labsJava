package ua.lviv.iot.lab2.model;

import lombok.Getter;

@Getter

public abstract class ComputerPart {

    private int price;
    private String manufacturer;
    private String type;

    public ComputerPart(String type, int price, String manufacturer){
        this.type = type;
        this.price = price;
        this.manufacturer = manufacturer;
    }


    @Override
    public String toString(){
        return "Price: " + this.price + ", Manufacturer: " + this.manufacturer + ", Type: " + this.type + System.lineSeparator();
    }
}

