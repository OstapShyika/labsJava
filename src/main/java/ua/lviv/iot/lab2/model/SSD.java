package ua.lviv.iot.lab2.model;

import lombok.Getter;
import ua.lviv.iot.lab2.model.ComputerPart;


@Getter
public class SSD extends ComputerPart {

    private int storage_capacity;
    private int read_speed;
    private int write_speed;



    public SSD(int price, String manufacturer, int storage_capacity, int read_speed, int write_speed){
        super("SSD", price, manufacturer);
        this.storage_capacity = storage_capacity;
        this.read_speed = read_speed;
        this.write_speed = write_speed;
    }

    public String toString(){
        return super.toString() + String.format("Storage: %d GB, " +
                "Read Speed: %d mb/s, " +
                "Write Speed: %d mb/s", storage_capacity, read_speed, write_speed) + System.lineSeparator();
    }
}
