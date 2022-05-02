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

    public int getStorageCapacity( ) {
        return storage_capacity;
    }
    public void setStorageCapacity(int storage_capacity) {
        this.storage_capacity = storage_capacity;
    }

    public int getReadSpeed( ) {
        return read_speed;
    }
    public void setReadSpeed(int read_speed) {
        this.read_speed = read_speed;
    }

    public int getWriteSpeed( ) {
        return write_speed;
    }
    public void setWriteSpeed(int write_speed) {
        this.write_speed = write_speed;
    }

    public String toString(){
        return super.toString() + String.format("Storage: %d GB, " +
                "Read Speed: %d mb/s, " +
                "Write Speed: %d mb/s", storage_capacity, read_speed, write_speed) + System.lineSeparator();
    }
}
