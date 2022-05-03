package ua.lviv.iot.lab2.model;

import lombok.Getter;
import ua.lviv.iot.lab2.model.ComputerPart;
@Getter
public class Motherboard extends ComputerPart {

    private int max_ram;

    public Motherboard(int price, String manufacturer, int max_ram) {
        super("Motherboard", price, manufacturer);
        this.max_ram = max_ram;
    }

    public String toString(){
        return super.toString() + String.format("Max RAM: %d GB", max_ram) + System.lineSeparator();
    }
}
