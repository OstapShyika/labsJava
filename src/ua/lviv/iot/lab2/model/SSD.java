package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.model.ComputerPart;

public class SSD extends ComputerPart {

    private int storage_capacity;
    private int read_speed;
    private int write_speed;

    public SSD(int price, String manufacturer, int storage_capacity, int read_speed, int write_speed){
        super(price, manufacturer);
        this.storage_capacity = storage_capacity;
        this.read_speed = read_speed;
        this.write_speed = write_speed;
    }
}
