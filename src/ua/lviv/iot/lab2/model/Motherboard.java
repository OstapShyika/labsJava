package ua.lviv.iot.lab2.model;

import ua.lviv.iot.lab2.model.ComputerPart;

public class Motherboard extends ComputerPart {

    private int max_ram;

    public Motherboard(int price, String manufacturer, int max_ram) {
        super(price, manufacturer);
        this.max_ram = max_ram;
    }

    public int getMaxRAM( ) {
        return max_ram;
    }
    public void setMaxRAM(int max_ram) {
        this.max_ram = max_ram;
    }

    public String toString(){
        return super.toString() + String.format("Max RAM: %d GB", max_ram) + System.lineSeparator();
    }
}
